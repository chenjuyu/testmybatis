<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
 <%
 String path = request.getContextPath();
 String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
 
 //String DepartmentID =request.getParameter("DepartmentID");
  //System.out.println(map.DepartmentID);
 //carousel模块快速使用
 %> 
<!DOCTYPE html>
<html>
<head>
 <base href="<%=basePath%>">
  <meta charset="utf-8">
  <title>首页</title>
  <link rel="stylesheet" href="ui/lib/layui/css/layui.css" media="all">
</head>
<body>
 
<div class="layui-carousel" id="test1">
  <div carousel-item>
    <div>条目1</div>
    <div>条目2</div>
    <div>条目3</div>
    <div>条目4</div>
    <div>条目5</div>
  </div>
</div>
<!-- 条目中可以是任意内容，如：<img src=""> -->
 
<script src="/ui/lib/layui/layui.js"></script>
<script>
layui.use('carousel', function(){
  var carousel = layui.carousel;
  //建造实例
  carousel.render({
    elem: '#test1'
    ,width: '100%' //设置容器宽度
    ,arrow: 'always' //始终显示箭头
    //,anim: 'updown' //切换动画方式
  });
});
</script>
</body>
</html>