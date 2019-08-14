package Board;

import java.sql.*;
import java.util.List;
import java.util.ArrayList;

public class MariaDBDAO {

    // # 바로 메모리에 할당하는 방법
    // # private static MariaDBDAO instance = new MariaDBDAO();
    private static MariaDBDAO MrDAO;

    // # 외부에서 MariaDBDAO의 인스턴스를 막는다.
    private MariaDBDAO(){}

    // # MairaDBDAO 인스턴스를 얻는 방법은 getInstance() 메서드를 호출하는 것 뿐이다.
    public static MariaDBDAO MDAO(){
        if(MrDAO == null){
            MrDAO = new MariaDBDAO();

        }
        return MrDAO;
    }

    public Connection getConnection() throws SQLException,ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        // core.log를 사용하게 되 쿼리 결과를 콘솔에 찍을 수 있다.
        // Class.forName("core.log.com.mysql.jdbc.Driver")
        String url =  "jdbc:mysql://localhost:3306/command_type_board?useSSL=false";
        String user = "root";
        String password = "space0707";
        Connection connection = DriverManager.getConnection(url,user,password);
        return connection;
    }

    public List<BoardDTO> getList() {

        PreparedStatement ppst = null;
        ResultSet rs = null;
        Connection conn = null;
        List<BoardDTO> list = null;

        try {
            conn = getConnection();

            ppst = conn.prepareStatement("SELECT * FROM command_type_board");
            rs = ppst.executeQuery();

            if (rs.next()) {
                list = new ArrayList<>();

                do{
                // 반복문이 수행될 때마다 BoardDTO 생성
                BoardDTO data = new BoardDTO();

                // 생성된 객체(data)에 수행된 쿼리 값(해당 컬럼)을 순서대로 저장
                data.setBoardIndex(rs.getInt("boardIndex"));
                data.setTitle(rs.getString("title"));
                data.setContents(rs.getString("contents"));
                data.setWriter(rs.getString("writer"));
                data.setWriteTime(rs.getString("writeTime"));

                list.add(data);
            }
            while (rs.next()) ;
        }
       } catch(Exception e) {
            e.printStackTrace();
        } finally {
            try  {
                if(rs != null) rs.close();
                if(ppst != null) ppst.close();
                if(conn != null) conn.close();
            } catch(Exception e2){
                e2.getStackTrace();
            }
        }
        return list;
    }
}
