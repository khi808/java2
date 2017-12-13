package p02.callables;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import p01.connections.Connections;

/**
 * autocommit 옵션을 false하여 자동 저장을
 * 못하게 한 후 입력/수정 처리가 모두 정상으로 끝나면 commit;
 * 입력/수정 처리가 하나라도 이상이있으면 rollback;
 * */
public class TransactionExample1 {
	public static void main(String[] args) {
		// 1. 연결
		Connection conn = Connections.getInstance().getConnections();
		// 2. 쿼리문생성
		PreparedStatement pstmt = null;
		boolean success = false;
		try {
			String sql 
				= "create table test1(id varchar(10), password varchar(10))";
			// 3. transaction작업
			pstmt = conn.prepareStatement(sql);
			pstmt.executeQuery();
			// 자동저장 기능 끄기
			conn.setAutoCommit(false);
			
			sql = "insert into test1 values('sh1011','1111')";
			pstmt = conn.prepareStatement(sql);
			pstmt.executeUpdate();
			
			sql = "insert into test1 values('sh2011','2222')";
			pstmt = conn.prepareStatement(sql);
			pstmt.executeUpdate();
			
			sql = "insert into test1 values('sh2033','3333')"; // 비정상 쿼리문
			pstmt = conn.prepareStatement(sql);
			pstmt.executeUpdate();
			
			success = true;
			
		// 4. 자원 해제
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				if(success) conn.commit();
				else
					conn.rollback();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {
				
			}
		}

		
	}
}
