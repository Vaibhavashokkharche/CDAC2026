package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDaoImpl implements LoginDao {
	static Connection conn;
	static {
		conn = DBUtil.getconnection();
	}

	@Override
	public String authenticate(String uname, String pwd) {
		try {
			PreparedStatement pst = conn.prepareStatement("Select * from myuser where username=? and password=?");
			pst.setString(1, uname);
			pst.setString(2, pwd);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				return rs.getString(3);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public void closeConnection() {
		DBUtil.closeConnection();
		
	}

}
