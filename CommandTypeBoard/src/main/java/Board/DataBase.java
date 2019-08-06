package Board;

import java.sql.*;

public class DataBase {

    static Connection con = null;
    static Statement statement = null;
    static ResultSet resultset = null;

    static final String driver = "com.mysql.jdbc.Driver";
    static final String url = "jdbc:mysql://localhost:3306/command_type_board?useSSL=false";
    static final String user = "root";
    static final String password = "space0707";




}
