package p01.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

/**
 * insert/update/delete executeUpdate();
 * executeUpdate() 메소드는 반영된 행(row)수를 리턴함.
 * */
public class JDBCInsert2 {
	public static void main(String[] args) {
		//Connection 객체 생성
		Connection conn = null;
		//Statement
		Statement stmt = null;
		//접속정보
		String url = "jdbc:mysql://localhost:3306/mydatabase01";
		String user = "user01";
		String password = "user01";
		
		Scanner sc = new Scanner(System.in);		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, user, password);
			//입력정보
			System.out.print("제목 입력>");
			String title = sc.nextLine();
			System.out.print("게시글 내용 입력>");
			String content = sc.nextLine();
			System.out.print("게시글 작성자 입력>");
			String writer = sc.nextLine();
			
			//쿼리문
			String sql 
				= "insert into board(title,content,writer)"
				+ "values('"+title+"','"+content+"','"+writer+"');";
			System.out.println(sql);
			
			stmt = conn.createStatement();
			int result 
				= stmt.executeUpdate(sql);//반영된 데이터의 행(row)수 리턴
			if(result > 0) {
				System.out.println("저장이 완료되었습니다.");
			} else {
				System.out.println("저장이 실패되었습니다.");
			}
			
			stmt.close();
			conn.close();
			sc.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
