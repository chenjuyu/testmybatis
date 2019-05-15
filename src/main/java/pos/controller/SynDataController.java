package pos.controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;


import pos.service.SysData;
import web.util.AjaxJson;


@Controller
@RequestMapping("syndata")
public class SynDataController {
	
	
	@Autowired
	private SysData syn;
	
	/*
	 * http://localhost:8080/testmybatis/syndata.do?syntools&currpage=1&pagesize=20&field=EmployeeID,Code,Name&tbl=Employee&keyid=EmployeeID
	 * */
	@RequestMapping(params="syntools")
	@ResponseBody
	public AjaxJson Syn(HttpServletRequest re,HttpServletResponse rp){
		
		AjaxJson j=new AjaxJson();
		
		 HttpSession session= re.getSession();
		                
		String userid=String.valueOf(session.getAttribute("userid"));
		System.out.println("session的ID值："+userid);
		
		int currpage=Integer.parseInt(re.getParameter("currpage"));
		int pagesize=Integer.parseInt(re.getParameter("pagesize"));
		String field=re.getParameter("field");
		String tbl=re.getParameter("tbl");
		String keyid=re.getParameter("keyid");
		List<Map<String,Object>> ls=syn.SynData(tbl, keyid, currpage, pagesize,field);
		j.setSuccess(true);
		j.setObj(ls);
		j.setMsg("返回成功");
		return j;
		
	/*
		try {
			rp.setContentType("text/html;charset=utf-8");//解决返回乱码
			rp.getOutputStream().write(JSONObject.toJSONString(ls).getBytes("utf-8"));
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} */
		
	}
	
	@RequestMapping(value="getdata",produces="text/html;charset=utf-8")
	public void GetData(HttpServletRequest re,HttpServletResponse rp){
		
		 HttpSession session= re.getSession();
		                
		String userid=String.valueOf(session.getAttribute("userid"));
		System.out.println("session的ID值："+userid);
		
		int currpage=Integer.parseInt(re.getParameter("currpage"));
		int pagesize=Integer.parseInt(re.getParameter("pagesize"));
		String field=re.getParameter("field");
		String tbl=re.getParameter("tbl");
		String keyid=re.getParameter("keyid");
		List<Map<String,Object>> ls=syn.SynData(tbl, keyid, currpage, pagesize,field);
		JSONObject json =new JSONObject();
		json.put("ls", ls);		
		//return JSONObject.toJSONString(json);
		try {
			rp.setContentType("text/html;charset=utf-8");
			//rp.setCharacterEncoding("text/html;charset=utf-8");
			rp.getOutputStream().write(json.toJSONString().getBytes("utf-8"));
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
	@RequestMapping(value="getpagecount")
	@ResponseBody
	public String Synpagecount(HttpServletRequest re,HttpServletResponse rp){
		 HttpSession session= re.getSession();
		 
		String userid=String.valueOf(session.getAttribute("userid"));
		
		System.out.println("session的ID值："+userid);
		
		//int currpage=Integer.parseInt(re.getParameter("currpage"));
		int pagesize=Integer.parseInt(re.getParameter("pagesize"));
		String tbl=re.getParameter("tbl");
		//String keyid=re.getParameter("keyid");
		int totalpage=syn.pagecount(tbl, pagesize);
	/*	Map<String,Object> m=new HashMap<String,Object>();
		m.put("totalpage", totalpage);
		List<Map<String,Object>> ls=new ArrayList<Map<String,Object>>();
		ls.add(m); */
		JSONObject json =new JSONObject();
		json.put("totalpage", totalpage);		
		return JSONObject.toJSONString(json);
	}
	
	
	

}
