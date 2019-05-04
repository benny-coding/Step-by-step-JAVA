package BasicAlgorithm;

public class Max4m {
    static int max3(int a, int b, int c, int d){
        int max = a;
        if (b > max){
            max = b;
        }
        if(c > max){
            max = c;
        }
        if(d > max){
            max = d;
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println("max(3,2,1) = " + max3(123,132,111,121));
        System.out.println("max(3,2,1) = " + max3(113,232,911,821));
        System.out.println("max(3,2,1) = " + max3(223,142,311,521));
        System.out.println("max(3,2,1) = " + max3(323,732,211,121));
    }
}
