package web.util.printplugins;












import net.sf.json.JSON;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.xml.XMLSerializer;











public class JsonToXml {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String jsonstr="[{\"__row_number__\":3,\"RealCash\":0.0000,\"PosSalesID\":\"X4EL1F1BHU-Z101\",\"No\":\"Z101SM0019395\",\"Type\":\"销售单\"}]";	
	
	//jsonToXML(jsonstr);
	System.out.println(jsonToXML(jsonstr));
	String xml="<xml><row><CustomerID>BLONP</CustomerID><CompanyName>国皓</CompanyName><ContactName>黄雅玲</ContactName><ContactTitle>市场经理</ContactTitle><Address>广发北路&#x0020;10&#x0020;号</Address><City>大连</City><Region>东北</Region><PostalCode>565479</PostalCode><Country>中国</Country><Phone>(0671)&#x0020;88601531</Phone><Fax>(0671)&#x0020;88601532</Fax></row></xml>";
	//JSONObject json=JSONObject.fromObject(jsonstr);
	
	System.out.println(xml2json(xml));
	
		

	}

	public static String jsonToXML(String json) {

		XMLSerializer xmlSerializer = new XMLSerializer();

		// 根节点名称

		xmlSerializer.setRootName("xml");

		// 不对类型进行设置

		xmlSerializer.setTypeHintsEnabled(false);
		xmlSerializer.setElementName("row"); //设置元素名
		//xmlSerializer.setSkipNamespaces(false);
		              //OmitXmlDeclaration = true;  // 不生成声明头
		

		String xmlStr = "";

		if (json.contains("[") && json.contains("]")) {

		// jsonArray

		JSONArray jobj = JSONArray.fromObject(json);

		xmlStr = xmlSerializer.write(jobj);

		} else {

		// jsonObject

		JSONObject jobj = JSONObject.fromObject(json);

		xmlStr = xmlSerializer.write(jobj);

		}
		xmlStr =xmlStr.replace("<?xml version=\"1.0\" encoding=\"UTF-8\"?>", "") ; //强制不生成声明头xml头部声明 去掉 <?xml version="1.0" encoding="UTF-8"?>
		System.out.println("转换后的参数：" + xmlStr);
		    
		return xmlStr;

		} 
	   /**  
	    * xml 转 json  
	    * （必须引入 xom-1.1.jar）  
	    * @param xmlString xml字符串  
	    * @return  
	    */  
	   public static String xml2json(String xmlString) {  
	       XMLSerializer xmlSerializer = new XMLSerializer();  
	       JSON json = xmlSerializer.read(xmlString);  
	       return json.toString(1);  
	   }  
	
	   

	  
	  

	
}
