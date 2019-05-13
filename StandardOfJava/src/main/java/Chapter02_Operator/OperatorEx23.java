package Chapter02_Operator;

public class OperatorEx23 {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = new String("abc");

        System.out.printf("\"abc\" == \"abc\" ? %b%n", "abc" == "abc");
        System.out.printf(" str1 == \"abc\" ? %b%n",    str1=="abc");

        // # ==를 사용하여 문자열 비교 시 같은 문자열이라도 다른 객체를 비교하게 되면 false를 출력한다
        System.out.printf(" str2 == \"abc\" ? %b%n",    str2=="abc");
        System.out.printf("str1.equals(\"abc\") ? %b%n", str1.equals("abc"));
        System.out.printf("str2.equals(\"abc\") ? %b%n", str2.equals("abc"));

        // # 대문자 ABC와 소문자 abc의 equals 비교 시에는 false를 출력한다.
        System.out.printf("str2.equals(\"ABC\") ? %b%n", str2.equals("ABC"));

        // # equalsignoreCase 함수는 대소문자 구분 없이 문자열을 비교해서 사용한다.
        System.out.printf("str2.equalsIgnoreCase(\"ABC\") ? %b%n", str2.equalsIgnoreCase("ABC"));
    }
}
