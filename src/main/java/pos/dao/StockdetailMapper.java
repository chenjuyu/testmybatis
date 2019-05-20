package pos.dao;

import java.util.List;
import pos.model.Stockdetail;
import pos.model.StockdetailExample;
import pos.model.StockdetailKey;

public interface StockdetailMapper {
    int countByExample(StockdetailExample example);

    int deleteByPrimaryKey(StockdetailKey key);

    int insert(Stockdetail record);

    int insertSelective(Stockdetail record);

    List<Stockdetail> selectByExample(StockdetailExample example);

    Stockdetail selectByPrimaryKey(StockdetailKey key);

    int updateByPrimaryKeySelective(Stockdetail record);

    int updateByPrimaryKey(Stockdetail record);
}