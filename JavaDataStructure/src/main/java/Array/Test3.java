package Array;

public class Test3 {

    // # 공백을 '%20'으로 바꾸어라 , 게시판의 글 리스트 출력 시 사용 가능함
    void replaceSpaces(char[] str, int trueLength){
        int spaceCount = 0, index, i = 0;
        for(i = 0; i < trueLength; i++) {
            if(str[i] == ' '){
                spaceCount++; // # 2
            }
        }
        System.out.println(str);

        System.out.println(trueLength);
        System.out.println(spaceCount);
        System.out.println(i);

        index = trueLength + spaceCount * 2; // # spaceCount : 6
        System.out.println(str.length);
        if (trueLength < str.length) str[trueLength] = '\0'; // 배열의 끝
        System.out.println(str[trueLength]);
        for(i = trueLength - 1; i >= 0; i--){
            System.out.print("before : ");
            // System.out.println(str);
            if (str[i] == ' '){
                str[index - 1] = '0';
                str[index - 2] = '2';
                str[index - 3] = '%';
                index = index - 3;
            } else {
                System.out.println(str[index-5]);
                str[index - 1] = str[i];
                System.out.println(str[i]);

                index--;
            }
            System.out.print("after : ");
            System.out.println(str);
        }

    }

    public static void main(String args[]){
        Test3 test = new Test3();
        String str = "Mr John Smith";
        char[] charArray = str.toCharArray();
        //test.replaceSpaces("Mr John Smith",13);
    }
}
