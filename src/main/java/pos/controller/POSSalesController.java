package pos.controller;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.DeflaterOutputStream;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;

import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONObject;

import pos.model.Possales;
import pos.model.PossalesExample;
import pos.service.IPossalesService;
import web.util.AjaxJson;
import web.util.CommonUtils;
import web.util.printplugins.Grcommon;
import web.util.printplugins.JsonToXml;

@Controller
@RequestMapping("possales")
public class POSSalesController {
	
  @Autowired
  private IPossalesService  mapp;  
  
   @RequestMapping("/index") 
   public ModelAndView index(HttpServletRequest request){
	   
	 return new ModelAndView("main");  
	   
   }
   @RequestMapping("/list2") 
   public ModelAndView list2(HttpServletRequest request){
	 Map<String,Object> map=new HashMap<String,Object>();
	 
	 String page =request.getParameter("page");
	 String rows =request.getParameter("rows");
	 
	 map.put("page", page);
	 map.put("rows", rows);      
	 return new ModelAndView("list",map);  
	   
   }
   
   @RequestMapping("/list3") 
   public ModelAndView list3(HttpServletRequest request){
	 Map<String,Object> map=new HashMap<String,Object>();
	 map.put("DepartmentID", "09A");
	// ModelAndView l3=new ModelAndView("list3");   
//	 l3.addObject("map",map);
	 return  new ModelAndView("list3",map); // l3;//在jsp页面中可直通过${DepartmentID}获得到值, map.put()相当于request.setAttribute方法。
	   
   }
  
	@RequestMapping(value = "/listdata", method = { RequestMethod.POST,
			RequestMethod.GET }, produces = "text/html,application/json;charset=UTF-8")

	public void listdata(HttpServletRequest request, HttpServletResponse response) {
		// AjaxJson j=new AjaxJson();
		// and a.DepartmentID='00L'
		
		String BeginDate =request.getParameter("BeginDate");
	    String EndDate =request.getParameter("EndDate");
	    
	    		
		          
		
		String conditions = " Convert(varchar(10),a.Date,121) between '"+BeginDate+"' and '"+EndDate+"'  ";
		
		int pageno = 1;
		pageno = Integer.valueOf(request.getParameter("page").toString()).intValue() > 1
				? Integer.valueOf(request.getParameter("page").toString()).intValue() : 1;
		int pagesize = Integer.valueOf(request.getParameter("rows").toString()).intValue();
		HashMap map = mapp.possaleslist(conditions, pageno, pagesize);

		JSONObject jsonobject = new JSONObject();
		jsonobject.put("total", map.get("total"));
		jsonobject.put("rows", map.get("rows"));
		jsonobject.put("footer", map.get("footer"));

		// StringBuffer sb =new StringBuffer();
		// sb.append(sb);
		// sb.toString()
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

	public enum ResponseDataType
	{
	    PlainText, //报表数据为XML或JSON文本，在调试时可以查看报表数据。数据未经压缩，大数据量报表采用此种方式不合适
	    ZipBinary, //报表数据为XML或JSON文本经过压缩得到的二进制数据。此种方式数据量最小(约为原始数据的1/10)，但用Ajax方式加载报表数据时不能为此种方式
	    ZipBase64, //报表数据为将 ZipBinary 方式得到的数据再进行 BASE64 编码的数据。此种方式适合用Ajax方式加载报表数据
	};
	//指定报表的默认数据类型，便于统一定义整个报表系统的数据类型
	//在报表开发调试阶段，通常指定为 ResponseDataType.PlainText, 以便在浏览器中查看响应的源文件时能看到可读的文本数据
	//在项目部署时，通常指定为 ResponseDataType.ZipBinary 或 ResponseDataType.ZipBase64，这样可以极大减少数据量，提供报表响应速度
	public static ResponseDataType DefaultReportDataType = ResponseDataType.PlainText;  //PlainText ZipBinary ZipBase64
	//将产生的报表文本数据(XML文本 或 JSON文本)发送给客户端，可以对数据进行压缩
	public static void ResponseText(HttpServletResponse response, String DataText, ResponseDataType DataType) throws Exception
	{
	    response.resetBuffer();
	    
	    if (DataType == ResponseDataType.PlainText)
	    {
	    	response.setContentType("text/html;charset=utf-8");   
	        PrintWriter pw = response.getWriter();
	        pw.print(DataText);
	        pw.close();  //终止后续不必要内容输出
	    }
	    else
	    {
	        byte[] RawData = DataText.getBytes("UTF-8"); //byte[] RawData = DataText.getBytes();
	        
	        //写入特有的压缩头部信息，以便报表客户端插件能识别数据
	        response.addHeader("gr_zip_type", "deflate");                           //指定压缩方法
	        response.addIntHeader("gr_zip_size", RawData.length);                   //指定数据的原始长度
	        response.addHeader("gr_zip_encode", response.getCharacterEncoding());   //指定数据的编码方式 utf-8 utf-16 ...
		
	        if (DataType == ResponseDataType.ZipBinary)
	        {
	            //压缩数据并输出
	            ServletOutputStream bos = response.getOutputStream();
	            DeflaterOutputStream zos = new DeflaterOutputStream(bos);
	            zos.write(RawData);
	            zos.close();
	            bos.flush();
	        }
	        else
	        {
	            ByteArrayOutputStream baos = new ByteArrayOutputStream();
	            DeflaterOutputStream zos = new DeflaterOutputStream(baos);
	            zos.write(RawData);
	            zos.close();
	            baos.close();

	            PrintWriter pw = response.getWriter();
	            pw.print( (new sun.misc.BASE64Encoder()).encode( baos.toByteArray() ) );
	            //pw.print( encodeBASE64( baos.toByteArray() ) );
	            pw.close();  //终止后续不必要内容输出
	        }
	    }
	}
	//打印功能 ，测试解决git冲突提交问题
	@RequestMapping(value = "/exportdata", method = { RequestMethod.POST,
				RequestMethod.GET }, produces = "text/html,application/json,application/xml;charset=UTF-8")
    public void exportdata(HttpServletRequest request, HttpServletResponse response){
		
		String possalesid=request.getParameter("possalesid");
		possalesid =" a.possalesid='"+possalesid+"'";
		
	   HashMap<String,Object> map=mapp.exportExcel(possalesid);	
	    
	 //net.sf.json.JSONObject json = net.sf.json.JSONObject.fromObject(map); 
	  // JSONObject json=new JSONObject();
	   //  json.put("possalesdetail",  map.get("possalesdetail"));
	    // json.put("possales", map.get("possales")); // X4EM1I05AB-Z101 
        
	  //  System.out.println(json.get("possalesdetail"));
	 List<HashMap<String,Object>> possalesdetail=(List<HashMap<String,Object>>)map.get("possalesdetail");
	 
	  StringBuffer sb=new  StringBuffer(); 
	   for(int i=0; i<possalesdetail.size();i++){
		   sb.append("\n");
		   sb.append("<Detail1>"); 
		   Set keySet =  possalesdetail.get(i).keySet();      //获取key集合对象 为了拼接xml
		   for (Object keyName : keySet) {
		   // System.out.println("键名：" + keyName);   //输出键名
			  if (Grcommon.HasSpecialChar(possalesdetail.get(i).get(keyName).toString()))
			   {
				  
				  sb.append("<"+keyName+">").append(Grcommon.HTMLEncode(possalesdetail.get(i).get(keyName).toString())).append("</"+keyName+">");
			   }else{
				  sb.append("<"+keyName+">").append(possalesdetail.get(i).get(keyName).toString()).append("</"+keyName+">"); 
				   
			   }
				   
			   
			  
			  // possalesdetail.get(i).
		   }
		   sb.append("</Detail1>");   
		   sb.append("\n");
	    }
	  // System.out.print(sb); 
	   List<HashMap<String,Object>> possales=(List<HashMap<String,Object>>)map.get("possales");
	   StringBuffer sb1=new  StringBuffer(); 
	   for(int i=0; i<possales.size();i++){
		   sb1.append("<Master>"); 
		   Set keySet =possales.get(i).keySet();      //获取key集合对象 为了拼接xml
		   for (Object keyName : keySet) {
		   // System.out.println("键名：" + keyName);   //输出键名
			   
			   if (Grcommon.HasSpecialChar(possales.get(i).get(keyName).toString()))
			   {
				  
				  sb1.append("<"+keyName+">").append(Grcommon.HTMLEncode(possales.get(i).get(keyName).toString())).append("</"+keyName+">");
			   }else{
				   sb1.append("<"+keyName+">").append(possales.get(i).get(keyName)).append("</"+keyName+">");
				   
			   }
			   
			   
			   
			   	     
		   }
		   sb1.append("</Master>\n");   
		   //sb1.append("\n");
	    }
	//   JSONObject jsonobject = new JSONObject();
	  // jsonobject.put("sb", sb.toString());
	 //  jsonobject.put("sb1", sb1.toString());
	  // System.out.println(json);//json.to
	   
	   try {
		   StringBuffer XmlText = new StringBuffer("<xml>\n");
		   XmlText.append(sb1.toString());
		   XmlText.append(sb.toString());
		   
		   
		   XmlText.append("</xml>\n");
		   
		ResponseText(response, XmlText.toString(), DefaultReportDataType);
	} catch (Exception e1) {
		// TODO Auto-generated catch block
		response.setContentType("text/html;charset=utf-8");   
	    PrintWriter out;
			try {
				
				out = response.getWriter();
			//	JsonToXml j=new JsonToXml();j.jsonToXML()
				
				out.print("<xml>\n");
				out.print(sb1.toString());
				out.print(sb.toString());//json.toJSONString()
				out.print("</xml>\n");
				out.flush();
			    out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    
		
		e1.printStackTrace();
	} 	
	}  	
	
	//做一个导出功能
  @RequestMapping(value="/exportExcel",method={RequestMethod.POST,RequestMethod.GET}, produces="text/html,application/json;charset=UTF-8")
  public void exportExcel(HttpServletRequest request,HttpServletResponse response){
	  
	  
   try {
		PrintWriter out=response.getWriter();
		out.print("这个导出功能要求返回的数据");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
	  
	  
	  
  }	  
	
	
	
	
   @RequestMapping(value="/list",method={RequestMethod.POST,RequestMethod.GET}, produces="text/html,application/json;charset=UTF-8")
   @ResponseBody
   public AjaxJson list(HttpServletRequest request){
	   AjaxJson aj =new AjaxJson();
	   String date1 =request.getParameter("date1");
	   String date2 =request.getParameter("date2");
	   String departmentid= request.getParameter("departmentid");
	   PossalesExample	example = new PossalesExample();
	   PossalesExample.Criteria cia = example.createCriteria();  //条件查询对象
	   cia.andDateBetween(CommonUtils.StrToDate(date1),CommonUtils.StrToDate(date2)); 
	   if (departmentid !=null && !departmentid.equals(""))
	   {   
	   cia.andDepartmentidEqualTo(departmentid);
	   }
	   List<Possales> possaleslist=mapp.selectByExample(example);  
	   if (possaleslist.size()>0)
	   {	   
	   aj.setObj(possaleslist);
	   aj.setMsg("有数据返回");
	   } else {
	   aj.setMsg("无数据返回");	   
	   }
	   return aj;//返回对象
   }
   
   
   
   
  
  
  
	@RequestMapping(value="/search",method={RequestMethod.POST,RequestMethod.GET}, produces="text/html,application/json;charset=UTF-8")
	@ResponseBody
    public String Search(HttpServletRequest request)	
    {
		AjaxJson aj=new AjaxJson();
	 CommonUtils com =new CommonUtils();	
 
	 String date1 =request.getParameter("date1");
	 String date2 =request.getParameter("date2");
	 List<Map<String,Object>> ls = mapp.search(date1, date2); //mapp.selectByExample(example);
//	 JSONObject j =new JSONObject();
	
	 List<HashMap<String, Object>> l=new ArrayList<HashMap<String,Object>>();

	 for (int i=0 ;i<ls.size();i++){ 
	  Map<String,Object> m =ls.get(i);
	  Map<String,Object> map=new HashMap<String, Object>();
	  map.put("Date", m.get("Date"));//CommonUtils.DateToStr() 
	  if (m.get("FactAmountSum")!=null && !m.get("FactAmountSum").equals("")){
	  map.put("FactAmountSum",m.get("FactAmountSum")); 	 
	  } else{map.put("FactAmountSum", ""); } 
	  l.add((HashMap<String, Object>) map);	   
	 }
	 // System.out.print(ls.get(i).getFactamountsum());
	// request.setAttribute("list", l);
	 
	 JSONArray jsonarray = JSONArray.fromObject(l);   //将list 转成 字符串对象 net.sf.json.JSONArray
	 return JSONObject.toJSONString(jsonarray);
	// return jsonarray.toString();
	        
    }
	
	
	

}
