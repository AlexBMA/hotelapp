package db.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import db.dao.PriceForServiceDAO;
import model.PriceForServiceOption;

public class PriceForServiceDAOImpl implements PriceForServiceDAO<PriceForServiceOption> {

	@Override
	public void insert(PriceForServiceOption item, Connection conn) {
		String sql="INSERT INTO "+" ()VALUES()";
		try {
			PreparedStatement stmt = conn.prepareStatement(sql);
			
			setValuesForInsert(stmt,item);
			stmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	private void setValuesForInsert(PreparedStatement stmt, PriceForServiceOption item) {
		
		
		
	}

	@Override
	public PriceForServiceOption getItemById(Connection conn, int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateItem(Connection conn, int id, PriceForServiceOption item) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteItem(Connection conn, int id) {
		// TODO Auto-generated method stub
		
	}

}
