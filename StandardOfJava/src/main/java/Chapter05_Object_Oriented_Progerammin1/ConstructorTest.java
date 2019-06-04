package Chapter05_Object_Oriented_Progerammin1;

class Data1 {
    int value;
}

class Data2_1 {
    int value;

    Data2_1(int x) {
        value = x;
    }
}


public class ConstructorTest {
    public static void main(String[] args){
        Data1 d1 = new Data1();
        Data2_1 d2 = new Data2_1(10);     // compile error 발생
    }
}
