package com.kh.myPoject;

import java.sql.Connection;


public class LMemberService {
	public int insertLMember(String id, Member m) {
		Connection conn = JDBCTemplate.getConnection();
		int result =new LMemberDao().insertMember(conn,id,m);
		if(result >0)
			JDBCTemplate.commit(conn);
		else
			JDBCTemplate.rollback(conn);
		JDBCTemplate.close(conn);
		return result;
	}
	
	public int changePassword(String id, String newPw) {
		Connection conn = JDBCTemplate.getConnection();
		int result = new LMemberDao().changePassword(conn,id,newPw);
		if(result >0)
			JDBCTemplate.commit(conn);
		else
			JDBCTemplate.rollback(conn);
		JDBCTemplate.close(conn);
		return result;
	}
	 
	 public int changeName(String id,String newName) {
		 Connection conn = JDBCTemplate.getConnection();
		 int result = new LMemberDao().changeName(conn,id,newName);
			if(result >0)
				JDBCTemplate.commit(conn);
			else
				JDBCTemplate.rollback(conn);
			JDBCTemplate.close(conn);
			return result;
	 }
}
