package com.kh.myPoject;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;


public class LMemberDao {
	
	private Properties prop =new Properties();
	
	public LMemberDao() {
		try {
			prop.loadFromXML(new FileInputStream("resources/query.xml"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public int insertMember(Connection conn, String id, Member m) { //DB LMEMBER테이블에 회원추가
		int result = 0;
		PreparedStatement pstmt = null;
		String sql =prop.getProperty("insertMember");

		try {

			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, m.getName());
			pstmt.setString(2, id);
			pstmt.setString(3, m.getPassword());
			result = pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(pstmt);
		}
		return result;
	}
	
	public int changePassword(Connection conn,String id,String newPw) { //DB LMEMBER에 있는 
		int result = 0;
		PreparedStatement pstmt = null;
		String sql =prop.getProperty("changePassword");
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, newPw);
			pstmt.setString(2, id);
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCTemplate.close(pstmt);
		}
		
		return result;
	}
	
	
	public int changeName(Connection conn,String id,String newName) {
		int result = 0;
		PreparedStatement pstmt = null;
		String sql =prop.getProperty("changeName");
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, newName);
			pstmt.setString(2, id);
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCTemplate.close(pstmt);
		}
		
		return result;
	}
}
