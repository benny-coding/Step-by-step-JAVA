package Chapter_3;

import java.sql.SQLOutput;

public class Controlgate_and_Array {

    public int a = 10;
    //  한줄 주석 처리
    /* 여러 줄 주석 처리 */
    public static void main(String[] args) {

        int a = 9;

        if(a == 10){
            System.out.println("참");
        } else if(a > 10){
            System.out.println("큼");
        } else if(a < 10){
            System.out.println("작음");
        }

        // # switch문
        switch(a){
            case 10 :
                System.out.println("10이다");
                break;
            case 11 :
                System.out.println("11이다");
                break;
            default :
                System.out.println("여기 없다!");
                break;

        }

        for(int i=1; i<=10; i++){
            System.out.println(i+"이다");
        }

        int w = 0;
        while(w  <= 10){

            w++;
            System.out.println(w);
        }

        w = 0;

        do{

            System.out.println(w);
            w++;

            if(w == 5){
                break;
            }
        } while(w <= 10);


    }
}
