package Chapter04_Array;
import java.util.Arrays;

public class ArrayEx9 {
    public static void main(String[] args) {
        int[] code = { -4, -1, 3, 6, 11, 22, 12, -2, 5};
        int[] arr  = new int[10];

        for(int i=0; i < arr.length; i++){
            int tmp = (int) (Math.random() * code.length);
            arr[i] = code[tmp];
        }

        System.out.println(Arrays.toString(arr)); // # code의 배열의 값들이 규칙이 없이 임의로 문자열로 출력된다.

    }
}
