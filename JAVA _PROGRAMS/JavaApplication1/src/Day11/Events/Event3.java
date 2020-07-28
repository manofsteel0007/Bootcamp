/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day11.Events;

/**
 *
 * @author kumar
 */
import java.awt.*;  
import java.awt.event.*;  
public class Event3 extends Frame implements MouseListener{  
    Label l;  
    Event3(){  
        addMouseListener(this);  
          
        l=new Label();  
        l.setBounds(20,50,100,20);  
        add(l);  
        setSize(300,300);  
        setLayout(null);  
        setVisible(true);  
    }  
    public void mouseClicked(MouseEvent e) {  
        l.setText("Mouse Clicked");  
    }  
    public void mouseEntered(MouseEvent e) {  
        l.setText("Mouse Entered");  
    }  
    public void mouseExited(MouseEvent e) {  
        l.setText("Mouse Exited");  
    }  
    public void mousePressed(MouseEvent e) {  
        l.setText("Mouse Pressed");  
    }  
    public void mouseReleased(MouseEvent e) {  
        l.setText("Mouse Released");  
    }  
public static void main(String[] args) {  
    new Event3();  
}  
}

