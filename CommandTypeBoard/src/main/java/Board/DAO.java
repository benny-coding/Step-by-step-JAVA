package Board;

public class DAO {
    private static DAO instance = new DAO();
    private DAO(){}
    public static DAO getInstance(){
        return instance;
    }
}
