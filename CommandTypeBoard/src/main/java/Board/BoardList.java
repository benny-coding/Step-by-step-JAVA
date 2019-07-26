package Board;
import java.util.Scanner;

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
