package com.lti.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.lti.entity.Employee;

public class Employee_Dao {
	
	private Connection conn;

	public Employee_Dao() throws SQLException {
		
		conn = DataBase_Conn.getconn();
		System.out.println("getting connection from constructor");
	}
	public void addEmp(Employee e) throws SQLException {
		
		PreparedStatement ps = conn.prepareStatement("insert into employee_table(username,password,email)values(?,?,?)");
	    ps.setString(1,e.getUsername());
		ps.setString(2,e.getPassword());
		ps.setString(3,e.getEmail());
		ps.executeUpdate();
		ps.close();
		
	}
	
	//below
/*
	public void deleteEmp(String username)   {
		
	PreparedStatement = ps= null;
	try {
		ps =  conn.prepareStatement("delete from employee_table where username = ?");
	    ps.setString(1,delname);
		
		ps.executeUpdate();
		ps.close();
	}
	catch(SQLException e) {
		System.out.println("name u have entered is not their in the table"+e);
	}
	}
	*/
	public Employee getEmpbyname(String username) throws SQLException {
		Employee emp1 = new Employee();
		PreparedStatement ps = conn.prepareStatement("select * from employee_table where username = ?");
		//below
		//PreparedStatement ps = conn.prepareStatement("delete from employee_table where username = ?");
		ps.setString(1, username);
		ResultSet rs = ps.executeQuery();
		
		if(rs.next())
		{
		emp1.setUsername(rs.getString("username"));
		emp1.setPassword(rs.getString("password"));
		emp1.setEmail(rs.getString("email"));
		}
		return emp1;
	}
	
	
	
	

}
