package Chapter04_Array;

public class ArrayEx14 {
    public static void main(String[] args) {
        String src = "ABCDE";

        for(int i=0; i < src.length(); i++) {
            char ch = src.charAt(i);
            System.out.println("src.charAt("+i+"):"+ch);
        }

        char[] chArr = src.toCharArray();   // String을 char[]로 변환

        System.out.println(chArr);  // char배열(char[]}을 출력
    }
}
