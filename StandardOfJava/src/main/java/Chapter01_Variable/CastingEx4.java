package Chapter01_Variable;

public class CastingEx4 {
    public static void main(String[] args) {
        int i = 91234567;  // 8자리의 10진수
        float f = (float)i;// int를 float로 형변환
        int  i2 = (int)f;   // float를 다시 int로 형변환

        double d = (double)i; // int를 double로 형변환
        int    i3 = (int)d;   // double을 다시 int로 형변환

        float f2 = 1.666f;
        int   i4 = (int)f2;

        System.out.printf("i=%d\n", i); // # int형 8자리의 10진수 출력
        System.out.printf("f=%f i2=%d\n", f, i2); // #  float로 변환 시에는 7자리를 넘어가므로 맨 끝자릴 올림 처리됨
        System.out.printf("d=%f i3=%d\n", d, i3); // # double형으로 변환 시에는 올림이 발생하지 않는다
        System.out.printf("(int)%f=%d\n", f2, i4); // # float를 int로 변환 시에는 소수점이 버림이 된
    }
}
