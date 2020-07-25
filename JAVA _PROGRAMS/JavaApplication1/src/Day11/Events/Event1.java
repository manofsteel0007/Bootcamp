/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day11.Events;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author kumar
 */
public class Event1 extends Frame{
    Button b1,b2;

    public Event1() {
        setLayout(null);
        b1=new Button();
        b2=new Button();
        b1.setLabel("Click");
        b1.setBounds(100, 100, 100, 100);
        b2.setBounds(250, 100, 100, 100);
        setBounds(460, 140, 1000, 800);
        setBackground(Color.GRAY);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setBackground(Color.yellow);
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setBackground(Color.green);
            }
        });
        
        add(b1);
        add(b2);
    }
    
}
