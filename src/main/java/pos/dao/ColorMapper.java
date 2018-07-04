package pos.dao;

import java.util.HashMap;
import java.util.List;

import pos.model.Color;
import pos.model.ColorExample;

public interface ColorMapper {
    int countByExample(ColorExample example);

    int deleteByPrimaryKey(String colorid);

    int insert(Color record);

    int insertSelective(Color record);

    List<Color> selectByExample(ColorExample example);

    Color selectByPrimaryKey(String colorid);

    int updateByPrimaryKeySelective(Color record);

    int updateByPrimaryKey(Color record);
    
    List<HashMap<String,Object>> goodscolorlist(HashMap<String,Object> m);
    int goodcolorscount(HashMap<String,Object> m);
    
    List<HashMap<String,Object>> colorlist(HashMap<String,Object> m);
    int colorcount(HashMap<String,Object> m);
    
    List<HashMap<String,Object>> brandcolorlist(HashMap<String,Object> m);
    int brandcolorcount(HashMap<String,Object> m);
    
    
}