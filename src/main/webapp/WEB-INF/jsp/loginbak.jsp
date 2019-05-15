<%@ page language="java" contentType="text/html; charset=UTF-8"  
    pageEncoding="UTF-8"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="f"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE HTML>
<html>
  <head>
    <base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">  
<title>登录</title>  
<script type="text/javascript" src="js/jquery-1.8.3.js"></script>  
<script>
$(document).ready(function(){//这个就是jQueryready,它就像C语言的main 所有操作包含在它里面
$("#sub").click(function(){
login(); //点击ID为"button_login"的按钮后触发函数 login();
});
});
function login(){ //函数 login();
//alert("login");
var username = $("#username").val();//取框中的用户名
var password = $("#password").val();//取框中的密码
$.ajax({ //一个Ajax过程
type: "post",  //以post方式与后台沟通
url : "user/ret.html", //与此php页面沟通
dataType:"json",//从php返回的值以 JSON方式 解释
async : false, // 设为false就是同步请求
data:  "username="+username+"&password="+password, //发给php的数据有两项，分别是上面传来的u和p   
success: function(result){//如果调用php成功
//alert(json.username+'\n'+json.password); //把php中的返回值（json.username）给 alert出来
var s=result  ;//                       JSON.stringify(result);
alert("返回标志:"+s)
if (s =="true"){
alert("返回标志:"+"登录成功")
}else{
alert("返回标志:"+"登录失败")
}

//$('#result').html("返回标志:" + result.loginFlag)//$('#result').html("姓名:" + json.username + "<br/>密码:" + json.password); //把php中的返回值显示在预定义的result定位符位置
}
});
}



</script>
</head>  
<body>  
<form action="" method="post" id="loginForm">  
<table>  
<tbody>  
<tr>  
<th>用户名：</th><td><input name="username" id="username"  /></td>  
</tr>  
<tr>  
<th>密码：</th><td><input name="password"  type="password" id="password"/></td>  
</tr>  
<tr>  
<td colspan="2"><input type="button" value="登录" id="sub"/><input type="reset" value="重置"/></td>  
</tr>  
</tbody>  
</table>  
</form> 
<div id="result" ></div> 
</body>  
</html>  