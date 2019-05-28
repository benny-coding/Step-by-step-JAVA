package Chapter04_Array;

public class ArrayEx18 {
    public static void main(String[] args) {
        int[][] score = {
                            {100, 100, 100}
                            , {20, 20, 20}
                            , {30, 30, 30}
                            , {40, 40, 40}
                        };
        int sum = 0;

        for(int i=0; i < score.length;i++){ // # 1차원 배열의 수만큼 for문 진행
            for(int j=0; j < score[i].length;j++){ // # 2차원 배열의 수만큼 for문 진행
                System.out.printf("score[%d][%d]=%d%n", i, j, score[i][j]);
            }
        }

        for (int[] tmp : score){ // # 1차원 배열의 값을 임시 값으로 저장
            for (int i : tmp){ // # 2차원 배열의 값을 i에 저장
                sum += i; // # 더하기
            }
        }

        System.out.println("sum = " + sum);
    }
}
