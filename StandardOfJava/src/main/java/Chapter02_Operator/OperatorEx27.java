package Chapter02_Operator;

public class OperatorEx27 {
    public static void main(String[] args) {
        boolean b = true;
        char ch = 'C';

        System.out.printf("b=%b%n", b);
        System.out.printf("!b = %b%n", !b); // # true가 아닌 것
        System.out.printf("!!b = %b%n", !!b); // # true가 아닌 것의 아닌 것
        System.out.printf("!!!b = %b%n", !!!b); // # true가 아닌 것의 아닌 것의 아닌 것
        System.out.println();

        System.out.printf("ch = %c%n", ch);
        System.out.printf("ch < 'a' || ch > 'z' = %b%n", ch < 'a' || ch > 'z'); // # 'C'는 'z'보다 작다
        System.out.printf("!('a' <= ch && ch <= 'z')=%b%n", !('a' <= ch && ch <= 'z'));
        System.out.printf("  'a' <= ch && ch <= 'z' =%b%n",   'a' <= ch && ch <= 'z');  
    }
}
