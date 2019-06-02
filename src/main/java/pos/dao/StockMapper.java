package pos.dao;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import pos.model.Stock;
import pos.model.StockExample;

public interface StockMapper {
    int countByExample(StockExample example);

    int deleteByPrimaryKey(String stockid);

    int insert(Stock record);

    int insertSelective(Stock record);

    List<Stock> selectByExample(StockExample example);

    Stock selectByPrimaryKey(String stockid);

    int updateByPrimaryKeySelective(Stock record);

    int updateByPrimaryKey(Stock record);
    
    List<Map<String,Object>> stocklist(Map<String,Object> map);
    
    int stockcount(Map<String,Object> map);
    
    List<LinkedHashMap<String,Object>> stockDetial(Map<String,Object> map); 
    
    List<LinkedHashMap<String,Object>> stockconnetjd(Map<String,Object> map); 
}