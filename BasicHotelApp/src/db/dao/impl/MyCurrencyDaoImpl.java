package db.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import db.AppTableNames.MyCurrencyEntry;
import db.dao.MyCurrencyDAO;
import model.MyCurrency;

public class MyCurrencyDaoImpl implements MyCurrencyDAO<MyCurrency> {

	@Override
	public void insert(MyCurrency item, Connection conn) {
		// TODO Auto-generated method stub

	}

	@Override
	public MyCurrency getItemById(Connection conn, int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateItem(Connection conn, int id, MyCurrency item) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteItem(Connection conn, int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<MyCurrency> getAll(Connection conn) {

		String sql = "SELECT * FROM " + MyCurrencyEntry.TABLE_NAME + ";";
		try {
			Statement stmt = conn.createStatement();

			List<MyCurrency> list = new ArrayList<>();
			ResultSet set = stmt.executeQuery(sql);
			while (set.next()) {
				MyCurrency tempC = new MyCurrency();
				putDataInObject(set, tempC);
				list.add(tempC);
			}
			System.out.println("Get all succes in table "+MyCurrencyEntry.TABLE_NAME);
			return list;

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}

	private void putDataInObject(ResultSet set, MyCurrency tempC) throws SQLException {

		tempC.setId(set.getInt(MyCurrencyEntry.COLUMN_ID));
		tempC.setName(set.getString(MyCurrencyEntry.COLUMN_NAME));
	}

}
