package p02.callables;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Types;

import p01.connections.Connections;

public class CallableStatementExample3 {
	public static void main(String[] args) {
		ResultSet rs = null;
		String sql = "{call my_empProc(?,?,?)}"; // DB 내장함수 매개변수 세개짜리 프로시저 호출
		CallableStatement cstmt = null;
		Connection conn = null;
		try {
			// 연결
			conn = Connections.getInstance().getConnections();
			// 작업
			if(conn!=null) {
				cstmt = conn.prepareCall(sql); // 프로시저 객체 생성
				cstmt.setInt(1, 7788); // in 타입 변수 바인딩
				// 내장객체 호출후 값을 받기 위해서 registerOutParameter()로 세팅
				cstmt.registerOutParameter(1, Types.INTEGER);
				cstmt.registerOutParameter(2, Types.VARCHAR);
				cstmt.registerOutParameter(3, Types.INTEGER);
				cstmt.execute(); // 프로시저 실행
				System.out.println("no:"+cstmt.getInt(1)+
									" name:"+cstmt.getString(2)+
									" sal:"+cstmt.getInt(3));	
			}
			cstmt.close();
			conn.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}
}
