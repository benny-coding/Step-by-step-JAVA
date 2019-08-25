package Array;

public class Test2 {

    // # 2.순열 관계 확인하라 : 풀이1
    public String sort(String s){
        char[] content = s.toCharArray();
        java.util.Arrays.sort(content);
        return new String(content);
    }

    public boolean premutation(String s, String t){
        if( s.length() != t.length()) {
            return false;
        }
        return sort(s).equals(sort(t));
    }
    // # str.toCharArray() : str을 새로운 문자형 배열로 저장합니다.
    // # Array.sort() : 배열을 오름차순으로 정렬합니다. 배열의 형에 상관 없이 정렬 가능
}

class Test2_2 {

    // # 풀이2
    public boolean premutation(String s, String t){
        if(s.length() != t.length()){
            return false;
        }

        int[] letters = new int[128]; // 가정

        char[] s_array = s.toCharArray();
        for(char c : s_array){ // s 내에서 각 문자의 출현 횟수를 샌다.
            letters[c]++;
        }

        for(int i = 0; i < t.length(); i++){
            int c = (int)t.charAt(i);
            letters[c]--;
            if (letters[c] < 0) {
                return false;
            }
        }

        return true;
    }


    public static void main(String args[]){
        Test2_2 test = new Test2_2();
        System.out.println(test.premutation("dog","god"));
    }
}


