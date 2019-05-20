package pos.dao;

import java.util.List;
import pos.model.Stockdetailtemp;
import pos.model.StockdetailtempExample;

public interface StockdetailtempMapper {
    int countByExample(StockdetailtempExample example);

    int deleteByPrimaryKey(String stockdetailid);

    int insert(Stockdetailtemp record);

    int insertSelective(Stockdetailtemp record);

    List<Stockdetailtemp> selectByExample(StockdetailtempExample example);

    Stockdetailtemp selectByPrimaryKey(String stockdetailid);

    int updateByPrimaryKeySelective(Stockdetailtemp record);

    int updateByPrimaryKey(Stockdetailtemp record);
}