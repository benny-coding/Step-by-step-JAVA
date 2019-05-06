package Chapter01_Variable;

public class PrintfEx2 {
    public static void main(String[] args ){

        String url = "www.codechobo.com";

        float f1 = .10f; // 0.10, 1.0e-1
        float f2 = 1e1f; // 10.0, 1.0e1, 1.0e+1
        float f3 = 3.14e3f;
        double d = 1.23456789;

        System.out.printf("f1=%f, %e, %g%n", f1, f1, f1);
        System.out.printf("f2=%f, %e, %g%n", f2, f2, f2);
        System.out.printf("f3=%f, %e, %g%n", f3, f3, f3);

        System.out.printf("d=%f%n", d);
        System.out.printf("d=%14.10f%n", d);

        System.out.printf("[12345678901234567890]%n");
        System.out.printf("[%s]%n", url);
        System.out.printf("[%20.10s]%n", url); // # 20글자 출력 공간 확보 후 우측 정렬
                                                // # 소수점 앞에 순자가 있으면 정렬을 위한 길이이고 소수점 뒤에 있으면 최대 길이이다.
                                                // # 최대 출력 길이는 좌측부터 기준임
        System.out.printf("[%-20s]%n", url); // # 20글자 출력 공간 확보 후 좌측 정렬
        System.out.printf("[%.8s]%n", url); // 왼쪽에서 8글자만 출력

        System.out.printf("d=%14.10f%n", d);
    }
}
