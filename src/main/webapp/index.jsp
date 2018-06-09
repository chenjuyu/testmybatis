<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML>
<html>
<body>
<h2>Insert into here</h2>
<form action="${pageContext.request.contextPath}/borController/addUser.do" method="post" >
   username:<input type="text" name="ID" required="required" />
   password:<input type="text" name="ledger" required="required"  />
   <input type="submit" value="submit" /> 
</form>

</body>
</html>
