package com.lti.EmployeeApp;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.sql.Connection;
import java.sql.SQLException;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.lti.dao.DataBase_Conn;
import com.lti.dao.Employee_Dao;
import com.lti.entity.Employee;


public class EmployeeDao_Test {
	public static Employee_Dao dao;
//	
//	@BeforeAll
//    static void init() throws SQLException {
//        Connection conn = DataBase_Conn.getconn();
//        try {
//            // set auto commit false so any operation in this test will be discarded.
//            conn.setAutoCommit(false);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        //emp_dao = new Employee_dao(conn);
//    }
//     
//    @AfterAll
//    static void teardown() throws SQLException {
//        Connection conn = DataBase_Conn.getconn();
//        try {
//            conn.setAutoCommit(true);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//

@Test
void getConnectionTest() throws SQLException {
	Connection conn = DataBase_Conn.getconn();
	assertNotNull(conn,"Connection Successfull");
	System.out.println("Getting connection from test");
}
@BeforeAll

static void getDao() throws SQLException {
	 dao =  new Employee_Dao();
}

@Test

public void addEmptest() throws SQLException
{
	Employee emp = new Employee();
	emp.setUsername("abc");
	emp.setPassword("abc");
	emp.setEmail("emp@email");
	Connection conn = DataBase_Conn.getconn();
	System.out.println("getting connection addemp test");
	//Employee_Dao dao = new Employee_Dao();
	System.out.println("getting connection from employee dao");
	dao.addEmp(emp);
	Employee empfromdb = dao.getEmpbyname("abc");
	assertEquals("abc",empfromdb.getPassword(),"Password check successfull");
	//assertEquals()
	
}
/*
@Test 

public void deleteEmpTest() throws SQLException
{
	
	Employee emp = new Employee();
	Employee empfromdb = dao.getEmpbyname("emp22");
	dao.deleteEmployee("emp22")
	assertNull(empfromdb.getUsername());
}
*/

}


