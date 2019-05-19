package Chapter03_ConditionalAndLoopStatements;

public class FlowEx12 {
    public static void main(String[] args) {
        for(int i = 1; i<=5;i++){
            System.out.println(i);
        }

        for(int i=1;i<=5;i++){
            System.out.print(i); // println() 대신 print()를쓰면 가로로 출력됨
        }

        System.out.println();
    }
}
