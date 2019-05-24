package Chapter04_Array;

public class ArrayEx4_1 {
    public static void main(String[] args) {

        // 45개의 정수값을 입력하기 위한 배열 생성
        int[] ball = new int[45];

        // 배열의 각 요소에 1~45의 값을 저장한다.
        for (int i = 0; i < ball.length; i++) {
            ball[i] = i + 1;
        }

        int tmp = 0;  // 두 값을 바꾸는데 사용할 임시변수
        int j = 0;    // 임의의 값 얻어서 저장할 변수

        // 배열에서 저장된 값이 잘 섞이도록 충분히 큰 반복횟수를 지정한다
        // 배열의 첫번째 요소와 임의의 요소에 저장된 값을 서로 바꿔서 값을 섞는다.
        for (int i = 0; i < 100; i++) {
            j = (int) (Math.random() * 45);
            tmp = ball[0];
            ball[0] = ball[j];
            ball[j] = tmp;
        }
        for (int i = 0; i < 6; i++) {
            System.out.print(ball[i] + " ");
        }
    }
}

