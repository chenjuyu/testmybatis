package pos.service;

import java.util.HashMap;
import java.util.List;

import pos.model.Department;
import pos.model.DepartmentExample;

public interface ISelect {
	
	int countByExample(DepartmentExample example);
	List<Department> selectByExample(DepartmentExample example);
	
	HashMap<String,Object> Departmentlist(String conditions, int pageno, int pagesize);
}
