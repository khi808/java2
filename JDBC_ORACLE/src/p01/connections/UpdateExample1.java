package p01.connections;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * update
 * */
public class UpdateExample1 {
	public static void main(String[] args) {
		// 쿼리문
		String sql = "update emp set sal = sal+sal*0.05 where deptno = ?";
		// 1. 연결
		Connection conn = Connections.getInstance().getConnections();
		// 2. 쿼리객체 생성
		PreparedStatement pstmt;
		// 3. 작업
		try {
			pstmt = conn.prepareStatement(sql);
			// 바인딩 변수 ? 에 값 대입
			Scanner sc = new Scanner(System.in);
			System.out.print("수정할 부서번호>");
			int dno = sc.nextInt();
			pstmt.setInt(1, dno);
			int result = pstmt.executeUpdate(); // update된 행(row)의 수를 반환.
			System.out.println("수정한 건수 : "+result);
			if(result>0)
				System.out.println("수정 성공!");
			else
				System.out.println("수정 실패!");
			
			// 4. 자원 해제
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}
