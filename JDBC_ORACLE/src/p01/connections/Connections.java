package p01.connections;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

/**
 * singleton
 * 하나의 객체를 만들어서 사용 후 반납하는 형태
 * 필드와 생성자를 private로 만들고
 * getInstance() 메소드로 호출하여 사용
 * 
 * */
public class Connections {
	//필드
	private static Connections instance;
	//생성자
	private Connections() {
	}
	//메소드
	public static Connections getInstance() {
		if(instance == null) instance = new Connections();
		return instance;
	}
	// connection 객체를 반환하는 메소드
	public static Connection getConnections() {
		//Connection 객체
		Connection conn = null;
		// Properties
		Properties prop = new Properties();
		String path = Connections.class.getResource("database.properties").getPath();
		
		try {
			prop.load(new FileReader(path));
			String driver = prop.getProperty("driver");
			String url = prop.getProperty("url");
			String user = prop.getProperty("user");
			String password = prop.getProperty("password");
			// 1. 드라이버 로딩
			Class.forName(driver);
			// 2. 연결
			conn = DriverManager.getConnection(url, user, password);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return conn;
	}
}
