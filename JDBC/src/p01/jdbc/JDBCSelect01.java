package p01.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCSelect01 {
	public static void main(String[] args) {
		//Connection 객체 생성
		Connection conn = null;
		String url = "jdbc:mysql://localhost:3306/mydatabase01";
		String user ="user01";
		String password = "user01";
		String sql = "select * from goods";
		//쿼리 전송 객체
		Statement stmt;
		//쿼리 결과 객체
		ResultSet rs;
		try {
			//1단계 - 드라이버 로딩
			Class.forName("com.mysql.jdbc.Driver");
			//2단계 - DB연결
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("DB를 연결했습니다.");
			//3단계 - 작업
			// 1. statement객체 생성
			stmt = conn.createStatement();
			// 2. statement문 실행 및 결과 얻기
			rs = stmt.executeQuery("select * from goods");
			// rs = stmt.executeQuery(sql);
			// 3. 쿼리결과 다음 객체에서 자료 추출
			while(rs.next()) {// 다음 자료가 있는지 확인
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int price = rs.getInt("price");
				int category = rs.getInt("category");
				int makercd = rs.getInt("maker_makercd");
				System.out.println("|"+id+"|"+name+"|"+price+"|"+category+"|"+makercd+"|");
			}
			System.out.println("|_________________________________|");
			//4단계 - 종료(생성된 역순으로 객체를 해제함)
			rs.close();
			stmt.close();
			conn.close();
			System.out.println("DB를 종료했습니다.");
		} catch (ClassNotFoundException cnfe) {
			System.out.println("클래스를 찾을 수 없습니다.");
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		}
	}
}
