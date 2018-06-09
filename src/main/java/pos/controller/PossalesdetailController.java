package pos.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONObject;

import pos.service.IPossalesdetail;

@Controller
@RequestMapping("possalesdetail")
public class PossalesdetailController {
	
	@Autowired
	IPossalesdetail possalesService;
	
	

	@RequestMapping(value = "/detail", method = { RequestMethod.POST,
			RequestMethod.GET }, produces = "text/html,application/json;charset=UTF-8")
	
	public ModelAndView detail(HttpServletRequest request,HttpServletResponse response){
		//HashMap<String,Object> map=(HashMap<String, Object>) getParameterMap(request);
		//System.out.println(map);
		
	 String map=null;
	try {
		map = URLDecoder.decode(request.getParameter("map"), "UTF-8");
		System.out.println(map);//map.get("POSSalesID")
	//	return new ModelAndView("possalesdetail");
	} catch (UnsupportedEncodingException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}//解码  JSONObject1.5 只能用Map转换，HashMap不行 aaa
	 net.sf.json.JSONObject jsonstr=net.sf.json.JSONObject.fromObject(map);
	 Map<String, Object> map1 = new HashMap<String, Object>();
      map1.put("map1", jsonstr);
	 // System.out.println(map1);
	// System.out.println(map1.get("POSSalesID"));//
	return new ModelAndView("possalesdetail",map1);	
		
	}
	
	
	
	
	
	
	@RequestMapping(value = "/listdata", method = { RequestMethod.POST,
			RequestMethod.GET }, produces = "text/html,application/json;charset=UTF-8")
	public void listData(HttpServletRequest request,HttpServletResponse response){
		
		String param=request.getParameter("map");
		
	//	HashMap<String,Object> mp=(HashMap<String, Object>) getParameterMap(request);
		//if (!(String.valueOf(mp.get("POSSalesID")=null) && !String.valueOf(mp.get("POSSalesID").equals("")){
			
	//	}
		 net.sf.json.JSONObject jsonstr=net.sf.json.JSONObject.fromObject(param);
		System.out.println(jsonstr);
		
		String conditions=" a.POSSalesID='"+jsonstr.getString("POSSalesID")+"'";
		
		System.out.println(conditions);
		
		
		int pageno = 1;
		pageno = Integer.valueOf(request.getParameter("page").toString()).intValue() > 1
				? Integer.valueOf(request.getParameter("page").toString()).intValue() : 1;
		int pagesize = Integer.valueOf(request.getParameter("rows").toString()).intValue();
		HashMap<String,Object> map = possalesService.possalesdetaillist(conditions, pageno, pagesize);
 
		
		JSONObject jsonobject = new JSONObject();
		jsonobject.put("total", map.get("total"));
		jsonobject.put("rows", map.get("rows"));
		jsonobject.put("footer", map.get("footer"));
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out;
		try {
			out = response.getWriter();
			out.write(jsonobject.toJSONString());
			out.flush();//flush()意思是把缓冲区的内容强制的写出
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	//将request接受数据转换成map
	 @SuppressWarnings({ "unchecked", "rawtypes" })  
	    public static Map getParameterMap(HttpServletRequest request) {  
	        // 参数Map  
	        Map properties = request.getParameterMap();  
	        // 返回值Map  
	        Map returnMap = new HashMap();  
	        Iterator entries = properties.entrySet().iterator();  
	        Map.Entry entry;  
	        String name = "";  
	        String value = "";  
	        while (entries.hasNext()) {  
	            entry = (Map.Entry) entries.next();  
	            name = (String) entry.getKey();  
	            Object valueObj = entry.getValue();  
	            if(null == valueObj){  
	                value = "";  
	            }else if(valueObj instanceof String[]){  
	                String[] values = (String[])valueObj;  
	                for(int i=0;i<values.length;i++){  
	                    value = values[i] + ",";  
	                }  
	                value = value.substring(0, value.length()-1);  
	            }else{  
	                value = valueObj.toString();  
	            }  
	            returnMap.put(name, value);  
	        }  
	        return returnMap;  
	    }  
	
	
}
