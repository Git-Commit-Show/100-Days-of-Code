package com.aglistech.qrsignature.connection;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public interface ConnectionInterface {
	public Connection connect() throws SQLException;
	
	public void commit(Connection connection) throws SQLException;
	
	public void roolback(Connection connection) throws SQLException;
	
	public List<?> getListData(Connection connection, String sql);
	
	public String getSingleData(Connection connection, String sql);
}
