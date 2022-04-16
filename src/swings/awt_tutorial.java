package swings;
import  java.awt.*;
public class awt_tutorial extends Frame {
    awt_tutorial(){
        Button b=new Button("click me");

        b.setBounds(30,100,80,30);
        add(b);
        setSize(300,300);
        setTitle("this is our basic awt example");
        setLayout(null);
        setVisible(true);

    }

    public static void main(String[] args) {
        awt_tutorial ff=new awt_tutorial();

    }
}

