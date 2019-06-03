package pos.dao;

import java.util.List;
import pos.model.Jdstock;
import pos.model.JdstockExample;

public interface JdstockMapper {
    int countByExample(JdstockExample example);

    int deleteByPrimaryKey(String stockid);

    int insert(Jdstock record);

    int insertSelective(Jdstock record);

    List<Jdstock> selectByExample(JdstockExample example);

    Jdstock selectByPrimaryKey(String stockid);

    int updateByPrimaryKeySelective(Jdstock record);

    int updateByPrimaryKey(Jdstock record);
}