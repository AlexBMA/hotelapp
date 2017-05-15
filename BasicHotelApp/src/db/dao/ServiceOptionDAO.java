package db.dao;

import java.sql.Connection;

public interface ServiceOptionDAO<E>  extends DBOperations<E> {
	
	 int insertAndGetId(Connection conn,E item);

}
