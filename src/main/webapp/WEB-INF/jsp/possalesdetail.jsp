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
	
	<link rel="stylesheet" type="text/css" href="<%=basePath%>js/easyui/demo/demo.css">
	<script type="text/javascript" src="<%=basePath%>js/easyui/jquery.min.js"></script>
	<script type="text/javascript" src="<%=basePath%>js/easyui/jquery.easyui.min.js"></script>

	<script type="text/javascript" src="<%=basePath%>js/easyui/locale/easyui-lang-zh_CN.js"></script>
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
 
  //在网页初始加载时向报表提供数据
    function window_onload() {
    	 Report.LoadFromURL("<%=basePath%>js/printplugins/grf/possales.grf");
    }
   
   
 $(function(){ 
	
	 
    $('#tt').datagrid({
    	url:"<%=basePath%>possalesdetail/listdata.do",
    	fit:true,//自动适应边距
    	rownumbers :"true" ,
    	fitColumns:true,//例自动适应边距
    	border:false,
    	cache : false, 
     	showFooter: true,
    	singleSelect: true,
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
     		field : "Code",
     		title : "货号",
     		width : 50,
     		hidden:false
     		},
     		{
         		field : "Name",
         		title : "货品名称",
         		width : 50,
         		hidden:false,
         		 //格式化时间操作
         		
         		
         		
         		},
     	    {
         		field : "Color",
         		title : "颜色",
         		width : 50,
         		hidden:false
         		},         		
    	    
    	    {
    		field : "Size",
    		title : "尺码",
    		width : 50,
    		hidden:false
    		},
    	
    		
    		{
        		field : "Quantity",
        		title : "数量",
        		width : 50,
        		hidden:false,
        		sum: 'true'   //是否统计
        		
        		},
    		{
        		field : "FactAmount",
        		title : "实收金额",
        		width : 50,
        		hidden:false,
        		sum: 'true'   //是否统计
        		
        		}
    		
    		]],
    		//双击事件
    		onDblClickRow :function(rowIndex,rowData){
    			//console.log(rowIndex);
    			//console.log(rowData.PosSalesID);
    		//alert("双击");
    		
    		//serializeObject(seachform)
    	//	if (seachform !==undefined){
    	//	console.log(serializeObject(seachform));// 表单的条件要记住为返回当页准备
    	//	}else{
    	//		console.log($('#tt').datagrid('options').queryParams.BeginDate);
    	//	}
    		
    		//var options=$("#tt").data("pagination").options;
    		//var curr = options.page;
    //		var page = $('#tt').datagrid('options').pageNumber;//pageNumber为datagrid的当前页码
    		//var rowsData= $("#tt").datagrid("getRows");
    		//var rows=rowsData.length;
    	// 	var rows= $('#tt').datagrid('options').pageSize;
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
    	 	
       //     var row = $('#tt').datagrid('getSelected');
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
                  // $('#tt').datagrid('statistics');
                 
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
 
 function doprint(){
 // using "<%=basePath%>js/printplugins/CreateControl.js";
 // console.log(json.POSSalesID);
 // CreatePrintViewerEx("100%", "100%", "<%=basePath%>js/printplugins/grf/possales.grf", "<%=basePath%>possales/exportdata.do?possalesid="+json.POSSalesID, true, ""); 
 //  debugger;
 
  Report.LoadDataFromURL("<%=basePath%>possales/exportdata.do?possalesid="+json.POSSalesID);
  
  Report.PrintPreview(true);
 
 }
 
 
 function doSearch(){
	 seachform=$("#form1").form();
	 console.log(serializeObject(seachform));
	 	$('#tt').datagrid('load',{
	 		
	 		BeginDate :$("#BeginDate").val(),
	 		EndDate :$("#EndDate").val(),
	 		DepartmentID: $('#DepartmentID').val(),
	 		GoodsID: $('#GoodsID').val()
	 	});
	 	
	 }
 
 
 
  

	var toolbar = [{
		text:'增加',
		iconCls:'icon-add',
		handler:function(){alert('add')}
	},
	{
		text:'修改',
		iconCls:'icon-edit',
		handler:function(){alert('edit')}
	},
	{
		text:'删除',
		iconCls:'icon-remove',
		handler:function(){alert('cut')}
	},
	
	'-',{
		text:'保存',
		iconCls:'icon-save',
		handler:function(){alert('save')}
	}];

  
  
    </script>	
    <Style>
	#css3menu li{ float:left; list-style-type:none;}
   #css3menu li a{	color:#fff; padding-right:20px;}
   #css3menu li a.active{color:yellow;}
</style>

	
	
</head>
<body  id="main" class="easyui-layout" style="overflow-y: hidden"  scroll="no">
 
<div region="north" split="true" class="easyui-accordion"  border="false" style="overflow: hidden; height: auto;">
 <div id="tb" style="padding:3px;Margin-bottom:5px">
<a  class="easyui-linkbutton" plain="true" onclick="doback()">返回列表</a>

<a  class="easyui-linkbutton" plain="true" onclick="doprint()">打印</a>
 
  <form id="form1">
    <span>日期</span>
    <input id="BeginDate" name="BeginDate" type="text" class="easyui-datetimebox" >-
   <!--  <input id="EndDate" name="EndDate" type="text" class="easyui-datebox" required="required" >  -->
	<span>部门:</span>
	<input id="DepartmentID" name="DepartmentID" type="hidden">
	<input id="Department" name="Department" type="text" style="line-height:26px;border:1px solid #ccc">
	<span>货品:</span>
	<input id="GoodsID" nae="GoodsID" style="line-height:26px;border:1px solid #ccc">
	<a  class="easyui-linkbutton" plain="true" onclick="doSearch()">Search</a>
  </form>	
</div>
</div>

 <div region="center" split="true" border="false" style="overflow: hidden; height: 700px;">

	<table id="tt" class="easyui-datagrid" style="width:700px;height:auto;Margin-Top:5px" >
	
	</table>
 
</div>


</body>
</html>