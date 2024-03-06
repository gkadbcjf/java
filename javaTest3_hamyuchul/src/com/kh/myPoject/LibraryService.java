package com.kh.myPoject;

import java.sql.Connection;

public class LibraryService {
	public int rentBook(String bookname) {
		Connection conn = JDBCTemplate.getConnection();
		int result =new LibraryDao().rentBook(conn,bookname);
		
		if(result>0)
			JDBCTemplate.commit(conn);
		else
			JDBCTemplate.rollback(conn);
		JDBCTemplate.close(conn);
		return result;
	}
	
	public int returnBook(Book b) {
		Connection conn = JDBCTemplate.getConnection();
		int result =new LibraryDao().returnBook(conn,b);
		if(result>0)
			JDBCTemplate.commit(conn);
		else
			JDBCTemplate.rollback(conn);
		JDBCTemplate.close(conn);
		return result;
	}
}
