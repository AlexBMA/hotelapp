package db.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import db.AppTableNames.ServiceOptionEntry;
import db.dao.ServiceOptionDAO;
import model.ServiceOption;

public class ServiceOptionDAOImpl implements ServiceOptionDAO<ServiceOption> {

	@Override
	public void insert(ServiceOption item, Connection conn) {
		String sql = "INSERT INTO " + " () VALUES ()";

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

		String sql = "SELECT * FROM " + ServiceOptionEntry.TABLE_NAME + " WHERE id= " + id + ";";

		try {
			Statement stmt = conn.createStatement();
			ResultSet set = stmt.executeQuery(sql);

			if (set.next()) {
				ServiceOption temp = new ServiceOption();
				putDataInObject(set, temp);

				System.out.println("get by id success in table " + ServiceOptionEntry.TABLE_NAME);
				return temp;

			}

		} catch (SQLException e) {

			e.printStackTrace();
		}

		return null;
	}

	@Override
	public void updateItem(Connection conn, int id, ServiceOption item) {

		String sql = "UPDATE  " + ServiceOptionEntry.TABLE_NAME + " SET " + ServiceOptionEntry.COLUMN_NAME + "=?,"
				+ ServiceOptionEntry.COLUMN_POSITION+" =? WHERE id=" + id + ";";
		
		try {
			PreparedStatement stmt = conn.prepareStatement(sql);
			setValuesForInsert(stmt, item);
			stmt.executeUpdate(sql);
			
			System.out.println("Update succes  in table "+ServiceOptionEntry.TABLE_NAME);
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}

	

	@Override
	public void deleteItem(Connection conn, int id) {

	}

	@Override
	public int insertAndGetId(Connection conn, ServiceOption item) {

		String sql = "INSERT INTO " + ServiceOptionEntry.TABLE_NAME + " (" + ServiceOptionEntry.COLUMN_NAME + ","
				+ ServiceOptionEntry.COLUMN_POSITION + ") VALUES (?,?)";

		try {
			PreparedStatement stmt = conn.prepareStatement(sql);

			setValuesForInsert(stmt, item);
			stmt.executeUpdate();

			Statement stmt2 = conn.createStatement();
			sql = "SELECT * FROM " + ServiceOptionEntry.TABLE_NAME + " ORDER BY  " + ServiceOptionEntry.COLUMN_ID
					+ "  DESC limit 1";

			ResultSet set = stmt2.executeQuery(sql);
			if (set.next()) {
				ServiceOption temp = new ServiceOption();
				putDataInObject(set, temp);

				System.out.println("INS and get ID success in table " + ServiceOptionEntry.TABLE_NAME);
				return temp.getId();

			}

		} catch (SQLException e) {

			e.printStackTrace();
		}

		return 0;
	}

	private void setValuesForInsert(PreparedStatement stmt, ServiceOption item) throws SQLException {

		stmt.setString(1, item.getName());
		stmt.setInt(2, item.getPosition());

	}

	@Override
	public List<ServiceOption> getAll(Connection conn) {

		String sql = "SELECT * FROM " + ServiceOptionEntry.TABLE_NAME + " ;";

		try {
			Statement stmt = conn.createStatement();
			ResultSet set = stmt.executeQuery(sql);
			List<ServiceOption> list = new ArrayList<>();
			while (set.next()) {
				ServiceOption temp = new ServiceOption();
				putDataInObject(set, temp);

				list.add(temp);
			}

			System.out.println("get all success in table " + ServiceOptionEntry.TABLE_NAME);
			return list;
		} catch (SQLException e) {

			e.printStackTrace();
		}

		return null;
	}

	private void putDataInObject(ResultSet set, ServiceOption temp) throws SQLException {

		temp.setId(set.getInt(ServiceOptionEntry.COLUMN_ID));
		temp.setName(set.getString(ServiceOptionEntry.COLUMN_NAME));
		temp.setPosition(set.getInt(ServiceOptionEntry.COLUMN_POSITION));

	}

}
