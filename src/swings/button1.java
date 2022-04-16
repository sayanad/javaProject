package swings;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class button1 {
    Frame f;
    Button b1,b2,b3;
    button1(){
        f=new Frame("this is a new frame");
        b1=new Button();
        b2=new Button("2nd button");
        b3=new Button();
        b3.setLabel("3rd button");
        f.add(b1);
        f.add(b2);
        f.add(b3);

        f.setLayout(new FlowLayout());
        f.setSize(400,400);
        f.setVisible(true);

    }

    public static void main(String[] args) {
        new button1();
    }

}
