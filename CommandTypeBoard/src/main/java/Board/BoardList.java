package Board;
import java.util.Scanner;
import java.
import java.sql.*;


class DBConnection {

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

public class BoardList {

    static int page_list_count = 10;
    static int now_page;
    static int all_list_count = 14;
    static int action;


    public static void View_List(int count) {
        for (int i = 0; i < count; i++) {
            System.out.println("   1                제목입니다.             오동진     2019-07-23     3   ");
            if (i == count - 1) {
                System.out.println("-----------------------------------------------------------------------");
            }
        }
    }


    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("-----------------------------------------------------------------------");
        System.out.println("| 번호 |              제목              |  글쓴이  |     날짜     |  조회수  |");
        System.out.println("-----------------------------------------------------------------------");
        if (all_list_count >= page_list_count) {
            View_List(page_list_count);
        } else {
            View_List(all_list_count);
        }
        System.out.println("                     1 2 3 4 5 6 7 8 9 10                              ");
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("1.게시글 상세보기  2.글쓰기  3.다른 페이지 글 보기");
        System.out.printf("원하는 행동의 번호를 입력해주세요 : ");
        action = Integer.parseInt(scanner.nextLine());


        if(action == 1){
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("  제목  |    제목입니다.                                                              ");
            System.out.println(" 글쓴이  |   오동진                                                           ");
            System.out.println("  날짜  |   2019-07-23                                                           ");
            System.out.println("  내용  |                                                              ");
            System.out.println("       |                                                              ");
            System.out.println("       |                                                              ");
            System.out.println("       |                                                              ");
            System.out.println("-----------------------------------------------------------------------");

        } else if (action == 2){

            while(true) {
                System.out.print("  제목  |  ");
                String title = scanner.nextLine();
                System.out.print("  내용  |  ");
                String contents = scanner.nextLine();
                System.out.println("  작성한 내용을 저장하시겠습니까? ( 예 / 아니요 )  ");
                String save_yn = scanner.nextLine();
                if (save_yn == "예") {
                    break;
                } else if (save_yn == "아니요") {
                    break;
                } else {
                    System.out.println(" 잘못된 값을 입력하셨습니다.");
                }
            }



        } else if (action == 3){

        } else {

        }
    }
}
