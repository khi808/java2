package p02.prepare;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class JDBCPrepareSelect01 {
	public static void main(String[] args) {
		//Connection 객체
		Connection conn = null;
		//PrepareStatement 객체
		PreparedStatement pstmt = null;
		//Statement stmt = null;
		//ResultSet
		ResultSet rs = null;
		//연결정보
		String url = "jdbc:mysql://localhost:3306/mydatabase01";
		String user = "user01";
		String password = "user01";
		//쿼리문
		//바인딩되는 변수의 개수만큼 ? 를 표시함.
		//바인딩순서는 ? 순서
		String sql = "select * from goods where id=?";
		try {
			//1단계
			Class.forName("com.mysql.jdbc.Driver");
			//2단계
			conn = DriverManager.getConnection(url, user, password);
			//3단계 - 작업
			pstmt = conn.prepareStatement(sql); //접속시에 쿼리문을 미리 만듬
			// stmt = conn.createStatement(); //쿼리문을 담을 객체만 만듬
			Scanner sc = new Scanner(System.in);
			System.out.println("조회할 상품번호를 입력하세요>");
			int id = sc.nextInt();
			pstmt.setInt(1, id);
			rs = pstmt.executeQuery();//실행시는 만들어진 (실제 변수값이 바인딩된)
			// rs = stmt.executeQuery(sql); //실행시 완성된 만들어진 쿼리를 실행
			while(rs.next()) {
				id = rs.getInt(1);
				String name = rs.getString(2);
				int price = rs.getInt(3);
				System.out.println("상품코드:"+id+"상품명:"+name+"가격:"+price);
			}
			//4단계
			rs.close();
			sc.close();
			pstmt.close();
			conn.close();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}