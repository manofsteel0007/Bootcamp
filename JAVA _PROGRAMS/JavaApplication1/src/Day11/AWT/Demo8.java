/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day11.AWT;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Label;

/**
 *
 * @author kumar
 */
public class Demo8 extends Frame {
    Label l1;
    
    public Demo8() {
        setLayout(null);
        setBackground(Color.yellow);
        setSize(1000,800);
        setLocation(460, 140);
        //setBounds(460, 140, 1000, 800);
        l1=new Label();
        l1.setText("Hello world");
        l1.setBounds(100, 200, 100, 200);
        add(l1);
        setVisible(true);
    
    }
    
    public void paint(Graphics g){
        g.setFont(new Font("Verdana",Font.BOLD,16));
        g.drawString("hai", 100, 200);
        g.drawRect(300 , 100, 200, 400);
        g.drawOval(100, 400, 200, 200);
    }
    
    public static void main(String[] args) {
        new Demo8();
        
    }
    
}
