package db.yhjae1004;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DbTest {
	
	public String select( ) {
		
		return "";
	}
	
	public int insert(String name, String phone, String addr) {
		
		// ��������
		String host = "database-1.cijm7niylbmw.us-east-2.rds.amazonaws.com";
		String port = "3306";
		String sid = "mysql";
		String id = "admin";
		String pw = "1234";
		String driver = "com.mysql.cj.jdbc.Driver";
		
		// ������ ����
		String query = "INSERT INTO heejaeyoo.YOO_TEST (NAME, PHONE, ADDR) VALUES('" + name + "', '" + phone + "', '" + addr + "')";
		// "INSERT INTO heejaeyoo.YOO_TEST (NAME, PHONE, ADDR) VALUES('����', '01012347890', '�����')";
		
		
		int result = 0;
		try {
			Class.forName(driver);
			
			// 1. DB ����
			String url = "jdbc:mysql://" + host + ":" + port + "/" + sid;
			Connection con = DriverManager.getConnection(url, id, pw);
			
			// 2. Insert Query ����
			PreparedStatement pstmt = con.prepareStatement(query);
			result = pstmt.executeUpdate();
			
			// 3. Insert ��� Ȯ��
			System.out.println("��� : " + result);
					
			
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
	
	public static void main(String[] args) {
		DbTest db = new DbTest();
		db.insert("���ֿ�", "01022334455", "�����"); // �̸�, �޴�����ȣ, ����
	}
}
