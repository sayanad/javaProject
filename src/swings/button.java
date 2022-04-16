package swings;
import java.awt.*;
import java.awt.event.*;

public class button {
    public static void main(String[] args) {

        Frame f = new Frame();
        Button b = new Button("button");

        b.setBounds(50,100,80,30);
        f.add(b);

        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);


    }



}