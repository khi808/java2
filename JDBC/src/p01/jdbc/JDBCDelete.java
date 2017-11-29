package p01.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCDelete {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Connection 객체
		Connection conn = null;
		//Statement
		Statement stmt = null;
		//ResultSet
		ResultSet rs = null;
		//쿼리문
		int no = 0;
		String sql = "";
		int result = 0;
		//연결정보
		String url = "jdbc:mysql://localhost:3306/mydatabase01";
		String user = "user01";
		String password = "user01";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url,user,password);
			stmt = conn.createStatement();
			System.out.print("삭제할 글번호>");
			no = sc.nextInt();
			System.out.print("정말로 삭제하시겠습니까?");
			if(sc.next().charAt(0)=='y'||sc.next().charAt(0)=='Y') {
				sql = "delete from board where no="+no+";";
				result = stmt.executeUpdate(sql);
			}
			if(result > 0) {
				System.out.println("삭제 성공!");
				rs = stmt.executeQuery("select * from board;");//전체 select
				while(rs.next()) {
					System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(4));
				}
			} else 
				System.out.println("삭제 실패");
			
			rs.close();
			stmt.close();
			conn.close();
			sc.close();
			
			
		} catch (Exception e) {
			
		}
	}
}
