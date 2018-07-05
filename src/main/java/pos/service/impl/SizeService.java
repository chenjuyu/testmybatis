package pos.service.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import pos.dao.SizegroupsizeMapper;
import pos.service.ISizeGroupSize;
import web.util.system.plugins.PagingView;

@Service("sizeservice")
public class SizeService implements ISizeGroupSize {
	
	@Autowired
	private SizegroupsizeMapper sizegroupsizeMapper;
	

	@Override
	public HashMap<String, Object> searchsize( String conditions, int pageno, int pagesize) {
		// TODO Auto-generated method stub
		PagingView p=new PagingView(Integer.valueOf(pageno).intValue());
		p.setPageSize(pagesize);//为分页预留
		
		HashMap<String,Object> map=new HashMap<String,Object>();
		
		map.put("conditions", conditions);
		//map.put("page",p);//加这个就会扫描分页
	   List<HashMap<String,Object>> sizelist=sizegroupsizeMapper.sizegroupsizelist(map);
		
	   HashMap<String,Object> m=new HashMap<String,Object>();
		m.put("rows", sizelist);

		return m;
	}

}
