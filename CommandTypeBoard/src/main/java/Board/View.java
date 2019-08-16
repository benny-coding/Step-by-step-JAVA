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

    protected void showEnd(){

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

    protected void showListStart(){
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("                               게시글 리스트                              ");
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("| 번호 |              제목              |  글쓴이  |     날짜     |  조회수  |");
        System.out.println("-----------------------------------------------------------------------");

    }

    protected void showListEnd() {
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("( 글 보기 : 1 , 글 쓰기 : 2 )");
        System.out.print("입력 : ");
    }

    protected void showBoardInfomation(String title, String writer, String writeTime, String viewCount,  String contents ){
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("                               게시글 정보                                ");
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("| 제목     | " + title + "");
        System.out.println("| 작성자    | " + writer + "");
        System.out.println("| 작성시간  | " + writeTime + "");
        System.out.println("| 조회수    | " + viewCount + "");
        System.out.println("| 내용     | " + contents + "");
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("( 리스트 보기 : 1 , 글 수정 : 2 , 글 삭제 : 3 )");
        System.out.print("입력 : ");

    }

    protected void showBoardInsert(){
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("                               글 쓰기                                   ");
        System.out.println("-----------------------------------------------------------------------");
    }
}
