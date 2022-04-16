package swings;
import java.awt.*;
import java.awt.event.*;
public class event_annonymus extends Frame {
    TextField tf;
    event_annonymus(){
        tf=new TextField();
        tf.setBounds(60,50,170,20);
        Button b=new Button("click me");
        b.setBounds(50,120,80,30);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText("hello");

            }
        });
        add(b);add(tf);
        setSize(300,300);
        setLayout(null);
        setVisible(true);


    }

    public static void main(String[] args) {
        new event_annonymus();
    }
}
