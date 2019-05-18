package pos.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;





import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;




import pos.model.Goods;
import pos.model.GoodsExample;
import pos.service.IGoods;

@Controller
@RequestMapping("/goods")
public class SearchGoodsComboGridController {
	
	@Autowired
	private IGoods  goodsserive;
	
	
	@RequestMapping(value="/search",method={RequestMethod.POST,RequestMethod.GET}, produces="text/html,application/json;charset=UTF-8")
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
			conditions=" and a.goodsid='"+keyword+"' ";
		}
		if (issyn==1){
			conditions=conditions+" and not exists(select GoodsID from jdgoods b where a.GoodsID=b.GoodsID)";
		}
		if (issyn==2){ //已同步
		    conditions=conditions+" and exists(select GoodsID from jdgoods b where a.GoodsID=b.GoodsID)";	
			
		}
		
		//System.out.println(q);
		int pageno = 1;
		pageno = Integer.valueOf(request.getParameter("page").toString()).intValue() > 1
				? Integer.valueOf(request.getParameter("page").toString()).intValue() : 1;
		int pagesize = Integer.valueOf(request.getParameter("rows").toString()).intValue();
		
		System.out.println("keyword的值："+keyword);
		
		//String conditions=" a.Code like '%"+keyword+"%' or a.Name like '%"+keyword+"%'";
		
		
		
		HashMap<String,Object> m=goodsserive.goodslist(conditions, pageno, pagesize);
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
		
		
		/*
		GoodsExample example=new GoodsExample();
		GoodsExample.Criteria c=example.createCriteria();
		c.andCodeLike(keyword);
		c.andNameLike(keyword);
		c.andSuppliercodeLike(keyword);	
		List<Goods> goods=	goodsserive.selectByExample(example);
		*/	
	}
	@RequestMapping(value="/autocompete")
	public void auto(HttpServletRequest request,HttpServletResponse response){
		
		String keyword=request.getParameter("keyword");
		
		String q=request.getParameter("q");
		
		if (keyword==null || "".equals(keyword)){
			
			keyword=q;
		}
		
		
		int pageno = 1;
		pageno = Integer.valueOf(request.getParameter("page").toString()).intValue() > 1
				? Integer.valueOf(request.getParameter("page").toString()).intValue() : 1;
		int pagesize = Integer.valueOf(request.getParameter("rows").toString()).intValue();
		
		String conditions=" and (a.Code like '%"+keyword+"%' or a.Name like '%"+keyword+"%')";
		
		HashMap<String,Object> m=goodsserive.goodslist(conditions, pageno, pagesize);
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
