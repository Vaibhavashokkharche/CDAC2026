package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.demo.model.Product;

public class ProductDaoImpl implements ProductDao{
	static Connection conn;
	static {
		try {
			conn=DBUtil.getMyconnection();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public List<Product> findProductById(int catid) {
	try {
		PreparedStatement pst= conn.prepareStatement("select * from product1 where cid=?");
		pst.setInt(1, catid);
		List<Product> plist=new ArrayList<>();
		
	ResultSet rs=pst.executeQuery();
	while(rs.next()) {
		Product p=new Product(rs.getInt(1),rs.getString(2),rs.getDouble(4));
		plist.add(p);
		
	}
		
	return plist;	
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return null;
		
	}

	
	
	
	
	
	
}
