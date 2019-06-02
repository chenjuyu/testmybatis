package pos.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Field;
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

import com.jd.open.api.sdk.JdException;

import pos.model.Sizegroupsize;
import pos.model.SizegroupsizeExample;
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
	
	
	
	@RequestMapping(value = "/search")
	public void search(HttpServletRequest request, HttpServletResponse response) {

		String keyword = request.getParameter("keyword");
		int issyn = Integer.parseInt(request.getParameter("issyn"));

		System.out.print("issyn的值：" + issyn);

		// String q=request.getParameter("q");
		String conditions = "";
		if (keyword == null || "".equals(keyword)) {
			conditions = "";
			// keyword=q;
		} else {
			conditions = " and a.StockID='" + keyword + "' ";
		}
		if (issyn == 1) {
			// conditions=conditions+" and not exists(select StockID from
			// jdStock b where a.StockID=b.StockID)";
		}
		if (issyn == 2) { // 已同步
			// conditions=conditions+" and exists(select StockID from jdStock b
			// where a.StockID=b.StockID)";

		}
		conditions = conditions + " and a.Direction=1 ";
		// System.out.println(q);
		int pageno = 1;
		pageno = Integer.valueOf(request.getParameter("page").toString()).intValue() > 1
				? Integer.valueOf(request.getParameter("page").toString()).intValue() : 1;
		int pagesize = Integer.valueOf(request.getParameter("rows").toString()).intValue();

		System.out.println("keyword的值：" + keyword);

		// String conditions=" a.Code like '%"+keyword+"%' or a.Name like
		// '%"+keyword+"%'";

		HashMap<String, Object> m = stockService.stocklist(conditions, pageno, pagesize);
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

		String conditions;

		if (keyword == null || "".equals(keyword)) {

			conditions = null;
		} else {
			conditions = " and (a.No like '%" + keyword + "%' )";
		}

		int pageno = 1;
		pageno = Integer.valueOf(request.getParameter("page").toString()).intValue() > 1
				? Integer.valueOf(request.getParameter("page").toString()).intValue() : 1;
		int pagesize = Integer.valueOf(request.getParameter("rows").toString()).intValue();

		HashMap<String, Object> m = stockService.stocklist(conditions, pageno, pagesize);
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
	
	@RequestMapping(value = "/jdstock")	
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
		String GoodsNo="";
		org.json.JSONObject jsonstr=new org.json.JSONObject();
		for(int i=0 ;i<list.size();i++){
			LinkedHashMap<String,Object> m= list.get(i);
			if(i==list.size()-1){
			GoodsNo =GoodsNo+String.valueOf(m.get("GoodsNo"));	
			}else{
			GoodsNo =GoodsNo+String.valueOf(m.get("GoodsNo"))+",";//京东货号
			}
			jsonstr.put("No", No);
			jsonstr.put("GoodsNo", GoodsNo);
			jsonstr.put("Qty",String.valueOf(m.get("Quantity")));
			jsonstr.put("totalPrice",String.valueOf(m.get("RelationAmount")));
		}
		JdTools  jdTools =new JdTools();
		
		org.json.JSONObject json=jdTools.addPoOrder(jsonstr);
		
		if(json.getString("errorcode") !=null){
			j.setSuccess(false);
			j.setMsg(json.getString("errorcode"));
		}else{
			j.setMsg(json.getString("msg"));
			j.setSuccess(true);
		}
		
		
		
		return j;
	}
	
	

}