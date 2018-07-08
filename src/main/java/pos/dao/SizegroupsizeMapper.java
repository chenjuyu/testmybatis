package pos.dao;

import java.util.List;
import pos.model.Sizegroupsize;
import pos.model.SizegroupsizeExample;
import pos.model.SizegroupsizeKey;

import java.util.HashMap;
import java.util.List;
import pos.model.Sizegroupsize;
import pos.model.SizegroupsizeExample;
import pos.model.SizegroupsizeKey;

public interface SizegroupsizeMapper {
    int countByExample(SizegroupsizeExample example);

    int deleteByPrimaryKey(SizegroupsizeKey key);

    int insert(Sizegroupsize record);

    int insertSelective(Sizegroupsize record);

    List<Sizegroupsize> selectByExample(SizegroupsizeExample example);

    Sizegroupsize selectByPrimaryKey(SizegroupsizeKey key);

    int updateByPrimaryKeySelective(Sizegroupsize record);

    int updateByPrimaryKey(Sizegroupsize record);
    
   List<HashMap<String,Object>>  sizegroupsizelist(HashMap<String,Object> map);
    
   int sizegroupsizecount(HashMap<String,Object> map);
    
    
    

}
