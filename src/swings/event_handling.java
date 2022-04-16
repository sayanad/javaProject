package swings;
import java.awt.*;
import java.awt.event.*;
public class event_handling extends Frame implements ActionListener  {
    TextField tf;
event_handling(){
    tf=new TextField();
    tf.setBounds(60,50,170,20);
    Button b=new Button("click me");
    b.setBounds(100,120,80,30);
    b.addActionListener(this);
    add(b);add(tf);
    setSize(300,300);
    setLayout(null);
    setVisible(true);


}



    public void actionPerformed( ActionEvent e) {
tf.setText("welcome");
    }

    public static void main(String[] args) {
        new event_handling();
    }
}
