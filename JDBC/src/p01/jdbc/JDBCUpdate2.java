package p01.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
/**
 * 글번만 입력받고 해당글번호의 readcount와 favor를 1씩 증가시킨 후 결과 출력
 * */
public class JDBCUpdate2 {
	public static void main(String[] args) {
		//Connection 객체
		Connection conn = null;
		//Statement 객체 (쿼리객체)
		Statement stmt = null;
		//ResultSet 객체
		ResultSet rs = null;
		//연결정보
		String url = "jdbc:mysql://localhost:3306/mydatabase01";
		String user = "user01";
		String password = "user01";
		int count =0, fcount =0, no=0;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, user, password);
			//입력
			Scanner sc = new Scanner(System.in);
			System.out.print("글번호>");
			no = sc.nextInt();
			//쿼리문
			String sql = "update board" + 
					"     set readcount = readcount+1," + 
					"	      favor = favor+1" + 
					"   where no="+no+";";
			//update
			stmt = conn.createStatement();
			int result = stmt.executeUpdate(sql); //입력된 행(row)수 리턴
			if(result > 0) {
				System.out.println("수정 완료");
				rs = stmt.executeQuery("select * from board where no="+no);
				if(rs.next())
					System.out.println(rs.getInt(1)+"|"+rs.getInt(5)+"|"+rs.getInt(7));
			} else
				System.out.println("수정 실패");
			rs.close();
			stmt.close();
			conn.close();
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}
}
