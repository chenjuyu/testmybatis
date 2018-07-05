package pos.dao;

import java.util.List;
import pos.model.Brandcolor;
import pos.model.BrandcolorExample;

public interface BrandcolorMapper {
    int countByExample(BrandcolorExample example);

    int deleteByPrimaryKey(String colorid);

    int insert(Brandcolor record);

    int insertSelective(Brandcolor record);

    List<Brandcolor> selectByExample(BrandcolorExample example);

    Brandcolor selectByPrimaryKey(String colorid);

    int updateByPrimaryKeySelective(Brandcolor record);

    int updateByPrimaryKey(Brandcolor record);
}