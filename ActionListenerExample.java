package myfirstproject;



import java.awt.*;  
import java.awt.event.*;  
public class ActionListenerExample {  
public static void main(String[] args) {  
    Frame f=new Frame("ActionListener ");  
    final TextField tf=new TextField();  
    tf.setBounds(50,50, 150,20);  
    Button b=new Button("Motu");  
    b.setBounds(50,100,60,30);  
  
    b.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
            tf.setText("gande insaan");  
    }  
    });  
    f.add(b);f.add(tf);  
    f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true);   
}  
}  