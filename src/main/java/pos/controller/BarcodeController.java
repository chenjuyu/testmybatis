package pos.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import org.springframework.web.servlet.ModelAndView;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import pos.model.Barcode;
import pos.service.BarCodeService;

@Controller
@RequestMapping("barcode")
public class BarcodeController {

	@Autowired
	private BarCodeService barcodeService; 
	 
//	private static List<Map<String,Object>> list=null;
/*	
	static{
	
		
		list=new ArrayList<Map<String,Object>>();	
	} */
	
//	List<Map<String,Object>> list=new ArrayList<Map<String,Object>>();	//放在方法list每次执行都new了，这个是新的，里面list会被覆盖的，所以要放在外面当全局变量
	//http://localhost:8080/testmybatis/barcode/list.do?barcode=123
	
	@RequestMapping(value="/display")
	public ModelAndView display(){ 
		ModelAndView mv=new ModelAndView("barcode");
		return mv;
	}
	
	@RequestMapping(value="/list",method={RequestMethod.POST,RequestMethod.GET})
	@ResponseBody  
	//ModelAndView
	public String list(Barcode barcode,HttpServletRequest request){
//	Map<String, Object> m = new HashMap<String, Object>();	有序LinkedHashMap
	//List<LinkedHashMap<String,Object>> list=new LinkedList<LinkedHashMap<String,Object>>();//jsp 再声明一个list来接收这个list代替显示 		
	JSONObject json=new JSONObject();
		String bc=request.getParameter("barcode");
	//	com.alibaba.fastjson.JSON.parseObject(text) 带转义json串转成对象测试
	if (bc!= null) {
	List<Barcode> ba=barcodeService.selectByExample(bc);
	// int count = ba.size(); 
	// int num[] = new int[count];
	for (int i=0;i<ba.size();i++){
LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();	
	System.out.println(ba.get(i).getGoodsid());	
	System.out.println(ba.get(i).getColorid());	
	System.out.println(ba.get(i).getSizeid());
	json.put("GoodsID", ba.get(i).getGoodsid());
	json.put("ColorID", ba.get(i).getColorid());
	json.put("SizeID", ba.get(i).getSizeid());
	json.put("Quantity", 1);
	
	//list.add(map); 
	
	//m.put("map"+i, map);
	}
	// for (String key : m.keySet()) {
	//	   System.out.println("key= "+ key + "   and value= " + m.get(key));
	//	  }
	
	//for(int i=0;i<list.size();i++){ System.out.println(list.get(i));}

//	<----------------------上面是已经装在了一个map的一个list <map>---------->
//	<----------------------下面是在原来map中添加一个队列---------->
/*	if (list.size()>0) {
	for(int i=0;i<list.size();i++){
	   // Map<String, Object> map = list.get(i);
	   // map.put("GoodsID",  list.get(i));
	   // map.put("ColorID",  list.get(i));
	   // map.put("SizeID",  list.get(i));
		System.out.println(list.get(0).get("GoodsID").toString());
		 System.out.println( list.get(0).get("ColorID").toString());
		 System.out.println(list.get(0).get("SizeID").toString());
		   // System.out.println("netMode2:+++++"+netMode2);
	    } 
	}*/
//	for(Map<String,Object> m:list){    //取list集合里的那一条Map集合
 //         for(String s:m.keySet()){    //取map集合里的String类型的key，
  //            System.out.println(m.get(s));//根据key迭代输出value
   //       }
   //   }
//	request.setAttribute("list",list); 
	//request.setAttribute("list",list);//request.setAttribute()把list放到里，jsp页面把这个list显示
	}
	//return  "barcode"; //new ModelAndView("barcode");
	 return JSONObject.toJSONString(json);
	}
	


	
}	
	
	

