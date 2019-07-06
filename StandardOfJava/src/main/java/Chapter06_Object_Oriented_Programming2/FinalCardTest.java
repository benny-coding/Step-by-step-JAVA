package Chapter06_Object_Oriented_Programming2;

class Card1 {
    final int NUMBER;
    final String KIND;
    static int width = 100;
    static int height = 250;

    Card1(String kind, int num){
        KIND = kind;
        NUMBER = num;
    }

    Card1(){
        this("HEART", 1);
    }

    public String toString(){
        return KIND + "+ NUMBER";
    }
}

public class FinalCardTest {
    public static void main(String[] args){
        Card1 c = new Card1("HEART", 10);
    //  c.NUMBER = 5; final 값은 변경이 불가능함으로 에러를 발생시킨다.
        System.out.println(c.KIND);
        System.out.println(c.NUMBER);
        System.out.println(c); // System.out.println(c.toString());
    }
}
