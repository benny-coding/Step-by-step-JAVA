package Chapter05_object_oriented_programming2;

public class BindingTest {
    public static void main(String[] args) {
        Parent3 p = new Child3();
        Child3 c = new Child3();

        System.out.println("p.x = " + p.x); // # 변수는 참조변수 타입의 영향을 받는다
        p.method(); // # 메서드는 항상 인스턴스 타입의 영향을 받는다

        System.out.println("c.x = " + c.x);
        c.method();
    }
}

class Parent3 {
    int x = 100;

    void method() {
        System.out.println("Parent Method");
    }
}

class Child3 extends Parent3 {
    int x = 200;

    void method() {
        System.out.println("Child Method");
    }
}