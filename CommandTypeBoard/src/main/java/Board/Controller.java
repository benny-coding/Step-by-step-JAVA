package Board;

import java.util.Scanner;
import java.util.List;

public class Controller {

    static private String action;

    static View ViewController = new View();
    static Scanner scanner = new Scanner(System.in);


    public static void untrue_Action(){
        System.out.print("잘못된 값을 입력하셨습니다. 다시 입력해주세요 : ");
        action = scanner.nextLine();

        SingleTone s = SingleTone.getInstance();

        s.setLog("asdf");

    }

    public static void main(String[] args) {

        MariaDBDAO manager = MariaDBDAO.getInstance();

        BoardDTO data = new BoardDTO();


        ViewController.show_Intro();
        action = scanner.nextLine();

        while(true) {

            if (action.equals("1")) {
                ViewController.showListStart();
                List<BoardDTO> list = manager.getList();

                for (int i = 0; i < list.size(); i++){
                    data = list.get(i);

                    System.out.print("   " + data.getBoardIndex() + "              " + data.getTitle() + "           ");
                    System.out.println(data.getWriter() + "        " + data.getWriteTime() + "       " + data.getViewCount());

                }

                ViewController.showListEnd();
                action = scanner.nextLine();

                if(action.equals("1")){
                    System.out.print("글의 번호 입력 : ");
                    String index = scanner.nextLine();
                    List<BoardDTO> infomation = manager.getBoardInfomation(index);
                    data = infomation.get(0);

                    ViewController.showBoardInfomation(data.getTitle(),data.getWriter(),data.getWriteTime(),
                            data.getViewCount(),data.getContents());

                    action = scanner.nextLine();


                    //System.out.println(data.getTitle() + "  " + data.getWriter() + " " + data.getWriteTime());

                    if(action.equals("1")){
                        continue;
                    } else if(action.equals("2")){

                    } else if(action.equals("3")){

                    }

                } else if (action.equals("2")){
                    ViewController.showBoardInsert();

                } else {
                    untrue_Action();
                }

                continue;
            } else if (action.equals("2")) {
                ViewController.showEnd();
                break;
            } else {
                untrue_Action();
            }
        }
    }

}
