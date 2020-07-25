/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day11.Swing;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

/**
 *
 * @author kumar
 */
class A extends JPanel{

    public A() {
        add(new Button("click"));
        add(new Button("click"));
        add(new Button("click"));
        add(new Button("click"));
        setBackground(Color.red);
    }
   
}
class B extends JPanel{

    public B() {
        add(new Button("Submit"));
        add(new Button("Submit"));
        add(new Button("Submit"));
        add(new Button("Submit"));
        setBackground(Color.green);
    }
   
}
public class Swing3 extends JFrame{
    JTabbedPane t;

    public Swing3() throws HeadlessException {
        
        t=new JTabbedPane(JTabbedPane.LEFT);
        t.addTab("Desktop", new A());
        t.addTab("Screen S", new B());
        add(t,BorderLayout.CENTER);
        setSize(1000, 800);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
    }
    public static void main(String[] args) {
        new Swing3();
        
    }
    
}
