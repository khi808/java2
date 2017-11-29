package p01.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

/**
 * insert/update/delete executeUpdate();
 * executeUpdate() 메소드는 반영된 행(row)수를 리턴함.
 * */
public class JDBCInsert01 {
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
			System.out.print("상품코드 입력>");
			int id = sc.nextInt();
			System.out.print("상품명 입력>");
			String name = sc.next();
			System.out.print("가격 입력>");
			int price = sc.nextInt();
			System.out.print("분류 입력(1.식품 2.생활용품)>");
			int category = sc.nextInt();
			System.out.println("제조사코드 입력>");
			int makercd = sc.nextInt();
			//쿼리문
			String sql = "insert into goods(id,name,price,category,maker_makercd)" + 
					" values("+id+",'"+name+"',"+price+","+category+","+makercd+");";
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
