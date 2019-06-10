package chapter05_object_oriented_programming2;
import static java.lang.System.out;
import static java.lang.Math.*;

public class StaticImportEx1 {
    public static void main(String[] args) {
        // System.out.println(Math.random());
        out.println(random());

        // System.out.println("Math.PI :" + Math.PI);
        out.println("Math.PI :" + PI);

        // # import를 추가함으로써 이렇게 소스를 간략하게 보이게 하는 것이 좋은 것인지는 생각을 더 해보아야 할 듯 하다.
    }
}
