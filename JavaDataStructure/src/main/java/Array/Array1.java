package Array;

public class Array1 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        int[] numbers2 = new int[10];
        System.out.println(numbers[0]);
        // System.out.println(numbers[6]); // # ArrayIndexOutOfBoundsException

        System.out.println(numbers2.length);

        int i = 0;
        while(i < numbers.length) {
            System.out.println(numbers[i]);
            i++;
        }

        for(int j = 0; j < numbers.length; j++){
            System.out.println(numbers[j]);
        }
    }
}
