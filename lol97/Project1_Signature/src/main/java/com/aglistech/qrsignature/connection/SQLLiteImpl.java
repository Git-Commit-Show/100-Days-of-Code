package com.aglistech.qrsignature.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class SQLLiteImpl implements ConnectionInterface {
	Connection connection = null;

	public Connection connect() throws SQLException {
		String url = "jdbc:sqlite:D:\\Code\\100DaysChallenge\\100-Days-of-Code\\lol97\\Project1_Signature\\src\\main\\resources\\db\\signature.db";
		connection = DriverManager.getConnection(url);
		return connection;
	}

	public void commit(Connection conn) throws SQLException {
		if (connection != null) {
			//DB AUTOCOMMIT
//			conn.commit();
			
			conn.close();
		}

	}

	public void roolback(Connection conn) throws SQLException {
		if (connection != null) {
			conn.rollback();
			conn.close();
		}

	}

	public List<?> getListData(Connection connection, String sql) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getSingleData(Connection connection, String sql) {
		// TODO Auto-generated method stub
		return null;
	}

}
