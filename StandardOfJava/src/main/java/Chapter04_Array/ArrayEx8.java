package Chapter04_Array;

public class ArrayEx8 {
    public static void main(String[] args) {
        int[] ball = new int[45];

        // 배열의 각 요소에 1~45의 값을 저장한다.
        for(int i=0; i < ball.length; i++){
            ball[i] = i + 1;
        }

        int temp = 0; //  두 값을 바꾸는데 사용할 임시변수
        int j = 0;    // 임의의 값을 얻어서 저장할 변수

        // 배열의 i번째 요소와 임의의 요소에 저장된 값을 서로 바꿔서 값을 섞는다
        // 0번째 부터 5번째 요소까지  모두 6개만 바꾼다.
        for(int i=0; i < 6; i++){
            j = (int)(Math.random() * 45); // # 1~45까지의 수 중 난수 구하기
            temp = ball[i]; // # i번째 값을 임시 값으로 저장
            ball[i] = ball[j]; // # 난수 번째의 값을 i번째 값으로 저장
            ball[j] = temp; // # 임시 값을 난수 번째 값으로 저장
        }

        // 배열 ball의 앞에서부터 6개의 요소를 출력한다.
        for(int i=0; i < 6; i++){
            System.out.printf("ball[%d]=%d%n", i, ball[i]); // # 1~45의 숫자가 있는 배열을 섞은 후 앞 6자리까지만 보여준다.
        }
    }
}
