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
	
	<link rel="stylesheet" type="text/css" href="<%=basePath%>css/ordertable.css">
	<link rel="stylesheet" type="text/css" href="<%=basePath%>css/scm.css">
	
	<link rel="stylesheet" type="text/css" href="<%=basePath%>js/easyui/demo/demo.css">
	<script type="text/javascript" src="<%=basePath%>js/easyui/jquery.min.js"></script>
	<script type="text/javascript" src="<%=basePath%>js/easyui/jquery.easyui.min.js"></script>
	<script type="text/javascript" src="<%=basePath%>js/easyui/locale/easyui-lang-zh_CN.js"></script>
	<script type="text/javascript" src="<%=basePath%>js/autobox.js"></script>
	<script type="text/javascript" src="<%=basePath%>js/invoice.js"></script>
    
    <script type="text/javascript">
    var cc="cc";
    $(function(){
    	
    	$("#cc").autobox({
    		
    		url:"<%=basePath%>goods/search.do",
    		method:'POST',
    		pagesize:10,
    		//pageNumber:1,
    		//inputTextname:"cc",
    		//data:'[{"keyword":'+$('#cc').val()+',"page":1,"rows":10}]',
    		//dataType:'json',
    		panelField:['Code','Name'],
    		inputTextname:'cc',
    		multiple: false,
    		dlgTextName:"name",
    		onEnter:function(data){
    			//afterSelectProduct(data);	
    	    console.log(data)		
    	    var goodsid=data.GoodsID;
    	    console.log(goodsid);
    	    $("#cc").val(data.Name);
    	    
    		}
    	 
    		//在用户按下键的时候调用一个函数
     
    		
    	});
    	
    	
    });
    
    
    </script>
 
	
<title>Insert title here</title>

</head>
<body>
<div>
<input id="cc" name="cc" type="text" autocomplete="off" >
</div>
<script type="text/javascript">

/*
$('#cc').combo({
    required:false,
    multiple:false,
    valueField:'value', //值
    textField:'text', //显示的文本
    editable:true,//是否支持编辑
    hasDownArrow : false, //是否有下拉的按钮及样式
    pagination:true,//显示分页
    data: [{
		label: 'java',
		value: 'Java'
	},{
		label: 'perl',
		value: 'Perl'
	},{
		label: 'ruby',
		value: 'Ruby'
	}],
    icons : [{    //图标的功能扩展
    //    iconCls : 'icon-clear', //我现在用的是清空选项的图标
    //    handler : function(e){ //图标的点击事件
          //  var eleId = e.handleObj.data.target.id;
           // $('#'+eleId).combobox("clear");
      //  }
    }],
    formatter: function(row){ //显示样式自定义
        var s = '<span class=\'identifySpan\'>' +row.label+ '</span>'; 
        return s;
    }
});

url:"<%=basePath%>goods/search.do?keyword="+$('#cc').val(),
formatUrl
*/


</script>

</body>
</html>