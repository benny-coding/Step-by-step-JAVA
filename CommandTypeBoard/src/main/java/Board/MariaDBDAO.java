package Board;

import java.sql.*;

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
}
