package p01.jdbc;

import java.sql.Connection; //connection객체는 sql폴더에 있음
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBTest01 {
	public static void main(String[] args) {
		//연결객체 생성
		Connection conn = null;
		String url = "jdbc:mysql://localhost:3306/mydatabase01";
		String user = "user01";
		String password = "user01";
		try {
			Class.forName("com.mysql.jdbc.Driver");//1단계: 드라이버 로딩
			conn = DriverManager.getConnection(url, user, password);//2단계: DB연결
			System.out.println("DB에 접속했습니다.");//3단계: 작업
			conn.close();//4단계: 연결 해제
			System.out.println("접속을 종료합니다.");
		} catch (ClassNotFoundException enfe) {
			System.out.println("해당 클래스를 찾을 수 없습니다.");
		} catch (SQLException se) {
			System.out.println(se.getMessage()); //sql오류메세지
		}
		
		
	}
}
