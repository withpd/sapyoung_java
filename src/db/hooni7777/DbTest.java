package db.hooni7777;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DbTest {

	public String select() {
		
		return "";
	}
	
	public int insert(String name, String phone, String addr) {
		
		// ��������
		String host = "database-1.c9oruul0e51t.ap-northeast-2.rds.amazonaws.com";
		String port = "3306";
		String sid = "mysql";
		String id = "admin";
		String pw = "";
		String driver = "com.mysql.cj.jdbc.Driver";
		
		// ������ ����(INSERT)
		String query = "INSERT INTO hooni.HOONI7777_TEST (NAME, PHONE, ADDR) VALUES('������', '01054442275', '����')";
		
		int result = 0;
		try {
			Class.forName(driver);
			
			// 1. DB ����
			String url = "jdbc:mysql://" + host + ":" + port + "/" + sid;
			
			Connection con = DriverManager.getConnection(url, id, pw);
			
			// 2. Insert Query ����
			PreparedStatement pstmt = con.prepareStatement(query);
			result = pstmt.executeUpdate();
			
			// 3. ���Ȯ��
			System.out.println("��� : " + result);
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
	
	public static void main(String[] args) {
		DbTest db = new DbTest();
		db.insert(null, null, null);
		
	}

}