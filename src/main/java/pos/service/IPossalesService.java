package pos.service;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import pos.model.Possales;
import pos.model.PossalesExample;

public interface IPossalesService {
	
	 int updateByPrimaryKeySelective(Possales record);	
public	List<Map<String,Object>> search(String date1,String date2);
	
public	List<Possales> selectByExample(PossalesExample example); 

public  List<Possales> selectByPrimaryKey(String possalesid);
public abstract HashMap<String, Object> possaleslist(String conditions, int pageno, int pagesize);

public HashMap<String,Object> exportExcel(String possalesid); 

}
 