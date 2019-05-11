package Chapter02_Operator;

public class OperatorEx10 {
    public static void main(String[] args) {
        int a = 1000000;

        int result1 = a * a / a; // 1000000 * 1000000 / 1000000
        int result2 = a / a * a; // 1000000 / 1000000 * 1000000

        System.out.printf("%d * %d / %d = %d%n", a, a, a, result1); // # 계산 중 int형의 값의 범위를 넘어 데이터 손실 발생!
        System.out.printf("%d / %d * %d = %d%n", a, a, a, result2);

    }
}
