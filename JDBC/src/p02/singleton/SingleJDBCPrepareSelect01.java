package p02.singleton;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SingleJDBCPrepareSelect01 {
	public static void main(String[] args) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Connection conn = null;
		String sql = "";
		try {
			//1,2단계
			conn = Connections.getInstance().getConnection();
			//3단계
			pstmt = conn.prepareStatement("select no,name from member where flag<>'n'");
			rs = pstmt.executeQuery();
			while(rs.next()) {
				int no = rs.getInt(1);
				String name = rs.getString(2);
				System.out.println("회원번호:"+no+"회원명:"+name);
			}
			//4단계
			rs.close();
			pstmt.close();
			conn.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
