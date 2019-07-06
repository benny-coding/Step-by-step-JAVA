package Chapter06_Object_Oriented_Programming2;

final class Singleton {
    private static Singleton s = new Singleton();

    private Singleton() {
        //...
    }

    public static Singleton getInstance() {
        if(s==null){
            s = new Singleton();
        }
        return s;
    }
    // ...
}

public class SingletonTest {
    public static void main(String[] args) {
        // Singleton s = new Singleton(); 생성자가 private로 선언되었기 때문에 인스턴스화가 불가능 하다
        Singleton s = Singleton.getInstance();
    }
}
