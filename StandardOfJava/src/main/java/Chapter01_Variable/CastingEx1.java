package Chapter01_Variable;

public class CastingEx1 {
    public static void main(String[] args) {
        double d = 85.4;
        int score = (int)d;

        System.out.println("score="+score); // # int형이라 소수점이 짤리지만
        System.out.println("d="+d); // # 원래 변수에는 변함이 없다
    }
}
