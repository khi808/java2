package p02.callables;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.Scanner;

import oracle.jdbc.internal.OracleTypes;
import p01.connections.Connections;

public class CallableStatementExample5 {
	public static void main(String[] args) {
		Connection conn = null;
		ResultSet rs = null;
		CallableStatement cstmt = null;
		String sql = "{call emp_info_proc(?,?)}";
		try {
			conn = Connections.getInstance().getConnections();
			if(conn != null) {
				cstmt = conn.prepareCall(sql); // 프로시저 객체 생성
				Scanner sc = new Scanner(System.in);
				System.out.print("부서번호 입력>");
				int deptno = sc.nextInt();
				cstmt.setInt(1, deptno);
				cstmt.registerOutParameter(2, OracleTypes.CURSOR);
				cstmt.execute(); // 프로시저 실행
				rs = (ResultSet)cstmt.getObject(2);
				System.out.println("사원번호/사원명/업무/급여/급여등급");
				while(rs.next()) {
					System.out.println(rs.getInt(1)+"/"+rs.getString(2)+"/"
									+rs.getString(3)+"/"+rs.getFloat(4)+"/"+rs.getInt(5));
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
