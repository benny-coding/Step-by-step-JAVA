package Board;
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.sql.*;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;



class DBConnection {

    Connection con = null;
    Statement stmt = null; // SQL 문을 데이터베이스에 보내기위한 객체
    ResultSet result = null; // SQL 질의에 의해 생성된 테이블을 저장하는 객체
    String Select_Data[];

    Gson gson = new Gson();
    JsonArray jsonArray = new JsonArray();

    // # 1. JDBC Mysql 세팅 정보
    final String driver = "com.mysql.jdbc.Driver";
    final String url = "jdbc:mysql://localhost:3306/command_type_board?useSSL=false";
    final String user = "root";
    final String password = "space0707";


    public void Connect() {
        try {
            // # 드라이버 로딩
            Class.forName(driver);

            // # DB 연결하기
            con = DriverManager.getConnection(url,user, password);

            // # 쿼리 수행을 위한 Statement 객체를 생성
            stmt = con.createStatement();

        } catch ( ClassNotFoundException e1 ){
            System.out.println("[JDBC Connector Driver 오류 : " + e1.getMessage() + "]");
        } catch ( SQLException e ) {
            System.out.println("SQL 에러 : " + e);
        }

    }

    public void QueryExcute(String sql) {

        try {
            stmt.executeUpdate(sql);
        } catch( SQLException e){
            System.out.println("SQL 실행 에러 " + e);
        }
        System.out.println(" 쿼리가 정상 실행되었습니다.");

    }

    public void Query(String sql) {

        try {
            result = stmt.executeQuery(sql);
        } catch( SQLException e){
            System.out.println("SQL 실행 에러 " + e);
        }
        System.out.println(" 쿼리가 정상 실행되었습니다.");

    }

    public JsonObject SelectResult(String sql) {

        JsonObject json_data = new JsonObject();

        try {
            result = stmt.executeQuery(sql);
            ResultSetMetaData resultmd = result.getMetaData();
            // # 열의 개수 구하기
            int colCount = resultmd.getColumnCount();

            // # 행의 개수 구하기
            result.last();
            int rowCount = result.getRow();

            // # 모든 데이터 배열에 넣기
            result.absolute(0);
            for(int i = 1; i <= rowCount; i++){ // 행
                result.next();
                JsonObject jsonObject = new JsonObject();

                for(int j = 1; j <= colCount; j++ ){

                    jsonObject.addProperty(resultmd.getColumnName(j),result.getString(j));
                }
                jsonArray.add(jsonObject);
            }
            json_data.add("board_list",jsonArray);

        } catch (SQLException e){
            System.out.println("SELECT문 실행 에러 " + e);
        }

        return json_data;

    }

}

// # 게시판 View 클래스
public class BoardList {

    static int page_list_count = 10;
    static int block_page_count = 10;
    static int now_page;
    static int now_block;
    static int all_list_count;
    static int all_page_count;
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
        DBConnection Mysql = new DBConnection();

        Mysql.Connect();
        JsonObject json_data = Mysql.SelectResult("SELECT * FROM board_list");
        JsonArray board_list_array = json_data.getAsJsonArray("board_list");
        all_list_count = board_list_array.size();

        System.out.println(board_list_array);
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("| 번호 |              제목              |  글쓴이  |     날짜     |  조회수  |");
        System.out.println("-----------------------------------------------------------------------");
        if (all_list_count >= page_list_count) {
            for(int i = 0; i < page_list_count; i++){

                JsonObject list_row = board_list_array.get(i).getAsJsonObject();

                System.out.println("   " + list_row.get("board_index").getAsString()  +
                                   "                " + list_row.get("title").getAsString() +
                                   "                " + list_row.get("writer").getAsString() +
                                    "    " + list_row.get("write_time").getAsString() +
                                   "     " + list_row.get("view_count").getAsString() + "   ");
                if (i == page_list_count - 1) {
                    System.out.println("-----------------------------------------------------------------------");
                }
            }
        } else {
            try {
                for (int i = 0; i < all_list_count; i++) {

                    JsonObject list_row = board_list_array.get(i).getAsJsonObject();

                    System.out.println("   " + list_row.get("board_index").getAsString() +
                            "                " + list_row.get("title").getAsString() +
                            "                " + list_row.get("writer").getAsString() +
                            "      " + list_row.get("write_time").getAsString() +
                            "      " + list_row.get("view_count").getAsString() + "   ");
                    if (i == all_list_count - 1) {
                        System.out.println("-----------------------------------------------------------------------");
                    }
                }
            } catch (NullPointerException e) {
                System.out.println(e.fillInStackTrace());
            }
        }
        System.out.println("                     1 2 3 4 5 6 7 8 9 10                              ");
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("1.게시글 상세보기  2.글쓰기  3.다른 페이지 글 보기");
        System.out.printf("원하는 행동의 번호를 입력해주세요 : ");
        action = Integer.parseInt(scanner.nextLine());


        if(action == 1){
            System.out.print("보고 싶은 글의 번호를 입력해주세요 : ");
            String index = scanner.nextLine();
            DBConnection Mysql2 = new DBConnection();
            Mysql2.Connect();
            JsonObject board_infomation = Mysql2.SelectResult("SELECT * FROM board_list WHERE board_index = " + index + "");
            System.out.println(board_infomation);
            JsonArray board_infomationArray = board_infomation.getAsJsonArray("board_list");

            System.out.println(board_infomation);

            JsonObject list_row = board_infomationArray.get(0).getAsJsonObject();

            System.out.println(list_row);

            System.out.println("-----------------------------------------------------------------------");
            System.out.println("  제목  |    " + list_row.get("title").getAsString()+"");
            System.out.println(" 글쓴이  |   " + list_row.get("writer").getAsString()+"");
            System.out.println("  날짜  |   " + list_row.get("write_time").getAsString()+"");
            System.out.println("  내용  |   " + list_row.get("contents").getAsString()+"");
            System.out.println("       |                                                              ");
            System.out.println("       |                                                              ");
            System.out.println("       |                                                              ");
            System.out.println("-----------------------------------------------------------------------");

        } else if (action == 2){

            Date time = new Date();
            String now_time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(time);

            while(true) {
                System.out.print("  작성자  |  ");
                String writer = scanner.nextLine();
                System.out.print("  제목  |  ");
                String title = scanner.nextLine();
                System.out.print("  내용  |  ");
                String contents = scanner.nextLine();
                System.out.println("  작성한 내용을 저장하시겠습니까? ( Y / N )  ");
                String save_yn = scanner.nextLine();
                if (save_yn.equals("Y")) {

                    String SQL  = "INSERT INTO board_list(title,writer,contents,write_time) " +
                                 "VALUES('" + title + "','" + writer + "','" + contents + "','" + now_time + "')";
                    System.out.println(SQL);
                    Mysql.QueryExcute(SQL);
                    break;
                } else if (save_yn.equals("N")) {
                    break;
                } else {

                    System.out.println(" 잘못된 값을 입력하셨습니다.");
                    System.out.println(" 입력하신 값은 " + save_yn + " 입니다.");
                }
            }



        } else if (action == 3){

        } else {

        }
    }
}
