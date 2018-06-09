package pos.controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;





import com.alibaba.fastjson.JSONObject;

import pos.model.User;
import pos.service.userService;
@Controller
@RequestMapping("/user")
public class UserController {
	
	

	
	
	@Autowired
	private userService userservice;

	
	@RequestMapping(value="/ret",produces="text/html;charset=UTF-8")
	@ResponseBody //String 
	public void  Login(User user,HttpServletRequest request,HttpServletResponse response){	
    String username,password;
    boolean loginFlag=false;
    username=request.getParameter("username");
    password=request.getParameter("password");
    
    User u=new User();
    //loginFlag=String.valueOf(userservice.Login(user));
    user.setUsername(username);
    user.setPassword(password);
   u=userservice.Login(user);
   
  // System.out.print(u.getUsername());
   if (null==u){
	   
	   System.out.println("为空");
	   try {
		response.getOutputStream().write("用户不存在".getBytes("utf-8"));
	} catch (UnsupportedEncodingException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   //return "false";
   } else{
  
   
    //System.out.println("sssss:"+loginFlag);
    System.out.println(u.getUserid());
    System.out.println(u.getUsername());
    System.out.println(u.getPassword());
    JSONObject j=new JSONObject();
    HashMap<String,Object> map=new HashMap<>();
    map.put("userid", u.getUserid());
   // if map.get(0)>0
    System.out.println(map.get("userid"));
    if (map.get("userid").toString()!="")
    {
    	loginFlag=true;
    	 System.out.println("ssss"+String.valueOf(1));
    	 request.getSession().setAttribute("user", user);
    	 j.put("userid", u.getUserid());
    	 j.put("no", u.getNo());
    	 j.put("password", u.getPassword());
    	 j.put("username", u.getUsername());
    	 j.put("departmentid", u.getDepartmentid());
    	 
    	 System.out.println(user);
    	 try {
    	//String l=JSONObject.toJSONString("j",j);
    		
    	response.getOutputStream().write(j.toJSONString().getBytes("utf-8"));
			//response.getOutputStream().write("登录成功".getBytes("utf-8"));
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	// return JSON.toJSONString("登录成功");
    // return JSON.toJSONString(loginFlag);   //返回的原为ResponseBody就是json了，所以这个要json要转换成String  //String.valueOf(1);	
    } else{
    	 System.out.println("ab"+String.valueOf(0));
    	 
    	 
    	 try {
			response.getOutputStream().write("登录失败".getBytes("utf-8"));
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    //	 return JSON.toJSONString ("登录失败");
    //	 return JSON.toJSONString(loginFlag); //String.valueOf(0);
    	 
    	 
    }
   }
  
  /*  if (loginFlag=="1") {
    	
    	//userid= user.getUserid();
    	request.getSession().setAttribute("user", user.getUserid());
    	
    	
    	HashMap<String, Object> map = new HashMap<>();
    	 map.put("user", request.getSession().getAttribute("user"));
    	 System.out.printf("userid", map);
    	//HttpSession session=HttpSession.setAttribute("userid", user);
	//request.getSession().getAttribute("user"); 
      return String.valueOf(userservice.Login(user));
    } else {return "0";}
	//return String.valueOf(userservice.Login(user));
	          */
	}
	
	
	
	
	
	@RequestMapping("/login")
	public ModelAndView login(HttpServletRequest request) {
	
		//HashMap<String, Object> err = new HashMap<String, Object>();

		//err.put("errmsg", "1");
		return new ModelAndView("login");
	}
	
	
	
	
	

}
