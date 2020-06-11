package myfirstproject;
import javax.swing.*;

public class TextArea {
	public static void main(String args[])
	{
		JFrame f = new JFrame();
		JTextArea area = new JTextArea("Reamrks");
		area.setBounds(10,30,300,200);
		f.add(area);
		f.setSize(300,300);
		f.setLayout(null);
		f.setVisible(true);
	}

}
