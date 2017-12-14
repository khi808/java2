package p02.callables;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;

import p01.connections.Connections;
/**
 * db내의 내장객체(procedure, function, cursor)등을
 * 호출하여 작업
 * CallableStatement 객체 사용
 * 쿼리문 {call 객체명(아규먼트1, 아규먼트2,...)}
 * */
public class CallableStatementExample1 {
	public static void main(String[] args) {
		Connection conn = null;
		ResultSet rs = null;
		String sql = "{call adjust01(?,?)}"; // 내장객체 호출 쿼리문
		CallableStatement cstmt = null; // 내장함수를 호출하는 쿼리객체
		try {
			// 2. 연결
			conn = Connections.getInstance().getConnections();
			if(conn!=null) {
				cstmt = conn.prepareCall(sql);
				cstmt.setInt(1, 7369); // 첫번째 변수 바인딩
				cstmt.setFloat(2, 0.05f); // 두번째 변수 바인딩
				cstmt.executeUpdate(); // 업데이트 실행
				System.out.println("update 완료!");
			}
			cstmt.close();
			conn.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}
}
