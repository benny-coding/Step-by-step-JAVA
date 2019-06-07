package Chapter05_Object_Oriented_Programming1;

public class VarArgsEx {
    public static void main(String[] args) {
        String[] strArr = { "100", "200", "300"};

        System.out.println(concatenate("","100", "200", "300"));
        System.out.println(concatenate("-", strArr));
        System.out.println(concatenate(",", new String[]{"1", "2", "3"}));
        System.out.println("[" + concatenate(",", new String[0]) + "]");
        System.out.println("[" + concatenate(",") +"]");
    }

    static String concatenate(String delim, String... args) {
        String result = "";

        for(String str : args) {
            result += str + delim;
        }

        return result;
    }

    /* # 가변인자를 사용한 메서드는 오버로딩 시에 메서드의 구분이 되지 않아 컴파일 에러를 뱉기도 한다
         그러므로 가변인자를 사용한 메서드는 되도록 오버로팅 하지 않기로 하자!
        static String concatenate(String... args) {
            return concatenate("", args);
        }

     */
}
