package p02.callables;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;

import oracle.jdbc.internal.OracleTypes;
import p01.connections.Connections;

public class CallableStatementExample4 {
	public static void main(String[] args) {
		ResultSet rs = null;
		Connection conn = null;
		CallableStatement cstmt = null;
		String sql = "{call dept_proc01(?)}"; // 프로시저 호출
		try {
			// 연결
			conn = Connections.getInstance().getConnections();
			if(conn!=null) {
				cstmt = conn.prepareCall(sql);
				cstmt.registerOutParameter(1, OracleTypes.CURSOR);
				cstmt.execute(); // 프로시저 실행
				rs = (ResultSet)cstmt.getObject(1); // Object -> ResultSet
				System.out.println("부서번호\t부서명\t사원번호\t사원명");
				System.out.println("-----------------------------");
				while(rs.next()) {
					System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3)+"\t"+rs.getString(4));
				}
			}
			
			// 자원 해제
			rs.close();
			cstmt.close();
			conn.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
