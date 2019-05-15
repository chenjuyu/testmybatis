package pos.controller;

import javax.servlet.http.HttpServletRequest;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import web.util.AjaxJson;
import web.util.CommonUtils;

@Controller
@RequestMapping("")
public class Test {
	
	
	
	
	@RequestMapping(value="/getEmp")
	@ResponseBody
	public AjaxJson getEmp(HttpServletRequest request){
		
		String path = request.getContextPath();
		String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
		basePath=basePath+"syndata/syntools.do?";
		
		JSONObject j=CommonUtils.JhttpRequest(basePath, "POST", "currpage=1&pagesize=10&field=EmployeeID,Code,Name&tbl=Employee&keyid=EmployeeID");
		//System.out.println("Str:"+str);
		//JSONObject j=new JSONObject(str);
		JSONArray  jsonarray= j.getJSONArray("obj");
		
		for(int i=0;i<jsonarray.length();++i){
			
			System.out.println(jsonarray.getJSONObject(i).getString("Name"));
		}
		AjaxJson  aj=new AjaxJson();
		aj.setObj(jsonarray.toList());
		aj.setMsg("接收数据成功");
		
		return aj;
		
	}
	
	
	
	
	
	
	
	

}
