package sy.test;

import java.util.List;
import java.util.Map;

import org.json.simple.JSONObject;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.fastjson.JSON;

import pos.model.Employee;
import pos.service.SysData;

public class JSONParseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
			ApplicationContext ac=new ClassPathXmlApplicationContext(new String[]{"spring.xml","spring-mybatis.xml"});
			SysData a=(SysData)ac.getBean("synData");
			List<Map<String,Object>> ls=a.SynData("Employee", "EmployeeID", 1, 10, "EmployeeID,Code,Name");
			JSONObject j=new JSONObject();
			   j.put("ls", ls);
	         String s=j.toJSONString();//JSONObject.toJSONString(j);
	            
	         net.sf.json.JSONObject jsonobject=net.sf.json.JSONObject.fromObject(s) ;      
	         
	         
	         
	        List<Employee> e=JSON.parseArray(String.valueOf(jsonobject.get("ls")), Employee.class);
	        
	        for(Employee e1 :e){
	        	
	        	System.out.println(e1.getName());
	        	
	        	
	        }
	         
			   
			
		
	}

}
