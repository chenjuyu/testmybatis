package sy.test;

import org.json.JSONArray;
import org.json.JSONObject;

public class TestOrgJson {
	
	
	public static void main(String[] args) {
		
		String str ="{'id':123,'name':'我们从人'}";
		
		JSONObject j=new JSONObject(str);
		JSONArray a =new JSONArray();
		//a.toList()
		System.out.println(j.toString());
		System.out.println(j.getString("name"));
		
		//Class.forName(className)
		
	}

}
