var PriceModel ; 
var editColumn = -1;

function addProductParam(url){
	url+="&priceType="+$("#priceType").val();
	return url;
}



function selectQDStore(url){
	if($("#orgID").val() == ""){
		tip("请选择渠道商!");
		return false;
	}
	url+="&createOrgID="+$("#orgID").val();
	return url;
}

function afterSelectOrg(data){
	PriceModel = {};
	$.extend(PriceModel,data);
	initPriceParam();
}

function afterSelectWarehouse(data){
	PriceModel = {};
	$.extend(PriceModel,data);
	initPriceParam();
}

function checkMustInput(){
	if($("#orgID").val() == ""){
		tip("供应商不能为空!");
		return false;
	}
	return true
}




function choose_input_qtys(data){
	var url = 'select.do?qty&productID='+data.id; 
	url += "&inputType="+$("#inputType").val();
	
	if($("#warehouseID").val() != undefined && $("#warehouseID").val()  != "" ){
		url+="&warehouseID="+$("#warehouseID").val();	
	}
	
	if($("#warehouseID1").val() != undefined && $("#warehouseID1").val()  != "" ){
		url+="&warehouseID1="+$("#warehouseID1").val();
	}
	
	if($("#masterType").val() != undefined && $("#masterType").val()  != "" ){
		url+="&masterType="+$("#masterType").val();
	}
	
	var chooseDlg = createChoose("选择数量",url, 0,"80%","90%",data); 
	chooseDlg.button({id:"dlg_select",name:"确定",callback:qty_callback},
			{name:"取消",callback:function(){}});

}

function afterSelectProduct(data){
	data.discount = $("#discount").val();
	choose_input_qtys(data);
}

function computeAmt(){
	//计算金额
	var input_qty = $("#input_qtys").val()
	var input_unitPrice = $("#input_unitPrice").val();
    $("#input_amt").val(Round(input_qty*input_unitPrice,getAmtround()));
}


function addDetail_extend(row,data){
	
}

function qty_callback(){
	iframe = this.iframe.contentWindow;
	if(!iframe.check()){
		return false;
	}
	var product = iframe.getProduct();
	var resultRows = iframe.getResult();
	for(var i = 0 ; i < resultRows.length; i++){
		var row = resultRows[i];
		row.productName = product.productName;
		row.productID = product.productID;
		row.productNo = product.productNo;
		row.sizesGroup = product.sizesGroup;
		row.sizeGroupID = product.sizeGroupID;
		row.stdPrice = product.stdPrice;
		row.unitPrice = product.unitPrice;
		row.discount  = product.discount;
		row.retailPrice = product.retailPrice;
		addDetail_extend(row,product);
		addDetail(row,"add");
	}
	
	$("#input_product_text1").val("");
	$("#input_product").val("");
}

function blank(){
	$("#input_product").val("");
	$("#input_product_text1").val("");
	$("#input_qtys").val(0);
	$("#input_qtys_text1").val("");
	$("#input_stdPrice").val("");
	$("#input_discount").val("");
	$("#input_unitPrice").val("");
	$("#input_amt").val("");
}

function addDetail(product,method){
	var rows=  $("#detailList").datagrid("getRows");
	var fields = $("#detailList").datagrid("getColumnFields");
	var flag = true;
	for(var i = 0 ; i < rows.length; i++){
		var row = rows[i];
		if(row.productID != product.productID || row.colorID != product.colorID
				|| row.sizesBoxID != product.sizesBoxID || row.sizesBoxStr != product.sizesBoxStr ){
			continue;
		}
		for(var g = 0; g< fields.length; g++){
			var fieldName = fields[g];
			if(fieldName.indexOf("x_")==0){
				var qty1 = row[fieldName];
				var qty = product[fieldName] ;
				if(qty == "" || qty == undefined ){
					qty  = 0;
				}
				if(qty1 == "" || qty1 == undefined ){
					qty1  = 0;
				}
				if(method == "add"){
					 qty = parseInt(qty1)+ parseInt(qty);
				}
				if(qty == 0){
					qty = "";
				}
				row[fieldName] = qty ;
			}
		}
		var boxQty1 = row.boxQty;
		var boxQty2 = product.boxQty;
		if(boxQty1 == ""){boxQty1 = 0;}
		if(boxQty2 == ""){boxQty2 = 0;}
		row['boxQty'] = boxQty1+boxQty2;
		reCalRow(row,$("#detailList"));
		$("#detailList").datagrid("refreshRow",i);
		flag =false;
	}
	if(flag){
		if(product.qtySum<=0 || ($("#inputType").val() == 1 && product.boxQty == "" ) ){
			return;
		}
		product.id = null;
		product.inputType = $("#inputType").val();
		reCalRow(product,$("#detailList"));
		$("#detailList").datagrid("appendRow",product);
		$("#detailList").datagrid("addSizesGroup",product.sizesGroup);
	}
	loadFooterdetailList();
}




function initPriceParam(){
	if(PriceModel == undefined){
		return;
	}
	if(PriceModel.orderDiscount == ""){
		PriceModel.orderDiscount = 1;
	}
	if(PriceModel.additionDiscount == ""){
		PriceModel.additionDiscount = 1;
	}
	if(PriceModel.orderDiscount == ""){
		PriceModel.orderDiscount = 1;
	}
	var masterType = $("#masterType").val();
	if(masterType == "stockmove" ){
		if($("#billType").val() == 0 || $("#billType").val() == 3){
			$("#discount").val(PriceModel.orderDiscount);
		}else if ($("#billType").val() == 1){
			$("#discount").val(PriceModel.additionDiscount);
		}else if ($("#billType").val() == 2){
			$("#discount").val(PriceModel.distributeDiscount);
		}
	}else{
		$("#priceType").val(PriceModel.priceType);
		if($("#billType").val() == 0){
			$("#discount").val(PriceModel.orderDiscount);
		}else {
			$("#discount").val(PriceModel.additionDiscount);
		}	
	}
	//如果是采购单设置税率
	if(masterType == "purchase"){
		$("#taxRate").val(PriceModel.taxRate);
	}
	
}





function getSourceData(productid){
	var rows = $("#detailList").datagrid("getRows");
	var result = [];
	for(var i = 0 ; i<rows.length; i++){
		if(rows[i].productID == productid){
			result.push(rows[i]);
		}
	}
	return result;
}





prompt = function(title,content, yes, value, check){
	value = value || '';
	var input;
	return $.dialog({
		title: title,
		zIndex: getzIndex(),
		icon: 'prompt.gif',
		fixed: true,
		lock: true,
		content: [
			'<div style="margin-bottom:5px;font-size:12px">',
				content,
			'</div>',
			'<div>',
				'<input value="',
					value,
				'"  type=\"text\"  onkeydown="enterDlg(event)" style="width:18em;padding:6px 4px" />',
			'</div>'
			].join(''),
		init: function(){
			input = this.DOM.content[0].getElementsByTagName('input')[0];
			input.select();
			input.focus();
		},
		ok: function(here){
			if(check && !check.call(this, input.value, here)){
				tip("请输入正确的值!");
				return false;
			}
			return yes && yes.call(this, input.value, here);
		},
		cancel: true
   });
}



function checkInputQty(product){
	if($("#input_qtyFlag").val()==1){
			prompt("数量",'请输入数量',
				    function(val){
						$("#barcodeQty").val(val);
						if(checkInputPrice(product)){
							 setProductInfo(product);
							 addDetail(product,"add"); 
						}
				    },
				    1,checkNum
			);
			return false;
	}
	return true;
}

function checkInputPrice(product){
	if($("#input_priceFlag").val()==1){
			prompt("价格",'请输入价格',
				    function(val){
						$("#barcodePrice").val(Round(val,getPriceround()));
						setProductInfo(product);
						addDetail(product,"add"); 
				    },
				    product.price,checkReal
			);
			return false;
	}
	return true;
}

function  setProductInfo(product){
	    product.stdPrice = product.price;
		var qty = $("#input_defaultQty").val();
		if($("#input_qtyFlag").val() == 1){
			qty = $("#barcodeQty").val();
		}
		var unitPrice ;
		if($("#input_priceFlag").val() == 1){
			unitPrice = $("#barcodePrice").val();			
		}else{
			unitPrice = product.stdPrice * $("#discount").val();
		}
		product.unitPrice = unitPrice;
		if($("#inputType").val() == 0){
			product.boxQty = "";
			product[product.sizesField] = qty;
		}else{
			product.boxQty = qty;
		}
}


function barcodeEnter(event){
	var barcode  = $(event.target).val();
	if(event.keyCode == 13){
		if(barcode == ""){
		     tip("请输入条码!");
		     return false;
		}
		if(!checkMustInput()){
			return false;
		}
		$.ajaxform({
			    showAlert:false,
	 			name:'productForm',
	 			url:"ajax.do?getBarcode",
	 			data:{"barcode":barcode,"priceType":$("#priceType").val(),"type":$("#inputType").val()},
	 			success:function(data){
	 				var price  = Round(data.obj.price*$("#discount").val(),getPriceround());
	 				$("#barcodePrice").val(price);
	 				var product = data.obj;
	 				if(!checkInputQty(product)){
	 					return ;
	 				}
	 				if(!checkInputPrice(product)){
	 					return ;
	 				}
	 				setProductInfo(product);
	 				addDetail(product,"add"); 
	 				$("#input_barcode").val("");
	 				$("#input_barcode").focus();
	 				$("#barcodePrice").val("");
	 				$("#barcodeQty").val("");
	 				
	 			},
	 			fail:function(data){
	 				tip(data.msg);
	 				$("#input_barcode").val("");
	 				$("#input_barcode").focus();
	 			}
	 		});
	}
}

function disableSelectProduct(){
	$("#input_product_text1").closest(".column").hide();
}

function enableSelectProduct(){
	$("#input_product_text1").closest(".column").show();
}

function enableBarcode(){
	$("#input_barcode").closest(".column").show();
	$("#input_defaultQty").attr("disabled",false);
	$(".input_qtyFlag").removeClass("disabled");
	$(".input_priceFlag").removeClass("disabled");
	$("#input_barcode").focus();	
}

function disableBarcode(){
	$("#input_barcode").closest(".column").hide();
	$("#input_defaultQty").attr("disabled",true);
	$(".input_qtyFlag").addClass("disabled");
	$(".input_priceFlag").addClass("disabled");
}




function click_input_barcodeFlag(){
	if($("#input_barcodeFlag").val() == 0){
		disableSelectProduct();
		enableBarcode();
	}else{
		enableSelectProduct();
		disableBarcode();
	}

}


function selectInputType(){
	if($("#inputType").val() == 0){
		$("#input_barcode").parent().siblings(".label").find(".text").html("条码");
		
		$("#detailList").datagrid("hideColumn","boxQty");
		$("#detailList").datagrid("hideColumn","sizesBoxID");
	}else{
		$("#input_barcode").parent().siblings(".label").find(".text").html("箱条码");
		
		$("#detailList").datagrid("showColumn","boxQty");
		$("#detailList").datagrid("showColumn","sizesBoxID");
	}
}

function gridFilter(data){
	for(var i = 0; i < data.rows.length; i++){
		reCalRow(data.rows[i],$("#detailList"));
	}
	return data;
}


function gridLoad(data){
	//隐藏尺码头
	hideSizesTitle(data);
	selectInputType();
	loadFooterdetailList();
}

function hideSizesTitle(data){
	$("#detailList").datagrid("initSizeTitle");

	for(var i = 0 ; i < data.rows.length; i++){
		var row = (data.rows)[i];
		$("#detailList").datagrid("addSizesGroup",row.sizesGroup);
	}
}




function gridLoadView(){
	formatSizesTitle(title);
	if($("#inputType").val() == 0){
		$("#detailList").datagrid("hideColumn","boxQty");
		$("#detailList").datagrid("hideColumn","sizesBoxID");
	}else{
		$("#detailList").datagrid("showColumn","boxQty");
		$("#detailList").datagrid("showColumn","sizesBoxID");
	}
}



function selectSizeBox(e,dgName){
	 var col = $(e).attr("column");
	 var rows = $("#"+dgName).datagrid("getRows");
	 var row = rows[col];
	 var sizesBoxID = $(e).val();
	 row.sizesBoxID = sizesBoxID;
	 $.ajax({
		 url:"ajax.do?sizesBox",
	     data:{"sizesBoxID":sizesBoxID},
	     method:"Post",
	     cache:true,
	     dataType:"json",
	     success:function(data){
	    	 var obj = data.obj;
	    	 for(var key in obj){
	    		 row[key] = obj[key];
	    	 }
	    	 $("#"+dgName).datagrid("refreshRow",col);
	     }
	 })
	 
}


function audit(e){
	if(ask("是否确定审核该单据？")){
		$.ajaxform({
			name:'auditForm',
			url:$("#action").val()+'?audit',
			data:{id:$("#id").val()},
			success:function(data){
				scmWin.win("view");
			},
			fail:function(data){
				
			}
		});
	}
}


function perform(e){
	if(ask("是否确定执行该单据？")){
		$.ajaxform({
			name:'performForm',
			url:$("#action").val()+'?perform',
			data:{id:$("#id").val()},
			success:function(data){
				scmWin.win("view");
			},
			fail:function(data){
				
			}
		});
	}
}

function validation(e){
	if(ask("是否确定校验该单据？")){
		$.ajaxform({
			name:'validationForm',
			url:$("#action").val()+'?validation',
			data:{id:$("#id").val()},
			success:function(data){
				scmWin.win("view");
			},
			fail:function(data){
				
			}
		});
	}
}

function account(e){
	if(ask("是否确定入账该单据？")){
		$.ajaxform({
			name:'validationForm',
			url:$("#action").val()+'?account',
			data:{id:$("#id").val()},
			success:function(data){
				scmWin.win("view");
			},
			fail:function(data){
				
			}
		});
	}
}

function validation(e){
	if(ask("是否确定校验该单据？")){
		$.ajaxform({
			name:'validationForm',
			url:$("#action").val()+'?validation',
			data:{id:$("#id").val()},
			success:function(data){
				scmWin.win("view");
			},
			fail:function(data){
				
			}
		});
	}
}


function rev(e){
	if(ask("是否确定收货该单据？")){
		$.ajaxform({
			name:'revForm',
			url:$("#action").val()+'?rev',
			data:{id:$("#id").val()},
			success:function(data){
				scmWin.win("view");
			},
			fail:function(data){
				
			}
		});
	}
}



function getDetail(){
	var rows = $("#detailList").datagrid("getRows");
	return rows;
}

function checkStockMove(){
	if($("#warehouseID").val() == $("#warehouseID1").val()){
		tip("出仓仓库不能与进仓仓库相同!");
		return false;
	}
}


function invoiceClickCell(index, field, value){
	if(field == "sizesBoxID"){
		var dg = $("#detailList");
		var rows = dg.datagrid("getRows");
		var row = rows[index];
	    var sizesBoxIDStr = row.sizesBoxIDStr.split(",");
		var sizesBoxStr = row.sizesBoxStr.split("|");
		var sizeFieldMap = $.parseJSON(row.sizeFieldMap);
		var productID= row.productID;
		var url = "select.do?showSizesbox&productID="+productID;
		var data = {};
		data.sizesBoxIDStr = sizesBoxIDStr;
		data.sizesBoxStr = sizesBoxStr;
		data.sizeFieldMap = sizeFieldMap;
		var dlg = createViewWindow("查看配码",url,700,200,data);
	}
}

function reCalRow_extend(row,dg){
	
}

function reCalRow(row,dg){
	//计算数量总和
	var fields  = dg.datagrid("getColumnFields");
	var sum = 0;
	for(var i = 0 ; i < fields.length; i++){
		if(fields[i].indexOf("x_") == 0){
			sum += (row[fields[i]] == "" || row[fields[i]] == undefined) ?0:parseFloat(row[fields[i]]);
		}
	}
	if(row.boxQty == ""){
		row.boxQty = 0;
	}
	
	if($("#inputType") == 1 && row.boxQty == 0){
		sum = 0;
	}
	
	row.qtySum = sum;
    row.amt = Round(parseFloat(row.qtySum)*parseFloat(row.unitPrice),getAmtround());
    row.stdAmt = Round(parseFloat(row.qtySum)*parseFloat(row.stdPrice),getAmtround());
    row.retailAmt = row.retailPrice == "" ? "" :Round(parseFloat(row.qtySum)*parseFloat(row.retailPrice),getAmtround());
    row.discount = row.unitPrice == 0 ?0 :(row.unitPrice/row.stdPrice).toFixed(getDiscountround());
    reCalRow_extend(row,dg)
}


function endEdit(index, row, changes,dgName){
	var dg = $("#"+dgName);
	reCalRow(row,dg);
	$("#detailList").datagrid("refreshRow",index);
	 loadFooterdetailList();
}

/**
 * 导入盘点机
 */
function pdImport(item){
	var url = $("#action").val()+"?pdImport&no="+$("#id").val();
	if($("#inputType").val() == 1){
		errortip("装箱状态下禁止此操作!");
		return false;
	}
	createwindow("导入盘点机文件",url,800,500);
}


function reloadPage(){
	$("#detailList").datagrid("reload");
}


$(function(){
	$("#billType").change(initPriceParam);
	$.extend($.fn.datagrid.defaults, {
		onBeforeCellEdit: function(index, field){
			var rows = $("#detailList").datagrid("getRows");
			var row = rows[index];
			var col = $("#detailList").datagrid('getColumnOption', field);
			if(col.editor){
				if(field.indexOf("x_")==0){
					var sizesStr = row["sizesStr"];
					if($("#inputType").val() == 1 && $("#canEditBoxQty").val() == 0 ){
						tip("装箱状态不允许编辑!");
						return false ;
					}
					
					if((","+sizesStr+",").indexOf(field)<0 ){
						tip("该尺码列不允许编辑!");
						return false ;
					}
					
				}
			}
		},
		onEndCellEdit: function(index, field){
			
		}
	});
	$(".input_barcodeFlag").click(click_input_barcodeFlag);
	$("#inputType").change(selectInputType);
	disableBarcode();
})
