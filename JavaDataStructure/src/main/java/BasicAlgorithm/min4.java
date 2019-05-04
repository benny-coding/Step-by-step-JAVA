package BasicAlgorithm;

public class min4 {

    static int min4(int a, int b, int c, int d){
        int min = a;

        if(min > b){
            min = b;
        }
        if(min > c){
            min = c;
        }
        if(min > d){
            min = d;
        }

        return min;

    }

    public static void main(String[] args) {
        System.out.println("1,2,3 = "+ min4(3,2,1, 123));
        System.out.println("1,2,3 = "+ min4(3,2,9,1));
        System.out.println("1,2,3 = "+ min4(1233,552362,112515,99));
        System.out.println("1,2,3 = "+ min4(100,2151,16,0));
        System.out.println("1,2,3 = "+ min4(3123,223,1563,7));
    }
}
