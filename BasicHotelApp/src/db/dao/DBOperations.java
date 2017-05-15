package db.dao;

import java.sql.Connection;

public interface DBOperations<E> {

	void insert(E item,Connection conn);
	E getItemById(Connection conn, int id);
	void updateItem(Connection conn,int id ,E item);
	void deleteItem(Connection conn,int id);
	
}
