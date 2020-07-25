/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day11.AWT;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;

/**
 *
 * @author kumar
 */
public class Demo4 extends Frame {

    public Demo4() {
        setLayout(null);
        Button b1,b2;
        b2=new Button();
        b1=new Button("hello world");
        b1.setBounds(100, 100, 200, 30);
        b2.setBounds(100, 160, 200, 30);
        b1.setBackground(Color.red);
        add(b1);
        add(b2);
        setBackground(Color.DARK_GRAY);
        setSize(400,400);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Demo4();
        
    }
    
}
