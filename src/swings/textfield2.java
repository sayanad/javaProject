package swings;
import java.awt.*;
import java.awt.event.*;
public class textfield2 extends Frame implements ActionListener {
    TextField tf1,tf2,tf3;
    Button b1,b2;
    Label l2;
    textfield2(){


        tf1=new TextField();
        tf1.setBounds(50, 50, 250, 20);
        tf2=new TextField();
        tf2.setBounds(50, 100, 150, 20);
        tf3=new TextField();
        tf3.setBounds(50, 150, 150, 20);
        b1=new Button("+");
        b1.setBounds(50, 200, 50, 50);
        b2=new Button("-");
        b2.setBounds(120,200,50,50);
        b1.addActionListener(this);
        b2.addActionListener(this);
        add(tf1);add(tf2);add(tf3);add(b1);add(b2);
        setSize(400,400);
        setLayout(null);
        setVisible(true);










    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String s1=tf1.getText();
        String s2= tf2.getText();
        int a=Integer.parseInt(s1);
        int b=Integer.parseInt(s2);
        int c=0;
        if(e.getSource()==b1){
            c=a+b;
        }
        else if(e.getSource()==b2){
            c=a-b;
        }
        String result=String.valueOf(c);
        tf3.setText(result);
    }

    public static void main(String[] args) {
        new textfield2();
    }
}
