package pos.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSONObject;

import pos.service.ISelect;
import web.util.oConvertUtils;

@Controller
@RequestMapping("select")
public class SelectController {
	
	
	@Autowired
	private ISelect selectservice;
	
	
	
	@RequestMapping(value="department")
	public void department(HttpServletRequest request,HttpServletResponse response){
		
	 String Department=oConvertUtils.getString(request.getParameter("department"));
	 String conditions=null; 
	 
	 if (!oConvertUtils.isEmpty(Department)){
		 conditions=" and a.Department like '%"+Department+"%' ";
	 }
	 
		int pageno = 1;
		pageno = Integer.valueOf(request.getParameter("page").toString()).intValue() > 1
				? Integer.valueOf(request.getParameter("page").toString()).intValue() : 1;
		int pagesize = Integer.valueOf(request.getParameter("rows").toString()).intValue();
	 
		HashMap<String,Object> m=selectservice.Departmentlist(conditions, pageno, pagesize);
	    
		JSONObject j=new JSONObject();
		j.put("code", 0);
		j.put("msg", "返回成功");
		j.put("count", m.get("total"));
		j.put("data", m.get("rows"));
		
		response.setContentType("text/html;charset=utf-8");
		try {
			PrintWriter p=response.getWriter();
			p.write(j.toJSONString());
			p.flush();
			p.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	 
		
		
		
		
		
	}	

}
