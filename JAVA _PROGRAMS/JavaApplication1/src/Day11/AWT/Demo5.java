/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day11.AWT;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.*;

/**
 *
 * @author kumar
 */
public class Demo5 extends Frame {
    Label l1,l2;
    TextField t1,t2;
    Button b1;

    public Demo5() {
        setLayout(null);
        setBackground(Color.gray);
        l1=new Label("UserName");
        l2=new Label("Password");
        t1=new TextField();
        t2=new TextField();
        b1=new Button("Submit");
        l1.setBounds(100, 100, 230, 30);
        l2.setBounds(100, 200, 230, 30);
        t1.setBounds(200,100, 230,30);
        t2.setBounds(200, 200, 230, 30);
        b1.setBounds(150,250,230,30);
        add(l1);
        add(l2);
        add(t1);
        add(t2);
        add(b1);
        setSize(500,500);
        setBackground(Color.yellow);
        setResizable(false);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Demo5();
        
    }
}
