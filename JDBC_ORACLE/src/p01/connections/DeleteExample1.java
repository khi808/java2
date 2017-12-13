package p01.connections;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteExample1 {
	public static void main(String[] args) {
		// 쿼리문 작성
		String sql = "delete emp where empno > ?";
		// 1. 연결
		Connection conn = Connections.getInstance().getConnections();
		// 2. 쿼리 객체 생성
		PreparedStatement pstmt;
		// 3. 작업
		try {
			pstmt = conn.prepareStatement(sql);
			int dno = getParameters();
			pstmt.setInt(1, dno);
			boolean ys = getYesNo(dno);
			if(ys==true) {
				int result = pstmt.executeUpdate();
				if(result>0)
					System.out.println("삭제 성공!");
				else
					System.out.println("삭제 실패!");
			}
			// 4. 자원 해제
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
	}
	private static boolean getYesNo(int dno) {
		System.out.println("삭제할 사원번호는 "+dno+"부터 입니다.");
		System.out.println("정말 삭제하시겠습니까?>");
		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);
		if(c == 'y' || c == 'Y')
			return true;
		else
			return false;
	}
	private static int getParameters() {
		Scanner sc = new Scanner(System.in);
		System.out.println("삭제할 사원번호를 입력하세요>");
		return sc.nextInt();
	}
}
