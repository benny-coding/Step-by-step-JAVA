package Chapter02_Operator;

public class OperatorEx9 {
    public static void main(String[] args) {
        long a = 1000000 * 1000000;
        long b = 1000000 * 1000000L;
        System.out.println("a = " + a); // # Int형의 계산이기 때문에 데이터의 손실이 이미 일어난 상태
        System.out.println("b = " + b); // # int형과 long형의 계산이기 때문에 결과값은 long형이며 데이터 손실이 일어나지 않는다.
    }
}
