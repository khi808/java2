package p01.connections;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * insert문 executeUpdate();
 */
// Ctrl + shift + F -> 정렬
public class InsertExample3 {
	public static void main(String[] args) {
		String sql = "insert into emp values(emp_seq2.nextval,?,?,?,sysdate,?,?,?)";
		ResultSet rs;
		// 1. 연결
		Connection conn = Connections.getInstance().getConnections();
		// 2. 쿼리객체
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql); //
			// insert문도 같은 connection
			// 3. 작업
			// 바인딩 작업
			pstmt.setString(1, "임걱쩡");
			pstmt.setString(2, "CLERK");
			pstmt.setInt(3, 7782);
			pstmt.setInt(4, 1200);
			pstmt.setInt(5, 500);
			pstmt.setInt(6, 10);
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
