package pos.dao;

import java.util.HashMap;
import java.util.List;

import pos.model.Possalesdetail;
import pos.model.PossalesdetailExample;

public interface PossalesdetailMapper {
    int countByExample(PossalesdetailExample example);
    int deleteByPrimaryKey(Integer possalesdetailid);

   
    int insert(Possalesdetail record);

   
    int insertSelective(Possalesdetail record);

    List<Possalesdetail> selectByExample(PossalesdetailExample example);


    Possalesdetail selectByPrimaryKey(Integer possalesdetailid);


    int updateByPrimaryKeySelective(Possalesdetail record);

 
    int updateByPrimaryKey(Possalesdetail record);
    
   List<HashMap<String,Object>> possalesdetaillist(HashMap<String,Object> param);
   List<HashMap<String,Object>> possalesdetailtotal(HashMap<String,Object> param);
}