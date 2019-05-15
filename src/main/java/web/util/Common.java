package web.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;
import javax.servlet.http.HttpServletRequest;

public class Common
{
  public static boolean isEmpty(String s)
  {
    if ((s == null) || ("".equals(s)) || ("".equals(s.trim())) || 
      ("null".equalsIgnoreCase(s))) {
      return true;
    }
    return false;
  }

  public static String fromUsage(long free, long total)
  {
    Double d = 
      Double.valueOf(new BigDecimal(free * 100L / total).setScale(1, 
      4).doubleValue());
    return String.valueOf(d);
  }

  public static String fromDateH()
  {
    DateFormat format1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
    return format1.format(new Date());
  }

  public static String fromDate(Date dd)
  {
    DateFormat format1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
    return format1.format(dd);
  }

  public static String fromDateY()
  {
    DateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
    return format1.format(new Date());
  }

  public static List<String> removeSameItem(List<String> list)
  {
    List difList = new ArrayList();
    for (String t : list) {
      if ((t != null) && (!difList.contains(t))) {
        difList.add(t);
      }
    }
    return difList;
  }

  public static String toIpAddr(HttpServletRequest request)
  {
    String ip = request.getHeader("x-forwarded-for");
    if ((ip == null) || (ip.length() == 0) || ("unknown".equalsIgnoreCase(ip))) {
      ip = request.getHeader("Proxy-Client-IP");
    }
    if ((ip == null) || (ip.length() == 0) || ("unknown".equalsIgnoreCase(ip))) {
      ip = request.getHeader("WL-Proxy-Client-IP");
    }
    if ((ip == null) || (ip.length() == 0) || ("unknown".equalsIgnoreCase(ip))) {
      ip = request.getRemoteAddr();
    }
    return ip;
  }

  public static String generateFileName(String fileName)
  {
    DateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
    String formatDate = format.format(new Date());
    int random = new Random().nextInt(10000);
    int position = fileName.lastIndexOf(".");
    String extension = fileName.substring(position);
    return formatDate + random + extension;
  }

  public static String getInputHtmlUTF8(String urlStr)
  {
    URL url = null;
    try {
      url = new URL(urlStr);
      HttpURLConnection httpsURLConnection = (HttpURLConnection)url
        .openConnection();

      httpsURLConnection.setRequestMethod("GET");
      httpsURLConnection.setConnectTimeout(5000);
      httpsURLConnection.connect();
      if (httpsURLConnection.getResponseCode() == 200)
      {
        InputStream inputStream = httpsURLConnection.getInputStream();
        String data = readHtml(inputStream, "UTF-8");
        inputStream.close();
        return data;
      }
    } catch (Exception e) {
      e.printStackTrace();
      return null;
    }

    return null;
  }

  public static String getInputHtmlGBK(String urlStr)
  {
    URL url = null;
    try {
      url = new URL(urlStr);
      HttpURLConnection httpsURLConnection = (HttpURLConnection)url
        .openConnection();

      httpsURLConnection.setRequestMethod("GET");
      httpsURLConnection.setConnectTimeout(5000);
      httpsURLConnection.connect();
      if (httpsURLConnection.getResponseCode() == 200)
      {
        InputStream inputStream = httpsURLConnection.getInputStream();
        String data = readHtml(inputStream, "GBK");
        inputStream.close();
        return data;
      }
    }
    catch (Exception e) {
      e.printStackTrace();
      return null;
    }

    return null;
  }

  public static String readHtml(InputStream inputStream, String uncode)
    throws Exception
  {
    InputStreamReader input = new InputStreamReader(inputStream, uncode);
    BufferedReader bufReader = new BufferedReader(input);
    String line = "";
    StringBuilder contentBuf = new StringBuilder();
    while ((line = bufReader.readLine()) != null) {
      contentBuf.append(line);
    }
    return contentBuf.toString();
  }

  public static byte[] readInputStream(InputStream inputStream)
  {
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

    byte[] buffer = new byte[1024];

    int len = 0;
    try
    {
      while ((len = inputStream.read(buffer)) != -1)
      {
        byteArrayOutputStream.write(buffer, 0, len);
      }
    } catch (IOException e) {
      e.printStackTrace();
      return null;
    } finally {
      try {
        byteArrayOutputStream.close();
      } catch (IOException e) {
        e.printStackTrace();
        return null;
      }

    }

    return byteArrayOutputStream.toByteArray();
  }

  public static String unescape(String src)
  {
    StringBuffer tmp = new StringBuffer();
    tmp.ensureCapacity(src.length());
    int lastPos = 0; int pos = 0;

    while (lastPos < src.length()) {
      pos = src.indexOf("%", lastPos);
      if (pos == lastPos) {
        if (src.charAt(pos + 1) == 'u') {
          char ch = (char)Integer.parseInt(
            src.substring(pos + 2, pos + 6), 16);
          tmp.append(ch);
          lastPos = pos + 6;
        } else {
          char ch = (char)Integer.parseInt(
            src.substring(pos + 1, pos + 3), 16);
          tmp.append(ch);
          lastPos = pos + 3;
        }
      }
      else if (pos == -1) {
        tmp.append(src.substring(lastPos));
        lastPos = src.length();
      } else {
        tmp.append(src.substring(lastPos, pos));
        lastPos = pos;
      }
    }

    return tmp.toString();
  }

  public static String escape(String src)
  {
    StringBuffer tmp = new StringBuffer();
    tmp.ensureCapacity(src.length() * 6);
    for (int i = 0; i < src.length(); i++) {
      char j = src.charAt(i);
      if ((Character.isDigit(j)) || (Character.isLowerCase(j)) || 
        (Character.isUpperCase(j))) {
        tmp.append(j);
      } else if (j < 'Ā') {
        tmp.append("%");
        if (j < '\020')
          tmp.append("0");
        tmp.append(Integer.toString(j, 16));
      } else {
        tmp.append("%u");
        tmp.append(Integer.toString(j, 16));
      }
    }
    return tmp.toString();
  }

  public static String htmlEncode(String str)
  {
    String s = "";
    if (str.length() == 0)
      return "";
    s = str.replace("&", "&amp;");
    s = s.replace("<", "&lt;");
    s = s.replace(">", "&gt;");
    s = s.replace("'", "&apos;");
    s = s.replace("\"", "&quot;");
    return s;
  }

  public static String htmlDecode(String str)
  {
    String s = "";
    if (str.length() == 0) return "";
    s = str.replace("&amp;", "&");
    s = s.replace("&lt;", "<");
    s = s.replace("&gt;", ">");
    s = s.replace("&apos;", "'");
    s = s.replace("&quot;", "\"");
    return s;
  }

  public static JSONObject loadInterface(String url)
  {
    StringBuilder json = new StringBuilder();
    
    try {
      URL oracle = new URL(url);
      URLConnection yc = oracle.openConnection();
      BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));
      String inputLine = null;
      while ((inputLine = in.readLine()) != null) {
        json.append(inputLine);
      }
      in.close();
    } catch (MalformedURLException e) {
    	 e.getMessage();
    } catch (IOException e) {
    	 e.getMessage();
    }
    return JSON.parseObject(json.toString());
  }

  public static String removeZeroOfNum(String num)
  {
    if ((num == null) || (num.equals("")) || (num.indexOf(".") < 0)) {
      return num;
    }

    String lstr = num.split("\\.")[0];
    String rstr = num.split("\\.")[1];

    while (rstr.endsWith("0")) {
      rstr = rstr.substring(0, rstr.length() - 1);
    }

    if ((rstr.equals("")) || (rstr.equals("0"))) {
      return lstr;
    }

    return lstr + "." + rstr;
  }

  public static String getRemoteIP(HttpServletRequest request)
  {
    String ipAddress = null;

    ipAddress = request.getHeader("x-forwarded-for");
    if ((ipAddress == null) || (ipAddress.length() == 0) || 
      ("unknown".equalsIgnoreCase(ipAddress))) {
      ipAddress = request.getHeader("Proxy-Client-IP");
    }
    if ((ipAddress == null) || (ipAddress.length() == 0) || 
      ("unknown".equalsIgnoreCase(ipAddress))) {
      ipAddress = request.getHeader("WL-Proxy-Client-IP");
    }
    if ((ipAddress == null) || (ipAddress.length() == 0) || 
      ("unknown".equalsIgnoreCase(ipAddress))) {
      ipAddress = request.getRemoteAddr();
      if ((ipAddress.equals("127.0.0.1")) || (ipAddress.indexOf(":") > 0))
      {
        InetAddress inet = null;
        try {
          inet = InetAddress.getLocalHost();
        } catch (UnknownHostException e) {
          e.printStackTrace();
        }
        ipAddress = inet.getHostAddress();
      }

    }

    if ((ipAddress != null) && (ipAddress.length() > 15))
    {
      if (ipAddress.indexOf(",") > 0) {
        ipAddress = ipAddress.substring(0, ipAddress.indexOf(","));
      }
    }
    return ipAddress;
  }

  public static Map<String, Object> getParameterStringMap(HttpServletRequest request)
  {
    Map properties = request.getParameterMap();

    Map returnMap = new HashMap();
    Iterator entries = properties.entrySet().iterator();

    String name = "";
    String value = "";
    while (entries.hasNext()) {
      Map.Entry entry = (Map.Entry)entries.next();
      name = (String)entry.getKey();
      Object valueObj = entry.getValue();
      if (valueObj == null) {
        value = "";
      } else if ((valueObj instanceof String[])) {
        String[] values = (String[])valueObj;
        for (int i = 0; i < values.length; i++) {
          value = values[i] + ",";
        }
        value = value.substring(0, value.length() - 1);
      } else {
        value = valueObj.toString();
      }
      returnMap.put(name, value);
    }
    return returnMap;
  }
  
  /*
获取精确到秒的时间戳 
@param date 
@return 
*/  
public static int getSecondTimestampTwo(Date date){  
  if (null == date) {  
      return 0;  
  }  
  String timestamp = String.valueOf(date.getTime()/1000);  
  return Integer.valueOf(timestamp);  
}
}