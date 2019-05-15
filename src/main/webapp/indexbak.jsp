<%@ page language="java" 
    import="java.util.*"
    import="pos.model.User"
    import="javax.servlet.jsp"
 
 pageEncoding="UTF-8"


%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

  User user=(User)request.getSession().getAttribute("user");  
  

  
  
%>
<!DOCTYPE HTML>
<html>
<script type="text/javascript" src="<%=basePath%>js/jquery-1.8.3.js"></script>
<body>
<h2>Insert into here</h2>
<form action="${pageContext.request.contextPath}/borController/addUser.do" method="post" >
   username:<input type="text" name="ID" required="required" />
   password:<input type="text" name="ledger" required="required"  />
   <input type="submit" value="submit" /> 
</form>
<script type="text/javascript">
var array=new Array();
$(document).ready(function(){
	
	$.ajax({url:"http://192.168.1.25:8080/testmybatis/syndata.do?syntools&currpage=1&pagesize=20&field=EmployeeID,Code,Name&tbl=Employee&keyid=EmployeeID",
			type: 'GET',
			dataType:'json',
			success:function(data,status){
		    alert("数据: " + data + "\n状态: " + status);
		   
		    array=data.obj;
		    console.log("obj的值："+array);
		    for(var i=0;i<array.length;++i){
		    	
		    	console.log(array[i].Code);
		    	console.log(array[i].Name);
		    }
			}
	})
		    
		    
		  
	

//console.log(userid);
})
</script>

</body>
</html>
