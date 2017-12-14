package p02.callables;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
/**
 * 하나의 프로그램에서도
 * connection이 다르면 transaction을 별개로 작동
 * */
public class TransactionExample2 {
	public void insertTest1() {
		Connection con=null;
		PreparedStatement pstmt = null;
		boolean success = false;
		try {
			con 
			= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","hr","hr");
			String sql = "create table test2(id varchar2(10))";
			
			pstmt = con.prepareStatement(sql);
			pstmt.executeUpdate();
			
			sql = "create table test3(id varchar2(10))";
			pstmt = con.prepareStatement(sql);
			pstmt.executeUpdate();
			con.setAutoCommit(false); //자동 저장 기능 끄기
			
			sql = "insert into test2 values('sh1011')";
			pstmt = con.prepareStatement(sql);
			pstmt.executeUpdate();
			insertOrders(con);//입력메소드 호출
			success = true;
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				if(success)con.commit();
				else con.rollback();
				if(pstmt!=null) pstmt.close();
				if(con!=null) con.close();
			}catch(Exception e) {}
		}
				
		
	}
	//입력 메소드
	private static void insertOrders(Connection con1){
		Connection con= null;
		PreparedStatement pstmt = null;
		try {
			 con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
			 String sql = "insert into test3 values('sh1011'";//insert 오류발생
			 pstmt = con.prepareStatement(sql);
			 pstmt.executeUpdate();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				if(pstmt!=null) pstmt.close();
				if(con!=null) con.close();
			}catch(Exception e) {}
		}
	}
	
	public static void main(String[] args) {
			new TransactionExample2().insertTest1();
	}
}
