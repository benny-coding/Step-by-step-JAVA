package Chapter02_Operator;

public class OperatorEx4 {
    public static void main(String[] args){
        int i = -10;
        i = +i;
        System.out.println(i);

        i = -10;
        i = -i;
        System.out.println(i); // # -와 -의 대입은 +로 변환시킨다.
    }
}
