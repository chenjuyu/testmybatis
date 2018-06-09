package sy.test;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import java.util.List;
import java.util.LinkedList;
import java.util.HashMap;

import org.apache.commons.beanutils.BeanUtils;

import pos.model.Possales;
public class BealUtilscopyProperties {

	public static void main(String[] args) {

/*	List<Map<String,Object>> ls=new LinkedList<Map<String,Object>>();
	  Map<String,Object> map=new HashMap<String,Object>();
	  map.put("DepartmentID", "天河店");
	  map.put("QuantitySum", 88);
	  ls.add(map);
	  map=new HashMap<String,Object>();
	  map.put("DepartmentID", "西门口店");
	  map.put("QuantitySum", 99);
	  ls.add(map); 
		
		
	 for(int i=0 ;i<ls.size();i++){
		 
		 System.out.println(ls.get(i).get("QuantitySum"));//get("QuantitySum")	 
	 } 
	 */
	// String DepartmentID="西门口店";
	// int  QuantitySum=99;
	  Map<String,Object> map=new HashMap<String,Object>();
	  map.put("DepartmentID", "天河店");
	 // map.put("QuantitySum", 88);
	  
	  
	 
	//  Object o = new Object();
	
	  try {
		Possales p=new Possales();
		BeanUtils.copyProperties(p,map);
		
		 System.out.println(p.getDepartmentid()); //p.getQuantitysum().toString()
	} catch (IllegalAccessException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (InvocationTargetException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
	  

	}

}
