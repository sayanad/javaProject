package swings;
import java.awt.*;
import java.awt.event.*;
public class textfield {
    public static void main(String[] args) {
        Frame f=new Frame();
        TextField tf=new TextField("hello");
        tf.setBounds(50, 100, 200, 30);
        TextField tf1=new TextField("hi2");
        tf1.setBounds(50, 150, 200, 30);
        f.add(tf);
        f.add(tf1);
        f.setSize(400,400);
        f.setVisible(true);
        f.setLayout(null);



    }
}
