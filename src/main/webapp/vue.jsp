<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%     
     String path = request.getContextPath();
 String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
 %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script src="<%=basePath%>js/vue-2.5.17/dist/vue.min.js"></script>
<script src="https://unpkg.com/axios/dist/axios.min.js"></script>
<title>Insert title here</title>
</head>
<body>
<div id="app">
        <input type="button" @click="get()" value="点击" />
 </div>
    
</body>
<script>
    new Vue({
        el : '#app',
        data : {
        }
        
       
    });
    methods:{
    	get:function(){
    axios.post('<%=basePath%>barcode/list.do', {
    	barcode:"1001010100011000",
        lastName: 'Flintstone'
      })
      .then(function (response) {
        console.log(response);
      }).catch(function (error) {
        console.log(error);
      });
    }
    }
</script>
</html>