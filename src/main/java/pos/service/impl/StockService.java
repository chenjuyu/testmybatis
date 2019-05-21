package pos.service.impl;

import java.util.HashMap;
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
	public HashMap<String, Object> stocklist(String conditions, int pageno,
			int pagesize) {
		
		PagingView p=new PagingView(Integer.valueOf(pageno).intValue());
		p.setPageSize(pagesize);
		
		HashMap<String, Object> map=new HashMap<String, Object>();
		
		 if(conditions !=null || !"".equals(conditions) ){
		
         map.put("conditions", conditions);			 	 
		 }
		 
		 int total =this.stockMapper.stockcount(map);
		 map.put("page", p);
		 List<Map<String, Object>> stocklist = this.stockMapper.stocklist(map);
		
		 HashMap<String, Object> m=new HashMap<String, Object>();
		 
		 m.put("total", total);
		 m.put("rows", stocklist);
		return m;
	}

	@Override
	public HashMap<String, Object> stockDetial(String conditions, int pageno,
			int pagesize) {
		PagingView p=new PagingView(Integer.valueOf(pageno).intValue());
		p.setPageSize(pagesize);
		
		HashMap<String, Object> map=new HashMap<String, Object>();
		
		 if(conditions !=null || !"".equals(conditions) ){
		
        map.put("conditions", conditions);			 	 
		 }
		 
		// int total =this.stockMapper.stockcount(map);
		// map.put("page", p); //先不分页
		 List<Map<String, Object>> stocklist = this.stockMapper.stockDetial(map);
		
		 HashMap<String, Object> m=new HashMap<String, Object>();
		 
		// m.put("total", total);
		 m.put("rows", stocklist);
		
		 return m;
	}



}
