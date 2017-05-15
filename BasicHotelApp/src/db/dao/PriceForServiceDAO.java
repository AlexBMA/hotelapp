package db.dao;

import java.sql.Connection;

public interface PriceForServiceDAO<E> extends DBOperations<E>{

	
	int insertAndGetId(Connection conn,E item);
}
