package pos.service.impl;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pos.dao.PossalesMapper;
import pos.model.Possales;
import pos.model.PossalesExample;
import pos.service.IPossalesService;
import web.util.system.plugins.PagingView;

@Service("possalesserive")
public class PossalesServiceimpl implements IPossalesService {

	@Autowired
	private PossalesMapper possalesmapp;

	@Override
	public List<Map<String, Object>> search(String date1, String date2) {
		// TODO Auto-generated method stub
		return possalesmapp.search(date1, date2);
	}

	@Override
	public List<Possales> selectByExample(PossalesExample example) {
		// TODO Auto-generated method stub
		return possalesmapp.selectByExample(example);
	}

	@Override
	public List<Possales> selectByPrimaryKey(String possalesid) {

		return possalesmapp.selectByPrimaryKey(possalesid);
	}

	@Override
	public HashMap<String, Object> possaleslist(String conditions, int pageno, int pagesize) { // xml
																								// 中来拦截只要Paginview
																								// 这个对象就会分页
																								// 简化了语句的写法
		PagingView page = new PagingView(Integer.valueOf(pageno).intValue());
		page.setPageSize(pagesize);

		HashMap<String, Object> map = new HashMap<String, Object>();
		
		/*
		 * map.put("pageno", pageno); map.put("pagesize", pagesize);
		 */
		map.put("conditions", conditions);
		
		List<HashMap<String,Object>> footer=possalesmapp.possaleslistTotal(map);
		
		map.put("page", page);// 传才能分产扫描
		// int count=possalesmapp.possalescount(map);

		// List<LinkedHashMap<String,Object>> possales =
		// this.possalesmapp.possaleslist(map);

		List<LinkedHashMap<String, Object>> possales = this.possalesmapp.possaleslistP(map);

		HashMap<String, Object> map1 = new HashMap<String, Object>();
		map1.put("total", page.getRowCount());
		map1.put("rows", possales);
		map1.put("footer", footer);
		// map1.put("page", page);

		return map1;
	}
   
	
	public HashMap<String,Object> exportExcel(String possalesid){
		
	 Map<String, Object> map1 = new HashMap<String, Object>();	
	 
	// String conditions=possalesid;
	 map1.put("conditions", possalesid); 
	 
	 HashMap<String, Object> map = new HashMap<String, Object>();
	 
	// List<HashMap<String, Object>>	
	 List<HashMap<String, Object>> possales=possalesmapp.selectPossales(map1); 
	  List<HashMap<String, Object>> possalesdetail=possalesmapp.selectPossalesDetail(map1); 	
		map.put("possales", possales);
		map.put("possalesdetail", possalesdetail);	
		return  map;
	}

	@Override
	public int updateByPrimaryKeySelective(Possales record) {
		// TODO Auto-generated method stub
		return possalesmapp.updateByPrimaryKeySelective(record);
	}


}
