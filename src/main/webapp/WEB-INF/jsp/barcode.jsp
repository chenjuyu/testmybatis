<%@ page language="java" 
 import="java.util.*"
 import="pos.model.Barcode"
contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
  <%
 String path = request.getContextPath();
 String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
 %> 
<!DOCTYPE>
<html>
<head>
<base href="<%=basePath%>">
<script type="text/javascript" src="js/jquery-1.8.3.js"></script>
<title>Insert title here</title>
<script type="text/javascript">
$(function () {
	var jsonstr="[]"; 
	var jsonarray = eval('('+jsonstr+')');  
	
$("#submitAdd").click(function(){
    
$.ajax({
type:"post",
url:"<%=basePath%>barcode/list.do", 
//cache: false,
async:false,
data:{barcode:$("#barcode").val()},
	    dataType:'json',  //'json', 
	    success:function(data){      
	     // alert(data);
	    var obj =JSON.parse(data); //json 后台里面每个是javabean实体类对象 要转有 转义\\，如果是List<Map<String,Object>> jdbctemplate 的不用转
	   // alert(obj.GoodsID);
	    
	      var obj1={
				   "GoodsID" : obj.GoodsID,
				   "ColorID" : obj.ColorID
			   };
	      jsonarray.push(obj1);
	      console.log(jsonarray);
	      var str='<ul>';
		   for ( var i = 0; i <jsonarray.length; i++){
			    console.log(jsonarray[i].GoodsID);
			    str +="<li>"+(i)+":"+jsonarray[i].GoodsID+"</li>";
			}
		   str +="</ul>";
		//   $("#content").append(str);
        $("#content").html(str);
         },
	    error:function(){ 
	     alert("请求失败");
	    }
	   })
	    
	})
})
</script>
</head>
<body>

条码：<input type="text" name="barcode" id="barcode"/> <input type="button" id="submitAdd" value="查询"/>	
<div name="content" id="content"></div>

 
</body>
</html>
