<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
 <%
 String path = request.getContextPath();
 String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
 
 //String DepartmentID =request.getParameter("DepartmentID");
  //System.out.println(map.DepartmentID);
 
 %>  
 <!doctype html>
<html  class="x-admin-sm">
<head>
    <base href="<%=basePath%>">
	<meta charset="UTF-8">
	<title>后台登录</title>
	<meta name="renderer" content="webkit|ie-comp|ie-stand">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
    <meta http-equiv="Cache-Control" content="no-siteapp" />
    <link rel="stylesheet" href="./ui/css/font.css">
    <link rel="stylesheet" href="./ui/css/login.css">
	  <link rel="stylesheet" href="./ui/css/xadmin.css">
    <script type="text/javascript" src="./ui/js/jquery.min.js"></script>
    <script src="./ui/lib/layui/layui.js" charset="utf-8"></script>

    <!--[if lt IE 9]>
      <script src="https://cdn.staticfile.org/html5shiv/r29/html5.min.js"></script>
      <script src="https://cdn.staticfile.org/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body class="login-bg">
    
    <div class="login layui-anim layui-anim-up">
        <div class="message">管理登录</div>
        <div id="darkbannerwrap"></div>
        
        <form method="post" class="layui-form" >
            <input name="username" placeholder="用户名"  type="text" lay-verify="required" class="layui-input" >
            <hr class="hr15">
            <input name="password" lay-verify="required" placeholder="密码"  type="password" class="layui-input">
            <hr class="hr15">
            <input value="登录" lay-submit lay-filter="login" style="width:100%;" type="submit">
            <hr class="hr20" >
        </form>
    </div>
    
    

    
    <script>

            layui.use(['form'], function(){
              var form = layui.form;
               
              var $ =layui.$
              
            
              // layer.msg('玩命卖萌中', function(){
              //   //关闭后的操作
              //   });
              //监听提交
              form.on('submit(login)', function(data){
                // alert(888)
              /*  layer.msg(JSON.stringify(data.field),function(){
                    //location.href='index.html'
                }); */
                
                $.ajax({
                	type: "post",  //数据提交方式（post/get）
                	url: "./user/loginCheck.do",  //提交到的url
                	data: {
                		"username":data.field.username,
                		"password":data.field.password
                	},
                	dataType: "json",//返回的数据类型格式  可以返回整个html页modelandview $.parseHtml()转
                	 success: function (msg) {
                         if (msg.success) {  //成功
                             //关闭编辑窗口
                             layer.closeAll();
                             //弹出提示窗口
                           //  layer.alert(msg.msg, {icon: 1, time: 2500, title: '操作成功'});
                             var map=msg.attribute.user;  //返回的map
                           //   console.log("map的值:"+map)
                            //  delCookie('usermap')
                             // setCookie('usermap',JSON.stringify(map),7)//JSON.stringify(map)
                              
                           //   var json=JSON.parse(getCookie('usermap'));
                           //  console.log(typeof getCookie('usermap'))
                            // console.log("getCookie:"+getCookie('usermap'))
                            // var obj = eval('(' + getCookie('usermap').substring(0,getCookie('usermap').length-1) + ')');
                             // console.log("cookie的username值:"+obj.username)
                         //    localStorage 持久化存储：layui.data(table, settings)，数据会永久存在，除非物理删除。
                          //    sessionStorage 会话性存储：layui.sessionData(table, settings)，页面关闭后即失效。注：layui 2.2.5 新增
                             layui.data('user',{key:'user',
                            	      value:JSON.stringify(map)})
                             //跳转就没有了
                           //  layui.sessionData('suser', {key:'u1',value:JSON.stringify(map)})	      
                            	      
                             // window.localStorage.setItem('usermap',JSON.stringify(map));
                               window.location.href='<%=basePath%>main/index.do'
                        	 
                             //  window.location.href='<%=basePath%>main/index.do?map='+encodeURI(encodeURI(JSON.stringify(map)));
                             //刷新parts_table
                           //  table.reload('partslist');
                         } else {  //失败
                             layer.open({
                                 icon: 2,
                                 // time:1500,
                                 type: 0,
                                 title: '操作失败',
                                 content: msg.msg,
                                 area: ['500px', '300px']
                             });
                         }
                     }
                });
                
                
                
                return false;
              });
            });
    

      
        
    </script>
    <!-- 底部结束 -->
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