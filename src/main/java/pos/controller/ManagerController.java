package pos.controller;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;

import web.util.AjaxJson;
import web.util.Common;

@Controller
@RequestMapping("main")
public class ManagerController {
	
	
	@RequestMapping("/index")
	public ModelAndView index(HttpServletRequest re){
		
		if(re.getSession().getAttribute("userid")==null){
			
		    return new ModelAndView("login");//重定向

		}		
		Map<String,Object> map=new HashMap<String,Object>();
		String str=null;
		try {
			str =URLDecoder.decode(re.getParameter("map"), "UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		map.put("map", JSON.parseObject(str).get("user"));
		  
		System.out.println("map的值："+str);
	
			
		return new ModelAndView("lmain",map);
	}
	
	@RequestMapping("/goods")
	public ModelAndView getgoods(HttpServletRequest re,HttpServletResponse rp){
	
	 	
		
		return new ModelAndView("goodslist");
	}
	
	
	
	
	

}
