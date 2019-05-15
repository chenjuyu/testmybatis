package sy.test;
import web.util.CommonUtils;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONArray;
public class CommonUtilsCookie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String,Object> map=new HashMap<String,Object>();
		map.put("userno", "admin");
		map.put("password", "1");
		//userno=admin&password=1
		
		String session=CommonUtils.getSessionMap("https://weixin.fxsoft88.com/managelogin/login.do","POST",map);
		
		System.out.println("sessionKKKK:"+session);;
		
		
		
		
		
	}
	
	

	
	
	
	
	
	

}
