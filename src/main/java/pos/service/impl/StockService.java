package pos.service.impl;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pos.dao.StockMapper;
import pos.model.Stock;
import pos.model.StockExample;
import pos.service.IStock;
import web.util.system.plugins.PagingView;
@Service("stockservice")
public class StockService implements IStock {

	@Autowired
	private StockMapper stockMapper;
	
	@Override
	public int countByExample(StockExample example) {
		// TODO Auto-generated method stub
		return stockMapper.countByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(String stockid) {
		// TODO Auto-generated method stub
		return stockMapper.deleteByPrimaryKey(stockid);
	}

	@Override
	public int insert(Stock record) {
		// TODO Auto-generated method stub
		return stockMapper.insert(record);
	}

	@Override
	public int updateByPrimaryKey(Stock record) {
		// TODO Auto-generated method stub
		return stockMapper.updateByPrimaryKey(record);
	}

	@Override
	public HashMap<String, Object> stocklist(int Direction,String conditions, int pageno,
			int pagesize) {
		
		PagingView p=new PagingView(Integer.valueOf(pageno).intValue());
		p.setPageSize(pagesize);
		
		HashMap<String, Object> map=new HashMap<String, Object>();
		
		 if(conditions !=null || !"".equals(conditions) ){
		
         map.put("conditions", conditions);			 	 
		 }
		
		 int total =this.stockMapper.stockcount(map);
		 
          String JoinStr="",FieldName="";
		 
		 if(Direction==1){
			 JoinStr=" Left Outer Join Supplier e On a.CSID=e.SupplierID ";
			 FieldName="(case isnull(a.CustomerID,'')  when '' then e.Supplier else '' end) Supplier,";
		 }else{
			 JoinStr=" Left Outer Join Customer e On a.CSID=e.CustomerID ";
			 FieldName="e.Customer,e.MobilePhone Mobile,e.Address,";
		 }
		 
		 map.put("JoinStr", JoinStr);
		 map.put("FieldName", FieldName);
		 map.put("page", p);
		 
		 
		 List<Map<String, Object>> stocklist = this.stockMapper.stocklist(map);
		
		 HashMap<String, Object> m=new HashMap<String, Object>();
		 
		 m.put("total", total);
		 m.put("rows", stocklist);
		return m;
	}

	@Override
	public HashMap<String, Object> stockDetial(String size,String conditions, int pageno,
			int pagesize) {
		PagingView p=new PagingView(Integer.valueOf(pageno).intValue());
		p.setPageSize(pagesize);
		
		HashMap<String, Object> map=new HashMap<String, Object>();
		
		 if(conditions !=null || !"".equals(conditions) ){
		
        map.put("conditions", conditions);			 	 
		 }
		 if(size !=null || !"".equals(size)){
		map.put("size", size);	 
		 }
		 
		// int total =this.stockMapper.stockcount(map);
		// map.put("page", p); //先不分页
		 List<LinkedHashMap<String, Object>> stocklist = this.stockMapper.stockDetial(map);
		
		 HashMap<String, Object> m=new HashMap<String, Object>();
		 
		// m.put("total", total);
		 m.put("rows", stocklist);
		
		 return m;
	}

	@Override
	public HashMap<String, Object> synstock(String conditions) {
         Map<String,Object> map=new HashMap<String,Object>();
         HashMap<String,Object> m=new HashMap<String,Object>();
		if(!"".equals(conditions) && conditions !=null){
			map.put("conditions", conditions);
		List<LinkedHashMap<String, Object>> stocklist = this.stockMapper.stockconnetjd(map);
		m.put("rows", stocklist);
		}
		
		return m;
		
	}

	@Override
	public boolean cancelStock(String stockid, String tabletag) {
		// TODO Auto-generated method stub
		Map<String,Object> map=new HashMap<>();
		map.put("stockid", stockid);
		map.put("tabletag", tabletag);
		try{
		stockMapper.cancelStock(map);
		return true;
		}catch(Exception e){
			e.getMessage();
		return false;
		}
	
	}



}
