package db.unmeblue21;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DBTest {

	public String select() {
		
		return "";
		
	}
	
	public int insert(String name, String phone, String addr) {
		
		// 접속정보
		String host = "database-1.caici47obx5g.ap-northeast-2.rds.amazonaws.com";
		String port = "3306";
		String sid = "mysql";
		String id = "admin";
		String pw = "";
		String driver = "com.mysql.cj.jdbc.Driver";
		
		// 실행할 쿼리(INSERT)
		String query = "INSERT INTO maindb.TEST_TABLE(NAME, PHONE, ADDR) VALUES('유재석', '01012345678', '한국')";
		
		int result = 0;
		
		try {
			Class.forName(driver);
			
			// 1. DB접속
			String url = "jdbc:mysql://" + host + ":" + port + "/" + sid;
			// jdbc:mysql://database-1.caici47obx5g.ap-northeast-2.rds.amazonaws.com:3306/mysql
			Connection con = DriverManager.getConnection(url, id, pw);

			// 2. Insert Query 실행
			PreparedStatement pstmt = con.prepareStatement(query);
			result = pstmt.executeUpdate();
								
			// 3. 결과 확인
			System.out.println("결과 : "+ result);
						
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
		
	}

	public int delete(String condition) {
		
		return 0;
		
	}
	
	public int update(String condition) {
		
		return 0;
		
	}
	
	public static void main(String[] arg) {
		DBTest db = new DBTest();
		db.insert(null, null, null);
	}
	
	
}
