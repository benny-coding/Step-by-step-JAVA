package Chapter02_Operator;

public class OperatorEx29 {
    public static void main(String[] args) {
        byte p = 10;
        byte n = 10;

        System.out.printf(" p  = %d \t%s%n",  p,  toBinaryString(p));
        System.out.printf("~p  = %d \t%s%n", ~p, toBinaryString(~p)); // p의 1의 보수
        System.out.printf("~p+1= %d \t%s%n", ~p+1, toBinaryString(~p+1)); // p의 1의 보수에 1을 더함
        System.out.printf("~~p = %d \t%s%n", ~~p, toBinaryString(~~p)); // p의 1의 보수의 1의 보수
        System.out.println();
        System.out.printf(" n  =%d%n", n); // 10진수 출력
        System.out.printf("~(n-1)=%d%n", ~(n-1)); // 1의 보수 -1(2의 보수 계산법) = 음수로 전

    }

    static String toBinaryString(int x){
        String zero = "00000000000000000000000000000000000";
        String tmp  = zero + Integer.toBinaryString(x);
        return tmp.substring(tmp.length()-32);
    }

}
