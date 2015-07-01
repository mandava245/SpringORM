package com.springorm.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springorm.dao.EmployeeDAO;
import com.springorm.pojo.Employee;

public class ClientApp1 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springorm/config/springConfig.xml");
        EmployeeDAO employeeDAO = context.getBean("employeeDAO",EmployeeDAO.class);
        
        Employee employee = new Employee();
        employee.setEmployeeId(88);
        employee.setEmployeeName("Pavan M");
        employee.setSalary(45000);
        
        int count = employeeDAO.createEmployee(employee);
        
        System.out.println("Employee Registered Successfully : : "+count);
        
    }
}
