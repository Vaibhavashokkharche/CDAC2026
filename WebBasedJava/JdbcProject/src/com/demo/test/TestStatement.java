package com.demo.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestStatement {
	public static void main(String[] args){
		//register the driver
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			//create the connection
			String url="jdbc:mysql://localhost:3306/java?useSSL=false";
			Connection conn =DriverManager.getConnection(url,"root","root");
			//Create a statement
			Statement st= conn.createStatement();
			String query ="Select * from product";
			ResultSet rs=	st.executeQuery(query);
			
			System.out.println(" pid "+" pname "+" price ");
		while(rs.next()) {
			System.out.println("Pid:"+rs.getInt(1)+" Pname:"+rs.getString(2)+" price:"+rs.getInt(3));
		}
		int pid=2;
		String pname="Bounce";
		double price=15.85;
		
		String query1 = "Insert into product values(" + pid + ", '" + pname + "', " + price + ")";
		int n =	st.executeUpdate(query1);
	  
		System.out.println(n>0?"insertion done":"Error occured");
		
			
		if(conn!=null) {
			System.out.println("Connection done");
			
		}else {
			System.out.println("Connection not done");
		}
		} catch (SQLException e) {
			System.out.println("Connection not done");
			e.printStackTrace();
		}
		
		
		

	}	
}
