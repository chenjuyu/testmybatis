package pos.service.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pos.dao.ColorMapper;
import pos.service.IColor;
import web.util.system.plugins.PagingView;

@Service("colorService")
public class ColorService implements IColor {
    
	@Autowired
	private ColorMapper colormapper; 
	
	@Override
	public HashMap<String, Object> searchcolor(boolean brandFlag,String conditions, int pageno,
			int pagesize) {
		// TODO Auto-generated method stub
		PagingView page=new PagingView(Integer.valueOf(pageno).intValue());
		page.setPageSize(pagesize);
		
		HashMap<String, Object> m =new HashMap<String, Object>();
		
		HashMap<String, Object> map =new HashMap<String, Object>();
		map.put("conditions",conditions);
		int total=0;
		if(brandFlag){
			total=colormapper.brandcolorcount(map);
			map.put("page", page);
			List<HashMap<String,Object>> brandcolorlist=colormapper.brandcolorlist(map);
			m.put("total", total);
			m.put("rows",brandcolorlist);
		}else{
	    total=colormapper.goodcolorscount(map);
		map.put("page", page);
		List<HashMap<String,Object>> goodscolorlist=colormapper.goodscolorlist(map);
		if(goodscolorlist.size()>0){
		m.put("total", total);
		m.put("rows", goodscolorlist);	
		}else{
		if (map.containsKey("page")){
			map.remove("page");
		}
		total=colormapper.colorcount(map);
		map.put("page", page);
		List<HashMap<String,Object>> colorlist=colormapper.colorlist(map);	
		m.put("total", total);
		m.put("rows", colorlist);	
		}
		
		}
		return m;
	}

}
