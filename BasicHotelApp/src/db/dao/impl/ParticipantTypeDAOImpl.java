package db.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import db.AppTableNames;
import db.AppTableNames.ParticiapntTypeEntry;
import db.dao.ParticipantTypeDAO;
import model.ParticipanType;

public class ParticipantTypeDAOImpl implements ParticipantTypeDAO<ParticipanType> {

	@Override
	public void insert(ParticipanType item, Connection conn) {

	}

	@Override
	public ParticipanType getItemById(Connection conn, int id) {
		String sql = "SELECT * FROM " + ParticiapntTypeEntry.TABLE_NAME + " WHERE id="+id+";";

		try {
			Statement stmt = conn.createStatement();
			stmt.executeQuery(sql);
			
			ResultSet set = stmt.executeQuery(sql);
			
			if(set.next())
			{
				ParticipanType typeTemp = new ParticipanType();
				putDataInObject(set, typeTemp);
				
				System.out.println("Get by id succes in table " + ParticiapntTypeEntry.TABLE_NAME);
				
				return typeTemp;
			}
			
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		
		return null;
	}

	@Override
	public void updateItem(Connection conn, int id, ParticipanType item) {

	}

	@Override
	public void deleteItem(Connection conn, int id) {

	}

	@Override
	public List<ParticipanType> getAll(Connection conn) {
		String sql = "SELECT * FROM " + ParticiapntTypeEntry.TABLE_NAME + ";";

		try {
			Statement stmt = conn.createStatement();

			stmt.executeQuery(sql);
			ResultSet set = stmt.executeQuery(sql);
			List<ParticipanType> list = new ArrayList<>();
			while (set.next()) {
				ParticipanType typeTemp = new ParticipanType();
				putDataInObject(set, typeTemp);

				list.add(typeTemp);

			}
			System.out.println("Get all succes in table " + ParticiapntTypeEntry.TABLE_NAME);
			return list;

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}

	private void putDataInObject(ResultSet set, ParticipanType typeTemp) throws SQLException {
		
		typeTemp.setId(set.getInt(ParticiapntTypeEntry.COLUMN_ID));
		typeTemp.setName(set.getString(ParticiapntTypeEntry.COLUMN_NAME));
	}

}
