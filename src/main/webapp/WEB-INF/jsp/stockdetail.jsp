<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"
    import="java.util.Random"
    %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
 <%
 String path = request.getContextPath();
 String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
 Random r=new Random();
	int rint= r.nextInt(13);
 //String DepartmentID =request.getParameter("DepartmentID");
  //System.out.println(map.DepartmentID);
 //<script type="text/javascript" src="./ui/js/autocomplete.js"></script>
 %>   
 <!DOCTYPE html>
 <html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8;no-cache">
 <link rel="stylesheet" href="./ui/css/xadmin.css?v=<%=rint%>" media="all">
  <link rel="stylesheet" href="./ui/css/autocomplete.css?v=<%=rint%>" media="all">
 <script src="./ui/lib/layui/layui.js" charset="utf-8"></script>
<script type="text/javascript" src="./ui/js/jquery.min.js"></script>
<script type="text/javascript" src="./ui/js/xadmin.js?v=<%=rint%>"></script>

<title>Insert title here</title>
</head>
<body>
    <div class="layui-card-body">
                            <div class="layui-form layui-col-space5">
                                <div class="layui-inline layui-show-xs-block">
                                    <input class="layui-input" autocomplete="off" placeholder="开始日" name="start" id="start"></div>
                                <div class="layui-inline layui-show-xs-block">
                                    <input class="layui-input" autocomplete="off" placeholder="截止日" name="end" id="end"></div>
                                <div class="layui-inline layui-show-xs-block">
                                    <input type="text" name="keyword" id="keyword" placeholder="请输入单号" autocomplete="off" class="layui-input"></div>
                                <div class="layui-inline layui-show-xs-block">
                                    <button class="layui-btn" data-type="reload">
                                        <i class="layui-icon">&#xe615;</i></button>
                                </div>
                            </div>
   </div>
   
 
   <div class="layui-btn-container">
    <button class="layui-btn layui-btn-sm" data-type="getCheckData">同步数据</button>
    <button class="layui-btn layui-btn-sm" data-type="getCheckLength">获取选中数目</button>
    <button class="layui-btn layui-btn-sm" data-type="isAll">验证是否全选</button>
  </div>
 
   
   
   <div class="layui-tab layui-tab-brief" lay-filter="demo">
  <ul class="layui-tab-title">
    <li class="layui-this">全部</li>
    <li>未同步</li>
    <li>已同步</li>
  </ul>
  <div class="layui-tab-content" style="height: auto;">
  <table class="layui-hide" id="test"  lay-filter="test"></table>
  <!--    <div class="layui-tab-item layui-show">
    
    </div>
    <div class="layui-tab-item">内容2</div>
    <div class="layui-tab-item">内容3</div>
    <div class="layui-tab-item">内容4</div>
    <div class="layui-tab-item">内容5</div>
    -->
  </div>
</div> 
   

    <script type="text/html" id="toolbarDemo">
  <div class="layui-btn-container">
    <button class="layui-btn layui-btn-sm" lay-event="getCheckData">同步数据</button>
    <button class="layui-btn layui-btn-sm" lay-event="getCheckLength">获取选中数目</button>
    <button class="layui-btn layui-btn-sm" lay-event="isAll">验证是否全选</button>
  </div>
</script>

 
<script type="text/html" id="barDemo">
  <a class="layui-btn layui-btn-xs" lay-event="edit">编辑</a>
  <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
</script>
              
          

<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 --> 
 
    <script>
    /*layui.use('laydate',
        function() {
            var laydate = layui.laydate;
            //执行一个laydate实例
            laydate.render({
                elem: '#start' //指定元素
            });
            //执行一个laydate实例
            laydate.render({
                elem: '#end' //指定元素
            });
        }); //ui/lib/layui/*/
        
        layui.config({
        	 version: true
        	 ,base: '<%=basePath%>ui/js/' //假设这是你存放拓展模块的根目录
        	  
        	}).extend({ //设定模块别名
        	 // mymod: 'mymod' //如果 mymod.js 是在根目录，也可以不用设定别名
        	 // ,mod1: 'admin/mod1' //相对于上述 base 目录的子目录
        	});
    </script>
 
 
<script>
//$(function  () {
layui.use(['element','table','laydate','form','autocomplete'], function(){
  var laydate = layui.laydate;	
  var form = layui.form;
  
  var autocomplete=layui.autocomplete;
  
  var table = layui.table;
  
  var element = layui.element;
  
  var issyn=0
  
  var stockin=layui.data('stockin')
  
  var stockid=stockin.stockid
  var DisplaySizeGroup=stockin.DisplaySizeGroup
  console.log("stockid:"+stockid)
  
  console.log("DisplaySizeGroup:"+DisplaySizeGroup)
  
 //layui.data('stockin', null); //删除test表 删除本地储存的数据
  
//执行一个laydate实例
  laydate.render({
      elem: '#start' //指定元素
  });
  //执行一个laydate实例
  laydate.render({
      elem: '#end' //指定元素
  });
  
 var $=layui.$
 //"fixed":"left",
 var cols=	 [
[{"type":"checkbox","width":50,"rowspan":2},
 {"field":"Code","title":"货品编码","width":120,"rowspan":2},
 {"field":"Color","title":"颜色","width":80,"rowspan":2},
 {"field":"x_1","title":"J<br/>J","align":"center"},
 {"field":"x_2","title":"S<br/>80","align":"center"},
 {"field":"x_3","title":"M<br/>90","align":"center"},
 {"field":"x_4","title":"L","align":"center"},
 {"field":"x_5","title":"XL","align":"center"},
 {"field":"x_6","title":"2XL","align":"center"},
 {"field":"x_7","title":"3XL","align":"center"},
 {"field":"x_8","title":"4XL","align":"center"},
 {"field":"x_9","title":"5XL","align":"center"},
 {"field":"x_10","title":"5XL","align":"center"},
 {"field":"Quantity","title":"数量","width":100,"rowspan":2},
 {"field":"RelationUnitPrice","title":"结算价","width":100,"rowspan":2},
 {"field":"RelationAmount","title":"结算金额","width":100,"rowspan":2}
 ],
] 
 /*
 [
  {"field":"x_1","title":"J","align":"center"},
 {"field":"x_2","title":"80","align":"center"},
 {"field":"x_3","title":"90","align":"center"},
 {"field":"x_4","title":"100","align":"center"},
 {"field":"x_5","title":"110","align":"center"},
 {"field":"x_6","title":"120","align":"center"},
 {"field":"x_7","title":"130","align":"center"},
 {"field":"x_8","title":"140","align":"center"},
 {"field":"x_9","title":"150","align":"center"},
 {"field":"x_10","title":"160","align":"center"}
 ]
 */
 
 $.ajax({ 
	 url:'<%=basePath%>stock/stockdetail.do',
     type:'post',
     data:{'keyword':stockid,'issyn':issyn,'DisplaySizeGroup':DisplaySizeGroup,"page":1,'rows':10},
     dataType:'json',
     cache:false,
     success:function(res){
    	 table.render({
    		 elem: '#test'
    		 ,title: '详情数据表'
    		 ,width:1000
    		 ,id: 'stockdetail'  
    	     ,data:res.data
    	     ,cols:res.cols //cols
    	     ,totalRow: true
    	     ,page: false
    	     ,limit: Number.MAX_VALUE //显示全部数据，不分页
    	 })
/*     	
  table.render({
    elem: '#test'
   // ,url:
  //  ,method:'post'
   // ,where:{'keyword':stockid,'issyn':issyn}
  //  ,toolbar: '#toolbarDemotest' //屏蔽先 #toolbarDemo
    ,defaultToolbar:[] //['filter', 'print', 'exports'] 删除后会显示出来的 导出打印
    ,parseData: function(res){ //res 即为原始返回的数据
        return {
            "code": res.code, //解析接口状态
            "msg": res.msg, //解析提示文本
           // "count": res.total, //解析数据长度
            "data": res.data, //解析数据列表
            "cols":res.cols
          };
         
        } 
    ,request: {
         pageName: 'page' //页码的参数名称，默认：page
        ,limitName: 'rows' //每页数据量的参数名，默认：limit
          }
  /*  ,response: {
        statusName: 'status' //规定数据状态的字段名称，默认：code
        ,statusCode: 200 //规定成功的状态码，默认：0
        ,msgName: 'hint' //规定状态信息的字段名称，默认：msg
        ,countName: 'total' //规定数据总数的字段名称，默认：count
        ,dataName: 'rows' //规定数据列表的字段名称，默认：data
      } */ 
//    ,title: '详情数据表'
  // ,cols:[[{"field":'Code', "title":'货品编码', "width":120}]]
//     ,cols: [[
//        {type: 'checkbox', fixed: 'left'}
//       ,{field:'StockID', title:'StockID', width:80, fixed: 'left', hide:true, unresize: true}
//       ,{field:'Code', title:'货品编码', width:120}
//       ,{field:'SupplierCode', title:'厂商货品编码', width:120, unresize: true}//, edit: 'text'
//       ,{field:'Name', title:'货品名称', width:120}//, edit: 'text'
//       ,{field:'Model', title:'型号规格', width:150}
//       /*,{field:'Name', title:'货品名称', width:150, edit: 'text', templet: function(res){
//         return '<em>'+ res.email +'</em>'
//       }} */
//       ,{field:'Unit', title:'单位', width:80 }
//       ,{field:'Color', title:'颜色', width:80 }//sort: true , edit: 'text'
//       ,{field:'AmountSum', title:'金额', width:100,hide:true}
//       ,{field:'RelationAmountSum', title:'结算金额',width:120}
      
//    //   ,{field:'SupplierCode', title:'厂商货品编码', width:120}
//     //  ,{field:'Model', title:'型号规格', width:100}
//      // ,{field:'Season', title:'季节', width:120}
//      // ,{fixed: 'right', title:'操作', toolbar: '#barDemo', width:150}
//     ]]
   // ,id: 'stockdetail'  
 //   ,page: true
   
  //}); */
     }//success 结束
 })//ajax 结束
  //头工具栏事件
  table.on('toolbar(test)', function(obj){
    var checkStatus = table.checkStatus(obj.config.id);
    switch(obj.event){
      case 'getCheckData':
        var data = checkStatus.data;
        layer.alert(JSON.stringify(data));
       Send(JSON.stringify(data))
      break;
      case 'getCheckLength':
        var data = checkStatus.data;
        layer.msg('选中了：'+ data.length + ' 个');
      break;
      case 'isAll':
        layer.msg(checkStatus.isAll ? '全选': '未全选');
      break;
    };
  });
  
  //监听行工具事件
  table.on('tool(test)', function(obj){
    var data = obj.data;
    //console.log(obj)
    if(obj.event === 'del'){
      layer.confirm('真的删除行么', function(index){
        obj.del();
        layer.close(index);
      });
    } else if(obj.event === 'edit'){
      layer.prompt({
        formType: 2
        ,value: data.Name
      }, function(value, index){
        obj.update({
        	Name: value
        });
        layer.close(index);
      });
    }
  });
  
//监听行双击事件
  table.on('rowDouble(test)', function(obj){
	  console.log(obj.tr) //得到当前行元素对象
	  console.log(obj.data) //得到当前行数据
	  console.log("GoodsID:"+obj.data.GoodsID) //得到当前行数据
	 
	//  xadmin.del_tab()//add_tab('货品','./main/goods.html')
	//xadmin.add_tab('货品','./main/goods.html',true)
	  layui.data('stockin', {key:'goodsid',value:obj.data.GoodsID})
	   location.href='<%=basePath%>index.jsp';
	  
	  //obj.del(); //删除当前行
	  //obj.update(fields) //修改当前行数据
  });
  
  
  
  
  //------------------------------表单
  
  var $ = layui.$, active = {
		    reload: function(){
		       if($('#keyword').val()==''){
		    	   $('#keyword').attr("alt","")    
		       }	
		    	
		      var keyword = $('#keyword').attr("alt");
		      console.log("keyword的值："+keyword)//keyword.val()
		      //执行重载
		      table.reload('stockdetail', {
		        page: {
		          curr: 1 //重新从第 1 页开始
		        }
		        ,where: {
		          //key: {
		        	  //keyword: keyword.val()
		        	  'keyword':keyword,
		        	  'issyn':issyn
		        //  }
		        }
		      });
		    }
		  };
  
  $('.layui-card-body .layui-btn').on('click', function(){
	    var type = $(this).data('type');
	    console.log("type的值："+type)
	    console.log("active[type]的值："+active[type])
	    active[type] ? active[type].call(this) : '';
	  });
  
  //一些事件监听 选项卡监听
  element.on('tab(demo)', function(data){
    console.log(data);
    console.log("index的值："+data.index);
    issyn=data.index
    active['reload'].call(this);
    
  });
  
  $('.layui-btn-container .layui-btn').on('click', function(){
	  
	  console.log("执行到这里了")
	 var type = $(this).data('type');
	  var checkStatus = table.checkStatus('stockdetail');
	    switch(type){
	      case 'getCheckData':
	        var data = checkStatus.data;
	        console.log(data)
	       // layer.alert(JSON.stringify(data));
	       if(data.length>0){
	        Send(JSON.stringify(data))
	        layer.msg('同步成功');
	       }
	      break;
	      case 'getCheckLength':
	        var data = checkStatus.data;
	        layer.msg('选中了：'+ data.length + ' 个');
	      break;
	      case 'isAll':
	        layer.msg(checkStatus.isAll ? '全选': '未全选');
	      break;
	    };
	  
	  
  })
  
  
    
  //自动输入提示
  autocomplete.render({
            elem: $('#keyword')[0],
            url: '<%=basePath%>stock/autocompete.do',
            template_val: '{{d.No}}',
            template_txt: '{{d.No}} <span class=\'layui-badge layui-bg-gray\'>{{d.Warehouse}}</span>',
            onselect: function (resp) {
              $('input[name=keyword]').val(resp.No),
              $('input[name=keyword]').attr("alt",resp.StockID)
            }
        })
        
 function  Send(data){
	  var datastr =data;
	  $.ajax({
		 	type: "post",  //数据提交方式（post/get）
        	url: "<%=basePath%>main/jdstock.do",  //提交到的url
        	data: {
        		"datas":datastr
        	},
        	dataType: "json",//返回的数据类型格式  
        	success: function (msg) {
        		layer.alert(msg.msg, {icon: 1, time: 2500, title: '操作成功'});
        	}
        	,error:function (){
        		
        		layer.alert(msg.msg, {icon: 1, time: 2500, title: '操作失败'});
        	}
		  
	  });   
  } 
       
        
  
  
});
//}) //$(function 结束
</script>

</body>
</html>