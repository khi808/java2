package p02.prepare;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class JDBCPrepareDelete01 {
	public static void main(String[] args) {
		//Connection
		Connection conn = null;
		//PrepareStatement
		PreparedStatement pstmt = null;
		
		//쿼리문
		String sql = "delete from board where no=?;";
		//연결정보
		String url = "jdbc:mysql://localhost:3306/mydatabase01";
		String user = "user01";
		String password = "user01";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, user, password);
			pstmt = conn.prepareStatement(sql);
			Scanner sc = new Scanner(System.in);
			System.out.println("삭제할 글 번호>");
			int no = sc.nextInt();
			System.out.println("정말 삭제하시겠습니까?");
			if(sc.next().charAt(0)=='y'||sc.next().charAt(0)=='Y') {
				pstmt.setInt(1, no);
				int result = pstmt.executeUpdate();
				if(result > 0)
					System.out.println("삭제 성공");
				else
					System.out.println("삭제 실패");
			} else
				System.out.println("삭제하지 않았습니다.");
			sc.close();
			pstmt.close();
			conn.close();
			
		} catch (Exception e) {
			
		}
		
	}
}
