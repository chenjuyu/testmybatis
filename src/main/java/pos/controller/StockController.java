package pos.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import pos.service.IStock;
import web.util.oConvertUtils;


@Controller
@RequestMapping("stock")
public class StockController {
	
	
	@Autowired
	private IStock stockService;
	

	@RequestMapping(value="/search")
	public void search(HttpServletRequest request,HttpServletResponse response){
		
		String keyword=request.getParameter("keyword");
		int issyn=Integer.parseInt(request.getParameter("issyn"));
		
		System.out.print("issyn的值："+issyn);
		
	//	String q=request.getParameter("q");
		String conditions="";
		if (keyword==null || "".equals(keyword)){
			conditions="";
	//		keyword=q;
		}else{
			conditions=" and a.StockID='"+keyword+"' ";
		}
		if (issyn==1){
		//	conditions=conditions+" and not exists(select StockID from jdStock b where a.StockID=b.StockID)";
		}
		if (issyn==2){ //已同步
		  //  conditions=conditions+" and exists(select StockID from jdStock b where a.StockID=b.StockID)";	
			
		}
		conditions =conditions+" and a.Direction=1 ";
		//System.out.println(q);
		int pageno = 1;
		pageno = Integer.valueOf(request.getParameter("page").toString()).intValue() > 1
				? Integer.valueOf(request.getParameter("page").toString()).intValue() : 1;
		int pagesize = Integer.valueOf(request.getParameter("rows").toString()).intValue();
		
		System.out.println("keyword的值："+keyword);
		
		//String conditions=" a.Code like '%"+keyword+"%' or a.Name like '%"+keyword+"%'";
		
		
		
		HashMap<String,Object> m=stockService.stocklist(conditions, pageno, pagesize);
		JSONObject j=new JSONObject();
		//j.put("total", m.get("total"));
		//j.put("rows", m.get("rows"));
		j.put("code", 0);
		j.put("msg", "返回成功");
		j.put("count", m.get("total"));
		j.put("data", m.get("rows"));
		
		PrintWriter p=null;
		response.setContentType("text/html;charset=utf-8");//解决返回乱码
		try {
			p=response.getWriter();
			p.write(j.toString());
		    p.flush();
		    p.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@RequestMapping(value="/stockdetail")
	public void stockdetail(HttpServletRequest request,HttpServletResponse response){
		
	  String keyword=oConvertUtils.getString(request.getParameter("keyword"));
	  String conditions=null;
	   if(!oConvertUtils.isEmpty(keyword)){
	     conditions=" a.StockID ='"+keyword+"' ";
	    }else{
	    	conditions=" a.StockID = NULL ";	
	    }
		//System.out.println(q);
		int pageno = 1;
		pageno = Integer.valueOf(request.getParameter("page").toString()).intValue() > 1
				? Integer.valueOf(request.getParameter("page").toString()).intValue() : 1;
		int pagesize = Integer.valueOf(request.getParameter("rows").toString()).intValue();
		
	
		
		//String conditions=" a.Code like '%"+keyword+"%' or a.Name like '%"+keyword+"%'";
		
		
		
		HashMap<String,Object> m=stockService.stockDetial(conditions, pageno, pagesize);
		JSONObject j=new JSONObject();
		//j.put("total", m.get("total"));
		//j.put("rows", m.get("rows"));
		j.put("code", 0);
		j.put("msg", "返回成功");
		//j.put("count", m.get("total"));
		
		//http://localhost:8080/testmybatis/stock/stockdetail.do?keyword=TI02594&page=1&rows=10
		
		List<List<Map<String,Object>>> cols=new ArrayList<List<Map<String,Object>>>();
		List<Map<String,Object>> cols2=new ArrayList<Map<String,Object>>();
		
		List<Map<String,Object>> listdata=(List<Map<String,Object>>)m.get("rows");
		
		Map<String,Object> m1=new HashMap<String,Object>();
		m1.put("type", "checkbox");
		m1.put("fixed", "left");
		cols2.add(m1);
		for(Map<String,Object> map:listdata){
		  Set set=map.keySet(); //所获取所有的键名
		  for(Iterator iter = set.iterator(); iter.hasNext();)
		  {
		   
		   String key = (String)iter.next();
		   System.out.println("key"+"===="+key);
		   if(key.equals("Code")){
		   Map<String,Object> m2=new HashMap<String,Object>();
		   m2.put("field", key);
		   m2.put("title", "货品编码");
		   m2.put("width", 120);
		   cols2.add(m2);
		   String value = (String)map.get(key);
		   System.out.println(key+"===="+value);
		   }
		  }	
		}
		cols.add(cols2);
		j.put("cols",cols);
		j.put("msg", "返回成功");	
		j.put("data", m.get("rows"));
		
		
		
		
		PrintWriter p=null;
		response.setContentType("text/html;charset=utf-8");//解决返回乱码
		try {
			p=response.getWriter();
			p.write(j.toString());
		    p.flush();
		    p.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	
	
	
	
	@RequestMapping(value="/autocompete")
	public void auto(HttpServletRequest request,HttpServletResponse response){
		
		String keyword=request.getParameter("keyword");
		
		String conditions;
		
		if (keyword==null || "".equals(keyword)){
			
			conditions=null;
		}else{
			conditions=" and (a.No like '%"+keyword+"%' )";
		}
		
		
		int pageno = 1;
		pageno = Integer.valueOf(request.getParameter("page").toString()).intValue() > 1
				? Integer.valueOf(request.getParameter("page").toString()).intValue() : 1;
		int pagesize = Integer.valueOf(request.getParameter("rows").toString()).intValue();
		
		
		
		HashMap<String,Object> m=stockService.stocklist(conditions, pageno, pagesize);
		JSONObject j=new JSONObject();
		//j.put("total", m.get("total"));
		//j.put("rows", m.get("rows"));
		j.put("code", 0);
		j.put("msg", "返回成功");
		j.put("count", m.get("total"));
		j.put("content", m.get("rows"));
		
		PrintWriter p=null;
		response.setContentType("text/html;charset=utf-8");//解决返回乱码
		try {
			p=response.getWriter();
			p.write(j.toString());
		    p.flush();
		    p.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		/*
		GoodsExample example=new GoodsExample();
		GoodsExample.Criteria c=example.createCriteria();
		c.andCodeLike(keyword);
		c.andNameLike(keyword);
		c.andSuppliercodeLike(keyword);	
		List<Goods> goods=	goodsserive.selectByExample(example);
		*/	
	}
	
	
	
	
	
	

}
