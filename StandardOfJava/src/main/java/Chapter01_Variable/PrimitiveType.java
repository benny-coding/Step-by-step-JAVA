package Chapter01_Variable;

public class PrimitiveType {
    /*
        1. 논리형 - boolean

        boolean power = true;
        boolean checked = False; // # 이것은 F가 대문자 이므로 오류 발생, 자바는 대소문자를 구별한다

        1. 문자형 - char

        char ch = 'A'; // 문자 'A'를 char타입의 변수 ch에 저장.

        문자 자체가 아닌 문자의 유니코드가 저장이 된다

        char ch = 'A'; // 문자 'A'를 char타입의 변수 ch에 저장
        char ch = 65;  // 문자의 코드를 직접 변수 ch에 저장

        int code = (int)ch; // ch에 저장된 값을 int타입으로 변환하여 저장한다.
     */

    public static void main(String[] args){
        char ch = 'A';      // char ch = 65;
        int code = (int)ch; // ch에 저장된 값을 int타입으로 변환하여 저장한다.

        System.out.printf("%c=%d(%#X)%n", ch, code, code);

        char hch = '가';
        System.out.printf("%c=%d(%#X)%n", hch, (int)hch, (int)hch);
    }
}
