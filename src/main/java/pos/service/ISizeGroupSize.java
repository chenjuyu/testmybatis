package pos.service;

import java.util.HashMap;
import java.util.List;

import pos.model.Sizegroupsize;
import pos.model.SizegroupsizeExample;
public interface ISizeGroupSize {
	
	
	
	
	
	HashMap<String,Object> searchsize(String conditions,int pageno,int pagesize);
	
	List<Sizegroupsize> selectByExample(SizegroupsizeExample example);

}
