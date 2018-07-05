<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Map接收页</title>
</head>
<body>
<div id="content" Style="width:100%;Height:50px">
 <span> 
<c:forEach items="${map}" var="m">
  ${m.key} ====>${m.value}<br/>
  </c:forEach>
 
 ${DepartmentID}

 </span>
</div>
</body>
</html>