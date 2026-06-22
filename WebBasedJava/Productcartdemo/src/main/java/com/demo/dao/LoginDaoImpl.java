package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.demo.model.User;

public class LoginDaoImpl implements LoginDao {
	static Connection conn;
	static {
		conn = DBUtil.getMyconnection();
	}

	@Override
	public User authenticateUser(String uname, String pass) {
		try {
			PreparedStatement pst = conn.prepareStatement("Select * from myuser where username=? and password=?");
			pst.setString(1, uname);
			pst.setString(2, pass);

			ResultSet rs = pst.executeQuery();
			if (rs.next()) {

				User u = new User(rs.getString(1), rs.getString(2), rs.getString(3));
				return u;
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

}
