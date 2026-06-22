package com.demo.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.CallableStatement;



public class TestCallable {
	
	
	public static void main(String[] args) {
		
	//Register driver
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			
		//create the connection 
			String url="jdbc:mysql://localhost:3306/java?useSSL=false";;
			Connection conn=DriverManager.getConnection(url,"root","root");
			
			CallableStatement cst=conn.prepareCall("{call getcnt(?,?)}");
			
			
			
			if(conn!=null) {
				System.out.println("Connection done suceesfully");
			}else {
				System.out.println("Connection Not done");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
	}

}
