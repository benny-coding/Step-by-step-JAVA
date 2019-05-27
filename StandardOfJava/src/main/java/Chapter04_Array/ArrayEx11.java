package Chapter04_Array;

public class ArrayEx11 {
    public static void main(String[] args) {
        int[] numArr = new int[10];
        int[] counter = new int[10];

        // # 10자리의 난수를 만든다
        for(int i = 0; i < numArr.length; i++){
            numArr[i] = (int)(Math.random() * 10);
            System.out.print(numArr[i]);
        }
        System.out.println();

        // # 첫번째자리부터 해당 난수를 counter배열의 인덱스로 하여 더한다.
        for (int i = 0; i < numArr.length ; i++){
            counter[numArr[i]]++;
        }

        for (int i = 0; i < numArr.length; i++){
            System.out.println( i +"의 개수 :" + counter[i]); // # 난수의 값의 개수? 출력
        }
        String[] name = new String[3];
        name[0] = new String("Kim");
        name[1] = new String("Park");
        name[2] = new String("Yi");

        String[] name2 = new String[3];
        name[0] = "Kim";
        name[1] = "Park";
        name[2] = "Yi";
    }
}
