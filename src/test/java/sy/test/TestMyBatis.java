package sy.test;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;





import javax.servlet.http.HttpServletRequest;
import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.CannotGetJdbcConnectionException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceUtils;

import com.sun.prism.impl.Disposer.Record;

import pos.model.Barcode;
import pos.model.BorrowingLog;
import pos.service.BarCodeService;
import pos.service.BorService;
import web.util.Paging;

//TODO
/**
 * spring mvc+mybatis
 * @author Administrator
 *
 */
public class TestMyBatis {
	 ApplicationContext ac=new ClassPathXmlApplicationContext(new String[]{"spring.xml","spring-mybatis.xml"});
	@SuppressWarnings("resource")
	@Test
	public  void test() {
		// ApplicationContext ac=new ClassPathXmlApplicationContext(new String[]{"spring.xml","spring-mybatis.xml"});
		 BorService borService= (BorService) ac.getBean("borService");
	     BorrowingLog borrowingLog=borService.getBorrowingById("3");
		 System.err.println(borrowingLog.getLedger());
	}
	

	@Test
	public  void test2() {
		// ApplicationContext ac=new ClassPathXmlApplicationContext(new String[]{"spring.xml","spring-mybatis.xml"});
		 BorService borService= (BorService) ac.getBean("borService");
		 Paging paging =new Paging();
	     List<BorrowingLog> borrowingLog =borService.getAll(paging);
	     int count=borService.getCount();
	     System.out.print(count);
	     //BorrowingLog borrowingLog2=borService.getBorrowingById("3");
		 System.err.println(borrowingLog);
	}
	

	
	
	
	@Test
	public void test4(){
		
	
		
	BarCodeService bs= (BarCodeService) ac.getBean("BarCodeSerivceImpl");
	
	
	List ls1=new ArrayList();
	  List ls=new ArrayList();	
	Map map=new HashMap();
	 List<Barcode>	lt=bs.selectByExample("123");
	  for (int i = 0; i < lt.size(); i++) {
		  List ls2=new ArrayList();	
		  map.put("GoodsID", lt.get(i).getGoodsid());
	     	map.put("ColorID", lt.get(i).getColorid());
	     	map.put("SizeID", lt.get(i).getSizeid());
			ls2.add(map);
			ls1.add(ls2);
			 
		}
	//  ls1.add(ls);
	   Map<String ,String> map2 = new HashMap<String ,String>();
	   
	   for (int i = 0; i < ls1.size(); i++) {
           map2 = (Map<String, String>) ls1.get(i);
           for (Iterator<String> iterator = map2.keySet().iterator(); iterator.hasNext();) {
               String key = iterator.next();
               System.out.print(key+":"+map2.get(key)+"\t");
           }
	   }
	/*	 for (int i = 0; i < ls1.size(); i++) {
	         String str = ls1.get(i).toString();
	         System.out.println(str);
	       // map.put("GoodsID", ls1.get(i).getGoodsid());
	     //	map.put("ColorID", lt.get(i).getColorid());
	     //	map.put("SizeID", lt.get(i).getSizeid());
		//	ls.add(i, map);	
		} */
		 
	//	 for (int i = 0; i < ls.size(); i++) {
	  //       String str = ls.get(i).toString();
	   //      System.out.println(str);	
	//	}
	
	} 	
	
	@Test
	public  void test3() {
		  //得到数据源连接，连接数据库 这里已经不用druid方式了
		 JdbcTemplate jdbcTemplate=new JdbcTemplate((DataSource)ac.getBean("dataSource"));
		 List rows = jdbcTemplate.queryForList("SELECT * FROM a003..[user]"); 
		 Iterator it = rows.iterator(); 
		 while(it.hasNext()) { 
		     Map userMap = (Map) it.next(); 
		     System.out.print(userMap.get("userid") + "\t"); 
		     System.out.print(userMap.get("username") + "\t"); 
		     System.out.print(userMap.get("no") + "\t"); 
		     System.out.println(userMap.get("password") + "\t"); 
		 } 
 
		 
		// String sql="update BorrowingLog set ledger='张三' where id='1' ";
		 //jdbcTemplate.execute(sql);
		 
		 
		 
		 try {  
			DataSourceUtils.getConnection((DataSource)ac.getBean("dataSource")).commit();
			//System.out.print("aaaa");
			
		} catch (CannotGetJdbcConnectionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	     
	}
	
	
	
	
}
