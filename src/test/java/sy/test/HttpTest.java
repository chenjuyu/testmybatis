package sy.test;
import org.apache.commons.lang.StringEscapeUtils;

import  net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import web.util.CommonUtils;
public class HttpTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //自定义的可以自动轩转义，网页返回的不可以[{"DepartmentID":"00L","FactAmountSum":"200.0000"},{"DepartmentID":"00L","FactAmountSum":"200.0000"},{"DepartmentID":"00L","FactAmountSum":"200.0000"},{"DepartmentID":"00L","FactAmountSum":"200.0000"},{"DepartmentID":"00L","FactAmountSum":"200.0000"},{"DepartmentID":"00L","FactAmountSum":"200.0000"},{"DepartmentID":"00L","FactAmountSum":"200.0000"}]
		//  String str ="[{\"DepartmentID\":\"00L\",\"FactAmountSum\":\"200.0000\"},{\"DepartmentID\":\"00L\",\"FactAmountSum\":\"200.0000\"},{\"DepartmentID\":\"00L\",\"FactAmountSum\":\"200.0000\"},{\"DepartmentID\":\"00L\",\"FactAmountSum\":\"200.0000\"},{\"DepartmentID\":\"00L\",\"FactAmountSum\":\"200.0000\"},{\"DepartmentID\":\"00L\",\"FactAmountSum\":\"200.0000\"},{\"DepartmentID\":\"00L\",\"FactAmountSum\":\"200.0000\"}]"; 
	//	net.sf.json.JSONArray jsonarray =CommonUtils.httpRequest("http://127.0.0.1:8080/testmybatis/possales/search.do","GET","a=1&b=2");
		String str =CommonUtils.httpRequest("http://127.0.0.1:8080/testmybatis/possales/search.do","GET","a=1&b=2");
		//str=str.substring(1,str.length()-1);
		System.out.println(str);
		str =StringEscapeUtils.unescapeJava(str); //去掉转义字符 从网页回来的是有转义字符的
		System.out.println(str);
		str=str.substring(1,str.length()-1);  //去掉前后的" 号
		JSONArray jsonarray =JSONArray.fromObject(str);
			if (jsonarray.size()>0) {
	     for(int i=0;i<jsonarray.size();i++){
	    	 JSONObject json=	 jsonarray.getJSONObject(i);
	    	  System.out.println(json.get("DepartmentID"));
	    	  System.out.println(json.get("FactAmountSum"));
	     } 	
    			
			
			
				
				  
				 	  
			  }
		
		
		
	}

}
