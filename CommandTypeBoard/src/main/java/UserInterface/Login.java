package UserInterface;
import java.util.Scanner;

public class Login {

    public static char[] chararr(String content){
        char arr[] = new char[10];
        for(int c = 0; c < content.length(); c++){
            arr[c] = content.charAt(c);
        }

            return arr;
    }

    public static void main(String[] args) {
        String array1[][] = new String[12][50];
        String Title = "로 그 인";
        String ID = "ID : ";
        String PW = "PW : ";

        Scanner scanner = new Scanner(System.in);

        char[] titlearr = chararr(Title);
        char[] idarr = chararr(ID);
        char[] pwarr = chararr(PW);

       // System.out.println(titlearr[10]);


        // # 로그인창 틀
        for(int i = 0; i < array1.length; i++){
            for(int x = 0; x < array1[i].length; x++){
                if(i < 1 || i == array1.length-1 ){
                    System.out.print("*");
                } else if(x > 20 && x < titlearr.length+20 && titlearr[x-21] != 0 && i == 2  ) {
                    System.out.print(titlearr[x-21]);
                } else if(x > 16 && x < idarr.length+16 && idarr[x-17] != 0 && i == 5){
                    System.out.print(idarr[x-17]);
                } else if(x > 16 && x < pwarr.length+16 && pwarr[x-17] != 0 && i == 6) {
                    System.out.print(pwarr[x-17]);
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
        System.out.print("아이디를 입력해주세요 : ");
        String id = scanner.nextLine();
        System.out.print("비밀번호를 입력해주세요 : ");
        String pw = scanner.nextLine();

        if(id.equals("admin") && pw.equals("1234")){
            System.out.println("로그인 되었습니다.");
        } else {
            System.out.println("아이디나 패스워드가 맞지 않습니다.");
        }
    }
}
