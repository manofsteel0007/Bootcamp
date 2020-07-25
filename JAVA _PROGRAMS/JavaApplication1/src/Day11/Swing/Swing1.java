/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day11.Swing;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import java.awt.Container;
/**
 *
 * @author kumar
 */
public class Swing1 extends JFrame {

    public Swing1() {
    
        setLayout(new FlowLayout());
        Container c=getContentPane();
        c.setBackground(Color.yellow);
        setSize(500,500);
        setVisible(true);
    
    }
    public static void main(String[] args) {
        new Swing1();
    }
}
