package chapter05_object_oriented_programming2;

public class AbstractMethodTest {

}

abstract class Player {
    abstract void play(int pos);    // 추상메서드
    abstract void stop();           // 추상메서드
}

class AudioPlayer extends Player {
    void play(int pos) { /* 내용 생략 */} // 추상 메서드를 구현
    void stop() { /* 내용 생략 */ }       // 추상 메서드를 구현

}


abstract class AbstractPlayer extends Player {
    void play(int pos) { /* 내용 생략 */ }  // 추상메서드를 구현
}
