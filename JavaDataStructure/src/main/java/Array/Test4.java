package Array;


/* # 질문 :  1. 회문 순열이란 무엇이고 예제는 어떤 기준에 대한 예제인가
            2. getnumericValue에 대한 이해가 부족
 */
public class Test4 {

    boolean isPermutationOfPalindrome(String phrase){
        int[] table = buildCharFrequencyTable(phrase);
        return checkMaxOneOdd(table);
    }

    /* 홀수 문자가 한 개 이상 존재하는지 확인한다. */
    boolean checkMaxOneOdd(int[] table){
        boolean foundOdd = false;
        for (int count : table){
            if (count % 2 == 1){
                if(foundOdd) {
                    return false;
                }
                foundOdd = true;
            }
        }
        return true;
    }

    /* 각 문자에 숫자를 대응시킨다. a -> 0, b -> 1, c -> 2, 등등.
     * 대소문자 구분이 없고, 문자가 아닌 경우에는 -1로 대응시킨다. */
    static int getCharNumber(Character c){
        int a = Character.getNumericValue('a');
        int z = Character.getNumericValue('z');
        int val = Character.getNumericValue(c);
        if (a <= val && val <= z) {
            return val - a;
        }
        return -1;
    }

    // # getNumericValue

    /* 각 문자가 몇 번 등장했는지 센다. */
    int[] buildCharFrequencyTable(String phrase){
        int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];

        for(char c : phrase.toCharArray()) {
            int x = getCharNumber(c);
            if (x != -1){
                table[x]++;
            }
        }
        return table;
    }


}

class Test4_2 {

boolean isPermuntationOfPalindrome(String phrase) {
    int countOdd = 0;
    int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];

    for(char c : phrase.toCharArray()) {
        int x = Test4.getCharNumber(c);
        if (x != -1){
            table[x]++;
            if(table[x] % 2 == 1){
                countOdd++;
            } else {
                countOdd--;
            }
        }
    }
    return countOdd <= 1;
 }

}

class Test4_3 {

}

class TestMain4 {
    public static void main(String args[]){
        Test4_2 test = new Test4_2();
        String str = "Mr John Smith";
        char[] charArray = str.toCharArray();
        System.out.println(test.isPermuntationOfPalindrome("abcddddccba"));
        char char_value = 'a';
        System.out.println(Character.getNumericValue(char_value));
    }
}
