package com.aglistech.qrsignature.controllers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.aglistech.qrsignature.connection.SQLLiteImpl;

public class UserController {
	private SQLLiteImpl conImp = new SQLLiteImpl();
	private Connection conn = null;
	
	public UserController() throws SQLException{
		this.conn = conImp.connect();
	}
	
	public String getUser(int id) {
		String sql = "SELECT id, name, key FROM users where id = ?";
		try {
			PreparedStatement pStatement = conn.prepareStatement(sql);
			pStatement.setInt(1, id);
			
			ResultSet rs = pStatement.executeQuery();
			
			String result = "";
			while (rs.next()) {
				int id_res = rs.getInt("id");
				String name_res = rs.getString("name");
				String key_res = rs.getString("key");
				result += id_res + "_" + name_res + "_" + key_res + "\n";				
			}
			conImp.commit(conn);
			
			return result;
		}catch (Exception e) {
			// TODO: handle exception
			return e.toString();
		}
	}
	
}
