package pos.dao;

import java.util.List;
import pos.model.Jdgoods;
import pos.model.JdgoodsExample;

public interface JdgoodsMapper {
    int countByExample(JdgoodsExample example);

    int deleteByPrimaryKey(String goodsno);

    int insert(Jdgoods record);

    int insertSelective(Jdgoods record);

    List<Jdgoods> selectByExample(JdgoodsExample example);

    Jdgoods selectByPrimaryKey(String goodsno);

    int updateByPrimaryKeySelective(Jdgoods record);

    int updateByPrimaryKey(Jdgoods record);
}