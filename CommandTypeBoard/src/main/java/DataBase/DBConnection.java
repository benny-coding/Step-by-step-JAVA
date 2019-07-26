package DataBase;

import java.sql.*;


public class DBConnection {
    public static void main(String[] args) throws SQLException {
        Connection con = null;
        Statement stmt = null; // SQL 문을 데이터베이스에 보내기위한 객체
        ResultSet rs = null; // SQL 질의에 의해 생성된 테이블을 저장하는 객체

        // 1. JDBC Driver Class - com.mysql.jdbc.Driver
        String driver = "com.mysql.jdbc.Driver";


        String url = "jdbc:mysql://localhost:3306/command_type_board?useSSL=false";
        String user = "root";
        String password = "space0707";

        String SQL = "SELECT * FROM user_infomation";

        try {
            // 1/ JDBC 드라이버 로딩
            Class.forName(driver);

            // 2. Connection 객체 생성
            con = DriverManager.getConnection(url, user, password);

            // 3. Statement 객체 생성
            stmt = con.createStatement();

            // 4. SQL 문장을 실행하고 결과를 리턴
            // stmt.excuteQeury(SQL)  : select
            // stmt.excuteUpdate(SQL) : insert, update, delete ..
            rs = stmt.executeQuery(SQL);
            // System.out.println(rs.next());
            // System.out.println(rs.getString(2));
            // 5. ResultSet에 저장된 데이터 얻기 - 결과가 2개 이상
            while (rs.next()) {
                String user_number = rs.getString("user_number");
                String user_name = rs.getString("user_name");

                System.out.println("user_number : " + user_number);
                System.out.println("user_name : " + user_name);
            }
        } catch (SQLException e) {

            System.out.println("SQL Error : " +  e.getMessage());

        } catch (ClassNotFoundException e1) {

            System.out.println("[JDBC Connector Driver 오류 : " + e1.getMessage() + "]");

        } finally {

            // 사용 순서와 반대로 close 함

            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (stmt != null){
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
