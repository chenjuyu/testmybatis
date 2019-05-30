<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8" import="java.util.Random"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	Random r = new Random();
	int rint = r.nextInt(13);
	//String DepartmentID =request.getParameter("DepartmentID");
	//System.out.println(map.DepartmentID);
	//<script type="text/javascript" src="./ui/js/autocomplete.js"></script>
%>
<!DOCTYPE html>
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet" href="./ui/css/xadmin.css?v=<%=rint%>"
	media="all">
<link rel="stylesheet" href="./ui/css/autocomplete.css?v=<%=rint%>"
	media="all">
<link rel="stylesheet" href="./ui/js/dtree/dtree.css?v=<%=rint%>"
	media="all">
<link rel="stylesheet"
	href="./ui/js/dtree/font/dtreefont.css?v=<%=rint%>" media="all">
<script src="./ui/lib/layui/layui.js" charset="utf-8"></script>
<script type="text/javascript" src="./ui/js/jquery.min.js"></script>
<script type="text/javascript" src="./ui/js/xadmin.js?v=<%=rint%>"></script>




<title>Insert title here</title>
</head>
<body>
	<div class="layui-card-body">
		<div class="layui-form layui-col-space5">
			<div class="layui-inline layui-show-xs-block">
				<input class="layui-input" autocomplete="off" placeholder="开始日"
					name="start" id="start">
			</div>
			<div class="layui-inline layui-show-xs-block">
				<input class="layui-input" autocomplete="off" placeholder="截止日"
					name="end" id="end">
			</div>
			<div class="layui-inline layui-show-xs-block">
				<input type="text" name="keyword" id="keyword" placeholder="请输入单号"
					autocomplete="off" class="layui-input">
			</div>
			<div class="layui-inline layui-unselect " style="position: relative;">
				<input type="text" name="DepartmentID" id="DepartmentID" placeholder="请输入部门"
					autocomplete="off" class="layui-input " style="float:left">
				 <i class="change layui-icon">&#xe65f;</i>
			</div>
			<div class="layui-inline layui-show-xs-block">
				<select name="interest" lay-filter="aihao">
					<option value="">请选择类别</option>
					<option value="0" selected="采购">采购</option>
					<option value="1">采购退货</option>
				</select>
			</div>
     <!-- 测试 dtree layui-input-block-->
  <!-- 	<label>城市：</label>
										<div class="layui-inline layui-show-xs-block">
											<div class="layui-unselect layui-form-select" id="city">
												<div class="layui-select-title">
													<input type="text" name="city" id="input_city" placeholder="请选择" readonly="" class="layui-input layui-unselect">
													<i class="layui-edge"></i>
												</div>
											</div>
											<div class="layui-card" id="test">
												<div class="layui-card-body">
													<div id="toolbarDiv"><ul id="slTree" class="dtree" data-id="0" style="width: 100%;"></ul></div>
												</div>
											</div>
											
										</div>

-->

    <!-- dtree -->
 
			<div class="layui-inline layui-show-xs-block">
				<button class="layui-btn" data-type="reload">
					<i class="layui-icon">&#xe615;</i>
				</button>
			</div>
		</div>
	</div>


	<div class="layui-btn-container">
		<button class="layui-btn layui-btn-sm" data-type="getCheckData">同步数据</button>
		<!--     <button class="layui-btn layui-btn-sm" data-type="getCheckLength">获取选中数目</button>
    <button class="layui-btn layui-btn-sm" data-type="isAll">验证是否全选</button> -->
	</div>



	<div class="layui-tab layui-tab-brief" lay-filter="demo">
		<ul class="layui-tab-title">
			<li class="layui-this">全部</li>
			<li>未同步</li>
			<li>已同步</li>
		</ul>
		<div class="layui-tab-content" style="height: auto;">
			<table class="layui-hide" id="test1" lay-filter="test"></table>
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
 
        
        layui.config({
        	  version: true
        	  ,base: '<%=basePath%>ui/js/' //假设这是你存放拓展模块的根目录
        	}).extend({ //设定模块别名
        	 // mymod: 'mymod' //如果 mymod.js 是在根目录，也可以不用设定别名
        	 // ,mod1: 'admin/mod1' //相对于上述 base 目录的子目录
        	});
    </script>


	<script>
//$(function  () { //,'dtree'
layui.use(['element','table','laydate','form','autocomplete','dtree','layer'], function(){
  var laydate = layui.laydate;
  var form = layui.form;
  
  var layer = layui.layer;
  
  var autocomplete=layui.autocomplete;
  
  var table = layui.table;
  
  var element = layui.element;
  
  var dtree=layui.dtree;
  
  var issyn=0
  
  var selectdata=[]
  
 layui.data('stockin', null); //删除test表 删除本地储存的数据
  
//执行一个laydate实例
  laydate.render({
      elem: '#start' //指定元素
  })
  //执行一个laydate实例
  laydate.render({
      elem: '#end' //指定元素
  })
  
  
  form.on('select(aihao)', function(data){
	  console.log(data.elem); //得到select原始DOM对象
	  console.log(data.value); //得到被选中的值
	  console.log(data.othis); //得到美化后的DOM对象
	})
  
  
  

  
  table.render({
    elem: '#test1'
    ,url:'<%=basePath%>stock/search.do'
    ,method:'post'
    ,where:{'keyword':'','issyn':issyn}
  //  ,toolbar: '#toolbarDemotest' //屏蔽先 #toolbarDemo
    ,defaultToolbar:[] //['filter', 'print', 'exports'] 删除后会显示出来的 导出打印
  /*  ,parseData: function(res){ //res 即为原始返回的数据
        return {
            "code": res.status, //解析接口状态
            "msg": res.message, //解析提示文本
            "count": res.total, //解析数据长度
            "data": res.rows //解析数据列表
          };
        } */
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
    ,title: '单据数据表'
    ,cols: [[
      {type: 'checkbox', fixed: 'left'}
      ,{field:'StockID', title:'StockID', width:80, fixed: 'left', hide:true, unresize: true}
      ,{field:'DisplaySizeGroup', title:'DisplaySizeGroup', width:80, fixed: 'left', hide:true}
      ,{field:'Date', title:'日期', width:120}
      ,{field:'No', title:'单号', width:120, unresize: true}//, edit: 'text'
      ,{field:'Warehouse', title:'仓库', width:120}//, edit: 'text'
      ,{field:'Supplier', title:'厂商', width:150}
      /*,{field:'Name', title:'货品名称', width:150, edit: 'text', templet: function(res){
        return '<em>'+ res.email +'</em>'
      }} */
      ,{field:'QuantitySum', title:'数量', width:80 }//sort: true , edit: 'text'
      ,{field:'AmountSum', title:'金额', width:100,hide:true}
      ,{field:'RelationAmountSum', title:'结算金额',width:120}
      
   //   ,{field:'SupplierCode', title:'厂商货品编码', width:120}
    //  ,{field:'Model', title:'型号规格', width:100}
     // ,{field:'Season', title:'季节', width:120}
     // ,{fixed: 'right', title:'操作', toolbar: '#barDemo', width:150}
    ]]
    ,id: 'stocklist'  
    ,page: true
   
  });
  
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
	  layui.data('stockin', {key:'stockid',value:obj.data.StockID})
	  layui.data('stockin', {key:'DisplaySizeGroup',value:obj.data.DisplaySizeGroup})
	  layui.data('obj',{key:'obj',value:JSON.stringify(obj.data)})
	  
	  console.log("stockpage:"+JSON.stringify(obj.data))
	   location.href='<%=basePath%>main/stockdetail.do';
	  
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
		      table.reload('stocklist', {
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
  
  $(".change").on('click',function(){
	   //Ajax获取
	//xadmin.open('资料选择','<%=basePath%>select/selectlist.html',650,400)
	
	layer.open({
		type:2,
		area: ['650px', '500px'],
		fix: false, //不固定
		maxmin: true,
        shadeClose: true,
        shade:0.4,
        title: '资料选择',
        content: '<%=basePath%>select/selectlist.html',
        btn:['确定','关闭'],
        yes:function(index, layero){
            //当点击‘确定’按钮的时候，获取弹出层返回的值
         //   var index1 = layer.open();
           // var res = window["layui-layer-iframe" + index].callbackdata();
            //打印返回的值，看是否有我们想返回的值。
           // console.log(res);
            //最后关闭弹出层
           // layer.close(index);
            //layero.find("iframe")[0].contentWindow; 此方法 可以 
   //var body = layer.getChildFrame('body', index1);
   var obj =  layero.find("iframe")[0].contentWindow; //得到iframe页的窗口对象，执行iframe页的方法：iframeWin.method();
 //   body.find('input').val('Hi，我是从父页来的')
      if(obj.selectdata.length>0){
    	  debugger
    	  console.log("obj.selectdata的数据:"+JSON.stringify(obj.selectdata));
      selectdata=obj.selectdata
      var value="",DepartmentID=""
      
    	for(var i=0;i<selectdata.length;i++){
    		if(i===selectdata.length-1)//判断最后一个
    		{
    			value=value+selectdata[i].Department
        		DepartmentID=DepartmentID+selectdata[i].DepartmentID
    		}else{
    			value=value+selectdata[i].Department+','
        		DepartmentID=DepartmentID+selectdata[i].DepartmentID+','	
    		}
    	}   
      $('#DepartmentID').val(value)
      }
     
     var data1=obj.back()
      //打印返回的值，看是否有我们想返回的值。
       console.log("index的数据:"+index);
            console.log("res的数据:"+data1.username);
     layer.close(index);
         //   var res =body.callbackdata() //(layero).find("iframe")[0].contentWindow.callbackdata();
          //  console.log("res的数据:"+res);
        //  var obj = $(layero).find("iframe")[0].contentWindow;	//obj可以调用子页面的任何方法
         
        },
        cancel:function(){
        	
        }, success: function(layero, index){
        	var j = parent.layer.getFrameIndex(window.name); 
            var body = layer.getChildFrame('body', j);
            var iframeWin = window[layero.find('iframe')[0]['name']]; //得到iframe页的窗口对象，执行iframe页的方法：iframeWin.method();
           // console.log(body.html()) //得到iframe页的body内容
            body.find('input[name=keyword]').val('Hi，我是从父页来的')
            console.log(iframeWin.kkk)
          }
        
	})
	
	
	
	
  })

  
  
  
  $('.layui-btn-container .layui-btn').on('click', function(){
	  
	  console.log("执行到这里了")
	 var type = $(this).data('type');
	  var checkStatus = table.checkStatus('stocklist');
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
	  
	  
  });
  // 测试可以正常使用，只是样式要调整
	//var DTree = dtree.render({
//		elem: "#slTree",
	//	url: "<%=basePath%>ui/js/dataTree.json",
	//	icon: "2",
//		accordion:true
//	});
//	$("#city").on("click",function(){
//		$(this).toggleClass("layui-form-selected");
////		$("#test").toggleClass("layui-show layui-anim layui-anim-upbit");
//	});
	
//	dtree.on("node(slTree)", function(obj){
//		$("#input_city").val(obj.param.context);
//		$("#city").toggleClass("layui-form-selected");
//		$("#test").toggleClass("layui-show layui-anim layui-anim-upbit");
//	})
 
 //  dtree.render({
//	  elem: "#input_city",
//	  url: "<%=basePath%>ui/js/dataTree.json"
//	});	
//  $("#city").on("click",function(){
//			$(this).toggleClass("layui-form-selected");
//			$("#test").toggleClass("layui-show layui-anim layui-anim-upbit");
//		});
  
	//	dtree.on("node(slTree)", function(obj){
		//	$("#input_city").val(obj.param.context);
		//	$("#city").toggleClass("layui-form-selected");
	//		$("#test").toggleClass("layui-show layui-anim layui-anim-upbit");
	//	});
  
  
    
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
<style type="text/css">
#test {
	position: absolute;
	max-height: 500px;
	height: 350px;
	overflow: auto;
	width: 100%;
	z-index: 123;
	display: none;
	border: 1px solid silver;
	top: 42px;
}

.layui-show {
	display: block !important;
}
/*    background-color: #fff;*/
.change{
    position: absolute;
    right: 10px;
    top: 50%;
    margin-top: -10px;
    cursor: pointer;
    border-width: 6px;
    transition: all .3s;
    -webkit-transition: all .3s;
}
</style>
</html>