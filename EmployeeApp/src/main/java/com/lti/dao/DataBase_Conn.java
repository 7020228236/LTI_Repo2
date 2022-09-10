package com.lti.dao;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class DataBase_Conn {
 public static Connection getconn() throws SQLException {
	 
	 String url="jdbc:oracle:thin:@localhost:1521:XE";
	 Connection conn = DriverManager.getConnection(url,"hr","hr");
	 if(conn!=null) {
		 System.out.println("Connected");
		 
	 }
	 return conn;
 }
 public static void main(String[] args) throws SQLException {
	getconn();
}
}
