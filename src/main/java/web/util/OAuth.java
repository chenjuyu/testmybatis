package web.util;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;

import pos.controller.UserController;
import web.util.CommonUtils;
import web.util.ResourceUtil;
import web.util.Common;

public class OAuth {
	
  public static String Code,access_token,
  refresh_token,scope,open_id;
  
  public static int expires_in;

 // https://open-oauth.jd.com/oauth2/to_login?app_key=16CE123054B0616AA1BCCE9917DFE684&response_type=code&redirect_uri=http://wvip.sc9991888.cn/user/loginjd.do&state=20190513&scope=snsapi_base

 //浏览器打开登录  在客户的服务上  打开
  //第一次取这个
  public static void getToken(String app_key,String app_secret){
	  //https://open-oauth.jd.com/oauth2/access_token?app_key=XXXXX&app_secret=XXXXX&grant_type=authorization_code&code=XXXXX
	  
	  System.out.println("Code返回的内容:"+Code);
	  
	//  String url="https://open-oauth.jd.com/oauth2/access_token?";
	 // Map<String,Object> map=new HashMap<String,Object>();
	//  map.put("app_key", app_key);
	//  map.put("app_secret", app_secret);
	 // map.put("grant_type", "authorization_code");
	 // map.put("code", Code);
	  String url="https://open-oauth.jd.com/oauth2/access_token?app_key="+app_key+"&app_secret="+app_secret+"&grant_type=authorization_code&code="+Code;
	  JSONObject j  = CommonUtils.jd(url,"POST",null);
	  
	 // System.out.println("JSONObject返回:"+j.toString());
	  
	  if(j !=null){
		  access_token=j.getString("access_token");   
		  expires_in=j.getInt("expires_in");
		  refresh_token=j.getString("refresh_token");
		  scope=j.getString("scope");
		  open_id=j.getString("open_id");
		String sysConfig= ResourceUtil.getClassPath()+"sysConfig.properties";
		  ResourceUtil.writeProperties(sysConfig,"code",Code);
		  ResourceUtil.writeProperties(sysConfig,"access_token",access_token);
		  ResourceUtil.writeProperties(sysConfig,"expires_in",String.valueOf(expires_in));
		  ResourceUtil.writeProperties(sysConfig,"refresh_token",refresh_token);
		  ResourceUtil.writeProperties(sysConfig,"scope",scope);
		  ResourceUtil.writeProperties(sysConfig,"open_id",open_id);
		  ResourceUtil.writeProperties(sysConfig,"EndDate",String.valueOf(Common.getSecondTimestampTwo(new Date())+expires_in));
	
	  }
  }
  /*当返回授权后的access_token信息后，应用程序应记录下“用户的授权到期时间”到数数据库，与用户的唯一ID“open_id”关联， “用户的授权到期时间”=当前日期时间+ “expires_in”参数值。 */
  
  public static void refreshtoken(){
 	
 	/*还有一个1小时，刷新 */ 
  /*  if(EndDate-Common.getSecondTimestampTwo(new Date())==3600){
 	   refreshtoken();
    } */ 
 	String appkey= ResourceUtil.getConfigByName("appKey");
 	String appSecret= ResourceUtil.getConfigByName("appSecret");
 	String refresh_token=ResourceUtil.getConfigByName("refresh_token");
   
    String url= "https://open-oauth.jd.com/oauth2/refresh_token?app_key="+appkey+"&app_secret="+appSecret+"&grant_type=refresh_token&refresh_token="+refresh_token;
  
    JSONObject json  = CommonUtils.jd(url,"POST",null);
    
    if(json.get("access_token") !=null){ 
 	   access_token=json.getString("access_token");   
 		  expires_in=json.getInt("expires_in");
 		  refresh_token=json.getString("refresh_token");
 		  scope=json.getString("scope");
 		  open_id=json.getString("open_id");
 	   
 		String sysConfig= ResourceUtil.getClassPath()+"sysConfig.properties";
 		
 		  ResourceUtil.writeProperties(sysConfig,"access_token",access_token);
 		  ResourceUtil.writeProperties(sysConfig,"expires_in",String.valueOf(expires_in));
 		  ResourceUtil.writeProperties(sysConfig,"refresh_token",refresh_token);
 		  ResourceUtil.writeProperties(sysConfig,"scope",scope);
 		  ResourceUtil.writeProperties(sysConfig,"open_id",open_id);
 	   
    }
  }
  
  public static Map<String,Object> transToken(){
	  
	  Map<String,Object> map=new HashMap<String,Object>();
	  
	  int EndDate=Integer.parseInt(ResourceUtil.getConfigByName("EndDate"));
	  if(EndDate-Common.getSecondTimestampTwo(new Date())<=3600){
	 	   refreshtoken();
	    }
	  map.put("appKey", ResourceUtil.getConfigByName("appKey"));
	  map.put("appSecret", ResourceUtil.getConfigByName("appSecret"));
	  map.put("access_token", ResourceUtil.getConfigByName("access_token"));
	  return map;
  }
  
}
