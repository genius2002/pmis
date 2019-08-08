package com.wayen.pmis.mapper;

import com.wayen.pmis.doo.Employee;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EmployeeMapper {
    List<Employee> query();
    void create(Employee emp);
}
