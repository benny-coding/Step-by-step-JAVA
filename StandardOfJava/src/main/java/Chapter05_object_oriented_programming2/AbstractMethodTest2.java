package Chapter05_object_oriented_programming2;

class CDPlayer extends Player {
    void play(int currentPos) {
        /* 조상의 추상메서드를 구현. 내용 생략 */
    }

    void stop() {
        /* 조상의 추상메서드를 구현. 내용 생략 */
    }

    int currentTrack;  // 현재 재생 중인 트랙

    void nextTrack() {
        currentTrack++;
    }

    void preTrack() {
        if(currentTrack > 1) {
            currentTrack--;
        }
    }
}

public class AbstractMethodTest2 {
}
