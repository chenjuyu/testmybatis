package web.util;
import web.util.MyX509TrustManager;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.net.ConnectException;
import java.net.CookieManager;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Formatter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;

import org.json.JSONObject;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class CommonUtils {
	private static Logger log = LoggerFactory.getLogger(CommonUtils.class);
	  public static final String dtLong = "yyyyMMddHHmmss";
	  
	 private static String firstCookie;
	 
	 public static JSONObject jd(String requestUrl, String requestMethod, Map<String,Object> outputStr)
	  {
	    /*
	     * 测试
	     * Map<String,Object> map=new HashMap<String,Object>();
		map.put("userno", "admin");
		map.put("password", "1");
		
		String session=CommonUtils.getSessionMap("https://weixin.fxsoft88.com/managelogin/login.do","POST",map);
		
		System.out.println("sessionKKKK:"+session);;
	     * 
	     * */
		 JSONObject j=null;
		 
	    try
	    {
	      TrustManager[] tm = { new MyX509TrustManager() };
	      SSLContext sslContext = SSLContext.getInstance("SSL", "SunJSSE");
	      sslContext.init(null, tm, new SecureRandom());

	      SSLSocketFactory ssf = sslContext.getSocketFactory();

	     URL url = new URL(requestUrl);
	      HttpsURLConnection conn = (HttpsURLConnection)url.openConnection(); //https 
	      conn.setSSLSocketFactory(ssf);

	      conn.setDoOutput(true);
	      conn.setDoInput(true);
	      conn.setUseCaches(false);

	 
	      
	      
	      conn.setRequestMethod(requestMethod);


	      if ("GET".equalsIgnoreCase(requestMethod)) {
	        conn.connect();
	      }

	      if (outputStr != null) {
	        OutputStream outputStream = conn.getOutputStream();
	        outputStream.write(String.valueOf(outputStr).getBytes("UTF-8"));
	        outputStream.close();
	      }

	      InputStream inputStream = conn.getInputStream();
	      InputStreamReader inputStreamReader = new InputStreamReader(
	        inputStream, "utf-8");
	      BufferedReader bufferedReader = new BufferedReader(
	        inputStreamReader);
	      
	    
	      String str = null;
	      StringBuffer buffer = new StringBuffer();
	      while ((str = bufferedReader.readLine()) != null) {
	        buffer.append(str);
	      }
	      System.out.println("\r返回内容:" + buffer.toString());
          
	   
	      
	      bufferedReader.close();
	      inputStreamReader.close();
	      inputStream.close();
	      inputStream = null;
	      conn.disconnect();
	      j=new JSONObject(buffer.toString());
	      return j;
	    }
	    catch (ConnectException ce) {
	      log.error("连接超时：{}", ce);
	      return null;//httpsRequest(requestUrl, requestMethod, outputStr);
	    } catch (Exception e) {
	      log.error("https请求异常：{}", e);
	    }return j;
	  }
	 
	 
	 public static JSONObject getResultMap(String requestUrl, String requestMethod, Map<String,Object> outputStr)
	  {
	    /*
	     * 测试
	     * Map<String,Object> map=new HashMap<String,Object>();
		map.put("userno", "admin");
		map.put("password", "1");
		
		String session=CommonUtils.getSessionMap("https://weixin.fxsoft88.com/managelogin/login.do","POST",map);
		
		System.out.println("sessionKKKK:"+session);;
	     * 
	     * */
		 JSONObject j=null;
		 
	    try
	    {
	      TrustManager[] tm = { new MyX509TrustManager() };
	      SSLContext sslContext = SSLContext.getInstance("SSL", "SunJSSE");
	      sslContext.init(null, tm, new SecureRandom());

	      SSLSocketFactory ssf = sslContext.getSocketFactory();

	     URL url = new URL(requestUrl);
	      HttpsURLConnection conn = (HttpsURLConnection)url.openConnection(); //https 
	      conn.setSSLSocketFactory(ssf);

	      conn.setDoOutput(true);
	      conn.setDoInput(true);
	      conn.setUseCaches(false);

	      if(getCookie() !=null){
	    	  
	      conn.setRequestProperty("Cookie", firstCookie);  
	      
	      }
	      
	      
	      conn.setRequestMethod(requestMethod);


	      if ("GET".equalsIgnoreCase(requestMethod)) {
	        conn.connect();
	      }

	      if (outputStr != null) {
	        OutputStream outputStream = conn.getOutputStream();
	        outputStream.write(String.valueOf(outputStr).getBytes("UTF-8"));
	        outputStream.close();
	      }

	      InputStream inputStream = conn.getInputStream();
	      InputStreamReader inputStreamReader = new InputStreamReader(
	        inputStream, "utf-8");
	      BufferedReader bufferedReader = new BufferedReader(
	        inputStreamReader);
	      
	    
	      String str = null;
	      StringBuffer buffer = new StringBuffer();
	      while ((str = bufferedReader.readLine()) != null) {
	        buffer.append(str);
	      }
	      System.out.println("\r返回内容:" + buffer.toString());

	      if(firstCookie ==null || "".equals(firstCookie)){
	    	  System.out.println("map:"+conn.getHeaderFields().toString());
	    	  setCookie(conn.getHeaderFields()); 
	      }
	      
	      bufferedReader.close();
	      inputStreamReader.close();
	      inputStream.close();
	      inputStream = null;
	      conn.disconnect();
	      j=new JSONObject(buffer.toString());
	      return j;
	    }
	    catch (ConnectException ce) {
	      log.error("连接超时：{}", ce);
	      return null;//httpsRequest(requestUrl, requestMethod, outputStr);
	    } catch (Exception e) {
	      log.error("https请求异常：{}", e);
	    }return j;
	  }
	 
	 
	 public static String getSessionMap(String requestUrl, String requestMethod, Map<String,Object> outputStr)
	  {
	    /*
	     * 测试
	     * Map<String,Object> map=new HashMap<String,Object>();
		map.put("userno", "admin");
		map.put("password", "1");
		
		String session=CommonUtils.getSessionMap("https://weixin.fxsoft88.com/managelogin/login.do","POST",map);
		
		System.out.println("sessionKKKK:"+session);;
	     * 
	     * */
	    try
	    {
	      TrustManager[] tm = { new MyX509TrustManager() };
	      SSLContext sslContext = SSLContext.getInstance("SSL", "SunJSSE");
	      sslContext.init(null, tm, new SecureRandom());

	      SSLSocketFactory ssf = sslContext.getSocketFactory();

	     URL url = new URL(requestUrl);
	      HttpsURLConnection conn = (HttpsURLConnection)url.openConnection(); //https 
	      conn.setSSLSocketFactory(ssf);

	      conn.setDoOutput(true);
	      conn.setDoInput(true);
	      conn.setUseCaches(false);

	      if(getCookie() !=null){
	    	  
	      conn.setRequestProperty("Cookie", firstCookie);  
	      
	      }
	      
	      
	      conn.setRequestMethod(requestMethod);


	      if ("GET".equalsIgnoreCase(requestMethod)) {
	        conn.connect();
	      }

	      if (outputStr != null) {
	        OutputStream outputStream = conn.getOutputStream();
	        outputStream.write(String.valueOf(outputStr).getBytes("UTF-8"));
	        outputStream.close();
	      }

	      InputStream inputStream = conn.getInputStream();
	      InputStreamReader inputStreamReader = new InputStreamReader(
	        inputStream, "utf-8");
	      BufferedReader bufferedReader = new BufferedReader(
	        inputStreamReader);
	      
	    
	      String str = null;
	      StringBuffer buffer = new StringBuffer();
	      while ((str = bufferedReader.readLine()) != null) {
	        buffer.append(str);
	      }
	      System.out.println("\r返回内容:" + buffer.toString());

	      if(firstCookie ==null || "".equals(firstCookie)){
	    	  System.out.println("map:"+conn.getHeaderFields().toString());
	    	  setCookie(conn.getHeaderFields()); 
	      }
	      
	      bufferedReader.close();
	      inputStreamReader.close();
	      inputStream.close();
	      inputStream = null;
	      conn.disconnect();
	      return firstCookie;//new JSONObject(buffer.toString());
	    }
	    catch (ConnectException ce) {
	      log.error("连接超时：{}", ce);
	      return null;//httpsRequest(requestUrl, requestMethod, outputStr);
	    } catch (Exception e) {
	      log.error("https请求异常：{}", e);
	    }return firstCookie;
	  }
	 
	 public static String getSession(String requestUrl, String requestMethod, String outputStr)
	  {
	    JSONObject jsonObject = null;
	    try
	    {
	      TrustManager[] tm = { new MyX509TrustManager() };
	      SSLContext sslContext = SSLContext.getInstance("SSL", "SunJSSE");
	      sslContext.init(null, tm, new SecureRandom());

	      SSLSocketFactory ssf = sslContext.getSocketFactory();

	     URL url = new URL(requestUrl);
	      HttpsURLConnection conn = (HttpsURLConnection)url.openConnection(); //https 
	      conn.setSSLSocketFactory(ssf);

	      conn.setDoOutput(true);
	      conn.setDoInput(true);
	      conn.setUseCaches(false);

	      if(getCookie() !=null){
	    	  
	      conn.setRequestProperty("Cookie", firstCookie);  
	      
	      }
	      
	      
	      conn.setRequestMethod(requestMethod);


	      if ("GET".equalsIgnoreCase(requestMethod)) {
	        conn.connect();
	      }

	      if (outputStr != null) {
	        OutputStream outputStream = conn.getOutputStream();
	        outputStream.write(outputStr.getBytes("UTF-8"));
	        outputStream.close();
	      }

	      InputStream inputStream = conn.getInputStream();
	      InputStreamReader inputStreamReader = new InputStreamReader(
	        inputStream, "utf-8");
	      BufferedReader bufferedReader = new BufferedReader(
	        inputStreamReader);
	      
	    
	      String str = null;
	      StringBuffer buffer = new StringBuffer();
	      while ((str = bufferedReader.readLine()) != null) {
	        buffer.append(str);
	      }
	      System.out.println("\r返回内容:" + buffer.toString());

	      if(firstCookie ==null || "".equals(firstCookie)){
	    	  System.out.println("map:"+conn.getHeaderFields().toString());
	    	  setCookie(conn.getHeaderFields()); 
	      }
	      
	      bufferedReader.close();
	      inputStreamReader.close();
	      inputStream.close();
	      inputStream = null;
	      conn.disconnect();
	      return firstCookie;//new JSONObject(buffer.toString());
	    }
	    catch (ConnectException ce) {
	      log.error("连接超时：{}", ce);
	      return null;//httpsRequest(requestUrl, requestMethod, outputStr);
	    } catch (Exception e) {
	      log.error("https请求异常：{}", e);
	    }return firstCookie;
	  }

	  public static JSONObject httpsRequest(String requestUrl, String requestMethod, String outputStr)
	  {
	    JSONObject jsonObject = null;
	    try
	    {
	      TrustManager[] tm = { new MyX509TrustManager() };
	      SSLContext sslContext = SSLContext.getInstance("SSL", "SunJSSE");
	      sslContext.init(null, tm, new SecureRandom());

	      SSLSocketFactory ssf = sslContext.getSocketFactory();

	     URL url = new URL(requestUrl);
	      HttpsURLConnection conn = (HttpsURLConnection)url.openConnection(); //https 
	      conn.setSSLSocketFactory(ssf);

	      conn.setDoOutput(true);
	      conn.setDoInput(true);
	      conn.setUseCaches(false);

	      if(getCookie() !=null){
	    	  
	      conn.setRequestProperty("Cookie", firstCookie);  
	      
	      }
	      
	      
	      conn.setRequestMethod(requestMethod);


	      if ("GET".equalsIgnoreCase(requestMethod)) {
	        conn.connect();
	      }

	      if (outputStr != null) {
	        OutputStream outputStream = conn.getOutputStream();
	        outputStream.write(outputStr.getBytes("UTF-8"));
	        outputStream.close();
	      }

	      InputStream inputStream = conn.getInputStream();
	      InputStreamReader inputStreamReader = new InputStreamReader(
	        inputStream, "utf-8");
	      BufferedReader bufferedReader = new BufferedReader(
	        inputStreamReader);
	      
	    
	      String str = null;
	      StringBuffer buffer = new StringBuffer();
	      while ((str = bufferedReader.readLine()) != null) {
	        buffer.append(str);
	      }
	      System.out.println("\r返回内容:" + buffer.toString());

	      if(firstCookie ==null || "".equals(firstCookie)){
	    	  System.out.println("map:"+conn.getHeaderFields().toString());
	    	  setCookie(conn.getHeaderFields()); 
	      }
	      
	      bufferedReader.close();
	      inputStreamReader.close();
	      inputStream.close();
	      inputStream = null;
	      conn.disconnect();
	      return new JSONObject(buffer.toString());
	    }
	    catch (ConnectException ce) {
	      log.error("连接超时：{}", ce);
	      return httpsRequest(requestUrl, requestMethod, outputStr);
	    } catch (Exception e) {
	      log.error("https请求异常：{}", e);
	    }return jsonObject;
	  }

	  
	 //setCookie 获取返回的cookie  HttpsURLConnection
	  //Map<String,List<String>> map=conn.getHeaderFields();  
	  
	public static void setCookie(Map<String,List<String>> map){
		
	       Set<String> set=map.keySet();  
	     //   for (Iterator iterator = set.iterator(); iterator.hasNext();) {  
	     //      String key = (String) iterator.next();  
	    //        System.out.println("key=" + key);  
	            //key.equals("Set-Cookie")
	       
	            if (map.containsKey("Set-Cookie")){  
	             //   System.out.println("key=" + key+",开始获取cookie");  
	                List<String> list = map.get("Set-Cookie");  
	                StringBuilder builder = new StringBuilder();  
	                System.out.println("list:"+list.toString());
	                for (String str : list) {  
	                    builder.append(str).toString();  
	                }  
	                firstCookie=builder.toString().substring(0,builder.toString().indexOf(";"));  
	                System.out.println("第一次得到的cookie="+firstCookie);  
	            }  
	       // } 	
	
	}
	public static String getCookie(){
		return firstCookie;
	}
	
	  
	  
	  

	  public static org.json.JSONObject JhttpRequest(String requestUrl, String requestMethod, String outputStr)
	  {
		  org.json.JSONObject jsonObject = null;
	    try
	    {
	    /*  TrustManager[] tm = { new MyX509TrustManager() };
	      SSLContext sslContext = SSLContext.getInstance("SSL", "SunJSSE");
	      sslContext.init(null, tm, new SecureRandom());

	      SSLSocketFactory ssf = sslContext.getSocketFactory(); */

	     URL url = new URL(requestUrl);
	      HttpURLConnection conn = (HttpURLConnection)url.openConnection(); //https 
	    // conn.setSSLSocketFactory(ssf);

	      conn.setDoOutput(true);
	      conn.setDoInput(true);
	      conn.setUseCaches(false);

	      conn.setRequestMethod(requestMethod);

	      if ("GET".equalsIgnoreCase(requestMethod)) {
	        conn.connect();
	      }

	      if (outputStr != null) {
	        OutputStream outputStream = conn.getOutputStream();

	        outputStream.write(outputStr.getBytes("UTF-8"));
	        outputStream.close();
	      }

	      InputStream inputStream = conn.getInputStream();
	      InputStreamReader inputStreamReader = new InputStreamReader(
	        inputStream, "utf-8");
	      BufferedReader bufferedReader = new BufferedReader(
	        inputStreamReader);
	      String str = null;
	      StringBuffer buffer = new StringBuffer();
	      while ((str = bufferedReader.readLine()) != null) {
	        buffer.append(str);
	      }
	      System.out.println("\r返回内容:" + buffer.toString());

	      bufferedReader.close();
	      inputStreamReader.close();
	      inputStream.close();
	      inputStream = null;
	      conn.disconnect();
	      jsonObject=new org.json.JSONObject(buffer.toString());
	      return jsonObject;//JSONObject.fromObject(buffer.toString());
	    }
	    catch (ConnectException ce) {
	      log.error("连接超时：{}", ce);
	      return JhttpRequest(requestUrl, requestMethod, outputStr);
	    } catch (Exception e) {
	      log.error("https请求异常：{}", e);
	    }return jsonObject;
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  public static String httpRequest(String requestUrl, String requestMethod, String outputStr)
	  {
		  //JSONArray json=null;
		  try {
	            URL url = new URL(requestUrl);
	            HttpURLConnection conn =  (HttpURLConnection) url.openConnection();
	            conn.setConnectTimeout(10000);
	            conn.setRequestMethod(requestMethod);//
	            String data =outputStr; //"username="+URLEncoder.encode(username)+"&password="
	                    //+URLEncoder.encode(password);
	            System.out.println(data);
	            conn.setRequestProperty("Content=Type", "application/x-wwww-form-urlencoded");
	            conn.setRequestProperty("Content-length", data.length()+"");
	            conn.setRequestProperty("Accept-Charset", "utf-8");
	            conn.setRequestProperty("contentType", "utf-8");
	            conn.setDoOutput(true);
	            OutputStream os = conn.getOutputStream();//向服务器提交时，这句有问题，异常，待排查
	            os.write(data.getBytes());
	            
	            System.out.println(String.valueOf(data.getBytes()));
	            
	            
	            int code = conn.getResponseCode();
	            System.out.println(code);
	            if (code == 200) {
	                InputStream is = conn.getInputStream();
	             String  str = URLDecoder.decode(ReadInputStream(is), "UTF-8");//从网络获取数据
	           
	            //  System.out.println(str);
	           //   com.alibaba.fastjson.JSONObject.toJSON(str);
	            //  JSONArray  json=JSONArray.fromObject(com.alibaba.fastjson.JSONObject.toJSON(str)); 
	                return str  ;
	            }else {
	                return null;
	            }
	            
	        } catch (MalformedURLException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	            System.out.println("111111");
	        } catch (ProtocolException e) {
	            System.out.println("222222");
	            e.printStackTrace();
	        } catch (IOException e) {
	            System.out.println("33333");
	            e.printStackTrace();
	        }
		  return null;
	  }
	  
	  //读取输入流
	  public static String ReadInputStream(InputStream is) {
	         try {
	             ByteArrayOutputStream baos = new ByteArrayOutputStream();
	             int len = 0;
	             byte[] buffer = new byte[4096];
	             while ((len = is.read(buffer)) != -1) {
	                 baos.write(buffer, 0, len);
	             }
	             is.close();
	             baos.close();
	             byte[] result = baos.toByteArray();
	             return new String(result);


	         } catch (Exception e) {
	             // TODO Auto-generated catch block
	             e.printStackTrace();
	             return "将输入流转化为字符串失败";
	         }
	     }
	  
	  public static String urlEncodeUTF8(String source)
	  {
	    String result = source;
	    try {
	      result = URLEncoder.encode(source, "utf-8");
	    } catch (UnsupportedEncodingException e) {
	      e.printStackTrace();
	    }
	    return result;
	  }

	  public static String getFileExt(String contentType)
	  {
	    String fileExt = "";
	    if ("image/jpeg".equals(contentType))
	      fileExt = ".jpg";
	    else if ("audio/mpeg".equals(contentType))
	      fileExt = ".mp3";
	    else if ("audio/amr".equals(contentType))
	      fileExt = ".amr";
	    else if ("video/mp4".equals(contentType))
	      fileExt = ".mp4";
	    else if ("video/mpeg4".equals(contentType))
	      fileExt = ".mp4";
	    return fileExt;
	  }

	  public static String getCurrTime()
	  {
	    Date now = new Date();
	    SimpleDateFormat outFormat = new SimpleDateFormat("yyyyMMddHHmmss");
	    String s = outFormat.format(now);
	    return s;
	  }

	  public static Long getRandom(int length)
	  {
	    long num = 1L;
	    double random = Math.random();
	    if (random < 0.1D) {
	      random += 0.1D;
	    }
	    for (int i = 0; i < length; i++) {
	      num *= 10L;
	    }
	    return Long.valueOf(String.valueOf(random * num));
	  }

	  private static String byteToHex(byte[] hash)
	  {
	    Formatter formatter = new Formatter();
	    byte[] arrayOfByte = hash; int j = hash.length; for (int i = 0; i < j; i++) { byte b = arrayOfByte[i];
	      formatter.format("%02x", new Object[] { Byte.valueOf(b) });
	    }
	    String result = formatter.toString();
	    formatter.close();
	    return result;
	  }

	  public static String getSign(String string)
	  {
	    String signature = null;
	    try
	    {
	      MessageDigest crypt = MessageDigest.getInstance("SHA-1");
	      crypt.reset();
	      crypt.update(string.getBytes("UTF-8"));
	      signature = byteToHex(crypt.digest());
	    } catch (NoSuchAlgorithmException e) {
	      e.printStackTrace();
	    } catch (UnsupportedEncodingException e) {
	      e.printStackTrace();
	    }

	    return signature;
	  }

	  public static String getOrderNum()
	  {
	    Date date = new Date();
	    DateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");
	    return df.format(date);
	  }

	  public static Map<String, String> paraFilter(Map<String, String> sArray)
	  {
	    Map result = new HashMap();

	    if ((sArray == null) || (sArray.size() <= 0)) {
	      return result;
	    }

	    for (String key : sArray.keySet()) {
	      String value = (String)sArray.get(key);
	      if ((value != null) && (!value.equals("")) && 
	        (!key.equalsIgnoreCase("sign")) && 
	        (!key.equalsIgnoreCase("sign_type")))
	      {
	        result.put(key, value);
	      }
	    }
	    return result;
	  }

	  public static String createLinkString(Map<String, String> params)
	  {
	    List keys = new ArrayList(params.keySet());
	    Collections.sort(keys);

	    String prestr = "";

	    for (int i = 0; i < keys.size(); i++) {
	      String key = (String)keys.get(i);
	      String value = (String)params.get(key);

	      if (i == keys.size() - 1)
	        prestr = prestr + key + "=" + value;
	      else {
	        prestr = prestr + key + "=" + value + "&";
	      }
	    }

	    return prestr;
	  }

	  public static String createLinkStringNoSort(Map<String, String> params)
	  {
	    StringBuilder gotoSign_params = new StringBuilder();
	    gotoSign_params.append("service=" + (String)params.get("service"));
	    gotoSign_params.append("&v=" + (String)params.get("v"));
	    gotoSign_params.append("&sec_id=" + (String)params.get("sec_id"));
	    gotoSign_params.append("&notify_data=" + (String)params.get("notify_data"));

	    return gotoSign_params.toString();
	  }

	  public static String checkUrl(String urlvalue) {
	    String inputLine = "";
	    try
	    {
	      URL url = new URL(urlvalue);
	      HttpURLConnection urlConnection = (HttpURLConnection)url
	        .openConnection();
	      BufferedReader in = new BufferedReader(new InputStreamReader(
	        urlConnection.getInputStream()));
	      inputLine = in.readLine().toString();
	    } catch (Exception e) {
	      e.printStackTrace();
	      inputLine = "";
	    }

	    return inputLine;
	  }

	  public static Map<String, String> decrypt(Map<String, String> inputPara, String private_key)
	    throws Exception
	  {
	    inputPara.put("notify_data", RSAUtil.decrypt(
	      (String)inputPara.get("notify_data"), private_key, "utf-8"));
	    return inputPara;
	  }

	  public static String gethttpsRequest(String requestUrl, String requestMethod, String outputStr)
	  {
	    String str = "";
	    try {
	      URL url = new URL(requestUrl);
	      HttpURLConnection connection = (HttpURLConnection)url
	        .openConnection();
	      connection.setDoOutput(true);
	      connection.setDoInput(true);
	      connection.setRequestMethod("POST");
	      connection.setUseCaches(false);
	      connection.setRequestProperty("Content-Type", 
	        "application/x-www-form-urlencoded");
	      connection.connect();

	      BufferedReader reader = null;

	      reader = new BufferedReader(new InputStreamReader(
	        connection.getInputStream()));
	      String temp = "";
	      while ((temp = reader.readLine()) != null) {
	        str = str + temp;
	      }
	      reader.close();
	      connection.disconnect();
	    }
	    catch (ConnectException ce) {
	      log.error("连接超时：{}", ce);
	    } catch (Exception e) {
	      log.error("https请求异常：{}", e);
	    }
	    return str;
	  }

	  public static void downImages(String filePath, String imageUrl, String fileName)
	  {
	    File files = new File(filePath);
	    if (!files.exists())
	      files.mkdirs();
	    try
	    {
	      URL url = new URL(imageUrl);
	      HttpURLConnection connection = (HttpURLConnection)url.openConnection();
	      InputStream is = connection.getInputStream();

	      File file = new File(filePath + fileName);
	      FileOutputStream out = new FileOutputStream(file);
	      int i = 0;
	      while ((i = is.read()) != -1) {
	        out.write(i);
	      }
	      is.close();
	      out.close();
	    } catch (Exception e) {
	      e.printStackTrace();
	    }
	  }
	
	
	
	
	public static String DateToStr(Date date) { 
		  
		   SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
		   String str = format.format(date); 
		   return str; 
		} 

		/** 
		* 字符串转换成日期 
		* @param str 
		* @return date 
		*/ 
		public static Date StrToDate(String str) { 
		  
		   SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd"); // SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
		   Date date = null; 
		   try { 
		    date = format.parse(str); 
		   } catch (ParseException e) { 
		    e.printStackTrace(); 
		   } 
		   return date; 
		} 

}
