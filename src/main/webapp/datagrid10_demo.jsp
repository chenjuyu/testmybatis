<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta name="keywords" content="jquery,ui,easy,easyui,web">
	<meta name="description" content="easyui help you build your web page easily!">
	<title>CheckBox select on DataGrid - jQuery EasyUI Demo</title>
	<link rel="stylesheet" type="text/css" href="http://www.jeasyui.net/Public/js/easyui/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="http://www.jeasyui.net/Public/js/easyui/themes/icon.css">
	<link rel="stylesheet" type="text/css" href="http://www.jeasyui.net/Public/js/easyui/demo/demo.css">
	<script type="text/javascript" src="http://code.jquery.com/jquery-1.4.4.min.js"></script>
	<script type="text/javascript" src="http://www.jeasyui.net/Public/js/easyui/jquery.easyui.min.js"></script>
</head>
<body>
	<h2>CheckBox select on DataGrid</h2>
	<div class="demo-info" style="margin-bottom:10px">
		<div class="demo-tip icon-tip">&nbsp;</div>
		<div>Click on header checkbox to select or unselect all selections.</div>
	</div>
	
	<table id="tt" title="Checkbox Select" class="easyui-datagrid" style="width:700px;height:250px"
			url="data/datagrid_data.json"
			idField="itemid" pagination="true"
			iconCls="icon-save">
		<thead>
			<tr>
				<th field="ck" checkbox="true"></th>
				<th field="itemid" width="80">Item ID</th>
				<th field="productid" width="120">Product ID</th>
				<th field="listprice" width="80" align="right">List Price</th>
				<th field="unitcost" width="80" align="right">Unit Cost</th>
				<th field="attr1" width="200">Attribute</th>
				<th field="status" width="60" align="center">Status</th>
			</tr>
		</thead>
	</table>
</body>
</html>