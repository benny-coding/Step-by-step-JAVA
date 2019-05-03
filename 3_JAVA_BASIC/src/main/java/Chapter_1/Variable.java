package Chapter_1;

public class Variable {
    public static void main(String[] args) {
        int score = 100;
        char ch = 'A';
        String str = "aBc";
        final int MAX = 100;

        boolean bool = true; // # 불린형 true / false
        System.out.println(bool);

        byte b = 1; // # byte형 1byte -128 ~ 127
        System.out.println(b);

        char c = 'A'; // # char형 2byte 모든 유니코드 문자
        System.out.println(c);

        short s = 10; // # short 2byte -32768 ~ 32767
        System.out.println(s);

        int i = 100; // # int형 4byte -21억 ~ 21억
        System.out.println(i);

        float f = 3.14f; // # float형 실수형 4byte
        System.out.println(f);

        long l = 1000l; // # long형 정수형 8byte
        System.out.println(l);

        double d = 3.14159265; // # double형 실수형 4byte
        System.out.println(d);

        System.out.println("-------------------------------");
        int i1 = 10;
        System.out.println(i1);
        i1 = -i1;
        System.out.println(i1);
        ++i1;
        System.out.println(i1);
        --i1;
        System.out.println(i1);
        System.out.println(i1++);
        System.out.println(i1);
        System.out.println(++i1);
        System.out.println("-------------------------------");
        int x = 10;
        int y = 10;

        if(x!=y){
            System.out.println("문장이 실행됩니다");
        }

        if(x==10 && y==10){
            System.out.println("x가 10이면서 y가 10일 때");
        }

        if(x==10 || y==10){
            System.out.println("x가 10이거나 y가 10일 때");
        }

        int z = (x>11)? x:-x;
        System.out.println(z);





    }

}
