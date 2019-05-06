package Chapter01_Variable;

public class PrintfEx1 {
    public static void main(String[] args) {
        byte b = 1;
        short s = 2;
        char c = 'A';

        int finger = 132412;
        long big = 100_000_000_000_000L;
        long hex = 0xFFFF_FFFF_FFFF_FFFFL; // long hex = 0xFFFFFFFFFFFFFFFFFL

        int octNum = 010;   // 8진수 10, 10진수로는 8
        int hexNum = 0x10;  // 16진수 10, 10진수로는 16 0x는 16진수 접두사
        int binNum = 0b10;  // 2진수 10, 10진수로는 2 0b는 2진수 접두사

        System.out.printf("b=%d%n", b); // # 정수형 그대로 출력
        System.out.printf("s=%d%n", s); // # 이것도 그대로 출력
        System.out.printf("c=%c, %d %n", c, (int)c); // # char의 그대로 출력과 int로 형변환 했을 때 아스키 코드 출력
        System.out.printf("finger=[%5d]%n", finger); // # 인트형 10의 5번째자리까지 출력
        System.out.printf("finger=[%-5d]%n", finger);// # 인트형 10의 밑으로 5번째자리까지 출력
        System.out.printf("finger=[%05d]%n", finger); // # 5번째 자리의 수만 출력하는데 빈 공간은 0으로 채움
                                                      // * 그런데 값의 자릿수가 5번째보다 높으면 그냥 값을 다 가져오는 것 같다
        System.out.printf("big=%d%n",big);            // # long형 출력
        System.out.printf("hex=%#x$n", hex);          // # #은 16진수에 대한 접두사이다.
        System.out.printf("octNum=%o, %d%n", octNum, octNum); // # 8진수 출력
        System.out.printf("hexNum=%x, %d%n", hexNum, hexNum); // # 16진수 출력
        System.out.printf("binNum=%s, %d%n", Integer.toBinaryString(binNum), binNum); // # 2진수 출력
    }
}
