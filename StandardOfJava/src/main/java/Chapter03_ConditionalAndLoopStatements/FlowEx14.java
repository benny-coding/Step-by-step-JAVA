package Chapter03_ConditionalAndLoopStatements;

public class FlowEx14 {
    public static void main(String[] args) {
        for(int i=1, j=10;i<=10;i++,j--){
            System.out.printf("%d \t %d%n", i, j); // # i와 j가 거꾸로 출력됨햣
        }
    }
}
