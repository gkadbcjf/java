package com.kh.myPoject;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class LibraryDao {
	
	private Properties prop =new Properties();
	
	public LibraryDao() {
		try {
			prop.loadFromXML(new FileInputStream("resources/query.xml"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public int rentBook(Connection conn, String bookname) {
		
		
		PreparedStatement pstmt = null;
		int result = 0;

		String sql = prop.getProperty("rentBook");

		try {

			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, bookname);
			result = pstmt.executeUpdate();
			pstmt.close();
			

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(pstmt);
		}
		return result;
	}

	
	public int returnBook(Connection conn,Book m) {
		int result = 0;
		PreparedStatement pstmt = null;
		String sql =prop.getProperty("returnBook");

		try {
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, m.getBooknum());
			pstmt.setString(2, m.getTitle());
			pstmt.setString(3, m.getAuthor());
			pstmt.setString(4, m.getGenre());

			result = pstmt.executeUpdate();

		}  catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(pstmt);
		}
		return result;
	}
}
