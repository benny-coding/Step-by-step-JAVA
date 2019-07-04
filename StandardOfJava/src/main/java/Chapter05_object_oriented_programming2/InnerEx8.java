package Chapter05_object_oriented_programming2;
import java.awt.*;
import java.awt.event.*;

public class InnerEx8 {
    public static void main(String[] args) {
        Button b = new Button("Start");
        b.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    System.out.println("ActionEvent occurered!!!");
                }
            }  // 익명 클래스의 끝
        );
    } // main의 끝
} // InnerEx8의 끝
