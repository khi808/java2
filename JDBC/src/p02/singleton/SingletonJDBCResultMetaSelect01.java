package p02.singleton;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

/**
 * MetaData = Data의 정보 (타입,길이 등의 정보)
 * */
public class SingletonJDBCResultMetaSelect01 {
	public static void main(String[] args) {
		//Connection객체
		Connection conn = null;
		//Statement
		Statement stmt = null;
		//ResultSet
		ResultSet rs = null;
		ResultSetMetaData rsmt = null;
		
		try {
			conn = Connections.getInstance().getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select * from goods;");
			rsmt = rs.getMetaData();
			for(int i=1;i<rsmt.getColumnCount();i++) {
				System.out.print(rsmt.getColumnName(i)+"\t");
			}
			System.out.println();
			while(rs.next()) {
				int i = 0;
				System.out.println(rs.getInt(++i)+"\t"+
								   rs.getString(++i)+"\t"+
								   rs.getInt(++i)+"\t");
					
					
				
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}
}
