package pos.controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.sql.DataSource;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import pos.model.BorrowingLog;
import pos.service.BorService;




import web.util.PageUtils;
import web.util.Paging;

@Controller
@RequestMapping("/borController")
public class BorController {

	private BorService borService;
	//private String ID,ledger;



	public BorService getBorService() {
		return borService;
	}


	@Autowired
	public void setBorService(BorService borService) {
		this.borService = borService;
	}



	@RequestMapping("/showUser")
	public String showUser(String id,HttpServletRequest request) {
		//BorrowingLog u = borService.getBorrowingById(id);
		BorrowingLog u = borService.getBorrowingById("7");
		request.setAttribute("bor", u);
		return "demo";
		//return "showUser";
	}
	
	@RequestMapping("/addUser")
	public String addUser(HttpServletRequest request) {
		String ID=request.getParameter("ID");
		String ledger=request.getParameter("content1"); 
		System.out.print(ID);
		System.out.print(ledger);
		
		//BorrowingLog u = 
		borService.insertSelective(ID,ledger);
		System.out.print("<script>alter('д��ɹ�')<script>");
		//request.setAttribute("bor", u);
		return "demo";
	}
	
	@RequestMapping("/update")
	public String update(HttpServletRequest request){
		String ID=request.getParameter("ID");
		String ledger=request.getParameter("content1"); 
		BorrowingLog b=new BorrowingLog();
		b.setId(ID);
		b.setLedger(ledger);
		borService.updateByPrimaryKeySelective(b);		
		return ("redirect:/borController/showUser.do");
	}
	
	
	@RequestMapping("/list")
	public String findPage(HttpServletRequest request) {
		//HttpServletRequest request=null;
		String borrower=null;
	  borrower=request.getParameter("borrower");
	
		
		System.out.println(borrower);
		/*		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("borrower", borrower);
		
		System.out.print(map);
		System.out.print(map.get(borrower));
		*/
		
		PageUtils p=new PageUtils();
		int pageNo= PageUtils.parseInt(request.getParameter("pageNo"),1);
		int pageCount=2;
		
		System.out.println("当前页码值"+pageNo);
		//以下用于分页，要判断为空，所在先在这里定义
		int totalCount;
		List  dataList;
		//System.out.print(borrower.length());
	     if(null==borrower || borrower.length()==0||borrower.toString().contentEquals("null")){
	 		
	    	  totalCount = borService.findTotal(null);
	    	
				System.out.print("执行到此步了");
				
			}else{//不为空走
				totalCount = borService.findTotal(borrower); 
			
				System.out.print("执行到此步了");
			}
		
		//int totalCount = borService.findTotal(borrower);
		//borService.findTotal(null);
		p.setCurrentPage(pageNo);
		p.setPageCount(pageCount);
		p.setTotalCount(totalCount);
		//b.setBorrower(ID);
		//findPage(pageNo, pageCount)用来在dao层查询分页之后每页的数据集：
		//List  dataList = borService.findPage(p); //名字要与参数名里面的名字一样，不然识别不了参数名
		//因为不传borrower或者为null这样写出错这个要在上面先做判断是否为空或者null先注释先
		//List  dataList = borService.findPage(borrower,p.getCurrentPage(),p.getPageCount());
		System.out.print(request.getParameter("borrower"));
		 if(null==borrower || borrower.length()==0||borrower.toString().contentEquals("null")){
		dataList = borService.findPage(null,p.getCurrentPage(),p.getPageCount());
		 
		 }else{
		
				dataList = borService.findPage(borrower,p.getCurrentPage(),p.getPageCount());
			 
		 }
		
		
		p.init(request, dataList,p.getTotalCount(),p.getPageCount(), "/testmybatis/borController/list.do?borrower="+borrower);
		
		
		
		request.setAttribute("page", p);
		request.setAttribute("bor", dataList);
		
		return "list";
} 
	
	//JdbcTemplate
	@RequestMapping("/user")
	public String viplist(HttpServletRequest request){
		ApplicationContext ac=new ClassPathXmlApplicationContext(new String[]{"spring.xml","spring-mybatis.xml"});
		JdbcTemplate jdbcTemplate=new JdbcTemplate((DataSource) ac.getBean("dataSource"));
		//加分页
		PageUtils p=new PageUtils();
		int pageNo= PageUtils.parseInt(request.getParameter("pageNo"),1);
		int pageCount=2;
		
		System.out.println("当前页码值"+pageNo);
		
	
	
		int totalCount = jdbcTemplate.queryForInt("select count(*) from a003..[user]");  
		p.setCurrentPage(pageNo);
		p.setPageCount(pageCount); 
		p.setTotalCount(totalCount);
		String sql="select * from (select row_number() over(order by userid) rn,* from a003..[user] where 1=1) tb where rn >("+p.getCurrentPage()+"-1)*"+p.getPageCount()+ " and rn <="+p.getCurrentPage()+"*"+p.getPageCount();
		List rows = jdbcTemplate.queryForList(sql); 
		p.init(request, rows, p.getTotalCount(), p.getPageCount(), "/testmybatis/borController/user.do?");
		
		 Iterator it = rows.iterator(); 
		 while(it.hasNext()) { 
		     Map userMap = (Map) it.next(); 
		     System.out.print(userMap.get("userid") + "\t"); 
		     System.out.print(userMap.get("username") + "\t"); 
		     System.out.print(userMap.get("no") + "\t"); 
		     System.out.println(userMap.get("password") + "\t"); 
		 } 
		request.setAttribute("page", p);
		request.setAttribute("userlist", rows);
		return "userlist";
	}
	
/*	public String list(HttpServletRequest request){
		Paging paging = new Paging();

		//设置当前页码
		
		paging.setCurPage(paging.getCurPage());
		
		
		//把得到总共显示的数据记录设置在分页总纪录中
		paging.setRowCount(borService.getCount());
		
		//设置每页显示的数据记录
		paging.setPageRowCount(3);
		
		//保存分页工具条
		request.setAttribute("toolBar", paging.getToolBar("list.do"));
		
		System.out.print(paging.getToolBar("list.do"));
		//得到每页显示数据
		List<BorrowingLog> u =  borService.getAll(paging);
		request.setAttribute("bor", u);
		return "list";
	}*/
	
	
	
	
	

}
