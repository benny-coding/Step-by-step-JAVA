package Chapter01_Variable;

public class CastingEx2 {
    public static void main(String[] args) {
        int i = 10;
        byte b = (byte)i;
        System.out.printf("[int -> byte] i=%d -> b=%d%n", i, b); // # 데이터왜 잘림이 없다

        i = 300;
        b = (byte)i;
        System.out.printf("[int -> byte] i=%d -> b=%d%n", i, b); // # int형 데이터가 커서 데이터가 잘린다

        b = 10;
        i = (int)b;
        System.out.printf("[byte -> int] b=%d -> i=%d%n", b, i); // # 잘림 없음

        b = -2;
        i = (int)b;
        System.out.printf("[byte -> int ] b=%d -> i=%d%n", b, i);

        System.out.println("i=" + Integer.toBinaryString(i)); // # 2의 보수법을 다시 확인해보자
    }
}
