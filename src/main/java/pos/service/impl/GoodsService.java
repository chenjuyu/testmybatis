package pos.service.impl;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pos.dao.GoodsMapper;
import pos.model.Goods;
import pos.model.GoodsExample;
import pos.service.IGoods;
import web.util.system.plugins.PagingView;
@Service("GoodsService")
public class GoodsService implements IGoods {
	
	@Autowired
	GoodsMapper  goodsmapper;

	@Override
	public List<Goods> selectByExample(GoodsExample example) {
		// TODO Auto-generated method stub
		return goodsmapper.selectByExample(example);
	}

	@Override
	public HashMap<String, Object> goodslist(String conditions,
			int pageno, int pagesize) {
		
		PagingView p=new PagingView(Integer.valueOf(pageno).intValue());
		p.setPageSize(pagesize);
		
		HashMap<String, Object> map=new HashMap<String, Object>();
		
		 if(conditions !=null ){
		
          map.put("conditions", conditions);			 	 
		 }
		 int total =this.goodsmapper.goodscount(map);
		 map.put("page", p);
	   List<HashMap<String, Object>> goods = this.goodsmapper.goodslist(map);
	   
	   HashMap<String, Object> m=new HashMap<String, Object>();
	     m.put("total", total);
	     m.put("rows", goods);
	     
	   
		
		
		return m;
	}



}
