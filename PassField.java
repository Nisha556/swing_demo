package myfirstproject;
import javax.swing.*;

public class PassField {
public static void main (String args[])
{
	JFrame f = new  JFrame("password field example");
	JPasswordField p = new JPasswordField();
	JLabel l1 = new JLabel("password");
	l1.setBounds(20,100,80,30);
	p.setBounds(100,100,100,30);
	
	f.add(l1);
	f.setSize(300,300);
	f.setLayout(null);
	f.setVisible(true);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}
