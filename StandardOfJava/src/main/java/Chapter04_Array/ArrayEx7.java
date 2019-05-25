package Chapter04_Array;

public class ArrayEx7 {
    public static void main(String[] args) {


        int[] numArr = new int[10];

        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = i;
            System.out.print(numArr[i]);
        }
        System.out.println(); // # 0 ~ 10 출력

        for(int i=0; i < 100; i++){
            int n = (int)(Math.random() * 10 ); // # 0 ~ 9 중 임의의 수 를 n에 저장
            System.out.println(i + " : n : " + n);
           int tmp = numArr[0]; // # numArr배열의 첫번째 값을 tmp에 저장
            System.out.println(i + " : tmp : " + tmp);
            numArr[0] = numArr[n]; // # numArr의 n번째 값을 numArr[0]에 저장
            System.out.println(i + " : numArr[0] : " + numArr[0]);
            numArr[n] = tmp;       // # numArr의 n번째 값에 tmp 값을 저장
            for(int i2=0; i2 < numArr.length ; i2++){
                System.out.print(numArr[i2]);
            }
            System.out.println();
        }

        for(int i=0; i < numArr.length ; i++){
            System.out.print(numArr[i]);
        }
    }
}
