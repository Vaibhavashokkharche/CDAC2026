package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.demo.model.MyUser;
import com.demo.model.Product;
import com.mysql.cj.protocol.Resultset;

public class ProductDaoImpl implements ProductDao {
	static Connection conn;
	static {
		conn = DBUtil.getMyConnection();
	}

	@Override
	public MyUser validateUser(String username, String password) {
		try {
			PreparedStatement pst = conn.prepareStatement("Select * from myuser where username=? And password=?");
			pst.setString(1, username);
			pst.setString(2, password);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				MyUser user = new MyUser(rs.getString(1), rs.getString(2), rs.getString(3));
				return user;
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Product> findAll() {
		List<Product> plist = new ArrayList<>();
		Product p = null;
		try {
			PreparedStatement pst = conn.prepareStatement("Select * from product1");
			ResultSet rs = pst.executeQuery();

			while (rs.next()) {
				if (rs.getDate(5) != null) {
					p = new Product(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getDouble(4),
							rs.getDate(5).toLocalDate());
				} else {
					p = new Product(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getDouble(4), null);

				}
				plist.add(p);

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (plist.size() > 0) {
			return plist;
		}

		return null;
	}

}