package db.dao;

import java.sql.Connection;
import java.util.List;

public interface ServiceOptionDAO<E>  extends DBOperations<E> {
	
	 int insertAndGetId(Connection conn,E item);
	 
	 List<E> getAll(Connection conn);

}
