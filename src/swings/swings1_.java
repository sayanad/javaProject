package swings;
import javax.swing.*;
public class swings1_ {
    JFrame j;
   swings1_(){
       j=new JFrame();
       JButton b=new JButton("click");
       b.setBounds(130,100,100,40);
       j.add(b);


       j.setSize(400,500);
       j.setLayout(null);
       j.setVisible(true);


   }

    public static void main(String[] args) {
        new swings1_();
    }
}
