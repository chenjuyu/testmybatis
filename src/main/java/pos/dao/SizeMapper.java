package pos.dao;

import java.util.List;
import pos.model.Size;
import pos.model.SizeExample;

public interface SizeMapper {
    int countByExample(SizeExample example);

    int deleteByPrimaryKey(String sizeid);

    int insert(Size record);

    int insertSelective(Size record);

    List<Size> selectByExample(SizeExample example);

    Size selectByPrimaryKey(String sizeid);

    int updateByPrimaryKeySelective(Size record);

    int updateByPrimaryKey(Size record);
}