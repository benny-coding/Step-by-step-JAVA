package Board;

import java.util.Scanner;

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

        ViewController.show_Intro();
        action = scanner.nextLine();

        while(true) {

            if (action.equals("1")) {
                ViewController.show_BoardList();

                break;
            } else if (action.equals("2")) {
                ViewController.show_End();
                break;
            } else {
                untrue_Action();
            }
        }
    }

}
