package com.demo.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.protocol.Resultset;

public class TestPreparedStatement {
	public static void main(String[] args) {
	//Register the driver
		Connection conn=null;
	try {
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
	  String url="jdbc:mysql://localhost:3306/java?useSSL=false";
		conn=DriverManager.getConnection(url,"root","root");
		System.out.println(conn!=null?"Connection done":"connection not done");
		//create a statement
		PreparedStatement pst=conn.prepareStatement("Select * from product");
		ResultSet rs= pst.executeQuery();
		while(rs.next()) {
			System.out.println("pid:"+rs.getInt(1));
			System.out.println("pname"+rs.getString(2));
			System.out.println("price"+rs.getDouble(3));
			System.out.println("-------------------------");
		}
		PreparedStatement pst1=conn.prepareStatement("Select * from product where pid=?");
		int id=101;
		
		pst1.setInt(1,id);
		ResultSet rs1 =pst1.executeQuery();
		if(rs1.next()) {
			System.out.println("pid:"+rs1.getInt(1));
			System.out.println("pname"+rs1.getString(2));
			System.out.println("price"+rs1.getDouble(3));
			System.out.println("-------------------------");
			
		}
		
		
		
		
		
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
		

	
		
	
	//	
		
		
		
		
		
	}

}
