package Board;
import java.util.Scanner;

public class BoardList {

    static int page_list_count = 10;
    static int now_page;
    static int all_list_count = 14;

    public static void View_List(int count) {
        for (int i = 0; i < count; i++) {
            System.out.println("   1                제목입니다.             오동진     2019-07-23     3   ");
            if (i == count - 1) {
                System.out.println("-----------------------------------------------------------------------");
            }
        }
    }


    public static void main(String args[]) {
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("| 번호 |              제목              |  글쓴이  |     날짜     |  조회수  |");
        System.out.println("-----------------------------------------------------------------------");
        if (all_list_count >= page_list_count) {
            View_List(page_list_count);
        } else {
            View_List(all_list_count);
        }
    }
}
