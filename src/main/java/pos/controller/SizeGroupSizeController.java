package pos.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import net.sf.json.JSONObject;
import pos.service.ISizeGroupSize;

@Controller
@RequestMapping("size")
public class SizeGroupSizeController {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Autowired
	private ISizeGroupSize sizeservice;
	
	
	@RequestMapping(value="/search",method={RequestMethod.POST,RequestMethod.GET}, produces="text/html,application/json;charset=UTF-8")
	public void search(HttpServletRequest request,HttpServletResponse response){
		
		String goodsid=request.getParameter("GoodsID");
		System.out.println(goodsid);
		
		String sql="Select SizeGroupID From Goods a,GoodsType b Where a.GoodsTypeID=b.GoodsTypeID and GoodsID='"+goodsid+"'";
		
		
		
		Map<String, Object> map= jdbcTemplate.queryForMap(sql);
		System.out.println(map);
		
		String SizeGroupID=String.valueOf(map.get("SizeGroupID"));
		
		/*
		int pageno = 1;
		pageno = Integer.valueOf(request.getParameter("page").toString()).intValue() > 1
				? Integer.valueOf(request.getParameter("page").toString()).intValue() : 1;
		int pagesize = Integer.valueOf(request.getParameter("rows").toString()).intValue();
		
		String conditions=" a.Code like '%"+keyword+"%' or a.Name like '%"+keyword+"%'";
		*/
		String conditions=" and a.SizeGroupID='"+SizeGroupID+"'";    
	    HashMap<String,Object> sizelist=sizeservice.searchsize(conditions, 1, 10);
		
	    JSONObject j=new JSONObject();
	    j.put("rows", sizelist.get("rows"));
	    
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
	
	

}
