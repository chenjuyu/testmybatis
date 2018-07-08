package pos.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import pos.service.IColor;

import net.sf.json.JSONObject;



@Controller
@RequestMapping("color")
public class ColorController {
	
	@Autowired
	private IColor colorservise;

	
	@RequestMapping(value = "/search", method = { RequestMethod.POST,
			RequestMethod.GET }, produces = "text/html,application/json;charset=UTF-8")
	public void search(HttpServletRequest request,HttpServletResponse response){
		
		String goodsid=request.getParameter("GoodsID");
		String keyword=request.getParameter("keyword");
		String conditions="";
		System.out.println(goodsid);
		System.out.println(keyword);
		
		if (goodsid ==null | "".equals(goodsid) && (keyword !=null && !"".equals(keyword))){
			conditions="(and a.Color like '%"+keyword+"%' or a.No like '%"+keyword+"%' and isnull(a.StopFlag,0)=0)";
		}else{
			conditions =" a.goodsid='"+goodsid+"' and (b.Color like '%"+keyword+"%' or b.No like '%"+keyword+"%') and isnull(a.StopFlag,0)=0";
		}
		int pageno = 1;
		pageno = Integer.valueOf(request.getParameter("page").toString()).intValue() > 1
				? Integer.valueOf(request.getParameter("page").toString()).intValue() : 1;
		int pagesize = Integer.valueOf(request.getParameter("rows").toString()).intValue();
		
		HashMap<String,Object> m=colorservise.searchcolor(false, conditions, pageno, pagesize);
		
		JSONObject j=new JSONObject();
		
		j.put("total", m.get("total"));
		j.put("rows", m.get("rows"));
		
		
		PrintWriter out=null;
		response.setContentType("text/html,application/json;charset=utf-8");
		
		try {
			out=response.getWriter();
			out.write(j.toString());

			out.flush();
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	
	
	
}
