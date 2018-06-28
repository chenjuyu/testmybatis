package pos.service;

import java.util.HashMap;
import java.util.List;

import pos.model.Possalesdetail;
import pos.model.PossalesdetailExample;



public interface IPossalesdetail {
		
	HashMap<String,Object> possalesdetaillist(String conditions, int pageno, int pagesize);
	List<Possalesdetail> selectByExample(PossalesdetailExample example);
	int selectByPrimaryKey(Integer possalesdetailid);
	int deleteByPrimaryKey(Integer possalesdetailid);
	int updateByPrimaryKeySelective(Possalesdetail record);
}
