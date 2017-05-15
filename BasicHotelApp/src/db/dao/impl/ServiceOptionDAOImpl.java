package db.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import db.dao.ServiceOptionDAO;
import model.ServiceOption;

public class ServiceOptionDAOImpl implements ServiceOptionDAO<ServiceOption> {

	@Override
	public void insert(ServiceOption item, Connection conn) {
		String sql="INSERT INTO "+" () VALUES ()";
		
		try {
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.executeUpdate();
			
			stmt.close();
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public ServiceOption getItemById(Connection conn, int id) {
		
		
		return null;
	}

	@Override
	public void updateItem(Connection conn, int id, ServiceOption item) {
		
		
	}

	@Override
	public void deleteItem(Connection conn, int id) {
		
		
	}

}
