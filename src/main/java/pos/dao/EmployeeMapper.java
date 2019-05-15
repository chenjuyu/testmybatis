package pos.dao;

import java.util.List;
import pos.model.Employee;
import pos.model.EmployeeExample;

public interface EmployeeMapper {
    int countByExample(EmployeeExample example);

    int deleteByPrimaryKey(String employeeid);

    int insert(Employee record);

    int insertSelective(Employee record);

    List<Employee> selectByExampleWithBLOBs(EmployeeExample example);

    List<Employee> selectByExample(EmployeeExample example);

    Employee selectByPrimaryKey(String employeeid);

    int updateByPrimaryKeySelective(Employee record);

    int updateByPrimaryKeyWithBLOBs(Employee record);

    int updateByPrimaryKey(Employee record);
}