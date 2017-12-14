package p02.callables;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;

import oracle.jdbc.OracleTypes;
import p01.connections.Connections;
/**
 * DB의 내장객체를 호출하는 인터페이스 CallableStatement
 * */
public class CallableStatementExample2 {
	public static void main(String[] args) {
		String sql = "begin ?:= cur_listEmp; end;"; // 내장함수의 호출
		CallableStatement cstmt = null;
		ResultSet rs = null;
		try {
			// 1. 연결
			Connection conn = Connections.getInstance().getConnections();
			if(conn!=null) {
				cstmt = conn.prepareCall(sql);
				cstmt.registerOutParameter(1, OracleTypes.CURSOR);
				cstmt.execute(); // 내장객체 실행
				// function(cur_listEmp)내의 객체(cursor) 하나.
				rs = (ResultSet)cstmt.getObject(1);
				while(rs.next()) {
					System.out.println(rs.getString(1)+"\t"+rs.getInt(2));
				}
			}
			//자원 해제
			rs.close();
			cstmt.close();
			conn.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
