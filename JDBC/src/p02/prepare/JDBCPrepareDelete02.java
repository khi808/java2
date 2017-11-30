package p02.prepare;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;
import java.util.Scanner;

public class JDBCPrepareDelete02 {
	public static void main(String[] args) {
		File f = new File("C:/javaworkspace/JDBC/src/ConnectionInfo.properties");
		//프로퍼티 객체 생성
		Properties prop = new Properties();
		//Connection 객체
		Connection conn = null;
		//PrepareStatement
		PreparedStatement pstmt = null;
		//쿼리문
		String sql = "update member set flag='n' where no=?;";
		
		try {
			InputStream is = new FileInputStream(f);
			prop.load(is);
			is.close();
			
			String driver = prop.getProperty("driver");
			String url = prop.getProperty("url");
			String user = prop.getProperty("user");
			String password = prop.getProperty("password");
			//1단계 드라이버 로딩
			Class.forName(driver);
			//2단계 데이터 베이스 연결
			conn = DriverManager.getConnection(url, user, password);
			pstmt = conn.prepareStatement(sql); //쿼리 객체 생성
			//3단계 작업
			Scanner sc = new Scanner(System.in);
			System.out.println("탈퇴회원번호 입력>");
			int no = sc.nextInt();
			System.out.println("정말 탈퇴하시겠습니까?");
			if(sc.next().charAt(0)=='y'||sc.next().charAt(0)=='Y') {
				pstmt.setInt(1, no);
				int result = pstmt.executeUpdate(); // 작업한 행수 반환
				if(result > 0) {
					System.out.println("탈퇴 완료!");
				} else {
					System.out.println("탈퇴 오류");
				}
			} else
				System.out.println("탈퇴를 취소했습니다.");
			//4단계 종료
			pstmt.close();
			sc.close();
			conn.close();
			
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
