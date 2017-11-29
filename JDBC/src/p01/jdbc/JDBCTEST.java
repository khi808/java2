package p01.jdbc;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;
/**
 * url,user,password <- 프로퍼티 파일로 따로 받아서 사용하기
 * */
public class JDBCTEST {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//파일 객체 생성
		File f = new File("C:/javaworkspace/JDBC/src/p01/jdbc/ConnectionInfo.properties");
		//프로퍼티 객체 생성
		Properties prop = new Properties();
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
		try {
			//프로퍼티 읽어오기
			InputStream is = new FileInputStream(f);
			prop.load(is);
			is.close();

			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(prop.getProperty("url"),prop.getProperty("user"),prop.getProperty("password"));
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
			System.out.println(e.getMessage());
		}
	}
}
