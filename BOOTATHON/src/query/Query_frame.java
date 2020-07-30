/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package query;

import admin.Admin_frame;
import assessment.Assessment_frame;
import dashboard.Dashboard_frame;
import forum.Forum_frame;
import java.awt.*;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.Border;
import static javax.swing.ScrollPaneConstants.*;
import login.*;
/**
 *
 * @author kumar
 */

public class Query_frame extends JFrame implements ActionListener,MouseListener,Runnable{
    JFrame f=new JFrame();
    JPanel p1,p2,p3;
    JLabel l1,l2,l3;
    JButton b1,b10,b11,b12,b13,b14,b15,b16;
    JTextArea tf1;
    JScrollPane sp1;
    JTextField tf3;
    Color c1=new Color(0,116,217);
    Color c2=new Color(225,50,3);
    Color c3=new Color(241, 241, 223);
    
    String main_user_name;  //rollno of the user
    String main_name;   //name of the user 
    
    String name;
    String user_name;
    String msg_user;
    String msg_send;
      
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b1){
            msg_send=tf3.getText();
            tf3.setText(null);
            sendMsg();
        }
    }
    
    public void run(){
        while(true){
            try {
                getMsg();
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
    
    public void StartThread()
    {
        new Thread(this).start();
    }
    
    void sendMsg(){
        final String Driver="oracle.jdbc.driver.OracleDriver";
        final String connect="jdbc:oracle:thin:@127.0.0.1:1521:XE";
        try {
            Class.forName(Driver);
            Connection con=DriverManager.getConnection(connect,"bootathon","admin");
            Statement st=con.createStatement();
            String query="insert into query_forum values ('"+main_user_name+"','"+main_name+"','"+msg_send+"') ";
            st.executeUpdate(query);
                                   
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e+" Error Insering msg");
        }
    }
    
    void getMsg(){
        String UserMsg="";
        final String Driver="oracle.jdbc.driver.OracleDriver";
        final String connect="jdbc:oracle:thin:@127.0.0.1:1521:XE";
        try {
            Class.forName(Driver);
            Connection con=DriverManager.getConnection(connect,"bootathon","admin");
            Statement st=con.createStatement();
            String query="Select * from query_forum";
            ResultSet rs=st.executeQuery(query);
            
            while(rs.next()){
                user_name=rs.getString("user_name");
                name=rs.getString("name");
                msg_user=rs.getString("msg_send");
                if(user_name.equals(main_user_name))
                    UserMsg=UserMsg +" "+ name+" ("+user_name+") : "+msg_user+".\n\n";
            }
            tf1.setText(UserMsg);
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e+" Error Displaying Table");
        }
    }
        
    public static void main(String[] args) {
        new Query_frame("18eumc070","Krishnan").StartThread();
    }
    
    public Query_frame(String main_user_name,String main_name) throws HeadlessException {
        this.main_user_name=main_user_name;  //rollno
        this.main_name=main_name;   //name
        
        p1=new JPanel();    //notification panel
        p2=new JPanel();    //head panel
        p3=new JPanel();    //forum
        
        l1=new JLabel("Bootcamp");
        l2=new JLabel("Query");
        l3=new JLabel("Query :");
        
        tf1=new JTextArea("");
        tf3=new JTextField("");
        
        sp1=new JScrollPane(tf1);
                
        b1=new JButton("Send");
        
        b10=new JButton("Dashboard");
        b11=new JButton("Forum");
        b12=new JButton("Assessment");
        b13=new JButton("Query");
        b14=new JButton("Admin");
        b15=new JButton("Setting");
        b16=new JButton("Logout");
                
        p1.setBounds(5,5,250,800);
        p2.setBounds(258,5,727,200);
        p3.setBounds(258, 205,  727, 640);
       
        l1.setBounds(10, 20, 250, 40);
        l2.setBounds( 270, 50, 500, 30);
        l3.setBounds(300, 220, 300, 30);
       
        b1.setBounds(850, 700, 100, 30);

        tf3.setBounds(300, 700, 500, 30);
        
        sp1.setBounds(300, 260, 600, 370);
        sp1.setHorizontalScrollBarPolicy(HORIZONTAL_SCROLLBAR_NEVER);
        
        b10.setBounds(5,120,250 , 30);
        b11.setBounds(5,160,250 , 30);
        b12.setBounds(5,200,250 , 30);
        b13.setBounds(5,240,250 , 30);
        b14.setBounds(5, 280, 250, 30);
        b15.setBounds(5,650,250,30);
        b16.setBounds(67,725,126,25);
        
        
        b1.setFocusPainted(false);
        
        b10.setBorderPainted(false);
        b11.setBorderPainted(false);
        b12.setBorderPainted(false);
        b13.setBorderPainted(false);
        b14.setBorderPainted(false);
        b15.setBorderPainted(false);
        b16.setBorderPainted(false);
        
        b10.setFocusPainted(false);
        b11.setFocusPainted(false);
        b12.setFocusPainted(false);
        b13.setFocusPainted(false);
        b14.setFocusPainted(false);
        b15.setFocusPainted(false);
        b16.setFocusPainted(false);
        
        
        p1.setBackground(c1);
        p2.setBackground(c2);
        p3.setBackground(c3);
        
        b1.setBorder(new RoundedBorder(20));
           
        b10.setBackground(c1);
        b11.setBackground(c1);
        b12.setBackground(c1);
        b13.setBackground(c2);
        b14.setBackground(c1);
        b15.setBackground(c1);
        b16.setBackground(Color.BLACK);
        
        l1.setForeground(c3);
        l2.setBackground(c3);
        b10.setForeground(c3);
        b11.setForeground(c3);
        b12.setForeground(c3);
        b13.setForeground(c3);
        b14.setForeground(c3);
        b15.setForeground(c3);
        b16.setForeground(c3);
        
        tf1.setLineWrap(true);
        tf1.setWrapStyleWord(true);
        
        l1.setFont(new Font("Verdana",Font.PLAIN,30));
        l2.setFont(new Font("Verdana",Font.BOLD,30));
        l3.setFont(new Font("Verdana",Font.BOLD,18));
        b1.setFont(new Font("Verdana",Font.PLAIN,16));
        
        tf1.setFont(new Font("Verdana",Font.PLAIN,14));
        tf3.setFont(new Font("Verdana",Font.PLAIN,14));
                
        b10.setFont(new Font("Verdana",Font.PLAIN,20));
        b11.setFont(new Font("Verdana",Font.PLAIN,20));
        b12.setFont(new Font("Verdana",Font.PLAIN,20));
        b13.setFont(new Font("Verdana",Font.PLAIN,20));
        b14.setFont(new Font("Verdana",Font.PLAIN,20));
        b15.setFont(new Font("Verdana",Font.PLAIN,20));
        b16.setFont(new Font("Verdana",Font.PLAIN,12));
        
        b1.addActionListener(this);
                
        b10.addMouseListener(this);
        b11.addMouseListener(this);
        b12.addMouseListener(this);
        b13.addMouseListener(this);
        b14.addMouseListener(this);
        b15.addMouseListener(this);
        
        f.add(l1);
        f.add(l2);
        f.add(b1);
        f.add(l3);
        f.add(sp1);
        f.add(tf3);
        f.add(b10);
        f.add(b11);
        f.add(b12);
        f.add(b13);
        f.add(b14);
        f.add(b15);
        f.add(b16);
        f.add(p1);
        f.add(p2);
        f.add(p3);
        
                
        p3.setLayout(null);
              
        f.setResizable(false);
        f.setBounds(460, 140, 1000, 800);
        f.setBackground(Color.GRAY);
        f.setVisible(true);
        
        b16.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            int a=JOptionPane.showConfirmDialog(f,"Are you sure?");  
            
            if(a==JOptionPane.YES_OPTION){  
                f.dispose();
                new Logins();
            } 
        }
        });
        
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
    
    public void mouseClicked(MouseEvent e){
        if(e.getSource()==b10){
            b11.setBackground(c1);
            b12.setBackground(c1);
            b13.setBackground(c1);
            b14.setBackground(c1);
            b15.setBackground(c1);
            b10.setBackground(c2);
            f.dispose();
            new Dashboard_frame(main_user_name, main_name);
        }
        else if(e.getSource()==b11){
            b10.setBackground(c1);
            b12.setBackground(c1);
            b13.setBackground(c1);
            b14.setBackground(c1); 
            b15.setBackground(c1);
            b11.setBackground(c2);
            f.dispose();
            new Forum_frame(main_user_name, main_name).StartThread();
        }
        else if(e.getSource()==b12){
            b10.setBackground(c1);
            b11.setBackground(c1);
            b13.setBackground(c1);
            b14.setBackground(c1);
            b15.setBackground(c1);
            b12.setBackground(c2);
            f.dispose();
            new Assessment_frame(main_user_name, main_name);
        }
        else if(e.getSource()==b13){
            b10.setBackground(c1);
            b11.setBackground(c1);
            b12.setBackground(c1);
            b14.setBackground(c1);
            b15.setBackground(c1);
            b13.setBackground(c2);
//            f.dispose();
//            new Query_frame(main_user_name, main_name).StartThread();
            
        }
        else if(e.getSource()==b14){
            b10.setBackground(c1);
            b11.setBackground(c1);
            b12.setBackground(c1);
            b13.setBackground(c1);
            b15.setBackground(c1);
            b14.setBackground(c2);
            
            new Admin_frame(main_user_name, main_name);
            
        }
        else if(e.getSource()==b15){
            b10.setBackground(c1);
            b11.setBackground(c1);
            b12.setBackground(c1);
            b13.setBackground(c1);
            b14.setBackground(c1);
            b15.setBackground(c2);
            new Setting_frame(main_user_name, main_name);
        }
    }
    
    private static class RoundedBorder implements Border {
        private int radius;

        RoundedBorder(int radius) {
            this.radius = radius;
        }

        public Insets getBorderInsets(Component c) {
            return new Insets(this.radius+1, this.radius+1, this.radius+2, this.radius);
        }

        public boolean isBorderOpaque() {
            return true;
        }

        public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
            g.drawRoundRect(x, y, width-1, height-1, radius, radius);
        }
    }
    
    @Override
    public void mouseEntered(MouseEvent e) {  
        }  
    public void mouseExited(MouseEvent e) {  
        }  
    public void mousePressed(MouseEvent e) {  
        }  
    public void mouseReleased(MouseEvent e) {  
        }
    
}
