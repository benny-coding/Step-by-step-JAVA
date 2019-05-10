package Chapter01_Variable;

public class CastingEx3 {
    public static void main(String[] args) {
        float f =  9.1234567f;
        double d = 9.1234567;
        double d2 = (double)f;

        System.out.printf("f =%20.18f\n", f); // 24번째 값에서 반올림 발생
        System.out.printf("d = %20.18f\n", d); // float와 double의 정밀도 차이 때문에 값이 다르다
        System.out.printf("d2 = %20.18f\n", d2); // float형으로 이미 초기화하였으므로 형변환 시 값이 달라지지 않는다.
    }
}
