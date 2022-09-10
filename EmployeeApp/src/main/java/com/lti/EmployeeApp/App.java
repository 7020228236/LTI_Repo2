package com.lti.EmployeeApp;

import java.sql.SQLException;

import com.lti.dao.Employee_Dao;
import com.lti.entity.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException
    {
        System.out.println( "Hello World!" );
        
       Employee_Dao dao = new Employee_Dao();
       
       Employee e1 = new Employee();
       e1.setUsername("Satyam");
       e1.setPassword("Satyam");
       e1.setEmail("Satyam@gmail.com");
       dao.addEmp(e1);
       System.out.println("Employee Added Successfully");
       //below
       //dao.deleteEmp(delname);
       System.out.println("");
       
       
    }
}
