package pos.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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
		
	 String Department=oConvertUtils.getString(request.getParameter("keyword"));
	 String conditions=null; 
	 
	 if (!oConvertUtils.isEmpty(Department)){
		 conditions=" and a.Department like '%"+Department+"%' ";
	 }
	 
		int pageno = 1;
		pageno = Integer.valueOf(request.getParameter("page").toString()).intValue() > 1
				? Integer.valueOf(request.getParameter("page").toString()).intValue() : 1;
		int pagesize = Integer.valueOf(request.getParameter("rows").toString()).intValue();
	 
		HashMap<String,Object> m=selectservice.Departmentlist(conditions, pageno, pagesize);
	    
		List<List<LinkedHashMap<String,Object>>> cols=new ArrayList<List<LinkedHashMap<String,Object>>>();
		List<LinkedHashMap<String,Object>> cols2=new ArrayList<LinkedHashMap<String,Object>>();
		
		LinkedHashMap<String,Object> m1=new LinkedHashMap<String,Object>();
		 m1.put("type", "checkbox");
		 m1.put("width", 50);
		 cols2.add(m1);
		 m1=new LinkedHashMap<String,Object>();
		 m1.put("field", "DepartmentID");
		 m1.put("title", "部门ID");
		 m1.put("width", 30);
		 m1.put("hide", true);
		 cols2.add(m1);
		 m1=new LinkedHashMap<String,Object>();
		 m1.put("field", "Code");
		 m1.put("title", "部门编码");
		 m1.put("width", 110);
		 cols2.add(m1);
		 m1=new LinkedHashMap<String,Object>();
		 m1.put("field", "Department");
		 m1.put("title", "部门名称");
		 m1.put("width", 100);
		 cols2.add(m1);
		 
		 cols.add(cols2);
		 
		JSONObject j=new JSONObject();
		j.put("code", 0);
		j.put("msg", "返回成功");
		j.put("count", m.get("total"));
		j.put("data", m.get("rows"));
		j.put("cols", cols);
		
		
		
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
	
	@RequestMapping(value="selectlist")
	public ModelAndView selectlist(HttpServletRequest request){
		
		return new ModelAndView("select");
	}

}