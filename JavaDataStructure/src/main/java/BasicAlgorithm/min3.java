package BasicAlgorithm;

public class min3 {

    static int min3(int a, int b, int c){
        int min = a;

        if(min > b){
            min = b;
        }
        if(min > c){
            min = c;
        }

        return min;

    }

    public static void main(String[] args) {
        System.out.println("1,2,3 = "+ min3(3,2,1));
        System.out.println("1,2,3 = "+ min3(3,2,9));
        System.out.println("1,2,3 = "+ min3(1233,552362,112515));
        System.out.println("1,2,3 = "+ min3(100,2151,16));
        System.out.println("1,2,3 = "+ min3(3123,223,1563));
    }
}
