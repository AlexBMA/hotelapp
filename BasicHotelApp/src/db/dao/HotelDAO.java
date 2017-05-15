package db.dao;

import java.sql.Connection;
import java.util.List;

import model.Hotel;

public interface HotelDAO extends DBOperations<Hotel>{

	List<Hotel> getAllHotels(Connection conn);
	
}
