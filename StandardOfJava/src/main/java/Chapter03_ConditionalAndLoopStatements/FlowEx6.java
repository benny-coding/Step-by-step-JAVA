package Chapter03_ConditionalAndLoopStatements;
import java.util.Scanner;

public class FlowEx6 {
    public static void main(String[] args) {
        int month = 0;

        System.out.print("현재 월을 입력하세여.>");

        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.nextLine(); // # 입력 받은 값을 tmp에 저장
        month = Integer.parseInt(tmp);  // 입력 받은 문자열(tmp)을 숫자로 변환

        switch(month){
            case 3:
            case 4:
            case 5:
                System.out.println("현재의 계절은 봄입니다.");
                break;
            case 6: case 7: case 8:
                System.out.println("현재의 계절을 여름입니다.");
                break;
            case 9: case 10: case 11:
                System.out.println("현재의 계절은 가을입니다.");
                break;
            default:
            case 12: case 1: case 2:
                System.out.println("현재의 계절은 겨울입니다.");
        }
    } // main의 끝
}
