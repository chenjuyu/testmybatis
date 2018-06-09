<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%
request.setCharacterEncoding("UTF-8");
String htmlData = request.getParameter("content1") != null ? request.getParameter("content1") : "";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!doctype html>
<html>
<head>
	<meta charset="utf-8" />
	<title>KindEditor JSP</title>
	<link rel="stylesheet" href="<%=basePath%>kindeditor-4.1.7/themes/default/default.css" />
	<link rel="stylesheet" href="<%=basePath%>kindeditor-4.1.7/plugins/code/prettify.css" />
	<script charset="utf-8" src="<%=basePath%>kindeditor-4.1.7/kindeditor.js"></script>
	<script charset="utf-8" src="<%=basePath%>kindeditor-4.1.7/lang/zh_CN.js"></script>
	<script charset="utf-8" src="<%=basePath%>kindeditor-4.1.7/plugins/code/prettify.js"></script>
	<script>
		KindEditor.ready(function(K) {
			var editor1 = K.create('textarea[name="content1"]', {
				cssPath : '<%=basePath%>kindeditor-4.1.7/plugins/code/prettify.css',
				uploadJson : '<%=basePath%>kindeditor-4.1.7/jsp/upload_json.jsp',
				fileManagerJson : '<%=basePath%>kindeditor-4.1.7/jsp/file_manager_json.jsp',
				allowFileManager : true,
				afterCreate : function() {
					var self = this;
					K.ctrl(document, 13, function() {
						self.sync();
						document.forms['example'].submit();
					});
					K.ctrl(self.edit.doc, 13, function() {
						self.sync();
						document.forms['example'].submit();
					});
				}
			});
			prettyPrint();
		});
	</script>
</head>
<body>
	<%=htmlData%>
	
	<form name="example" method="post" action="${pageContext.request.contextPath}/borController/update.do">
		<input type="hidden" name="ID" value="${bor.id}"/>
		<textarea name="content1" cols="100" rows="8" style="width:700px;height:200px;visibility:hidden;">${bor.ledger}</textarea>
		<br />
		
		<input type="submit" name="button" value="提交内容" /> (提交快捷键: Ctrl + Enter)
	</form>
	<%=htmlspecialchars(htmlData)%>
</body>
</html>
<%!
private String htmlspecialchars(String str) {
	str = str.replaceAll("&", "&amp;");
	str = str.replaceAll("<", "&lt;");
	str = str.replaceAll(">", "&gt;");
	str = str.replaceAll("\"", "&quot;");
	return str;
}
%>