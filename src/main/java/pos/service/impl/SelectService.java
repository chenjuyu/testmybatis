package pos.service.impl;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pos.dao.DepartmentMapper;
import pos.model.Department;
import pos.model.DepartmentExample;
import pos.service.ISelect;
import web.util.system.plugins.PagingView;

@Service("selectservice")
public class SelectService implements ISelect {

	
    @Autowired
    private DepartmentMapper deptMapper;
	
	
	@Override
	public int countByExample(DepartmentExample example) {
		// TODO Auto-generated method stub
		return deptMapper.countByExample(example);
	}

	@Override
	public List<Department> selectByExample(DepartmentExample example) {
		// TODO Auto-generated method stub
		return deptMapper.selectByExample(example);
	}

	@Override
	public HashMap<String, Object> Departmentlist(String conditions,
			int pageno, int pagesize) {
		PagingView p=new PagingView(Integer.valueOf(pageno).intValue());
		p.setPageSize(pagesize);
		
		HashMap<String, Object> map=new HashMap<String, Object>();
		
		 if(conditions !=null || !"".equals(conditions) ){
		
         map.put("conditions", conditions);			 	 
		 }
		 int total =this.deptMapper.Departmentcount(map);
		 map.put("page", p);
	     List<LinkedHashMap<String, Object>> dept = this.deptMapper.Departmentlist(map);
		 
	     HashMap<String,Object> m=new HashMap<String,Object>();
         m.put("total", total);
         m.put("rows", dept);
	    
		return m;
	}

}
