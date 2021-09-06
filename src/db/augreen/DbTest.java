package db.augreen;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DbTest {

	public String select() {
		return "";
	}
	
    public int insert(String name, String phone, String addr) {
    	
    	//접속정보
    	String host = "database-1.corp9kafshqg.us-east-2.rds.amazonaws.com";
    	String port = "3306";
    	String sid = "mysql";
    	String id ="admin";
    	String pw ="sari&7322";    			
    	String driver = "com.mysql.cj.jdbc.Driver";
    	
    	//실행할 쿼리(INSERT)
    	String query = "INSERT INTO augreen.SARI_TEST(NAME, PHONE, ADDR) VALUES('조보라미', '01098765432', '대구')";
		
    	int result = 0;
    	try {
			Class.forName(driver);
			
			// 1. DB 접속
			String url = "jdbc:mysql://" + host + ":" + port + "/" + sid;
			Connection con = DriverManager.getConnection(url, id, pw);
			
			// 2. Insert Query 실행
			PreparedStatement pstmt = con.prepareStatement(query);
			result = pstmt.executeUpdate();
			
			// 3. 결과 확인
			System.out.println("결과 : " + result);
			
		} catch (Exception e) {
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
    	DbTest db = new DbTest();
    	db.insert(null,  null, null);
    }
}
