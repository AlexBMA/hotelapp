package db.dao;

import java.sql.Connection;
import java.util.List;

public interface ParticipantTypeDAO<E> extends DBOperations<E>{
	
	List<E> getAll(Connection conn);

}
