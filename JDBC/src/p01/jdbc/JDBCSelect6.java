package p01.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCSelect6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Connection 객체 생성
		Connection conn;
		//Statement 객체 생성
		Statement stmt;
		//ResultSet 객체 생성
		ResultSet rs;
		System.out.print("제품명을 입력하세요>");
		String goodsname = sc.next();
		System.out.print("제조사를 입력하세요>");
		String maker = sc.next();
		//쿼리문
		String sql = "select goods.id id," + 
				"       goods.name goodsname," + 
				"       maker.name makername," + 
				"       goods.price price," + 
				"       qty qty" + 
				"  from goods," + 
				"       maker," + 
				"	   stock" + 
				" where goods.id = stock.goods_id" + 
				"   and goods.maker_makercd = maker.makercd" + 
				"   and goods.name='"+goodsname+"'" + 
				"   and maker.name='"+maker + 
				" ';";
		System.out.println(sql);		
				
		try {
			Class.forName("com.mysql.jdbc.Driver"); // 드라이버 로딩
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase01","user01","user01");
			//3단계
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				//getInt("칼럼명") => getInt(1),getString(2)
				int id = rs.getInt(1);
				String name = rs.getString(2);
				//String maker = rs.getString("makername");
				int price = rs.getInt(3);
				int category = rs.getInt(4);
				int maker_makercd = rs.getInt(5);
				//int qty = rs.getInt("qty");
				System.out.println(id+"|"+name+"|"+price+"|"+category+"|"+maker_makercd);
			}
			//4단계 자원 해제
			rs.close();
			stmt.close();
			conn.close();
		} catch (ClassNotFoundException cnfe) {
			System.out.println("클래스를 찾을 수 없습니다.");
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		}
	}
}
