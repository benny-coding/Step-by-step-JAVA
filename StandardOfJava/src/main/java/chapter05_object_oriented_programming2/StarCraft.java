package chapter05_object_oriented_programming2;

abstract class Unit {
    int x, y;
    abstract void move(int x, int y); // # 반드시 구현해야 한다는 의미도 담겨 있다.
    void stop()  {      /* 현재 위치에 정지 */ }
}

class Marine extends Unit { // 보병
    void move(int x, int y) { /* 지정된 위치로 이동 */ }
    void stimPack()         { /* 스팀팩을 사용한다. */}
}

class Tank extends Unit { // 탱크
    void move(int x, int y) { /* 지정된 위치로 이동 */ }
    void changeMode()       { /* 공격모드를 변환한다. */}
}

class Dropship extends Unit { // 수송선
    void move(int x, int y) { /* 지정된 위치로 이동 */}
    void load()             { /* 선택된 대상을 태운다. */}
    void unload()           { /* 선택된 대상을 내린다. */}
}


public class StarCraft {
}
