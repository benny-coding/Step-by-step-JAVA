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

            ResultSetMetaData rsmd = rs.getMetaData();

            // 열의 개수

            int colCount = rsmd.getColumnCount();

            System.out.println("열의 개수:" + colCount);

            // 커서가 맨 마지막 행으로 이동

            rs.last();

            // 행의 개수

            int rowCount = rs.getRow();

            System.out.println("행의 개수:" + rowCount);

            // 열제목 출력

            for (int i=1; i<=colCount; i++) {

                System.out.print(rsmd.getColumnName(i) + "\t");

            }

            System.out.println("\n");



            // 첫번째 행으로 커서 이동

            // rs.first();

            // 마지막 행 바로 다음으로 커서 이동

            // rs.afterLast();

            // 지정된 커서 행으로 이동

            // rs.absolute(2);;

            // 첫행 바로 이전으로 커서 이동 (초기 위치)

            rs.beforeFirst();



//			while (rs.next()) {

//

//			}



            for (int r=1; r<=rowCount; r++) { // 행

                rs.next();

                for (int c=1; c<=colCount; c++) { // 열

                    System.out.print(rs.getObject(c) + "\t");

                }

                System.out.println();

            }



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
