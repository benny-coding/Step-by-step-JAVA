package Board;

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
}
