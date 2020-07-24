/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day11;

import com.sun.glass.ui.Cursor;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author kumar
 */
public class Demo3 extends Frame implements ActionListener{
    TextField t1,t2;
    Button b;
    Label l1,l2;
    String ip,ip2;
    static int v=0;
    public void actionPerformed(ActionEvent e){
        try{
            String host =t1.getText();
            ip=java.net.InetAddress.getByName(host).getHostAddress();
            System.out.println("IP of "+host+" "+ip);
            String host2=t2.getText();
            ip2=java.net.InetAddress.getByName(host2).getHostAddress();
            System.out.println("IP of "+host2+" "+ip2);
            v=1;
            l1.setText(ip);
        l2.setText(ip2);
        }
        catch(Exception ex){
            System.out.println(ex);
        }
    }
    void frame(){
        Frame f=new Frame();
        f.setLayout(null);
        t1=new TextField("");
        t2=new TextField();
        t1.setBounds(100, 100, 100, 30);
        t2.setBounds(100, 200, 100, 30);
        b=new Button("Submit");
        b.setBounds(300, 150, 100, 50);
        b.addActionListener(this);
        
        l1=new Label();
        l2=new Label();
        l1.setText(ip);
        l2.setText(ip2);
        f.add(t1);
        f.add(t2);
        f.add(b);
        f.add(l1);
        f.add(l2);
        l1.setBounds(100, 240, 100, 30);
        l2.setBounds(100, 270, 100 , 30);
        f.setBackground(Color.CYAN);
        f.setBounds(100, 100, 600, 350);
        f.setVisible(true);    
    }
    public static void main(String[] args) {
        new Demo3().frame();
        if(v==1)
        {
            Cursor.setVisible(false);
        }
    }
}
