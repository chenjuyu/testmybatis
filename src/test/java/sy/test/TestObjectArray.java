package sy.test;

import net.sf.json.JSONObject;

public class TestObjectArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	int n=50;
		Object[] b=new Object[n];
		b[0]=222;
		b[1]=333;
		
		for(int i=0;i<=b.length;i++){
			
			
			System.out.println(b[i]);
			
			
		} */
		
		String str="{\"totalpage\":15}";
		 System.out.println(str);
		 JSONObject jsonObject = JSONObject.fromObject(str);
		
		 System.out.println(jsonObject.getString("totalpage"));
	}

}
