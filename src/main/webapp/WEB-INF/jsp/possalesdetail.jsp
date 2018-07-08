<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
 <%
 String path = request.getContextPath();
 String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
 
 //String DepartmentID =request.getParameter("DepartmentID");
  //System.out.println(map.DepartmentID);
 
 %>   
 <!DOCTYPE html>
<html>
<head>
 <base href="<%=basePath%>">
 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <meta http-equiv="Cache-Control" content="no-cache">
	<title>Basic Panel - jQuery EasyUI Demo</title>
	<link rel="stylesheet" type="text/css" href="<%=basePath%>js/easyui/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="<%=basePath%>js/easyui/themes/icon.css">
	<link rel="stylesheet" type="text/css" href="<%=basePath%>js/jquery-ui.css">

	
	<link rel="stylesheet" type="text/css" href="<%=basePath%>js/easyui/demo/demo.css">
	<script type="text/javascript" src="<%=basePath%>js/easyui/jquery.min.js"></script>
	<script type="text/javascript" src="<%=basePath%>js/easyui/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="<%=basePath%>js/datagrid-cellediting.js"></script>
	<script type="text/javascript" src="<%=basePath%>js/easyui/locale/easyui-lang-zh_CN.js"></script>
	
	<script type="text/javascript" src="<%=basePath%>js/jquery-ui.min.js"></script>	
	 <script type="text/javascript" src="<%=basePath%>js/jquery-ui.js"></script>

	
	
	<script type="text/javascript" src="<%=basePath%>js/printplugins/CreateControl.js"></script>
	
    <script type="text/javascript">
    CreateReport("Report");
    
    </script>
	
<!-- 每次都要改下页面内容，js 才会更新outlook.js -->	
	
<title>Insert title here</title>
	<script>
	/*
		function addTab(title, url){
			if ($('#mainPanle').tabs('exists', title)){
				$('#mainPanle').tabs('select', title);
			} else {
				var content = '<iframe scrolling="auto" frameborder="0"  src="'+url+'" style="width:100%;height:100%;"></iframe>';
				$('#mainPanle').tabs('add',{
					title:title,
					content:content,
					closable:true
				});
			}
		} 
	
	    //	   <style type="text/css">
     //   .subtotal { font-weight: bold; }/*合计单元格样式*/
      // </style> 

       /*      function onLoadSuccess() {
             //添加“合计”列
            $('#table').datagrid('appendRow', {
                 Saler: '<span class="subtotal">合计</span>',
                 TotalOrderCount: '<span class="subtotal">' + compute("TotalOrderCount") + '</span>',
                 TotalOrderMoney: '<span class="subtotal">' + compute("TotalOrderMoney") + '</span>',
                 TotalOrderScore: '<span class="subtotal">' + compute("TotalOrderScore") + '</span>',
                 TotalTrailCount: '<span class="subtotal">' + compute("TotalTrailCount") + '</span>',
                 Rate: '<span class="subtotal">' + ((compute("TotalOrderScore") / compute("TotalTrailCount")) * 100).toFixed(2) + '</span>'
             });
         }
        //指定列求和
        function compute(colName) {
             var rows = $('#table').datagrid('getRows');
             var total = 0;
             for (var i = 0; i < rows.length; i++) {
                 total += parseFloat(rows[i][colName]);
             }
             return total; 
         } */
  
	</script>
	
    <script type="text/javascript">
    var seachform;
    var json;
    var map=JSON.stringify(${map1});//eval('('+${map1}+')');  Map转String：
    var pfields =undefined; //字段属性集合
    var tf=undefined;
    var GoodsID="";
    var GID="";
    var Code="";
    var ColorID="";
    var Color ="";
    var SizeID="";
    var Size="";
  //在网页初始加载时向报表提供数据
    function window_onload() {
    	 Report.LoadFromURL("<%=basePath%>js/printplugins/grf/possales.grf?timeStamp="+new Date().getTime());
    	 
    }
   
    var editRow = undefined;
    
    function endEditing()
    {
       if(editRow == undefined) {return true;}//如果为undefined的话，为真，说明可以编辑
       if($('#dg').datagrid('validateRow',index)) {
           $('#dg').datagrid('endEdit',index);//当前行编辑事件取消
           editRow = undefined; return true;//重置编辑行索引对象，返回真，允许编辑
        }else{return false;}//否则，为假，返回假，不允许编辑
    }
    
 $(function(){ 
	
	 
    $('#dg').datagrid({
    	url:"<%=basePath%>possalesdetail/listdata.do",
    	fit:true,//自动适应边距
    	rownumbers :"true" ,
    	fitColumns:true,//例自动适应边距
    	border:false,
    	cache : false, 
     	showFooter: true,
    	//singleSelect: true,
    	dataType :"json",
    	idField:"PosSalesDetailID",//加上这个才能获得id
    	pagination:true,//显示分页
    	pagePosition:"bottom",//分页显示的位置
      	toolbar:toolbar,
    //	sortName:’createdatetime’,//按什么排序
     // 	sortOrder:’desc’,
      queryParams:{
    	 // BeginDate:'2016-01-01',    //myformatter(new Date()),  //加载时传的参数
       //   EndDate :myformatter(new Date()),    
          map:map
    	}, 
       
     
    
    	pageList:[10,20,30,40,50],
    	
    	columns : [ [    
      
       {
		field : "ck",
		checkbox:true,
		width : 50,
		hidden:true
		//editor: { type: 'text', options: { required: true } } 
		},  
		
    	             {
    	          		field : "GoodsID",
    	          		title : "货品ID",
    	          		width : 50,
    	          		hidden:true
    	          		//editor: { type: 'text', options: { required: true } } 
    	          		},         
    	    {
     		field : "Code",
     		title : "货号",
     		width : 50,
     		hidden:false
     		//editor: { type: 'text', options: { required: true } } 
     		},
     		{
         		field : "Name",
         		title : "货品名称",
         		width : 50,
         		hidden:false
         		 //格式化时间操作
         		
         		
         		
         		},
     	    {
         		field : "Color",
         		title : "颜色",
         		width : 50,
         		hidden:false
         		//editor: { type: 'text', options: { required: true } } 
         		},         		
    	    
    	    {
    		field : "Size",
    		title : "尺码",
    		width : 50,
    		hidden:false
    		//editor: { type: 'text', options: { required: true } } 
    		},
    	
    		
    		{
        		field : "Quantity",
        		title : "数量",
        		width : 50,
        		hidden:false,
        		sum: 'true'  //是否统计
        	//	editor: { type: 'text', options: { required: true } } 
        		
        		},
        		{
            		field : "UnitPrice",
            		title : "单价",
            		width : 50,
            		hidden:false,
            		sum: 'true'   //是否统计
            		//editor: { type: 'text', options: { required: true } }         		
            		},
    		{
        		field : "FactAmount",
        		title : "实收金额",
        		width : 50,
        		hidden:false,
        		sum: 'true'   //是否统计
        		//editor: { type: 'text', options: { required: true } }         		
        		}
    		
    		]],
    		onAfterEdit:function(rowIndex, rowData, changes){
    		//	 tf.editor={};
    			 if(rowData.Quantity !=undefined && rowData.UnitPrice !=undefined ){
    			 $("#dg").datagrid("updateRow",{ 
                     index:rowIndex, //行索引  
                     row:{  
                    	 FactAmount:rowData.Quantity*rowData.UnitPrice //行中的某个字段  
                     }  
                 }); 
    			 }
    		},
    		  //开始 编辑前
    		onBeginEdit:function(rowIndex, rowData){ 
    			   
    			GID =rowData.GoodsID;
    		/*	 pfields = $(this).datagrid('getColumnFields',true).concat($(this).datagrid('getColumnFields'));
    			  
    			console.log(pfields.length);
    			
    			
    			   var editors = $('#dg').datagrid('getEditors', rowIndex);
                   for (var i = 0, len = editors.length; i < len; i++) {
                   var editor = editors[i];
                   $(editor.target).bind('keyup', function (e) {
                       var code = e.keyCode || e.which;
                       if (code == 13) {
                           $('#dg').datagrid('endEdit', editRow);
                          
                           
                           
                           //do something
                           /*
                           for(var j=0; j<pfields.length; j++){
                        	   if(tf==pfields[j]){ //最前一列时换行
                        	   if(j==0){
                        	   editRow=editRow-1;
                        	   tf=pfields[pfields.length-1];
                        	   break;
                        	   }
                        	   tf=pfields[j-1];
                        	   focusEditor(tf);
                        	   break;
                        	   }
                           } */
                           
                 /*          
                           
                       }
                   });
                   }	*/	
    		
    			
    			
    			
    	     /*   var ed = $('#dg').datagrid('getEditors', rowIndex);
    	        
    	        pfields=$('#dg').datagrid('getColumnFields');
    	        
    	        
    	      //  var n1 = $(editors[0].target);  
    	       // var n2 = $(editors[1].target);  
    	      //  var n3 = $(editors[2].target); 
    	     // var editors= $('#dg').datagrid('getEditor', {index:1,field:'Code'})
    	        for (var i = 0; i < ed.length; i++){  
                    var ei = ed[i];    
                      // if(ei.field == "Code") { // click 'keydown'
                        $(ei.target).bind("keydown",function(e){  
                        	var code = e.keyCode || e.which;
                        	if(code == 13){
                        	    //保存更改 第一次编辑可能不会改变值
                        	  //  $('#dg').datagrid('acceptChanges');
                        	  //  $('#dg').datagrid('editCell',{index:ei,field:ei.field});
                        	  //  $('#dg').datagrid('endEdit', ei);
                        	    //do something
                        	   
                        	    //editRow=editRow+1;
                        	    //console.log(editRow);
                        	   // alert("enter me");
                        	   
                        	//	debugger;
              
                    			if(e.preventDefault){ //屏蔽浏览器快捷键
                    			e.preventDefault();
                    			e.stopPropagation()
                    			}else{
                    			e.returnValue=false;
                    			e.cancelBubble=true
                    			}
                    			//var index = $('#dg').datagrid('getRowIndex', editRow);
                    			$("#dg").datagrid('endEdit', editRow);
                    			for(var j=0; j<pfields.length; j++){ 
                    			if(ei.field==pfields[j]){
                    			if(j==pfields.length-1){//最后一列时换行
                    				editRow=editRow+1;
                    				ei.field=pfields[0];
                    			break;
                    			}
                    			ei.field=pfields[j+1];
                    			break;
                    			}
                    			}
                        	   
                    			  
                    			    
                                  $('#dg').datagrid('endEdit', rowIndex);
                                  $('#dg').datagrid('updateRow', { index: editRow, row: {FactAmount: rowData.Quantity*rowData.UnitPrice} });
                        	}
                           // alert("enter me");  
                        });  
                     //  }  
                } 
    	        
    	   /*     n1.add(n2).numberbox({  
    	            onChange:function(){  
    	                var cost = n1.numberbox('getValue')*n2.numberbox('getValue');  
    	                n3.numberbox('setValue',cost);  
    	            }  
    	        }） */
    	    }, 
    	    onEndEdit:function(rowIndex,rowData){
    	    	if(GoodsID !=""){
    	    	rowData.GoodsID=GoodsID;
    	    	}
    	    	if(Code !=""){
        	    	rowData.Code=Code;
        	    	}
    	    	if(ColorID !=""){
        	    	rowData.ColorID=ColorID;
        	    	}
        	    	if(Color !=""){
            	    	rowData.Color=Color;
            	   }
        	    	if(SizeID !=""){
            	    	rowData.SizeID=SizeID;
            	    	}
            	    	if(Size !=""){
                	    	rowData.Size=Size;
                	   }  	
        	    	
        	    	
    	    	
    	    },
    		//单击事件   
    		onClickRow:function(rowIndex,rowData){
    		  
    		/*	  if(editRow !=undefined){
    				  $('#dg').datagrid('endEdit',editRow);//当前行编辑事件取消
    				  editRow = undefined;
    				 // $("#dg").datagrid('rejectChanges');
    		          $("#dg").datagrid('unselectAll');
    		          console.log(rowIndex);
    		          $("#dg").datagrid('beginEdit',  rowIndex);
    		          editRow=rowIndex;
    			         }else {
    			        	 //console.log(rowIndex);
    			        	 editRow= rowIndex;
    			        	 
    			        	 
    			        	 
    			        	 $('#dg').datagrid('beginedit',editRow);
    			        	
    			        	 // $('#dg').datagrid('selectRow',rowIndex);
    			        	 console.log(editRow);
    			         } */
    		},
    		//双击事件
    		onDblClickRow :function(rowIndex,rowData){
    			//console.log(rowIndex);
    			//console.log(rowData.PosSalesID);
    		//alert("双击");
    		
    		//serializeObject(seachform)
    	//	if (seachform !==undefined){
    	//	console.log(serializeObject(seachform));// 表单的条件要记住为返回当页准备
    	//	}else{
    	//		console.log($('#dg').datagrid('options').queryParams.BeginDate);
    	//	}
    		
    		//var options=$("#dg").data("pagination").options;
    		//var curr = options.page;
    //		var page = $('#dg').datagrid('options').pageNumber;//pageNumber为datagrid的当前页码
    		//var rowsData= $("#dg").datagrid("getRows");
    		//var rows=rowsData.length;
    	// 	var rows= $('#dg').datagrid('options').pageSize;
    	 	//js Map创建：
    ////	 	var map = {};
    	// 	map['POSSalesID'] =rowData.PosSalesID;
    	// 	map['page']=page;
    	// 	map['rows']=rows;
    	// 	map['Department']=rowData.Department;
    	// 	map['DepartmentID']=rowData.DepartmentID;
    	// 	map['QuantitySum']=rowData.QuantitySum;
    	// 	map['FactAmoutSum']=rowData.FactAmountSum;
    	 //	map =encodeURI(map); JSON.stringify(map)
    	 //1.js文件中使用encodeURI()方法(必须套两层)。
        //login_name = encodeURI(encodeURI(login_name));  
    	 	//console.log(encodeURI(encodeURI(JSON.stringify(map))));
    	 	
       //     var row = $('#dg').datagrid('getSelected');
       //     if (row) {
              
              //  var jq = top.jQuery;
             // 获取选中的标签页面板（tab panel）和它的标签页（tab）对象
             //   var tab = jq('#tabs').tabs('getSelected');
              //  var tab = pp.panel('options').tab; // 相应的标签页（tab）对象 
               // var tab = jq('#tabs').tabs('select',title);  //'getTab',0 取得第一个tab
                //jq('#tabs').tabs('update', {
                   // tab: tab,
                  //  options: {
                 //       title: 'New Title'
                //    }
               // });
             //   window.location.href="<%=basePath%>possalesdetail/detail.do?map="+encodeURI(encodeURI(JSON.stringify(map)));
                // testAddSubPage('小票列表',"<%=basePath%>possalesdetail/detail.do?map="+encodeURI(encodeURI(JSON.stringify(map))));
        //    }
    	 
     	 	
    	 //	window.open("?map="+JSON.stringify(map));
    	 	
    		//console.log(page);  
    		//console.log(rows);
    		
    		
    		},
    		onLoadSuccess: function (data) {
                  // $('#dg').datagrid('statistics');
                 //  $('#dg').datagrid('selectRow',0);   
                 //   $('#dg').datagrid('keyCtr');  
                 $('#dg').datagrid('enableCellEditing');
                //合计
               },
    
	});
    $.extend($.fn.datagrid.methods, //扩展方法
    	    {
    	        statistics: function (jq) {
    	            var opt = $(jq).datagrid('options').columns;
    	            var rows = $(jq).datagrid("getRows");
    	            var footer = new Array();
    	            footer['sum'] = "";
    	            for (var i = 0; i < opt[0].length; i++) {
    	                if (opt[0][i].sum) {
    	                    footer['sum'] = footer['sum'] + sum(opt[0][i].field, 1) + ',';
    	                }
    	            }
    	            var footerObj = new Array();
    	            if (footer['sum'] != "") {
    	                var tmp = '{' + footer['sum'].substring(0, footer['sum'].length - 1) + "}";
    	                var obj = eval('(' + tmp + ')');
    	                if (obj[opt[0][0].field] == undefined) {
    	                    footer['sum'] += '"' + opt[0][0].field + '":"<b>合计:</b>"';

    	                    //第0列显示为合计
    	                    obj = eval('({' + footer['sum'] + '})');
    	                }
    	                else {
    	                    obj[opt[0][0].field] = "<b>合计:</b>" + obj[opt[0][0].field];
    	                }
    	                footerObj.push(obj);
    	            }
    	            if (footerObj.length > 0) { $(jq).datagrid('reloadFooter', footerObj); }
    	            function sum(filed) {
    	                var sumNum = 0;
    	                var str = "";
    	                for (var i = 0; i < rows.length; i++) {
    	                    var num = rows[i][filed];
    	                    if (typeof(num)=="undefined") //此字段没有值时，如充值单
    	                    {
    	                    	num =0;	
    	                    } 
    	                    console.log(num);
    	                    sumNum =sumNum+num ;//parseFloat(num) Number(num);
    	                }
    	            //return '"' + filed + '":"' + sumNum.toFixed(2) + '"';  //返回两位的小数位的
    	                return '"' + filed + '":"' + sumNum+ '"';
    	            
    	   

    	          
    	            }
    	        }
    	    });
    
    

    //动态添加editor
    
    $.extend($.fn.datagrid.methods, {  
        addEditor : function(jq, param) {  
            if (param instanceof Array) {  
                $.each(param, function(index, item) {  
                    var e = $(jq).datagrid('getColumnOption', item.field);  
                    e.editor = item.editor;  
                });  
            } else {  
              //获取datagrid字段的属性
                var e = $(jq).datagrid('getColumnOption', param.field);  
              //给编辑器赋值
               console.log(e);
                e.editor = param.editor;  
            }  
        },  
        removeEditor : function(jq, param) {  
            if (param instanceof Array) {  
                $.each(param, function(index, item) {  
                    var e = $(jq).datagrid('getColumnOption', item.field);  
                    e.editor = {};  
                });  
            } else {  
                var e = $(jq).datagrid('getColumnOption', param.field);  
                e.editor = {};  
            }  
        }  
    }); 

    
    
    
    
    
   //在子页面找父页面的div
    function testAddSubPage(title,url){    
        
        var jq = top.jQuery;    
    
        if (jq("#tabs").tabs('exists', title)){    
            jq("#tabs").tabs('select', title);    
        } else {  
              var content = '<iframe scrolling="auto" frameborder="0"  src="'+url+'" style="width:100%;height:100%;"></iframe>';     
               jq("#tabs").tabs('add',{    
                                  title:title,    
                                  content:content,    
                                  closable:true    
                                });    
         }    
    } 
    
    
    function myformatter(date){  
    	console.log(date);  //要返回这种格式 的2019-06-12
        var y = date.getFullYear();  
        var m = date.getMonth()+1;  
        var d = date.getDate();  
        return y+'-'+(m<10?('0'+m):m)+'-'+(d<10?('0'+d):d);  
    }  
              
    function myparser(s){  
        if (!s) return new Date();  
        var ss = (s.split('-'));  
        var y = parseInt(ss[0],10);  
        var m = parseInt(ss[1],10);  
        var d = parseInt(ss[2],10);  
        if (!isNaN(y) && !isNaN(m) && !isNaN(d)){  
            return new Date(y,m-1,d);  
        } else {  
            return new Date();  
        }  
    }  
    
    //设置时间  
 var curr_time = new Date();   
    
 json =eval('('+map+')');
 //$("#BeginDate").datebox("setValue",myformatter(curr_time));
 //$("#BeginDate").datetimebox("setValue",json.Date);
 //$("#EndDate").datebox("setValue",myformatter(curr_time));  
 //获取时间   data-options="formatter:myformatter,parser:myparser" href="javascript:void(0)"
// var BeginDate=$("#BeginDate").datetimebox("getValue");  
 //var EndDate=$("#EndDate").datebox("getValue");  
 console.log(json);

 $("#BeginDate").datetimebox({
    value: json.Date,
    required: true,
    showSeconds: true
});   

 //required="required" 
 
 $(".datetimebox :text").attr("readonly","readonly");
 
 $("#DepartmentID").val(json.DepartmentID); 
 $("#Department").val(json.Department); 
 $("#No").val(json.No); 
 
 //载入页面时
 $('#remove').linkbutton("disable");
 

 
 
 
 
 

 window_onload();
 
 //$('#main').layout('collapse','north');  
 

 
  });


 function serializeObject(form){
	    var o={};
	    $.each(form.serializeArray(),function(index){
	        
	              if(o[this['name'] ]){
	           
	                   o[this['name'] ] = o[this['name'] ] + "," + this['value'];

	               }else{

	                  o[this['name'] ]=this['value'];

	               }

	        })

	      return o;
	}
 function doback(){
	 
	 window.location.href="<%=basePath%>possales/list2.do?page="+json.page+"&rows="+json.rows;
	 
	 
 }
 
 function endEditing(){  
	    if (editRow == undefined){return true}//如果为undefined的话，为真，说明可以编辑  
	    if ($('#dg').datagrid('validateRow', editRow)){  
	        $('#dg').datagrid('endEdit', editRow);  //判断是否有开启编辑的行，如果有则把开户编辑的那行结束编辑  
	        editRow = undefined;  
	        return true;  
	    } else {  
	        return false;  
	    }  
	}
 
 
 
 
 function doprint(){
 // using "<%=basePath%>js/printplugins/CreateControl.js";
 // console.log(json.POSSalesID);
 // CreatePrintViewerEx("100%", "100%", "<%=basePath%>js/printplugins/grf/possales.grf?timeStamp="+new Date().getTime(), "<%=basePath%>possales/exportdata.do?possalesid="+json.POSSalesID, true, ""); 
 //  debugger;
 
  Report.LoadDataFromURL("<%=basePath%>possales/exportdata.do?possalesid="+json.POSSalesID);
  
  Report.PrintPreview(true);
 
 }
 
 function doexportExcel(){
	 
	 Report.LoadDataFromURL("<%=basePath%>possales/exportdata.do?possalesid="+json.POSSalesID);

	    //要改变导出默认选项参数，响应IGridppReport.ExportBegin 事件，在事件函数中设置选项参数属性，具体参考例子03.Export
	 Report.ExportDirect(1, "销售小票.xls", true,  true); //gretXLS = 1, 	 
	 
	 
 }

 $.extend($.fn.datagrid.defaults.editors, {
		combogrid: {
			init: function(container, options){
				var input = $('<input type="text" class="datagrid-editable-input">').appendTo(container); 
				input.combogrid(options);
				return input;
			},
			destroy: function(target){
				$(target).combogrid('destroy');
			},
			getValue: function(target){
				return $(target).combogrid('getValue');
			},
			setValue: function(target, value){
				$(target).combogrid('setValue', value);
			},
			resize: function(target, width){
				$(target).combogrid('resize',width);
			}
		}
	});
 
 function doSearch(){
	 seachform=$("#form1").form();
	 console.log(serializeObject(seachform));
	 	$('#dg').datagrid('load',{
	 		
	 		BeginDate :$("#BeginDate").val(),
	 		EndDate :$("#EndDate").val(),
	 		DepartmentID: $('#DepartmentID').val(),
	 		GoodsID: $('#GoodsID').val()
	 	});
	 	
	 }
 
 
 
  

	var toolbar = [{
		text:'增加',
		iconCls:'icon-add',
		handler:function(){
			//alert('add')
			 $('#remove').linkbutton("enable");
	  if (editRow != undefined) {
        $("#dg").datagrid('endEdit', editRow);
        
      //  editRow=$('#dg').datagrid('selectRow',index);//行号 
        //var row = $('#dg').datagrid('getSelected'); //2.获取选中行的值
        console.log(editRow);
        editRow=undefined;
        
      };
	  if (editRow == undefined) {
		 var rows = $('#dg').datagrid('getSelected');
		  var lastindex =$('#dg').datagrid("getRows").length;
		 // var index = $('#dg').datagrid("getRowIndex", rows[lastindex]);//rows[0]永远在第一行
		 // console.log(rows);   
		 // console.log(index);
		/*  var rows =$('#dg').datagrid("getRows");
		  var keys ={} ;//一条数据拿所有的列名
		 // console.log(keys);
		  //keys['index']=lastindex;
		  for(var key in rows[0]){  
        	  //if(arr.hasOwnProperty(key))  
        	 // console.log(key);        //键名  
        	//  console.log(rows[0][key]);   //键值  
        	  
        	  keys[key]='';
        	}
		  //如果遍历map
		  var mapstr="";
          for(var prop in keys){
              if(keys.hasOwnProperty(prop)){
                 // console.log('key is ' + prop +' and value is' + keys[prop]);
                  mapstr  =mapstr+prop+":"+"''"+",";
              }
          }
          mapstr= mapstr.substring(0,mapstr.length-1);
          
		  //console.log(mapstr);
		  var col =mapstr.split(","); */
		//  var newrow = jQuery.extend(true, {}, rows);
          $("#dg").datagrid('insertRow', {//insertRow appendRow
        	  index  :lastindex, //在指定行添加数据  // 行数从0开始计算
              
               row:{}//newrow
            	  
              
            
             
          });
          
          pfields = $('#dg').datagrid('getColumnFields',true).concat($('#dg').datagrid('getColumnFields'));
		   //  var myeditor = {make: "Honda", model: "Accord", year: 1998};
		    for(var i=0;i<pfields.length;i++){
			if(pfields[i] in{'Code':'','Color':'','Quantity':'','UnitPrice':''}){
				$("#dg").datagrid('addEditor',[ //添加cardNo列editor
				                                {field:pfields[i],editor:{
				                                    type:'textbox'
				                                  /*  options:{
				                                        required:true,
				                                        validType:'length[3,3]', 
				                                        invalidMessage:'请输入3位号码!'
				                                    } */
				                                }
				                            }]);
				
				
				
			}	
				
			}
		   // $('#dg').datagrid('enableCellEditing');
          
          
          
          var rows =$('#dg').datagrid("getRows");
         // $("#dg").datagrid('beginEdit',  rows.length-1);
        //  editRow =index-index;  //rows.length+1;
         editRow= rows.length-1;
	  }	
	}
	},
	{   id:'edit',
		text:'修改',
		iconCls:'icon-edit',
		handler:function(){
			$("#dg").datagrid('showColumn','ck');	
			 $('#remove').linkbutton("enable");
			 $("#barcode").css("display","block");
		
			// $('#barcode').next(".combo").show();

	 
			 
			 
			 
			pfields=undefined;
	    pfields = $('#dg').datagrid('getColumnFields',true).concat($('#dg').datagrid('getColumnFields'));
	   //  var myeditor = {make: "Honda", model: "Accord", year: 1998};
	   var data={"total":10,"rows":[
	                            	{"GoodsID":"009AD","Code":"001-168-2","status":"P","listprice":16.50,"attr1":"Large","itemid":"EST-1"},
	                            	{"GoodsID":"009AB","Code":"001-168-5","status":"P","listprice":18.50,"attr1":"Spotted Adult Female","itemid":"EST-10"},
	                            	{"GoodsID":"009EL","Code":"001-823-5","status":"P","listprice":18.50,"attr1":"Venomless","itemid":"EST-11"},
	                            	{"GoodsID":"RP-SN-01","Code":"DD","status":"P","listprice":18.50,"attr1":"Rattleless","itemid":"EST-12"},
	                            	{"GoodsID":"RP-LI-02","Code":"ee","status":"P","listprice":18.50,"attr1":"Green Adult","itemid":"EST-13"},
	                            	{"GoodsID":"FL-DSH-01","Code":"ff","status":"P","listprice":58.50,"attr1":"Tailless","itemid":"EST-14"},
	                            	{"GoodsID":"FL-DSH-01","Code":"GG","status":"P","listprice":23.50,"attr1":"With tail","itemid":"EST-15"},
	                            	{"GoodsID":"FL-DLH-02","Code":"HH","status":"P","listprice":93.50,"attr1":"Adult Female","itemid":"EST-16"},
	                            	{"GoodsID":"FL-DLH-02","Code":"II","status":"P","listprice":93.50,"attr1":"Adult Male","itemid":"EST-17"},
	                            	{"GoodsID":"AV-CB-01","Code":"JJ","status":"P","listprice":193.50,"attr1":"Adult Male","itemid":"EST-18"}
	                            ]};
	   
	    for(var i=0;i<pfields.length;i++){
		if(pfields[i] in{'Code':'','Color':'','Size':'','Quantity':'','UnitPrice':''}){
	    if (pfields[i]=="Code"){
	    	$("#dg").datagrid('addEditor',[ //添加cardNo列editor
			                                   
			                                {field:pfields[i],editor:{
			                                    type:'combogrid',
			                                    	options:{
			                        					panelWidth:300,
			                        					fit: true,//自动大小
			                        					idField:'GoodsID',
			                        					textField:'Code',
			                        					pagination: true,           //是否分页  
			                        				    rownumbers: true,           //序号 
			                        					//url:'datagrid_data.json',
			                        					url:'<%=basePath%>goods/search.do',
			                        					pageSize:10,               //每页显示的记录条数，默认为10  
                                                        pageList: [10,15,20],  
			                        					//data:data,
			                        					columns:[[
			                        						{field:'Code',title:'货品编码'},
			                        						{field:'Name',title:'货品名称'},
			                        						{field:'SupplierCode',title:'厂商编码'}
			                        					]],keyHandler: { 
			                        						up: function() {}, 
			                        						down: function() {}, 
			                        						enter: function() {}, 
			                        						query: function(q) { 
			                        						//动态搜索 
			                        						if (q.length>4){
			                        						$('.datagrid-editable-input').combogrid("grid").datagrid("reload", { 'keyword': q }); 
			                        						$('.datagrid-editable-input').combogrid("setValue", q); 
			                        						}
			                        						} 
			                        						},
			 
			                        					onSelect:function(index,row){

			                        						GoodsID = row.GoodsID;

			                        						Code = row.Code;
			                        						
			                        						

			                        						}
			                        				}
			                                }
			                                
			                            }]);
				
		}else if(pfields[i]=="Color")
		{
			$("#dg").datagrid('addEditor',[ //添加cardNo列editor
			                                   
			                                {field:pfields[i],editor:{
			                                    type:'combogrid',
			                                    	options:{
			                        					panelWidth:300,
			                        					fit: true,//自动大小
			                        					idField:'ColorID',
			                        					textField:'Color',
			                        					pagination: true,           //是否分页  
			                        				    rownumbers: true,           //序号 
			                        					//url:'datagrid_data.json',
			                        					url:'<%=basePath%>color/search.do',
			                        					pageSize:10,               //每页显示的记录条数，默认为10  
                                                        pageList: [10,15,20],   ////data:data,          					
                                                        columns:[[
			                        						{field:'No',title:'颜色编码'},
			                        						{field:'Color',title:'颜色名称'}
			                        						
			                        					]],
			                        					keyHandler: {
			                        						up: function() {}, 
			                        						down: function() {}, 
			                        						enter: function() {},
			                        				
			                        						query: function(q) {
			                        						//动态搜索 
			                        					
			                        					
			                        						console.log(GID);
			                        						$('.datagrid-editable-input').combogrid("grid").datagrid("reload", 
			                        						{'keyword': q ,'GoodsID':GID}); 
			                        						$('.datagrid-editable-input').combogrid("setValue", q); 
			                        						}
			                        		
			                        						},
			 
			                        					onSelect:function(index,row){

			                        						ColorID = row.ColorID;

			                        						Color = row.Color;

			                        						

			                        						}
			                        				}
			                                }
			                                
			                            }]);
			
		}else if(pfields[i]=="Size")
		{
			$("#dg").datagrid('addEditor',[ //添加cardNo列editor
			                                   
			                                {field:pfields[i],editor:{
			                                    type:'combogrid',
			                                    	options:{
			                        					panelWidth:300,
			                        					fit: true,//自动大小
			                        					idField:'SizeID',
			                        					textField:'Size',
			                        					//pagination: true,           //是否分页  
			                        				    rownumbers: true,           //序号 
			                        					//url:'datagrid_data.json',
			                        					url:'<%=basePath%>size/search.do',
			                        					pageSize:10,               //每页显示的记录条数，默认为10  
                                                        pageList: [10,15,20],   ////data:data,          					
                                                        columns:[[
			                        						{field:'SizeNo',title:'尺码编码'},
			                        						{field:'Size',title:'尺码名称'}
			                        						
			                        					]],
			                        					keyHandler: {
			                        						up: function() {}, 
			                        						down: function() {}, 
			                        						enter: function() {},
			                        				
			                        						query: function(q) {
			                        						//动态搜索 
			                        					
			                        					
			                        						console.log(GID);
			                        						$('.datagrid-editable-input').combogrid("grid").datagrid("reload", 
			                        						{'keyword': q ,'GoodsID':GID}); 
			                        						$('.datagrid-editable-input').combogrid("setValue", q); 
			                        						}
			                        		
			                        						},
			 
			                        					onSelect:function(index,row){

			                        						SizeID = row.SizeID;

			                        						Size = row.Size;

			                        						

			                        						}
			                        				}
			                                }
			                                
			                            }]);
			
		}
		
		else{
			$("#dg").datagrid('addEditor',[ //添加cardNo列editor
			                                   
			                                {field:pfields[i],editor:{
			                                    type:'numberbox'
			                                  /*  options:{
			                                        required:true,
			                                        validType:'length[3,3]', 
			                                        invalidMessage:'请输入3位号码!'
			                                    } */
			                                }
			                                
			                            }]);		
			
		}
		}
			
		}	  	
			
		//	alert('edit')
	    var row = $("#dg").datagrid('getSelected');
		if (row) {
			var rowIndex = $("#dg").datagrid('getRowIndex', row);
			$("#dg").datagrid('beginEdit', rowIndex);
			editRow =rowIndex;
		}
		
	
		
		}
	},
	{   id:'remove',
		text:'删除',
		iconCls:'icon-remove',
		handler:function(){
			//alert('cut')
			//var row = $("#dg").datagrid('getSelected');
		   var selectarray 	=$("#dg").datagrid('getChecked');
		   console.log(selectarray.length);
	 if(selectarray.length){
		  for(var i=0;i<=selectarray.length;i++){
		    var r=selectarray[i];
		    console.log(r);
		   var id = $("#dg").datagrid('getRowIndex',r);
		      $("#dg").datagrid('deleteRow', id);
			
	
		  }
	 }	  
		}
	},'-', {
		id:'redo',
        text: '撤销', iconCls: 'icon-redo', handler: function () {
            editRow = undefined;
            $("#dg").datagrid('hideColumn','ck');
            $("#remove").linkbutton('disable');
            pfields = $('#dg').datagrid('getColumnFields',true).concat($('#dg').datagrid('getColumnFields'));
			   //  var myeditor = {make: "Honda", model: "Accord", year: 1998};
			    for(var i=0;i<pfields.length;i++){
				if(pfields[i] in{'Code':'','Color':'','Size':'','Quantity':'','UnitPrice':''}){
					$("#dg").datagrid('removeEditor',[ //添加cardNo列editor
					                                {field:pfields[i],editor:{
					                                    type:'textbox'
					                                  /*  options:{
					                                        required:true,
					                                        validType:'length[3,3]', 
					                                        invalidMessage:'请输入3位号码!'
					                                    } */
					                                }
					                            }]);
					
					
					
				}	
					
				}	
            
            $("#dg").datagrid('disableCellEditing');
            
            $("#dg").datagrid('uncheckAll');
            
            $("#dg").datagrid('rejectChanges');
            $("#dg").datagrid('unselectAll');
            
        }
	},'-',{
		id:'save',
		text:'保存',
		iconCls:'icon-save',
		handler:function(){
			  $("#dg").datagrid('endEdit', editRow);
			  $("#dg").datagrid('hideColumn','ck');
              //如果调用acceptChanges(),使用getChanges()则获取不到编辑和新增的数据。
              $("#remove").linkbutton('disable');
              //使用JSON序列化datarow对象，发送到后台。
              var rows = $("#dg").datagrid('getChanges');
              console.log(rows);
              
              //var rowstr = JSON.stringify(rows);
             // console.log(rowstr);
            //  $.post('/Home/Create', rowstr, function (data) {
                   
            //  });
			//alert('save')
			
			  if ($("#dg").datagrid('getChanges').length) {
					var inserted = $("#dg").datagrid('getChanges', "inserted");
					var deleted =$("#dg").datagrid('getChanges', "deleted");
					var updated = $("#dg").datagrid('getChanges', "updated");
					
					var effectRow = new Object();
					if (inserted.length) {
						effectRow["inserted"] = JSON.stringify(inserted);
					}
					if (deleted.length) {
						effectRow["deleted"] = JSON.stringify(deleted);
					}
					if (updated.length) {
						effectRow["updated"] = JSON.stringify(updated);
					}

					$.post('<%=basePath%>possales/save.do', effectRow, function(rsp) {
						var r=eval('('+rsp+')');
						if(r.status){
							$.messager.alert("提示", "提交成功！");
							//$("#dg").datagrid('acceptChanges');
							//$("#dg").datagrid('getChanges');
							$("#dg").datagrid('load');
							editRow =undefined;
							$("#dg").datagrid('disableCellEditing');
							   pfields = $('#dg').datagrid('getColumnFields',true).concat($('#dg').datagrid('getColumnFields'));
							   //  var myeditor = {make: "Honda", model: "Accord", year: 1998};
							    for(var i=0;i<pfields.length;i++){
								if(pfields[i] in{'Code':'','Color':'','Size':'','Quantity':'','UnitPrice':''}){
									$("#dg").datagrid('removeEditor',[ //添加cardNo列editor
									                                {field:pfields[i],editor:{
									                                    type:'textbox'
									                                  /*  options:{
									                                        required:true,
									                                        validType:'length[3,3]', 
									                                        invalidMessage:'请输入3位号码!'
									                                    } */
									                                }
									                            }]);
									
									
									
								}	
									
								}	  
							
							
							
							
							
						
						}
					}, "json").error(function() {
						$.messager.alert("提示", "提交错误了！");
						   pfields = $('#dg').datagrid('getColumnFields',true).concat($('#dg').datagrid('getColumnFields'));
						   //  var myeditor = {make: "Honda", model: "Accord", year: 1998};
						    for(var i=0;i<pfields.length;i++){
							if(pfields[i] in{'Code':'','Color':'','Quantity':'','UnitPrice':''}){
								$("#dg").datagrid('removeEditor',[ //添加cardNo列editor
								                                {field:pfields[i],editor:{
								                                    type:'textbox'
								                                  /*  options:{
								                                        required:true,
								                                        validType:'length[3,3]', 
								                                        invalidMessage:'请输入3位号码!'
								                                    } */
								                                }
								                            }]);
								
								
								
							}	
								
							}	   	
						
					});
				}

			
			
		}
		
	}];

  
  
    </script>	
    <Style>
	#css3menu li{ float:left; list-style-type:none;}
   #css3menu li a{	color:#fff; padding-right:20px;}
   #css3menu li a.active{color:yellow;}
</style>

	
	
</head>
<body id="main" class="easyui-layout" style="overflow-y: hidden"  scroll="no">

<div region="north" split="true" class="easyui-accordion"  border="false" style="overflow: hidden; height: auto;">
 <div id="tb" style="padding:3px;Margin-bottom:5px">
<a  class="easyui-linkbutton" plain="true" onclick="doback()">返回列表</a>

<a  class="easyui-linkbutton" plain="true" onclick="doprint()">打印</a>
 
<a  class="easyui-linkbutton" plain="true" onclick="doexportExcel()">导出Excel</a>
<a  class="easyui-linkbutton" plain="true" onclick="removePanel()">删除南部</a>

 
  <form id="form1">
    <span>日期</span>
    <input id="BeginDate" name="BeginDate" type="text" class="easyui-datetimebox" >-
   <!--  <input id="EndDate" name="EndDate" type="text" class="easyui-datebox" required="required" >  -->
	<span>单号:</span>
	<input id="No" name="No" type="text" style="line-height:26px;border:1px solid #ccc">
	<span>部门:</span>
	<input id="DepartmentID" name="DepartmentID" type="hidden">
	<input id="Department" name="Department" type="text" style="line-height:26px;border:1px solid #ccc">
	<span>货品:</span>
	<input id="GoodsID" nae="GoodsID" style="line-height:26px;border:1px solid #ccc">
	<a  class="easyui-linkbutton" plain="true" onclick="doSearch()">Search</a>
  </form>	
</div>
</div>

 <div region="center" split="true" border="false" style="overflow: hidden; height: 500px;">

	<table id="dg" class="easyui-datagrid" style="width:700px;height:auto;Margin-Top:5px;" >
	
	</table>
 
</div>

<div region="south"  split="true" border="false" style="overflow: hidden; height: 50px;">
<div id="content"><label style="display: inline-block;float: left;">新增输入</label><input id="barcode" Name="barcode"   type="text"  style="display:none;width:200px;height:20px;float: left; "></div>
</div>



<script type="text/javascript">
var availableTags = [
                     "ActionScript",
                     "AppleScript",
                     "Asp",
                     "BASIC",
                     "C",
                     "C++",
                     "Clojure",
                     "COBOL",
                     "ColdFusion",
                     "Erlang",
                     "Fortran",
                     "Groovy",
                     "Haskell",
                     "Java",
                     "JavaScript",
                     "Lisp",
                     "Perl",
                     "PHP",
                     "Python",
                     "Ruby",
                     "Scala",
                     "Scheme"
                   ];
$("#barcode").autocomplete({
    source: availableTags
});                   
                   
                   
function removePanel(){
	//$('#cc').layout('remove', $('#region').val());
	//$('#main').layout('remove','south');
	$("#barcode").css("display","none");
  // $('#barcode').combogrid({
   //   hide:true	   
  // });
  
	//$('#barcode').combo('destroy'); //.next(".combo")//.hide();
//	$('#barcode').next(".combo").hide();
}
//blur
/*
$("#barcode").focus(function(){
	
	$("#barcode").css("display","none");
	 $('#barcode').combogrid({    
		    panelWidth:450,    
		    value:'006',    
		     
		    idField:'code',    
		    textField:'name',    
		    hasDownArrow:false,
		    editable:true,
		    width: 202,
		    height: 25,
		    plain :true,
		   // url:'datagrid_data.json',    
		    columns:[[    
		        {field:'code',title:'Code',width:60},    
		        {field:'name',title:'Name',width:100},    
		        {field:'addr',title:'Address',width:120},    
		        {field:'col4',title:'Col41',width:100}    
		    ]]    
		}); 
				 
	//	 $('#barcode').next(".combo").show();	
		 
		
	});

  */




</script>

</body>
</html>