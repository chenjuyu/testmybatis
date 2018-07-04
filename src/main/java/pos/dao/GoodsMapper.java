package pos.dao;

import java.util.HashMap;
import java.util.List;

import pos.model.Goods;
import pos.model.GoodsExample;

public interface GoodsMapper {
    int countByExample(GoodsExample example);

    int deleteByPrimaryKey(String goodsid);

    int insert(Goods record);

    int insertSelective(Goods record);

    List<Goods> selectByExampleWithBLOBs(GoodsExample example);

    List<Goods> selectByExample(GoodsExample example);
    
    
    Goods selectByPrimaryKey(String goodsid);

    int updateByPrimaryKeySelective(Goods record);

    int updateByPrimaryKeyWithBLOBs(Goods record);

    int updateByPrimaryKey(Goods record);
    
    List<HashMap<String,Object>> goodslist(HashMap<String,Object> map);

    int goodscount(HashMap<String,Object> map);
}