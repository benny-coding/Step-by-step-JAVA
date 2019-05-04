package BasicAlgorithm;

public class Max3m {
    static int max3(int a, int b, int c){
        int max = a;
        if (b > max){
            max = b;
        }
        if(c > max){
            max = c;
        }


        return max;
    }

    public static void main(String[] args) {
        System.out.println("max(3,2,1) = " + max3(123,132,111));
        System.out.println("max(3,2,1) = " + max3(113,232,911));
        System.out.println("max(3,2,1) = " + max3(223,142,311));
        System.out.println("max(3,2,1) = " + max3(323,732,211));
    }
}
