package p01.connections;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;
/**
 * JDBC를 이용한 DB작업
 * 1. DRIVER 로딩
 * 2. CONNECTION
 * 3. 작업
 * 4. 자원해제
 * */
// emp테이블의 사번, 사원명, 급여, 입사일자, 부서명
// 부서번호가 10번인 부서의 사원들 중 급여가 5000이상인 사원
// scanner로 입력받아서 출력
public class SelectExample1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// connection 객체
		Connection conn = null;
		// 쿼리객체
		PreparedStatement pstmt = null; // preparestatement 바인딩 ?
		// 결과 set 객체
		ResultSet rs = null;
		//
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String user = "hr";
		String password = "hr";
		// 쿼리문
		String sql = "select empno, ename, sal, hiredate, dname"
				+ "		from emp, dept"
				+ "		where emp.deptno = dept.deptno"
				+ "		and emp.deptno = ?"
				+ "		and sal >= ?"; // 바인딩변수 ?(index = 1부터 증가)
		
		try {
			// 1. Dirver 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 2. 연결
			conn = DriverManager.getConnection(url, user, password);
			// 3. 작업
			pstmt = conn.prepareStatement(sql);
			// 바인딩변수에 값 지정
			System.out.print("부서번호(10,20,30,40)>");
			int deptno = sc.nextInt();
			pstmt.setInt(1, deptno);
			System.out.print("급여 설정(~이상)>");
			int sal2 = sc.nextInt();
			pstmt.setInt(2, sal2);
			rs = pstmt.executeQuery();
			System.out.println("사번  |사원명  |급여 |입사일자  |부서명");
			while(rs.next()) {
				int no = rs.getInt(1);
				String name = rs.getString(2);
				double sal = rs.getDouble(3);
				Date hiredate = rs.getDate(4);
				String dname = rs.getString(5);
				System.out.println(no+"|"+name+"|"+sal+"|"+hiredate+"|"+dname);
			}
			// 4. 종료
			rs.close();
			pstmt.close();
			conn.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
