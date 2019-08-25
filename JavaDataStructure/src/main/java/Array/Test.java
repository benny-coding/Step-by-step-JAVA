package Array;

public class Test {


    // # 1.문자열에 중복되는 문자가 있는가?
    String isUniqueChars(String str) {
        if(str.length() > 128) return " 중복이 있습니다.";
        boolean[] char_set = new boolean[128];
        for(int i = 0; i < str.length(); i++){
            int val = str.charAt(i);
            if(char_set[val]) { // 이 문자는 이미 문자열 내에 있음
                return "중복이 있습니다.";
            }
            char_set[val] = true;
        }
        return "중복이 없습니다.";
    }
    // # str.charAt[i] : str 문자열에서 인덱스 i에 해당하는 문자를 추출한다.



    public static void main(String args[]){
        Test test = new Test();
        System.out.println(test.isUniqueChars("abcdefgc"));
    }


}
