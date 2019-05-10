package Chapter02_Operator;

public class OperatorEx3 {
    public static void main(String[] args){
        int i=5, j=5;
        System.out.println(i++); // # 후위형 증감연산자이므로 아직 +가 안된 상태의 값을 출력
        System.out.println(++j); // # 전위형 증감연산자이므로 ++가 적용된 상태의 값 출력
        System.out.println("i = " + i + ", j = " + j); // # 두개의 변수 모두 적용되어 ++가 된 상태
    }
}
