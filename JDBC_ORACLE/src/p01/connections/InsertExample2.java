package p01.connections;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * insert문 executeUpdate();
 */
// Ctrl + shift + F -> 정렬
public class InsertExample2 {
	public static void main(String[] args) {
		String sql = "insert into emp values(?,?,?,?,sysdate,?,?,?)";
		String sql2 = "select max(empno)+1 from emp";
		ResultSet rs;
		// 1. 연결
		Connection conn = Connections.getInstance().getConnections();
		// 2. 쿼리객체
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql2); //
			rs = pstmt.executeQuery();
			int maxSeq = 0;
			if(rs.next())
				maxSeq = rs.getInt(1);
			// insert문도 같은 connection
			// 3. 작업
			// 바인딩 작업
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, maxSeq);
			pstmt.setString(2, "홍길둉");
			pstmt.setString(3, "CLERK");
			pstmt.setInt(4, 7782);
			pstmt.setInt(5, 1200);
			pstmt.setInt(6, 500);
			pstmt.setInt(7, 10);
			// insert 실행
			int result = pstmt.executeUpdate(); // insert 된 row수만큼 반환 1
			if(result>0) {
				System.out.println("입력 성공!");
			} else {
				System.out.println("입력 실패!");
			}
			// 4. 자원해제
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}
