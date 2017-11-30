package p02.prepare;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

/**
 * PreperStatement문은 바인딩 변수를 미리 만들어서
 * 실행시 바인딩된 실제값으로 된 쿼리문을 실행함.
 * 
 * */
public class JDBCPrepareInsert01 {
	public static void main(String[] args) {
		//Connection 객체
		Connection conn = null;
		//PrepareStatement문
		PreparedStatement pstmt = null;
		//ResultSet
		ResultSet rs = null;
		//쿼리문
		String sql = "insert into goods(id,name,price,category,maker_makercd)"
				+ " values(?,?,?,?,?);";
		/* String sql2 = "insert into goods(id,name,price,category,maker_makercd)" + 
				"		values("+id+",'"+name+"',"+price+","+category+","+maker_makercd+");"; */
		//연결정보
		String url = "jdbc:mysql://localhost:3306/mydatabase01";
		String user = "user01";
		String password = "user01";
		try {
			//1단계 드라이버 로딩
			Class.forName("com.mysql.jdbc.Driver");
			//2단계 연결
			conn = DriverManager.getConnection(url, user, password);
			//3단계 작업
			pstmt = conn.prepareStatement(sql); //쿼리문장 틀이 생성됨.
			//stmt = conn.createStatement(); //쿼리문없이 쿼리저장객체만 생성
			Scanner sc = new Scanner(System.in);
			System.out.println("상품 추가 값 입력");
			System.out.print("상품번호 입력>");
			int id = sc.nextInt();
			System.out.print("상품명 입력>");
			String name = sc.next();
			System.out.print("상품가격 입력>");
			int price = sc.nextInt();
			System.out.print("상품분류 입력>(1.식품 2.생활용품)");
			int category = sc.nextInt();
			System.out.print("제조사코드 입력>");
			int makercd = sc.nextInt();
			
			pstmt.setInt(1, id);
			pstmt.setString(2, name);
			pstmt.setInt(3, price);
			pstmt.setInt(4, category);
			pstmt.setInt(5, makercd);
			
			int result = pstmt.executeUpdate(); //실행한 행(row)수 리턴
			System.out.println("입력된 행(row)의 수="+result);
			//pstmt.executeUpdate(sql);//쿼리문을 넣어서 실행
			if(result > 0) {
				System.out.println("수정 성공");
			} else {
				System.out.println("수정 실패");
			}
			//4단계 종료
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
