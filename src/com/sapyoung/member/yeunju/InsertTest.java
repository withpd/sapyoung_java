package com.sapyoung.member.yeunju;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertTest {
    public static void main(String[] args) {
        // pet ���̺��� �̸�/������/��/����/����� Į���� �ֽ��ϴ�.
        insert("����", "victolee", "�丣�þ�", "m", "2010-08-21", null);
    }

    public static void insert(String name, String owner, String species,
                              String gender, String birth, String death){
        Connection conn = null;
        PreparedStatement pstmt = null;

        try{
            // 1. ����̹� �ε�
            Class.forName("com.mysql.jdbc.Driver");

            // 2. �����ϱ�
            String url = "jdbc:mysql://database-1.cv99veek0jdu.us-east-2.rds.amazonaws.com/mysql";
            conn = DriverManager.getConnection(url, "admin", "DUSwn1014!");


            // 3. SQL ���� �غ�
            // �߰��Ϸ��� �������� ���� ���޵� ���ڸ� ���� �������� �Ҵ�Ǵ� ���̴�.
            // �� � ���� ���޵��� �𸣹Ƿ� Select �� ���� �޸�
            // stmt = conn.createStatement(); �� �ۼ����� �ʰ�
            // pstmt = conn.prepareStatement(sql); �� �ۼ��Ͽ� �����͸� �߰��� ������ �˸��ϴ�.
            // ���� sql ���� ������ + �����ڷ� �� �ٷ� �ۼ��� �� ������ �������� �ʹ� �������� �ǹǷ�
            // �� ����� ���մϴ�.
            String sql = "INSERT INTO yeunju.autofocus VALUES (?,?,?)";
            pstmt = conn.prepareStatement(sql);


            // 4. ������ binding
            pstmt.setString(1, "yeunju");
            pstmt.setInt(2, 1041818672);
            pstmt.setInt(3, 123455556);


            // 5. ���� ���� �� ��� ó��
            // SELECT�� �޸� INSERT�� ��ȯ�Ǵ� �����͵��� �����Ƿ�
            // ResultSet ��ü�� �ʿ� ����, �ٷ� pstmt.executeUpdate()�޼��带 ȣ���ϸ� �˴ϴ�.
            // INSERT, UPDATE, DELETE ������ �̿� ���� �޼��带 ȣ���ϸ�
            // SELECT������ stmt.executeQuery(sql); �޼��带 ����߾����ϴ�.
            // @return     int - �� ���� row�� ������ ���ƴ����� ��ȯ
            int count = pstmt.executeUpdate();
            if( count == 0 ){
                System.out.println("������ �Է� ����");
            }
            else{
                System.out.println("������ �Է� ����");
            }
        }
        catch( ClassNotFoundException e){
            System.out.println("����̹� �ε� ����");
        }
        catch( SQLException e){
            System.out.println("���� " + e);
        }
        finally{
            try{
                if( conn != null && !conn.isClosed()){
                    conn.close();
                }
                if( pstmt != null && !pstmt.isClosed()){
                    pstmt.close();
                }
            }
            catch( SQLException e){
                e.printStackTrace();
            }
        }
    }
}