package db.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import db.dao.HotelDAO;
import model.Hotel;

public class HotelDAOImpl  implements HotelDAO{
	
	private final  String TABLE_NAME = "hotels";
	
	@Override
	public void insert(Hotel item, Connection conn) {
		
		String sql="INSERT INTO "+TABLE_NAME+" (name,stars,list_room_id) VALUES (?,?,?);";
		try {
			PreparedStatement stmt = conn.prepareStatement(sql);
			setValuesForInsert(stmt,item);
			stmt.execute();
			
			System.out.println("INSERT SUCCESS in table "+TABLE_NAME);
			
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		
	}

	private void setValuesForInsert(PreparedStatement stmt, Hotel item) throws SQLException {
		stmt.setString(1, item.getName());
		stmt.setInt(2,item.getStars() );
		stmt.setString(3,item.getRoomListName());
		
	}

	@Override
	public Hotel getItemById(Connection conn, int id) {
		
		String sql ="SELECT * FROM "+TABLE_NAME+" WHERE id="+id+";";
		try {
			Statement stmt = conn.createStatement();

			ResultSet set = stmt.executeQuery(sql);
			if(set.next())
			{	Hotel temp = new Hotel();
				putDataInObject(set,temp);
				
				System.out.println("GET BY ID SUCCES in table "+TABLE_NAME);
				return temp;
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	private void putDataInObject(ResultSet set, Hotel temp) throws SQLException {
		
		temp.setId(set.getInt("id"));
		temp.setName(set.getString("name"));
		temp.setRoomListName(set.getString("list_room_id"));
		temp.setStars(set.getInt("stars"));
		
	}

	@Override
	public void updateItem(Connection conn, int id, Hotel item) {
		
	}

	@Override
	public void deleteItem(Connection conn, int id) {
		
		
		try {
			String sql="DELETE FROM "+TABLE_NAME+" WHERE id="+id+";";
			Statement stmt = conn.createStatement();
			stmt.execute(sql);
			System.out.println("DELETE SUCCES in table "+TABLE_NAME);
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}

	@Override
	public List<Hotel> getAllHotels(Connection conn) {
	
		try {
			
			List<Hotel> list = new ArrayList<>();
			String sql="SELECT * FROM "+TABLE_NAME+";";
			Statement stmt = conn.createStatement();
			ResultSet set = stmt.executeQuery(sql);
			while(set.next())
			{
				Hotel temp = new Hotel();
				putDataInObject(set, temp);
				list.add(temp);
			}
			System.out.println("GET ALL SUCCESS in table "+TABLE_NAME);
			
			return list;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return null;
	}

}
