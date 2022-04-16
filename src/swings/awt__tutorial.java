package swings;

import java.awt.*;

public class awt__tutorial {
    awt__tutorial(){
        Frame f=new Frame();
        Label l=new Label("employee id");

        TextField tf=new TextField();
        Button b=new Button("submit");

        l.setBounds(20, 80, 80, 30);
        b.setBounds(20, 100, 80, 30);
        tf.setBounds(100, 100, 80, 30);
        f.add(l);
        f.add(b);
        f.add(tf);

        f.setSize(400,300);
        f.setTitle("employe info");
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        awt__tutorial a=new awt__tutorial();
    }
}
