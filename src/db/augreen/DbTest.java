package db.augreen;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DbTest {

	public String select() {
		return "";
	}
	
    public int insert(String name, String phone, String addr) {
    	
    	//��������
    	String host = "database-1.corp9kafshqg.us-east-2.rds.amazonaws.com";
    	String port = "3306";
    	String sid = "mysql";
    	String id ="admin";
    	String pw ="sari&7322";    			
    	String driver = "com.mysql.cj.jdbc.Driver";
    	
    	//������ ����(INSERT)
    	String query = "INSERT INTO augreen.SARI_TEST(NAME, PHONE, ADDR) VALUES('�������', '01098765432', '�뱸')";
		
    	int result = 0;
    	try {
			Class.forName(driver);
			
			// 1. DB ����
			String url = "jdbc:mysql://" + host + ":" + port + "/" + sid;
			Connection con = DriverManager.getConnection(url, id, pw);
			
			// 2. Insert Query ����
			PreparedStatement pstmt = con.prepareStatement(query);
			result = pstmt.executeUpdate();
			
			// 3. ��� Ȯ��
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
    
    public static void main(String[] arg) {
    	DbTest db = new DbTest();
    	db.insert(null,  null, null);
    }
}
