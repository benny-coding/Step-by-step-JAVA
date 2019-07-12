package Chapter07_Exception_Handling;

public class ExceptionEx8 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        try {
            System.out.println(3);
            System.out.println(0/0); // 예외발생!!!
            System.out.println(4);   // 실행되지 않음
        } catch (ArithmeticException ae){
            ae.printStackTrace();
            System.out.println("예외메시지 : " + ae.getMessage());

        } // try의 끝
        System.out.println(6);
    }   // main 메서드의 끝
}
