package com.springorm.dao;

import com.springorm.pojo.Employee;

public interface EmployeeDAO {
	
	public int registerEmployee(Employee employee);
	
	public void updateEmployee(Employee employee);
	
	public void deleteEmployee(int employeeId);
	
	public Employee getEmployee(int employeeId);

}
