package p02.prepare;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class JDBCPrepareUpdate2 {
	public static void main(String[] args) {
		//Connection 
		Connection conn = null;
		//PrepareStatement
		PreparedStatement pstmt = null;
		//ResultSet
		ResultSet rs = null;
		//쿼리문
		String sql = "update board set title=?, readcount=readcount+1, favor=favor+1 where no=?;";
		//연결정보
		String url = "jdbc:mysql://localhost:3306/mydatabase01";
		String user = "user01";
		String password = "user01";
		try {
			//1단계
			Class.forName("com.mysql.jdbc.Driver");
			//2단계
			conn = DriverManager.getConnection(url, user, password);
			//3단계
			pstmt = conn.prepareStatement(sql);
			Scanner sc = new Scanner(System.in);
			System.out.println("|수정 값 입력|");
			System.out.print("수정할 글번호?>");
			int no = sc.nextInt();
			System.out.print("수정할 제목?>");
			String title = sc.next();
			
			pstmt.setString(1, title);
			pstmt.setInt(2, no);
			
			int result = pstmt.executeUpdate();
			if(result > 0) {
				System.out.println("수정 성공");
			} else {
				System.out.println("수정 실패");
			}
			
			//4단계 종료
			sc.close();
			pstmt.close();
			conn.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
