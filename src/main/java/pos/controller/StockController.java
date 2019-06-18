package pos.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.jd.open.api.sdk.JdException;
import com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryOrder.OrderDetail;
import com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryOrder.OrderDetailResult;
import com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryPoOrder.PoItemModel;
import com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryPoOrder.QueryPoModel;
import com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.cancelOrder.CancelResult;
import com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.isvRtsTransfer.RtsResult;

import pos.model.Department;
import pos.model.Jdstock;
import pos.model.JdstockExample;
import pos.model.Sizegroupsize;
import pos.model.SizegroupsizeExample;
import pos.service.IGoods;
import pos.service.IJdstock;
import pos.service.ISizeGroupSize;
import pos.service.IStock;
import web.util.AjaxJson;
import web.util.JdTools;
import web.util.oConvertUtils;

@Controller
@RequestMapping("stock")
public class StockController {

	@Autowired
	private IStock stockService;
	@Autowired
	private ISizeGroupSize sizeservice;
	
	@Autowired
	private IGoods goodsservice;
	@Autowired
	private IJdstock jdstockService;
	
	 JdTools  jdTools =new JdTools();
	
	@RequestMapping(value = "/search")
	public void search(HttpServletRequest request, HttpServletResponse response) {

		String keyword = request.getParameter("keyword");
		int issyn = Integer.parseInt(request.getParameter("issyn"));

	   String DepartmentID=request.getParameter("DepartmentID");
	   
	   String BeginDate=request.getParameter("BeginDate");
	   
	   String EndDate =request.getParameter("EndDate");
		
	   String Type= request.getParameter("Type");
		
	   String auditflag=request.getParameter("auditflag");
	   
	   int Direction=Integer.valueOf(request.getParameter("Direction")).intValue();
	   
	   String relationType=request.getParameter("relationType");
	   
		System.out.print("issyn的值：" + issyn);

		
		
		
		// String q=request.getParameter("q");
		String conditions = "";
		if (keyword != null && !"".equals(keyword)) {
			conditions =conditions+ " and a.StockID='" + keyword + "' ";
			// keyword=q;
		}
		
		if(auditflag !=null && !"".equals(auditflag)){
			
			conditions =conditions+ " and isnull(a.AuditFlag,0)=" + auditflag;	
		}
		
		if(relationType !=null && !"".equals(relationType)){
			
			conditions =conditions+ " and a.relationType<> '" + relationType+"'";	
		}
			
	if(BeginDate != null || !"".equals(BeginDate)){
		conditions =conditions+" and a.Date>='"+BeginDate+"'";
		}
		
		
		
		if(EndDate != null && !"".equals(EndDate)){
			conditions =conditions+" and a.Date<='"+EndDate+" 23:59:59.997'";
			
		}
		if(Type !=null && !"".equals(Type)){
			conditions =conditions+ " and a.Type='" + Type + "' ";	
		}
			
		if(DepartmentID != null && !"".equals(DepartmentID)){
			
		/*	String str="";
			
			if(DepartmentID.indexOf(",") !=-1){
				String [] idlist=DepartmentID.split(",");
				for(int i=0;i<idlist.length;i++){
					if(i==idlist.length){
					str=str+"'"+idlist[i]+"'";
					}else{
					str=str+"'"+idlist[i]+"',";
					}
				}
				
			}*/
			
			conditions =conditions+" and a.warehouseID in("+DepartmentID+")";	
		}
		
	
		
		if (issyn == 1) {
			 conditions=conditions+" and not exists(select StockID from jdStock b where a.StockID=b.StockID)";
		}
		if (issyn == 2) { // 已同步
			 conditions=conditions+" and exists(select StockID from jdStock b where a.StockID=b.StockID)";

		}
		if(Direction==1){
		conditions = conditions + " and a.Direction=1 ";
		}else{
		conditions = conditions + " and a.Direction=-1 ";	
		}
		// System.out.println(q);
		int pageno = 1;
		pageno = Integer.valueOf(request.getParameter("page").toString()).intValue() > 1
				? Integer.valueOf(request.getParameter("page").toString()).intValue() : 1;
		int pagesize = Integer.valueOf(request.getParameter("rows").toString()).intValue();

		System.out.println("keyword的值：" + keyword);

		// String conditions=" a.Code like '%"+keyword+"%' or a.Name like
		// '%"+keyword+"%'";

		HashMap<String, Object> m = stockService.stocklist(Direction,conditions, pageno, pagesize);
		JSONObject j = new JSONObject();
		// j.put("total", m.get("total"));
		// j.put("rows", m.get("rows"));
		j.put("code", 0);
		j.put("msg", "返回成功");
		j.put("count", m.get("total"));
		j.put("data", m.get("rows"));

		PrintWriter p = null;
		response.setContentType("text/html;charset=utf-8");// 解决返回乱码
		try {
			p = response.getWriter();
			p.write(j.toString());
			p.flush();
			p.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@RequestMapping(value = "/stockdetail")
	public void stockdetail(HttpServletRequest request, HttpServletResponse response) {

		String keyword = oConvertUtils.getString(request.getParameter("keyword"));
		
		String DisplaySizeGroup= oConvertUtils.getString(request.getParameter("DisplaySizeGroup"));
		
		String conditions = null;
		if (!oConvertUtils.isEmpty(keyword)) {
			conditions = " a.StockID ='" + keyword + "' ";
		} else {
			conditions = " a.StockID = NULL ";
		}
		// System.out.println(q);
		int pageno = 1;
		pageno = Integer.valueOf(request.getParameter("page").toString()).intValue() > 1
				? Integer.valueOf(request.getParameter("page").toString()).intValue() : 1;
		int pagesize = Integer.valueOf(request.getParameter("rows").toString()).intValue();

		// String conditions=" a.Code like '%"+keyword+"%' or a.Name like
		// '%"+keyword+"%'";

	
		// j.put("count", m.get("total"));

		// http://localhost:8080/testmybatis/stock/stockdetail.do?keyword=TI02594&page=1&rows=10

		List<List<LinkedHashMap<String, Object>>> cols = new ArrayList<List<LinkedHashMap<String, Object>>>();
		List<LinkedHashMap<String, Object>> cols2 = new ArrayList<LinkedHashMap<String, Object>>();

		

		int col=1;//向下合并的行数
		
		List<Sizegroupsize> ls=null;
		String [] str=null;
		int MaxNo=0;
		String size="";
		if(!"".equals(DisplaySizeGroup) && DisplaySizeGroup !=null){
					List<String> query=new ArrayList<String>();
					System.out.println("DisplaySizeGroup数组："+DisplaySizeGroup);
					if(DisplaySizeGroup.indexOf(",") !=-1){
						str =DisplaySizeGroup.split(",");
					
					 //col =str.length;
					 
					 for(int i=0;i<str.length;i++){
						 query.add(str[i].replace("'", ""));	//有'单引号，不可以用example in 要去掉如果，才能查询出结果
					 }	
					}else{
						query.add(DisplaySizeGroup.replace("'", ""));	
						str=new String[1];//新建一个对像
						str[0]=DisplaySizeGroup.replace("'", "");
					 
					}
						
					
					System.out.println("value数组："+query.toString());
					
			
					SizegroupsizeExample example =new SizegroupsizeExample();
					example.clear();
					SizegroupsizeExample.Criteria cr=example.createCriteria();
					//example.createCriteria().andSizegroupidIn(query); //00B
					//cr.andSizegroupidEqualTo("008");
					cr.andSizegroupidIn(query);
					
					ls=sizeservice.selectByExample(example);
				    for(Sizegroupsize sg:ls){
				    	if(sg.getNo()>MaxNo){
				    		MaxNo =sg.getNo();//返回中最大的值
				    	}
				    }
							 
		}
		 for(int i=1;i<=MaxNo;i++){
			size=size+"a.x_"+String.valueOf(i)+","; 
		 }
		 
		// col=col+1;//因下标从0开始
	   System.out.println("col向下合并的行数:"+col);	 
		 
		HashMap<String, Object> m = stockService.stockDetial(size,conditions, pageno, pagesize);
		JSONObject j = new JSONObject();
		// j.put("total", m.get("total"));
		// j.put("rows", m.get("rows"));
		j.put("code", 0);
		j.put("msg", "返回成功");
		
		
		List<HashMap<String, Object>> listdata = (List<HashMap<String, Object>>) m.get("rows");
		System.out.println("listdata:"+listdata.toString());
		
		LinkedHashMap<String, Object> m1 = new LinkedHashMap<String, Object>();
	/*	m1.put("type", "checkbox");
	//	m1.put("fixed", "left");  //去掉这个才能自适应高度
		m1.put("width", 50);
	//	m1.put("height","auto");
		m1.put("rowspan",String.valueOf(col));
		cols2.add(m1);*/
		HashMap<String, Object> map = listdata.get(0);  //拿一条记录取列名就可以 了，不要for
			Set<Entry<String, Object>> entrySet = map.entrySet(); //Set set = map.keySet(); // 所获取所有的键名
			Iterator<Entry<String, Object>> iter = entrySet.iterator(); 
			while (iter.hasNext()) {
				Entry<String, Object> me = iter.next();//获取Map.Entry关系对象me
				String key =me.getKey(); //(String) iter.next();
				System.out.println("key" + "====" + key);
				if (key.equals("GoodsID") || key.equals("Code") || key.equals("StockID") || key.equals("StockDetailID")
						|| key.equals("IndexNo") || key.equals("ColorID") || key.equals("Color") || key.equals("BoxQty") || key.indexOf("x_") !=-1
						|| key.equals("Quantity") || key.equals("RelationUnitPrice") || key.equals("RelationAmount")) {
					LinkedHashMap<String, Object> m2 = new LinkedHashMap<String, Object>(); //一级表头
					if(key.equals("StockDetailID")){
						m2.put("field", key);
						m2.put("title", "StockDetailID");
						//m2.put("width", 10);
						m2.put("hide", true);
						m2.put("rowspan", String.valueOf(col));
						cols2.add(m2);	
					}else if(key.equals("GoodsID")) {
						m2.put("field", key);
						m2.put("title", "GoodsID");
						//m2.put("width", 120);
						m2.put("hide", true);
						m2.put("rowspan", String.valueOf(col));
						cols2.add(m2);
					}else if (key.equals("Code")){
					m2.put("field", key);
					m2.put("title", "货品编码");
					m1.put("height","auto");
					m2.put("width", 120);
					m2.put("rowspan", String.valueOf(col));
					m2.put("totalRowText", "合计：");
					cols2.add(m2);
					}else if(key.equals("StockID")){
						m2.put("field", key);
						m2.put("title", "StockID");
						m2.put("width", 10);
						m2.put("hide", true);
						m2.put("rowspan", String.valueOf(col));
						cols2.add(m2);	
					}else if(key.equals("IndexNo")){
						m2.put("field", key);
						m2.put("title", "序号");
						m2.put("width", 10);
						m2.put("hide", true);
						m2.put("rowspan", String.valueOf(col));
						cols2.add(m2);
					}else if(key.equals("ColorID")){
						m2.put("field", key);
						m2.put("title", "ColorID");
						m2.put("width", 10);
						m2.put("hide", true);
						m2.put("rowspan", String.valueOf(col));
						cols2.add(m2);	
					}else if(key.equals("Color")){
						m2.put("field", key);
						m2.put("title", "颜色");
						m2.put("width", 80);
						m2.put("rowspan", String.valueOf(col));
						cols2.add(m2);
					}else if(key.equals("BoxQty")){
						m2.put("field", key);
						m2.put("title", "箱数");
						m2.put("width", 80);
						m2.put("rowspan", String.valueOf(col));
						cols2.add(m2);
					}
				}		
					
			/*		Field[] declaredFields =	map.get(key).getClass().getDeclaredFields();
					for(Field f : declaredFields){
						 
			            if(f.getType() == String.class){
			 
			            	String value =String.valueOf(map.get(key));
							System.out.println(key + "====" + value);
			            }
			        }*/
			}//while 结束	
			
			
		    
			String s="";	
		//Sizegroupsize sg
		
			for(int k=0;k<str.length;k++){ //代替尺码组个数	
				List<LinkedHashMap<String, Object>> cols3= new ArrayList<LinkedHashMap<String, Object>>(); //当返回两行尺码头时，用到	 ;
			    String groupid=str[k].replace("'", "");
			    
			for(int i=1;i<=MaxNo;i++){
				String title=null;
			 for(Sizegroupsize sg :ls){		
			 if(i==sg.getNo() && sg.getSizegroupid().equals(groupid) && sg.getSize() !=null && !"".equals(sg.getSize())){
				 title =sg.getSize();
			  }//for结束
			}
			     s="x_"+String.valueOf(i);	  
				 LinkedHashMap<String,Object> m3=new LinkedHashMap<String,Object>(); //每一个x
				 m3.put("field", s);
				 m3.put("title", title);
				 m3.put("align", "center");	
				 m3.put("minWidth", 40);
				// m3.put("Width", 10);
			 if(k==0){//此时一个尺码也没有
				cols2.add(m3); 
			 }else{
			 for(int n=0;n<cols2.size();n++){	 
				if(cols2.get(n).get("field") !=null && !"".equals(cols2.get(n).get("field"))){
					if(cols2.get(n).get("field").equals(s))
					{
						if(cols2.get(n).get("title") !=null &&!"".equals(cols2.get(n).get("title")) ){
							if(title !=null && !"".equals(title)){
							cols2.get(n).put("title",cols2.get(n).get("title").toString()+"<br/>"+title);
							}
							System.out.println("title的值KKKKK:"+cols2.get(n).get("title").toString());
						}else{
							if(title !=null && !"".equals(title)){
							cols2.get(n).put("title","<br/>"+title); //尺码为空的也要添加
							}
						}
					//cols2.get(0).put("title", cols2.get(0).get("title").toString()+title);
					}
				} 
			 }
			 
			}
			}	

			}//for结束
			//List<LinkedHashMap<String, Object>> cols4 = new ArrayList<LinkedHashMap<String, Object>>();	
			
			
			
			
			
			LinkedHashMap<String, Object> m2 = new LinkedHashMap<String, Object>(); //一级表头m2 = new LinkedHashMap<String, Object>(); //一级表头
			m2.put("field", "Quantity");
			m2.put("title", "数量");
			m2.put("width", 100);
			m2.put("rowspan", String.valueOf(col));
			m2.put("totalRow", true);
			cols2.add(m2);
			m2 = new LinkedHashMap<String, Object>();
			m2.put("field", "RelationUnitPrice");
			m2.put("title", "结算价");
			m2.put("width", 100);
			m2.put("rowspan", String.valueOf(col));
			cols2.add(m2);
			
			m2 = new LinkedHashMap<String, Object>();
			m2.put("field", "RelationAmount");
			m2.put("title", "结算金额");
			m2.put("width", 100);
			m2.put("totalRow", true);
			m2.put("rowspan", String.valueOf(col));
			cols2.add(m2);	
			cols.add(cols2); //加第一个尺码组
			
			
			
			
			
			
			
		
			
	
		
		
		System.out.println("cols的数据：" + "====" + cols.toString());	
		
		j.put("cols", cols);
		j.put("msg", "返回成功");
		j.put("data", m.get("rows"));

		PrintWriter p = null;
		response.setContentType("text/html;charset=utf-8");// 解决返回乱码
		try {
			p = response.getWriter();
			p.write(j.toString());
			p.flush();
			p.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	

	

	@RequestMapping(value = "/autocompete")
	public void auto(HttpServletRequest request, HttpServletResponse response) {

		String keyword = request.getParameter("keyword");
   
		int Direction=Integer.valueOf(request.getParameter("Direction")).intValue();
		
		String conditions;

		if (keyword == null || "".equals(keyword)) {

			conditions = null;
		} else {
			conditions = " and (a.No like '%" + keyword + "%' )";
		}
		
		if(Direction==1){
			conditions = conditions + " and a.Direction=1 ";
			}else{
			conditions = conditions + " and a.Direction=-1 ";	
			}
		

		int pageno = 1;
		pageno = Integer.valueOf(request.getParameter("page").toString()).intValue() > 1
				? Integer.valueOf(request.getParameter("page").toString()).intValue() : 1;
		int pagesize = Integer.valueOf(request.getParameter("rows").toString()).intValue();

		HashMap<String, Object> m = stockService.stocklist(Direction,conditions, pageno, pagesize);
		JSONObject j = new JSONObject();
		// j.put("total", m.get("total"));
		// j.put("rows", m.get("rows"));
		j.put("code", 0);
		j.put("msg", "返回成功");
		j.put("count", m.get("total"));
		j.put("content", m.get("rows"));

		PrintWriter p = null;
		response.setContentType("text/html;charset=utf-8");// 解决返回乱码
		try {
			p = response.getWriter();
			p.write(j.toString());
			p.flush();
			p.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		/*
		 * GoodsExample example=new GoodsExample(); GoodsExample.Criteria
		 * c=example.createCriteria(); c.andCodeLike(keyword);
		 * c.andNameLike(keyword); c.andSuppliercodeLike(keyword); List<Goods>
		 * goods= goodsserive.selectByExample(example);
		 */
	}
	//获取单据同不的货品，同不到京东
	@RequestMapping(value = "/stockgoods")	
	@ResponseBody 
	public AjaxJson stockgoods(HttpServletRequest re){
		AjaxJson j=new AjaxJson();
		
		String stockid=re.getParameter("stockid");
		List<HashMap<String,Object>> ls=goodsservice.stockgoods("'"+stockid+"'");
		if(ls.size()>0){
		j.setSuccess(true);
		j.setObj(ls);
		j.setMsg("获取数据成功");
		}else{
		j.setMsg("获取数据失败");	
		}
		
		return j;
	}
	
	
	
	
	
	@RequestMapping(value = "/jdstock")	
	@ResponseBody
	public AjaxJson jdstock(HttpServletRequest re) throws JdException{
		AjaxJson j=new AjaxJson();
		
		String stockid=oConvertUtils.getString(re.getParameter("stockid"));
		String No=oConvertUtils.getString(re.getParameter("No"));
		String conditions=null;
		if(!"".equals(stockid) && stockid !=null){
			conditions=" and a.stockID='"+stockid+"'";
		}
		
		HashMap<String,Object> map = stockService.synstock(conditions);		        
		
		List<LinkedHashMap<String,Object>> list= (List<LinkedHashMap<String,Object>>) map.get("rows");
		String GoodsNo="",Qty="",RelationAmount="",GoodsStatus="";
		org.json.JSONObject jsonstr=new org.json.JSONObject();
		for(int i=0 ;i<list.size();i++){
			LinkedHashMap<String,Object> m= list.get(i);
			if(i==list.size()-1){
			GoodsNo =GoodsNo+String.valueOf(m.get("GoodsNo"));	
			Qty=Qty+String.valueOf(m.get("Quantity"));	
			BigDecimal rmt=(BigDecimal)m.get("RelationAmount");
			BigDecimal bg = rmt.setScale(2, BigDecimal.ROUND_HALF_UP);
			RelationAmount=RelationAmount+String.valueOf(bg);
			GoodsStatus=GoodsStatus+"1";
			}else{
			GoodsNo =GoodsNo+String.valueOf(m.get("GoodsNo"))+",";//京东货号
			Qty=Qty+String.valueOf(m.get("Quantity"))+",";
			BigDecimal rmt=(BigDecimal)m.get("RelationAmount");
			BigDecimal bg = rmt.setScale(2, BigDecimal.ROUND_HALF_UP);
			RelationAmount=RelationAmount+String.valueOf(bg)+",";
			GoodsStatus=GoodsStatus+"1"+",";
			  
			}
			
		}
		jsonstr.put("No", No);
		jsonstr.put("GoodsNo", GoodsNo);
		jsonstr.put("Qty",Qty);
		jsonstr.put("totalPrice",RelationAmount);
		jsonstr.put("GoodsStatus",GoodsStatus);
		
		// JdTools  jdTools =new JdTools();
		
		org.json.JSONObject json=jdTools.addPoOrder(jsonstr);
		
		if(json.has("errorcode")){
			j.setSuccess(false);
			j.setMsg(json.getString("errorcode"));
		}else{
			j.setMsg(json.getString("msg"));
			j.setSuccess(true);
			
			JdstockExample example =new JdstockExample();
			example.clear();
			JdstockExample.Criteria cr=example.createCriteria();
			cr.andStockidEqualTo(stockid);
			int count=jdstockService.countByExample(example);
			
			Jdstock jd=new Jdstock();
			jd.setStockid(stockid);
			jd.setGoodsno(GoodsNo);
			jd.setNo(No);
			jd.setIscancel(false);
			jd.setPoorderno(json.getString("PoOrderNo"));
			if(count>0){
					
			}else{
				jdstockService.insert(jd);
			}
			
		}
		
		
		
		return j;
	}
	
	
	@RequestMapping(value = "/jdstockdetail")
	public ModelAndView jdstockdetail(HttpServletRequest re){
		
		return new ModelAndView("jdstockdetail");
	}
	@RequestMapping(value = "/queryPoOrder")
	@ResponseBody
	public AjaxJson queryPoOrder(HttpServletRequest re,HttpServletResponse response) throws JdException{
		//默认只能查询一单
		AjaxJson j=new AjaxJson();
		String No=re.getParameter("No");
		System.out.println("京东单号："+No);
		
		
		
		
		List<QueryPoModel> ls=jdTools.queryPoOrder(No);
		
		if(ls.size()>0){
			System.out.println("ls的长度："+ls.size());
			     QueryPoModel po=ls.get(0); 
			     Map<String,Object> jsons= new LinkedHashMap<String,Object>();
			     String poOrderNo =po.getPoOrderNo();//开放平台采购入库单号;最大长度50
			     String isvPoOrderNo=po.getIsvPoOrderNo();//ISV采购入库单号；最大长度50
			     String deptNo=po.getDeptNo();//开放平台事业部编号；EBU开头；最大长度50
			     String whNo=po.getWhNo();//开放平台库房编号；最大长度50；
			     String supplierNo=po.getSupplierNo();//开放平台供应商编号；最大长度50
			     String createUser=po.getCreateUser();//采购入库单创建人;最大长度50；
			     String poOrderStatus=po.getPoOrderStatus();//采购入库单状态：10：新建，20：初始（下发），50：验收,70：关单；最大长度4
			     String createTime=po.getCreateTime();
			     String completeTime=po.getCompleteTime();
			     String storageStatus=po.getStorageStatus();
			     String resultCode=po.getResultCode();
			     String msg=po.getMsg();
			     List<PoItemModel> lt=po.getPoItemModelList();
			     
			     System.out.println("返回的单号getPoOrderNo:"+poOrderNo);
				 jsons.put("poOrderNo", poOrderNo);
		    	 jsons.put("isvPoOrderNo", isvPoOrderNo);
		    	 jsons.put("deptNo", deptNo);
		    	 jsons.put("whNo", whNo);
		    	 jsons.put("supplierNo", supplierNo);
		    	 jsons.put("createUser", createUser);
		    	 jsons.put("poOrderStatus", poOrderStatus);
		    	 jsons.put("createTime", createTime);
		    	 jsons.put("completeTime", completeTime);
		    	 jsons.put("storageStatus", storageStatus);
		    	 jsons.put("resultCode", resultCode);
		    	 
		    	 j.setAttribute(jsons);
		    	 
		    	 jsons.put("msg", msg);
			     if(lt !=null){	 
			    	 //jsons.put("data", lt);//采购入库单明细 
			    	 j.setObj(lt);
			     }
			     j.setSuccess(true);
			     List<String> qc= po.getQcBackErrItemList(); //质检不合格明细     
			     if(qc !=null){
			    	 jsons.put("qcBackErrItemList", qc);
			     }
			     	
			   
		}else{
			j.setMsg("返回查询失败");
			j.setSuccess(false);
		}
		
		
	/*	PrintWriter p = null;
		response.setContentType("text/html;charset=utf-8");// 解决返回乱码
		try {
			p = response.getWriter();
			p.write(jsons.toString());
			p.flush();
			p.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} */
		return j;
	}
	
	//退供应商下发(非备件库)
	@RequestMapping(value = "/jdstockRtsTransfer")	
	@ResponseBody
	public AjaxJson rtsisvRtsTransfer (HttpServletRequest re) throws JdException{
		
		AjaxJson j=new AjaxJson();
		
		String No=re.getParameter("No");
		String stockid=oConvertUtils.getString(re.getParameter("stockid"));
		String conditions=null;
		
		if(!"".equals(stockid) && stockid !=null){
			conditions=" and a.stockID='"+stockid+"'";
		}
		 //得到单据货品
		HashMap<String,Object> map = stockService.synstock(conditions);	
		
		List<LinkedHashMap<String,Object>> list= (List<LinkedHashMap<String,Object>>) map.get("rows");
		String GoodsNo="",Qty="",RelationAmount="",GoodsStatus="",jdName="";
		//因为退货要正数，所以负数的，要转成正数
		for(int i=0 ;i<list.size();i++){
			LinkedHashMap<String,Object> m= list.get(i);
			if(i==list.size()-1){
			GoodsNo =GoodsNo+String.valueOf(m.get("GoodsNo"));	
			Qty=Qty+String.valueOf(-Integer.valueOf(String.valueOf(m.get("Quantity"))));	
			BigDecimal rmt=(BigDecimal)m.get("RelationAmount");
			BigDecimal bg = rmt.setScale(2, BigDecimal.ROUND_HALF_UP);
			RelationAmount=RelationAmount+String.valueOf(bg);
			GoodsStatus=GoodsStatus+"1";
			jdName=jdName+String.valueOf(m.get("GoodsName"));
			}else{
			GoodsNo =GoodsNo+String.valueOf(m.get("GoodsNo"))+",";//京东货号
			Qty=Qty+String.valueOf(-Integer.valueOf(String.valueOf(m.get("Quantity"))))+",";
			BigDecimal rmt=(BigDecimal)m.get("RelationAmount");
			BigDecimal bg = rmt.setScale(2, BigDecimal.ROUND_HALF_UP);
			RelationAmount=RelationAmount+String.valueOf(bg)+",";
			GoodsStatus=GoodsStatus+"1"+",";
			jdName=jdName+String.valueOf(m.get("GoodsName"))+",";  
			}
			
		}
		if(list.size()>0){
		System.out.println("转换后的数量:"+Qty);
		org.json.JSONObject jsonstr =new org.json.JSONObject();
		jsonstr.put("No", No);
		jsonstr.put("GoodsNo", GoodsNo);
		jsonstr.put("jdName", jdName);
		jsonstr.put("Qty", Qty);
		
	    org.json.JSONObject json= jdTools.rtsisvRtsTransfer(jsonstr);
	    
	    if(json.has("result")){
	    	RtsResult result=(RtsResult)json.get("result");
	    	j.setMsg("新建退供单单号为："+result.getEclpRtsNo());  
	    	j.setSuccess(true);
	    	JdstockExample example =new JdstockExample();
			example.clear();
			JdstockExample.Criteria cr=example.createCriteria();
			cr.andStockidEqualTo(stockid);
			int count=jdstockService.countByExample(example);
			
			Jdstock jd=new Jdstock();
			jd.setStockid(stockid);
			jd.setGoodsno(GoodsNo);
			jd.setNo(No);
			jd.setEclprtsno(result.getEclpRtsNo());
			jd.setIscancel(false);
			
			if(count==0){
				jdstockService.insert(jd);
			}
	    	
	    	
	    }else{
	    	j.setMsg(json.getString("msg"));
	    	j.setSuccess(false);
	    }
	    
	    
		
		}
		
		
		
		return j;
	}
	
	//查询退供应商详情     rts.isvRtsQuery
	@RequestMapping(value = "/rtsisvRtsQuery")	
	@ResponseBody
	public AjaxJson rtsisvRtsQuery(HttpServletRequest re) throws JdException{
		AjaxJson j=new AjaxJson();
		
		String eclpRtsNo =re.getParameter("No"); //京东退货单号  就查询一条的
		Map<String,Object> map=new LinkedHashMap<>(); //表头内容
		
		if(!"".equals(eclpRtsNo) && eclpRtsNo !=null){
		List<com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.isvRtsQuery.RtsResult> ls=jdTools.rtsisvRtsQuery(eclpRtsNo);
		
		for(com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.isvRtsQuery.RtsResult result : ls){
			if("1".equals(result.getResultCode())){
				j.setMsg(result.getMsg());
				map.put("eclpRtsNo", result.getEclpRtsNo());//京东退货单号
				map.put("isvRtsNum", result.getIsvRtsNum());//线下单号
				map.put("supplierNo", result.getSupplierNo());
			  List<com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.isvRtsQuery.RtsDetail> detail=result.getRtsDetailList();	//退供应商明细信息集合
			  j.setObj(detail);
			  j.setAttribute(map);
			  j.setSuccess(true);
			}else{
			  j.setSuccess(false);
			  j.setMsg(result.getMsg());
			}
			
		}
		
		
		}	
		return j;
	}
	
	//查询退供应商详情   界面
	
	@RequestMapping(value = "/rtsisvRtsQueryDetail")
	public ModelAndView rtsisvRtsQueryDetail(HttpServletRequest re){
		Map<String,Object> map =new HashMap<>();
		map.put("No", re.getParameter("No"));
		
		return new ModelAndView("rtsisvRtsQueryDetail",map);
	}
	
	
	
	
	
	
	
	
	@RequestMapping(value = "/jdstockout")	
	@ResponseBody  //出库单同步
	public AjaxJson jdstockout(HttpServletRequest re) throws JdException{
		AjaxJson j=new AjaxJson();
		
		String stockid=oConvertUtils.getString(re.getParameter("stockid"));
		String No=oConvertUtils.getString(re.getParameter("No"));
		String Customer=oConvertUtils.getString(re.getParameter("Customer"));
		String Type=oConvertUtils.getString(re.getParameter("Type"));
		String shipperNo=oConvertUtils.getString(re.getParameter("shipperNo"));
		String Mobile=oConvertUtils.getString(re.getParameter("Mobile"));
		String Address=oConvertUtils.getString(re.getParameter("Address"));
		
		
		String conditions=null;
		if(!"".equals(stockid) && stockid !=null){
			conditions=" and a.stockID='"+stockid+"'";
		}
		
		HashMap<String,Object> map = stockService.synstock(conditions);		        
		
		List<LinkedHashMap<String,Object>> list= (List<LinkedHashMap<String,Object>>) map.get("rows");
		String GoodsNo="",Qty="",RelationAmount="",GoodsStatus="",jdName="";
		org.json.JSONObject jsonstr=new org.json.JSONObject();
		for(int i=0 ;i<list.size();i++){
			LinkedHashMap<String,Object> m= list.get(i);
			if(i==list.size()-1){
			
			GoodsNo =GoodsNo+String.valueOf(m.get("GoodsNo"));	
			jdName=jdName+String.valueOf(m.get("GoodsName"));
			Qty=Qty+String.valueOf(m.get("Quantity"));	
			BigDecimal rmt=(BigDecimal)m.get("RelationAmount");
			BigDecimal bg = rmt.setScale(2, BigDecimal.ROUND_DOWN);
			RelationAmount=RelationAmount+String.valueOf(bg);
			GoodsStatus=GoodsStatus+"1";
			}else{
			
			GoodsNo =GoodsNo+String.valueOf(m.get("GoodsNo"))+",";//京东货号
			jdName=jdName+String.valueOf(m.get("GoodsName"))+",";
			Qty=Qty+String.valueOf(m.get("Quantity"))+",";
			BigDecimal rmt=(BigDecimal)m.get("RelationAmount");
			BigDecimal bg = rmt.setScale(2, BigDecimal.ROUND_DOWN);
			RelationAmount=RelationAmount+String.valueOf(bg)+",";
			GoodsStatus=GoodsStatus+"1"+",";
			  
			}
			
		}
		jsonstr.put("Customer", Customer);
		jsonstr.put("Mobile", Mobile);
		jsonstr.put("Address", Address);
		jsonstr.put("Type", Type);
		jsonstr.put("shipperNo", shipperNo);
		jsonstr.put("OrderNo", "");
		jsonstr.put("No", No);
		jsonstr.put("GoodsNo", GoodsNo);
		jsonstr.put("jdName", jdName);
		jsonstr.put("Qty",Qty);
		jsonstr.put("Amt",RelationAmount);
		
		//jsonstr.put("GoodsStatus",GoodsStatus);
		
		// JdTools  jdTools =new JdTools();
		
		org.json.JSONObject json=jdTools.orderaddOrder(jsonstr);
		
		if(json.has("errorcode")){
			j.setSuccess(false);
			j.setMsg(json.getString("msg"));
		}else{
			j.setMsg(json.getString("msg"));
			j.setSuccess(true);
			
			JdstockExample example =new JdstockExample();
			example.clear();
			JdstockExample.Criteria cr=example.createCriteria();
			cr.andStockidEqualTo(stockid);
			int count=jdstockService.countByExample(example);
			
			Jdstock jd=new Jdstock();
			jd.setStockid(stockid);
			jd.setGoodsno(GoodsNo);
			jd.setNo(No);
			jd.setEclpsono(json.getString("eclpSoNo"));
			jd.setIscancel(false);
			if(count>0){
				jdstockService.updateByPrimaryKey(jd);
			}else{
				jdstockService.insert(jd);
			}
			
		}
		
		
		
		return j;
	}
	
	//出库单取消
	@RequestMapping("/cancelorderaddOrder")
	@ResponseBody
	public AjaxJson cancelorderaddOrder(HttpServletRequest re) throws JdException{
		AjaxJson j= new AjaxJson();
		
		String eclpSoNo=re.getParameter("No");
		String stockid=re.getParameter("stockid");
		CancelResult result=jdTools.ordercancelOrder(eclpSoNo);
		//返回结果码,1:取消成功,2:取消失败,3:取消中，需要等待一段时间，重新调用查询接口，获取拦截结果
		if(result.getCode() ==1){
			j.setSuccess(true);
			stockService.cancelStock(stockid, "32");
			
			Jdstock jd=new Jdstock();
			jd.setStockid(stockid);
			jd.setEclpsono(eclpSoNo);
			jd.setIscancel(true);
			jdstockService.updateByPrimaryKeySelective(jd);
			
			j.setMsg(result.getMsg());
			
			
			
		}else{
			j.setSuccess(false);
			j.setMsg(result.getMsg());
		}
	
		
		
		
		return j;
	}
	//出库单查询
	@RequestMapping("/orderqueryOrder")
	@ResponseBody
	public AjaxJson orderqueryOrder(HttpServletRequest re) throws JdException{
		AjaxJson j= new AjaxJson();
		
		String No =re.getParameter("No");
		OrderDetailResult result= jdTools.orderqueryOrder(No);
		
		String eclpSoNo =result.getEclpSoNo(); //	开放平台出库单号
		
		String isvUUID=result.getIsvUUID();
		String shopNo=result.getShopNo();
		String consigneeName=result.getConsigneeName();//客户姓名
		String consigneeAddress =result.getConsigneeAddress();//收货人地址
		String shipperName=result.getShipperName();//承运商名称
		List<OrderDetail> ls=result.getOrderDetailList(); //出库商品集合
		Map<String,Object> map=new LinkedHashMap<String,Object>();
		map.put("eclpSoNo", eclpSoNo);
		map.put("isvUUID", isvUUID);
		map.put("shopNo", shopNo);
		map.put("consigneeName", consigneeName);
		map.put("consigneeAddress", consigneeAddress);
		map.put("shipperName", shipperName);
		j.setAttribute(map);
		j.setObj(ls);
		
		return j;
	}
	
	//出库单查询
	@RequestMapping("/orderqueryShow")
	public ModelAndView orderqueryShow(HttpServletRequest re) throws JdException{
		
		
		String No =re.getParameter("No");
		String stockid=re.getParameter("stockid");
		
        Map<String,Object> map= new LinkedHashMap<>(); 
		
        map.put("No", No);
        map.put("stockid", stockid);
		
		return new ModelAndView("orderqueryShow",map);
	}
	
	
	
	

}