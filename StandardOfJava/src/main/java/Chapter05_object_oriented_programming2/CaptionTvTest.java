package Chapter05_object_oriented_programming2;

class Tv{
    boolean power;  // 전원상태( on / off )
    int channel;    //  채널

    void power()        { power = !power;}
    void channelUp()    { ++channel;    }
    void channelDown()  { --channel;    }
}



class CaptionTv extends Tv {
    boolean caption;    // 캡션상태(on/off)
    void displayCaption(String text){
        if(caption){    // 캡션 상태가 on(true)일 때만 text를 보여 준다.
            System.out.println(text);
        }
    }
}

public class CaptionTvTest {
    public static void main(String args[]){
        CaptionTv ctv = new CaptionTv();
        ctv.channel = 10;
        ctv.channelUp();
        System.out.println(ctv.channel); // # Tv 클래스에서 선언된 변수와 메소드 적용
        ctv.displayCaption("Hello, World"); // # CaptionTv 클래스의 변수 caption의 기본 값은 false
        ctv.caption = true;
        ctv.displayCaption("Hello, World");

    }
}