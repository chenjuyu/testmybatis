package pos.service;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import pos.model.Goods;
import pos.model.GoodsExample;

public interface IGoods {

	
	List<Goods> selectByExample(GoodsExample example);
	
	HashMap<String,Object> goodslist(String conditions, int pageno, int pagesize);
	
	LinkedHashMap<String,Object> autolist(String conditions, int pageno, int pagesize);
	
	List<HashMap<String, Object>> stockgoods(String stockid);
	
}
