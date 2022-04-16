package swings;
import java.awt.*;
import java.awt.event.*;
public class label {
    public static void main(String[] args) {
        Frame f=new Frame("this is a new frame");
        Label l1=new Label("1 st label");
        Label l2=new Label("2 nd label");
        l1.setBounds(50, 100, 100, 30);
        l2.setBounds(50, 150, 100, 30);
        f.add(l1);
        f.add(l2);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}
