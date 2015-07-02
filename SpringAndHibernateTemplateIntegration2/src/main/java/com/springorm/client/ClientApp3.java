package com.springorm.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springorm.dao.EmployeeDAO;

public class ClientApp3 
{
    public static void main( String[] args )
    {
    	
        @SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springorm/config/spring-config.xml");
        EmployeeDAO dao = context.getBean("employeeDao",EmployeeDAO.class);
        
        dao.deleteEmployee(4);
        
        System.out.println("Employee Deleted Successfully...!!!");
        
    }
}
