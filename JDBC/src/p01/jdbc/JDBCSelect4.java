package p01.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCSelect4 {
	public static void main(String[] args) {
		//Connection 객체 생성
		Connection conn;
		//Statement 객체 생성
		Statement stmt;
		//ResultSet 객체 생성
		ResultSet rs;
		String goodsname = "새우깡";
		//쿼리문
		String sql = "select goods.id id,"
				+"		goods.name goodsname,"
				+"		maker.name makername,"
				+"		goods.price price,"
				+"		qty qty"
				+"		from goods,"
				+"			 maker,"
				+"			 stock"
				+"		where goods.id = stock.goods_id"
				+"		and goods.maker_makercd = maker.makercd"
				+"		and goods.name ='"+goodsname+"';";
		try {
			Class.forName("com.mysql.jdbc.Driver"); // 드라이버 로딩
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase01","user01","user01");
			//3단계
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("goodsname");
				String maker = rs.getString("makername");
				int price = rs.getInt("price");
				int qty = rs.getInt("qty");
				System.out.println(id+" "+name+" "+maker+" "+price+" "+qty);
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
