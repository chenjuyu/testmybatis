package pos.dao;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import pos.model.Possales;
import pos.model.PossalesExample;

public interface PossalesMapper {

    int countByExample(PossalesExample example);
    int deleteByPrimaryKey(@Param("possalesid")String possalesid);
    int insert(Possales record);
    int insertSelective(Possales record);

    List<Possales> selectByExample(PossalesExample example);
    //@Param mybatis 标准加@Param参数
    List<Map<String,Object>>  search(@Param("date1")String date1 , @Param("date2")String date2 );

 
    List<Possales> selectByPrimaryKey(@Param(value="possalesid")String possalesid);

 
    int updateByPrimaryKeySelective(Possales record);

  
    int updateByPrimaryKey(Possales record);
    
    public  List<LinkedHashMap<String, Object>> possaleslist(HashMap<String, Object> paramHashMap);
    public  List<LinkedHashMap<String, Object>> possaleslistP(HashMap<String, Object> paramHashMap);
    
    public  List<HashMap<String, Object>> possaleslistTotal(HashMap<String, Object> paramHashMap);
    //查询单条记录 List<HashMap<String, Object>>
    public   List<HashMap<String, Object>> selectPossales(Map<String, Object> paramHashMap);
    public List<HashMap<String, Object>> selectPossalesDetail(Map<String, Object> paramHashMap);
    
    
	int possalescount(HashMap<String, Object> map);
}