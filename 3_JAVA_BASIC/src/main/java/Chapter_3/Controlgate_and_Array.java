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


        // # 배열은 영어로 Array
        int level[] = new int[5];
        int[] level2;

        int level3[] = {1,2,3,4,5};
        int[] level4 = {1,2,3,4,5};

        int level5[] = new int[6];

        System.out.println(level);

        level[0] = 1;
        level[1] = 2;
        level[2] = 3;
        level[3] = 4;
        level[4] = 5;

        int highlevel[][]; // 2차원 배열
        int highlevel2[][] = new int[1][2]; // 2차원 배열 메모리 할당
        System.out.println(highlevel2);

        int highlevel3[][] = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};
    }
}
