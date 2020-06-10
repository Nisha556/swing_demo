package myfirstproject;


import java.awt.FlowLayout;  
import javax.swing.JButton;  
import javax.swing.JFrame;  
import javax.swing.JLabel;  
import javax.swing.Jpanel;  

public class JFrameExample {  
    public static void main(String s[]) {  
        JFrame frame = new JFrame("JFrame Example"); 
        JPanel panel = new JPanel();  
        panel.setLayout(new FlowLayout());  
        JLabel label = new JLabel("JFrame By Example");  
          
     
        
              panel.add(heading); 
              frame.add(panel); 
        frame.setSize(200, 300);  
        frame.setLocationRelativeTo(null);  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        frame.setVisible(true);  
    }  
}  
