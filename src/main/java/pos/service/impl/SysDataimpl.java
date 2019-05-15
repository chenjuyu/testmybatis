package pos.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import pos.service.SysData;
@Service("synData")
public class SysDataimpl implements SysData {
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public List<Map<String, Object>> SynData(String tbl, String keyid, int CurrPage, int PageSize,String AysField) {
		// TODO Auto-generated method stub
		
		int count =jdbcTemplate.queryForInt("select count(1) from "+tbl);
		int pagecount =jdbcTemplate.queryForInt("select ceiling("+String.valueOf(count)+"*1.0/"+String.valueOf(PageSize)+")");
		String sql="SELECT "+AysField+" FROM "+"\t"+
		"(SELECT "+AysField+",ROW_NUMBER() OVER(ORDER BY "+keyid+") AS num FROM  "+tbl+" ) a "+"\t"+
		"WHERE a.num BETWEEN ("+String.valueOf(CurrPage)+"-1)*"+String.valueOf(PageSize)+"+1 AND ("+String.valueOf(CurrPage)+")*"+String.valueOf(PageSize)+"";	
		List<Map<String,Object>> ls=jdbcTemplate.queryForList(sql);
		return ls;
	}

	@Override
	public int pagecount(String tbl, int PageSize) {
		// TODO Auto-generated method stub
		int count =jdbcTemplate.queryForInt("select count(1) from "+tbl);
		int pagecount =jdbcTemplate.queryForInt("select ceiling("+String.valueOf(count)+"*1.0/"+String.valueOf(PageSize)+")");
		return pagecount;
	}

}
