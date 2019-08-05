package Board;

public class View {

    protected void show_Intro(){

        System.out.println("-----------------------------------------------------------------------");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("                          자바 MVC 커맨드 게시판                            ");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("( 시작 : 1 , 종료 : 2 )");
        System.out.print("입력 : ");
    }

    protected void show_End(){

        System.out.println("-----------------------------------------------------------------------");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("                               게시판 종료                                ");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("-----------------------------------------------------------------------");

    }

    protected void show_BoardList(){

        System.out.println("-----------------------------------------------------------------------");
        System.out.println("| 번호 |              제목              |  글쓴이  |     날짜     |  조회수  |");
        System.out.println("-----------------------------------------------------------------------");
        Board.loadBoardList();
        System.out.println("-----------------------------------------------------------------------");

    }
}
