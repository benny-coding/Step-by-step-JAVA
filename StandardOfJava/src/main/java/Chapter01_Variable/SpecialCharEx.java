package Chapter01_Variable;

public class SpecialCharEx {
    public static void main(String[] args){
        System.out.println('\''); //  따옴표 하나만 출력 가능
        System.out.println("abc\t123\b456"); // \b는 백스페이스를 출력하여 3이 지워진다
        System.out.println('\n');           // 개행문자를 출력하고 개행을 한다 println까지 개행이 2개
        System.out.println("\"Hello\"");    // 큰따옴표를 출력하기 위해서는 백슬래시를 사용한다.
        System.out.println("c:\\");         // 백슬래쉬를 출력하기 위해서는 백슬래시 2개를 입력

    }
    /*

        오버플로우 : 4비트의 2진수의 값이 1111일 때 1을 더한다면 올림이 되는 1은 저장할 곳이 없어진다
                  그러므로 값은 0000이 된다.
                  0000에서 1을 뺄때도 마찬가지로 1111로 되는 것이다

                  부호 있는 정수 : +, 0, -
                  부호 없는 정수 : +, 0

     */
}