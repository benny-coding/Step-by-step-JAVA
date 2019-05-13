package Chapter02_Operator;

public class OperatorEx17 {
    public static void main(String[] args){
        double pi = 3.141592;
        double shortPi = (int)(pi * 1000 + 0.5) / 1000.0;
        // # 반올림의 개념을 연산으로 나타내면 0.5를 더한 후 소수점 자리를 버림을 하는 것이다.

        System.out.println(shortPi);
    }
}
