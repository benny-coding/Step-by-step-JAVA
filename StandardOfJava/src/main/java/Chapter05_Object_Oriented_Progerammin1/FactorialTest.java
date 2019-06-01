package Chapter05_Object_Oriented_Progerammin1;

public class FactorialTest {
    public static void main(String args[]){
        int result = factorial(3); // int result = FactorialTest.factorial(4);

        System.out.println(result);
    }

    static int factorial(int n) {
        int result = 0;

        if ( n == 1) {
            result = 1;
        } else {
            result = n * factorial(n-1);    // 다시 메서드 자신을 호출한다.
        }

        return result;
    }
}
