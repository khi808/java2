package p02.singleton;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

/**
 * 하나의 객체를 공유하여 사용,
 * 데이터 접속의 일관성 유지
 * Connection conn1 = DriverManager.getConnection();
 * Connection conn2 = DriverManager.getConnection();
 * Singleton - 객체 하나를 여럿이 공유하여 사용
 * */
public class Connections {
	//필드 - private static 자신타입 필드명;
	private static Connections instance;
	//생성자 - private 생성자
	private Connections() {}
	//메소드 - public static 자신타입 getInstance() {}
	public static Connections getInstance() {
		if(instance==null) instance=new Connections();
		return instance;
	}
	
	public Connection getConnection() {
		//프로퍼티 객체 생성
		Properties prop = new Properties();
		//Connection 객체
		Connection conn = null;
		//PrepareStatement
		PreparedStatement pstmt = null;
		//ResultSet
		ResultSet rs = null;
		// 파일의 절대 경로
		String path = "C:/javaworkspace/JDBC/src/ConnectionInfo.properties";
		try {
			prop.load(new FileReader(path));
			
			String driver = prop.getProperty("driver");
			String url = prop.getProperty("url");
			String user = prop.getProperty("user");
			String password = prop.getProperty("password");
			
			Class.forName(driver);
			conn = DriverManager.getConnection(url,user,password);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return conn;
	}
}
