package Chapter02_Operator;

public class OperatorEx7 {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 30;
        byte c = (byte)(a * b); // # int형을 byte형으로 변환하면서 데이터 손실이 발생한다
        System.out.println(c);
    }
}
