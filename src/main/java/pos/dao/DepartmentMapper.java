package pos.dao;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

import pos.model.Department;
import pos.model.DepartmentExample;

public interface DepartmentMapper {
    int countByExample(DepartmentExample example);

    int deleteByPrimaryKey(String departmentid);

    int insert(Department record);

    int insertSelective(Department record);

    List<Department> selectByExample(DepartmentExample example);

    Department selectByPrimaryKey(String departmentid);

    int updateByPrimaryKeySelective(Department record);

    int updateByPrimaryKey(Department record);
    
    int Departmentcount(HashMap<String,Object> map);
    
    List<LinkedHashMap<String,Object>> Departmentlist(HashMap<String,Object> map);
    
}