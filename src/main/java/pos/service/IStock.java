package pos.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import pos.model.Stock;
import pos.model.StockExample;

public interface IStock {
	    int countByExample(StockExample example);

	    int deleteByPrimaryKey(String stockid);

	    int insert(Stock record);
	    
	    int updateByPrimaryKey(Stock record);
	    
	    HashMap<String,Object> stocklist(int Direction,String conditions, int pageno, int pagesize);
	    
	    HashMap<String,Object> stockDetial(String size,String conditions, int pageno, int pagesize);
	    //不用分页这个
	    HashMap<String,Object> synstock(String conditions);
}
