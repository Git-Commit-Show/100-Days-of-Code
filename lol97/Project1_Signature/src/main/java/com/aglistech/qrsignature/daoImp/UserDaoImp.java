package com.aglistech.qrsignature.daoImp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.aglistech.qrsignature.connection.SQLLiteImpl;
import com.aglistech.qrsignature.model.User;

public class UserDaoImp {
	private SQLLiteImpl conImp = new SQLLiteImpl();
	private Connection conn = null;
	
	public UserDaoImp() throws SQLException {
		super();
		this.conn = conImp.connect();
	}
	
	public User getUser(int id) {
		String sql = "SELECT id, name, key FROM users where id = ?";
		User result = new User();
		try {
			PreparedStatement pStatement = conn.prepareStatement(sql);
			pStatement.setInt(1, id);
			
			ResultSet rs = pStatement.executeQuery();
			
			while (rs.next()) {
				result.setId(rs.getInt("id"));
				result.setName(rs.getString("name"));
				result.setKey(rs.getString("key"));			
			}
			conImp.commit(conn);
			
			return result;
		}catch (Exception e) {
			// TODO: handle exception
			return result;
		}
	}
	
	public boolean checkPassword(User user, String key) {
		if (user.getKey() == null) {
			return false;
		} else if (user.getKey().trim().equals(key.trim())) {
			return true;
		} else {
			return false;
		}
	}
}
