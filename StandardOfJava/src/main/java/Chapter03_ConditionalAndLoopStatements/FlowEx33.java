package Chapter03_ConditionalAndLoopStatements;

public class FlowEx33 {

    public static void main(String[] args) {

        Loop1 : for(int i=2; i<=9;i++){
                    for (int j=1; j<=9;j++){
                        if(j==5) {
                            break Loop1;
                        }
                        //    break;
                            //continue Loop1;
                            //continue; # ㅡㅡ 왜 오류가 나는지 한참을 생각했다.. 도달할 수 없는 건 오류로 처리하는 구나...
                        System.out.println(i+"*"+ j +"=" + i*j);
                    }


                    System.out.println();

        }
    }
}
