package myfirstproject;
 import java.awt.GraphicsConfiguration;
 import javax.swing.JFrame;
 
public class JFrameSize {
static GraphicsConfiguration gc;
public static void main(String args[])
{
	JFrame frame = new JFrame(gc);frame.setTitle("welcome to java Swing");
	frame.setSize(600,400);
	frame.setVisible(true);
			
	
}
}
