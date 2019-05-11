package Chapter02_Operator;

public class OperatorEx8 {
    public static void main(String[] args) {
        int a = 1000000;    // 1,000,000 1백만
        int b = 2000000;    // 2,000,000 2백만

        long c = a * b;     // a * b = 2,000,000,000,000 ??

        System.out.println(c); // # long형 변수 c에 대입하기 전까지는 int형이므로 int형의 계산 값이 long형으로 대입된다.
    }

}
