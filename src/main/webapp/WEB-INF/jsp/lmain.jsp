<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"
	import="java.util.Random"
	%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	Random r=new Random();
	int rint= r.nextInt(13);
%>
<!DOCTYPE html>
<html>
<head>
<base href="<%=basePath%>">
<meta charset="UTF-8">
<title>后台</title>
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport"
	content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
<meta http-equiv="Cache-Control" content="no-siteapp" />
<link rel="stylesheet" href="./ui/css/font.css?v=<%=rint%>">
<link rel="stylesheet" href="./ui/css/xadmin.css?v=<%=rint%>">
<!-- <link rel="stylesheet" href="./css/theme5.css"> -->
<script src="./ui/lib/layui/layui.js" charset="utf-8"></script>
<script type="text/javascript" src="./ui/js/xadmin.js?v=<%=rint%>"></script>

<!-- 让IE8/9支持媒体查询，从而兼容栅格 -->
<!--[if lt IE 9]>
          <script src="https://cdn.staticfile.org/html5shiv/r29/html5.min.js"></script>
          <script src="https://cdn.staticfile.org/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->


<script type="text/javascript">
	// 是否开启刷新记忆tab功能
	// var is_remember = false;
	//  console.log(${map})   
	//获取cookie代码
		
	
	layui.use([ 'element'], function() {
		var $ = layui.$
        
	 
		
		// var map=${map}
		//document.getElementById("obj").innerHTML=sVa
		// <span>${ item.userid}</span>
		//        <span>${ item.username}</span>

		//  var jsonstr=window.localStorage.getItem('usermap'); //可以实现
		// var obj=JSON.parse(jsonstr)
		// console.log(typeof window.localStorage.getItem('usermap'))
		//console.log(JSON.stringify(obj))
		// console.log(obj.username)
		//  $(".container .logo").append('<a href="#">后台用户js的变量:'+obj.username+'</a></div>')
        var user=layui.data('user')
        var obj = JSON.parse(user.user)  
       // console.log(user.user)
       var suser=layui.data('suser')
		 
	  console.log("suser页面:"+suser.u1)
	  
	 //  $(".container .logo").append('<a href="#">后台用户js的变量:'+obj.username+'</a></div>')
		

	});//use 结束  


</script>
</head>
<body class="index">
	<!-- 顶部开始 -->
	<div class="container">
		<div class="logo">

			<a href="#">后台用户:${user.username}</a>
		</div>

		<div class="left_open">
			<a><i title="展开左侧栏" class="iconfont">&#xe699;</i></a>
		</div>
		<!--  
            <ul class="layui-nav left fast-add" lay-filter="">
                <li class="layui-nav-item">
                    <a href="javascript:;">+新增</a>
                    <dl class="layui-nav-child">
                     
                        <dd>
                            <a onclick="xadmin.open('最大化','http://www.baidu.com','','',true)">
                                <i class="iconfont">&#xe6a2;</i>弹出最大化</a></dd>
                        <dd>
                            <a onclick="xadmin.open('弹出自动宽高','http://www.baidu.com')">
                                <i class="iconfont">&#xe6a8;</i>弹出自动宽高</a></dd>
                        <dd>
                            <a onclick="xadmin.open('弹出指定宽高','http://www.baidu.com',500,300)">
                                <i class="iconfont">&#xe6a8;</i>弹出指定宽高</a></dd>
                        <dd>
                            <a onclick="xadmin.add_tab('在tab打开','member-list.html')">
                                <i class="iconfont">&#xe6b8;</i>在tab打开</a></dd>
                        <dd>
                            <a onclick="xadmin.add_tab('在tab打开刷新','member-del.html',true)">
                                <i class="iconfont">&#xe6b8;</i>在tab打开刷新</a></dd>
                    </dl>
                </li>
            </ul>
            <ul class="layui-nav right" lay-filter="">
                <li class="layui-nav-item">
                    <a href="javascript:;">admin</a>
                    <dl class="layui-nav-child">
                       
                        <dd>
                            <a onclick="xadmin.open('个人信息','http://www.baidu.com')">个人信息</a></dd>
                        <dd>
                            <a onclick="xadmin.open('切换帐号','http://www.baidu.com')">切换帐号</a></dd>
                        <dd>
                            <a href="./login.html">退出</a></dd>
                    </dl>
                </li>
                <li class="layui-nav-item to-index">
                    <a href="/">前台首页</a></li>
            </ul>   -->
	</div>

	<!-- 顶部结束 -->
	<!-- 左侧菜单开始 -->
	<div class="left-nav">
		<div id="side-nav">
			<ul id="nav">
				<li><a href="javascript:;"> <i class="iconfont left-nav-li"
						lay-tips="货品管理">&#xe723;</i> <cite>货品管理</cite> <i
						class="iconfont nav_right">&#xe697;</i></a>
					<ul class="sub-menu">
						<li><a onclick="xadmin.add_tab('货品','./main/goods.html')">
								<i class="iconfont">&#xe6a7;</i> <cite>货品</cite>
						</a></li>
					</ul></li>
					
				
					<li><a href="javascript:;"> <i class="iconfont left-nav-li"
						lay-tips="业务单据">&#xe723;</i> <cite>业务单据</cite> <i
						class="iconfont nav_right">&#xe697;</i></a>
					<ul class="sub-menu">
						<li><a onclick="xadmin.add_tab('进仓单','./main/stock.html')">
								<i class="iconfont">&#xe6a7;</i> <cite>进仓单</cite>
						</a></li>
						<li><a onclick="xadmin.add_tab('出仓单','./main/stockout.html')">
								<i class="iconfont">&#xe6a7;</i> <cite>出仓单</cite>
						</a></li>
					</ul></li>	
					
                <c:if test="${jdbrowflag}">
				<li><a href="javascript:;"> <i class="iconfont left-nav-li"
						lay-tips="京东授权">&#xe6b4;</i> <cite>京东授权</cite> <i
						class="iconfont nav_right">&#xe697;</i></a>
					<ul class="sub-menu">
						<li><a onclick="xadmin.add_tab('京东授权','./main/jdindex.html')">
								<i class="iconfont">&#xe6a7;</i> <cite>京东授权</cite>
						</a></li>

					</ul></li>
                  </c:if>  <!-- if 结束 -->
			</ul>
		</div>
	</div>
	<!-- 左侧菜单结束 -->
	<!-- 右侧主体开始 -->
	<div class="page-content">
		<div class="layui-tab tab" lay-filter="xbs_tab" lay-allowclose="false">
			<ul class="layui-tab-title">
				<li class="home"><i class="layui-icon">&#xe68e;</i>后台首页</li>
			</ul>
			<div class="layui-unselect layui-form-select layui-form-selected"
				id="tab_right">
				<dl>
					<dd data-type="this">关闭当前</dd>
					<dd data-type="other">关闭其它</dd>
					<dd data-type="all">关闭全部</dd>
				</dl>
			</div>
			<div class="layui-tab-content">
				<div class="layui-tab-item layui-show">
					<!--   <iframe src='./welcome.html' frameborder="0" scrolling="yes" class="x-iframe"></iframe> -->
				</div>
			</div>
			<div id="tab_show"></div>
		</div>
	</div>
	<div class="page-content-bg"></div>
	<style id="theme_style"></style>
	<!-- 右侧主体结束 -->
	<!-- 中部结束 -->
	<script>
		//百度统计可去掉
		var _hmt = _hmt || [];
		(function() {
			var hm = document.createElement("script");
			hm.src = "https://hm.baidu.com/hm.js?b393d153aeb26b46e9431fabaf0f6190";
			var s = document.getElementsByTagName("script")[0];
			s.parentNode.insertBefore(hm, s);

		})();
	</script>
</body>
</html>