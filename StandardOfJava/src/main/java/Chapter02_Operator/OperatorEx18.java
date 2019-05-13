package Chapter02_Operator;

public class OperatorEx18 {
    public static void main(String[] args){
        double pi = 3.141592;
        double shortPi = Math.round(pi * 1000) / 1000.0;
        // # 반올림 함수 Math.round

        System.out.println(shortPi);
    }
}
