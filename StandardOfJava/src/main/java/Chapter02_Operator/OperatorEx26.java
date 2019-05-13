package Chapter02_Operator;

public class OperatorEx26 {
    public static void main(String[] args){
        int a = 5;
        int b = 0;

        System.out.printf("a = %d, b = %d%n", a, b);
        System.out.printf("a != 0 || ++b != 0 = %b%n", a!=0 || ++b!=0);
        // # 좌측 연산자에서 true인 것이 확정 되었기 때문에 우측 연산자를 계산하지 않음
        System.out.printf("a = %d, b = %d%n", a, b);
        System.out.printf("a==0 && ++b!=0 = %b%n", a==0 && ++b != 0);
        // # 좌측 연산자가 false이기 때문에 우측 연산자를 계산하지 않음
        System.out.printf("a=%d, b=%d%n", a, b);

    }
}
