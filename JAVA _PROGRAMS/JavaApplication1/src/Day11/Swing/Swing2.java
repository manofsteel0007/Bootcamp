/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day11.Swing;

import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author kumar
 */
public class Swing2 extends JFrame{
    JButton b1,b2;

    public Swing2() {
        setLayout(new FlowLayout());
        b1=new JButton("helo");
        b2=new JButton(new ImageIcon("C:\\Users\\kumar\\Desktop\\image.png"));
        add(b1);
        add(b2);
        setBounds(460, 140, 1000, 800);
        
        setVisible(true);
        
        
    }
    public static void main(String[] args) {
        new Swing2();
        
                
    }
    
}
