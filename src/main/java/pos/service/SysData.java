package pos.service;
import java.util.List;
import java.util.Map;

public interface SysData {
	
	
	public List<Map<String,Object>> SynData(String tbl,String keyid,int CurrPage,int PageSize,String AysField);
    public int pagecount(String tbl,int PageSize);
		
	
	
	
	
	
	

}
