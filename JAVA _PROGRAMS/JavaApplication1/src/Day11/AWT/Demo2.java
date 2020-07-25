/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day11.AWT;

import java.awt.Color;
import java.awt.Frame;
import java.awt.HeadlessException;

/**
 *
 * @author kumar
 */
public class Demo2 extends Frame{

    public Demo2() throws HeadlessException {
        setLayout(null);
        setBackground(Color.cyan);
        setLocation(400,300);
        setSize(350,350);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        Demo2 b =new Demo2();
        
    }
}
