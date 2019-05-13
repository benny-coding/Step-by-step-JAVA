package Chapter02_Operator;

public class OperatorEx13 {
    public static void main(String[] args) {
        char c1 = 'a';

        //char c2 = c1 + 1;   // # int형을 char로 변환 시 데이터 손실이 있다고 얘기해주고 있다
                              // # 위와 같이 변수를 통해 계산하는 경우는 컴파일러가 미리 계산을 할 수가 없다.
        char c2 = 'a' + 1;  // # 리터럴 값은 컴파일러가 컴파일 시 자동으로 형변환을 한다


        System.out.println(c2);
    }
}
