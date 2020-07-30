/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dashboard;

import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author kumar
 */
public class Dashboard_frame extends JFrame{
    JFrame f=new JFrame();
    String main_user_name;
    String main_name;
    public Dashboard_frame(String main_user_name,String main_name) {
        this.main_user_name=main_user_name;
        this.main_name=main_name;
        f.setBounds(460, 140, 1000, 800);
        f.setBackground(Color.WHITE);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {  
        int a=JOptionPane.showConfirmDialog(f,"Are you sure?");  
        if(a==JOptionPane.YES_OPTION){  
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        } 
        }
        });
        f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    }
    
}
