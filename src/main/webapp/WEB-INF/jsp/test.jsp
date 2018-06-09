<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>测试</title>

<!-- CSS -->
<style type="text/css">
	.bottom{margin: 20px 0 0 0;}
	table tr{text-align: center;}
</style>

<!-- JS -->
<script type="text/javascript" src="../plug-in/jquery/jquery-1.8.3.js"></script>
<script type="text/javascript">
	
	//定义变量
	var list = new Array();

	//页面加载后执行
	$(function(){
		
		//添加按钮点击事件
		$("#add").click(function(){
			$.ajax({
				url : "<%=basePath%>common.do?getBarcode&barcode="+$("#barcode").val(),
				type : 'get',
				cache : false,
				success : function(data) {
					var d = $.parseJSON(data);
					if (d.success) {
						var obj = d.obj;
						$("#table").append('<tr><td>'+obj[0].goodsId+'</td><td>'+obj[0].colorId+'</td><td>'+obj[0].sizeId+'</td><td><input type="button" name="del" onclick="deleteItem(this);" class="del" title="'+list.length+'" value="删除"/></td></tr>');
						list.push(obj);
					}else{
						alert("发生错误");
					}
				}
			});
		});

	});

	//删除事件
	function deleteItem(obj){
		var index = obj.title
		list.splice(index,1);
		$(obj).parent().parent().remove();
	}
	
</script>

</head>
<body>

	<!-- 标题 -->
	<h2 align="center">条码显示列表</h2>
	<div class="main" align="center">
		<!-- 表格显示 -->
		<table border="1" width="500" cellpadding="0" cellspacing="0" id="table">
			<tr>
				<th>商品ID</th>
				<th>颜色ID</th>
				<th>尺码ID</th>
				<th>操作</th>
			</tr>
		</table>
		<!-- 添加数据 -->
		<div class="bottom">
			<input type="text" name="barcode" id="barcode" />
			<input type="button" name="add" id="add" value="添加" />
		</div>
	</div>

</body>
</html>