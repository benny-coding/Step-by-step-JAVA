package UserInterface;
import DataBase.DBConnection;

import java.util.Scanner;

public class BoardList {
    public static void main(String[] args) {
        int boardline[][] = new int[14][56];
        int number = 1;
        String boardlist[][] = {{"1","2"},{}};
        String writer = "좋은 회사";
        String writedate = "2019-06-20";

        for(int i = 0; i < boardline.length;i++){
            for(int x = 0; x < boardline[i].length;x++){
                if(i == 0 || i == boardline.length-1){
                    System.out.print("*");
                } else {
                    // # 컬럼
                    if(i == 1 && x == 1){
                        System.out.print("번호");
                    } else if(i == 1 && x == 16){
                        System.out.print("제  목");
                    } else if(i == 1 && x == 32){
                        System.out.print("글쓴이");
                    } else if (i == 1 && x == 38) {
                        System.out.print("작성날짜");
                    } else {
                        System.out.print(" ");
                    }

                }

            }
            System.out.println();

        }
    }
}
