/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assessment;

import assessment.sql_creation.TestDetails_Result;
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
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kumar
 */
//class A extends Thread{
//    public void start(JButton button){
//        this.run(button);
//    }
//    public void run(JButton button){
//        button.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                
//            }
//        });
//    }
//    
//}
public class Assessment_frame extends JFrame implements ActionListener,MouseListener{
    JFrame f=new JFrame();
    JPanel p1,p2,p3,p4,p5,p6,p7;
    JLabel l1,l2;
    JButton b1,b2,b3,b4,b5,b10,b11,b12,b13,b14,b15;
    JTable t1,t2;
    JTextField tf1;
    JScrollPane sp1,sp2;
    Color c1=new Color(0,116,217);
    Color c2=new Color(225,50,3);
    Color c3=new Color(255, 255, 255);
    
    public Assessment_frame() throws HeadlessException {
        p1=new JPanel();    //notification panel
        p2=new JPanel();    //head panel
        p3=new JPanel();    //upcoming test panel
        p4=new JPanel();    //completed test panel
        p5=new JPanel();    //test Documents
        p6=new JPanel();    //QnA forum
        p7=new JPanel();    //Result
        
        l1=new JLabel("Bootcamp");
        l2=new JLabel("Assessment");
        
        tf1=new JTextField();
        
        b1=new JButton("Upcoming Test");
        b2=new JButton("Completed Test");
        b3=new JButton("Test Documents");
        b4=new JButton("QnA Forum");
        b5=new JButton("Results");
        
        b10=new JButton("Dashboard");
        b11=new JButton("Forum");
        b12=new JButton("Assessment");
        b13=new JButton("Admin");
        b14=new JButton("Setting");
        b15=new JButton("Logout");
        
        t1=new JTable();
        t1.setFont(new Font("Verdana",Font.PLAIN,15));
        sp1 =new JScrollPane(t1);
        sp2 =new JScrollPane(t2);
                
        p1.setBounds(5,5,250,800);
        p2.setBounds(258,5,727,167);
        p3.setBounds(258, 205,  727, 640);
        p4.setBounds(258, 205,  727, 640);
        p5.setBounds(258, 235,  727, 610);
        p6.setBounds(258, 235,  727, 610);
        p7.setBounds(258, 235,  727, 610);
       
        l1.setBounds(10, 20, 250, 40);
        l2.setBounds( 270, 50, 500, 30);
        
        b1.setBounds(258, 174, 366, 30);
        b2.setBounds(624, 174, 365, 30);
        
        
        b10.setBounds(5,120,250 , 30);
        b11.setBounds(5,160,250 , 30);
        b12.setBounds(5,200,250 , 30);
        b13.setBounds(5,240,250 , 30);
        b14.setBounds(5,650,250,30);
        b15.setBounds(67,725,126,25);
        
        b1.setFocusPainted(false);
        b2.setFocusPainted(false);
        b3.setFocusPainted(false);
        b4.setFocusPainted(false);
        b5.setFocusPainted(false);
        
        b10.setFocusPainted(false);
        b11.setFocusPainted(false);
        b12.setFocusPainted(false);
        b13.setFocusPainted(false);
        b14.setFocusPainted(false);
        b15.setFocusPainted(false);
        b10.setBorderPainted(false);
        b11.setBorderPainted(false);
        b12.setBorderPainted(false);
        b13.setBorderPainted(false);
        b14.setBorderPainted(false);
        b15.setBorderPainted(false);
        
        p1.setBackground(c1);
        p2.setBackground(c2);
        p3.setBackground(c3);
        p4.setBackground(c3);
        p5.setBackground(c3);
        p6.setBackground(c3);
        p7.setBackground(c3);
        
        b1.setBackground(c3);
        b2.setBackground(c3);
        b3.setBackground(c3);
        b4.setBackground(c3);
        b5.setBackground(c3);
        
        b1.setBorder(new RoundedBorder(20));
        b2.setBorder(new RoundedBorder(20));
        b3.setBorder(new RoundedBorder(20));
        b4.setBorder(new RoundedBorder(20));
        b5.setBorder(new RoundedBorder(20));
        
        b10.setBackground(c1);
        b11.setBackground(c1);
        b12.setBackground(c1);
        b13.setBackground(c1);
        b14.setBackground(c1);
        b15.setBackground(Color.BLACK);
        
        l1.setForeground(c3);
        l2.setBackground(c3);
        b10.setForeground(c3);
        b11.setForeground(c3);
        b12.setForeground(c3);
        b13.setForeground(c3);
        b14.setForeground(c3);
        b15.setForeground(c3);
        
        l1.setFont(new Font("Verdana",Font.PLAIN,30));
        l2.setFont(new Font("Verdana",Font.PLAIN,25));
        b1.setFont(new Font("Verdana",Font.PLAIN,17));
        b2.setFont(new Font("Verdana",Font.PLAIN,17));
        b3.setFont(new Font("Verdana",Font.PLAIN,16));
        b4.setFont(new Font("Verdana",Font.PLAIN,16));
        b5.setFont(new Font("Verdana",Font.PLAIN,16));
        
        b10.setFont(new Font("Verdana",Font.PLAIN,20));
        b11.setFont(new Font("Verdana",Font.PLAIN,20));
        b12.setFont(new Font("Verdana",Font.PLAIN,20));
        b13.setFont(new Font("Verdana",Font.PLAIN,20));
        b14.setFont(new Font("Verdana",Font.PLAIN,20));
        b15.setFont(new Font("Verdana",Font.PLAIN,12));
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        
        b10.addMouseListener(this);
        b11.addMouseListener(this);
        b12.addMouseListener(this);
        b13.addMouseListener(this);
        b14.addMouseListener(this);
        
        f.add(l1);
        f.add(l2);
        f.add(b1);
        f.add(b2);
        f.add(b10);
        f.add(b11);
        f.add(b12);
        f.add(b13);
        f.add(b14);
        f.add(b15);
        f.add(p1);
        f.add(p2);
        f.add(p3);
        f.add(p4);
        f.add(p5);
        f.add(p6);
        f.add(p7);
        
        p4.setVisible(false);
        p5.setVisible(false);
        p6.setVisible(false);
        p7.setVisible(false);
        
        p3.setLayout(null);
        p4.setLayout(null);
        p5.setLayout(null);
        p6.setLayout(null);
        p7.setLayout(null);
        
       
        f.setResizable(false);
        f.setBounds(460, 140, 1000, 800);
        f.setBackground(Color.GRAY);
        f.setVisible(true);
        
        b15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            int a=JOptionPane.showConfirmDialog(f,"Are you sure?");  
            
            if(a==JOptionPane.YES_OPTION){  
                f.dispose();
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
            b10.setBackground(c2);
        }
        else if(e.getSource()==b11){
            b10.setBackground(c1);
            b12.setBackground(c1);
            b13.setBackground(c1);
            b14.setBackground(c1);            
            b11.setBackground(c2);
        }
        else if(e.getSource()==b12){
            b10.setBackground(c1);
            b11.setBackground(c1);
            b13.setBackground(c1);
            b14.setBackground(c1);
            b12.setBackground(c2);
        }
        else if(e.getSource()==b13){
            b10.setBackground(c1);
            b11.setBackground(c1);
            b12.setBackground(c1);
            b14.setBackground(c1);
            b13.setBackground(c2);
        }
        else if(e.getSource()==b14){
            b10.setBackground(c1);
            b11.setBackground(c1);
            b12.setBackground(c1);
            b13.setBackground(c1);
            b14.setBackground(c2);
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
    
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b1)
        {
            p3.setBounds(258, 205,  727, 640);
            sp1.setBounds(0, 4, 750, 640);
            p4.setVisible(false);
            p5.setVisible(false);
            p6.setVisible(false);
            p7.setVisible(false);
            p3.setVisible(true);
            TestDetails_result();
            p3.add(sp1);
        }
        else if(e.getSource()==b2)
        {
            sp2.setBounds(0, 0, 727, 610);
            p3.setVisible(false);
            b3.setBounds(0, 4, 242, 30);
            b4.setBounds(242, 4, 243  , 30);
            b5.setBounds(485, 4, 244, 30);
            
            p4.add(b3);
            p4.add(b4);
            p4.add(b5);
        
            p4.setVisible(true);
            b3.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    TestDocumnets();
                    p6.setVisible(false);
                    p7.setVisible(false);
                    p5.setVisible(true);
                }
            });
            //A td1=new A();
            //td1.start(b4);
            b4.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    p5.setVisible(false);
                    p7.setVisible(false);
                    p6.setVisible(true);
                    
                }
            });
            
            b5.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    p5.setVisible(false);
                    p6.setVisible(false);
                    p7.setVisible(true);
                    
                }
            });
        }
    }
    JLabel l3=new JLabel("hello");
    
    
       void TestDocumnets(){
           
           l3.setBounds(40, 40, 100, 30);
           l3.setFont(new Font("Verdana",Font.PLAIN,30));
           p5.add(l3);
       
       }
       
       void QnAForum(){
           
        }
        
        void Results(){
            int sno=1;
            final String Driver="oracle.jdbc.driver.OracleDriver";
            final String connect="jdbc:oracle:thin:@127.0.0.1:1521:XE";
            try {
                Class.forName(Driver);
                Connection con=DriverManager.getConnection(connect,"bootathon","admin");
                Statement st=con.createStatement();
                String query="Select * from Student_Results";
                ResultSet rs=st.executeQuery(query);
            
                DefaultTableModel model=new DefaultTableModel();
                String s2[]={"Sno","Test Link","Start Time","End Time","Test Date"};
                model.setColumnIdentifiers(s2);
                t1.setModel(model);
                t1.setFillsViewportHeight(true);
                t1.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
            
                while(rs.next()){
                    test_link=rs.getString("test_link");
                    start_time=rs.getString("start_time");			     
                    end_time=rs.getString("end_time");
                    date_test=rs.getString("date_test");
                    model.addRow(new Object[] {sno,test_link,start_time,end_time,date_test});
                    sno++;
                }
                con.close();
            }
            catch(Exception e)
            {
                System.out.println(e+" Error Displaying Table");
            }
        }
        
	String test_link="";
	String start_time="";
	String end_time="";
	String date_test="";
	int status;
    
    void TestDetails_result(){
        int sno=1;
        final String Driver="oracle.jdbc.driver.OracleDriver";
        final String connect="jdbc:oracle:thin:@127.0.0.1:1521:XE";
        try {
            Class.forName(Driver);
            Connection con=DriverManager.getConnection(connect,"bootathon","admin");
            Statement st=con.createStatement();
            String query="Select * from Test_Details";
            ResultSet rs=st.executeQuery(query);
            
            DefaultTableModel model=new DefaultTableModel();
            String s1[]={"Sno","Test Link","Start Time","End Time","Test Date"};
            model.setColumnIdentifiers(s1);
            t1.setModel(model);
            t1.setFillsViewportHeight(true);
            t1.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
            
            while(rs.next()){
                test_link=rs.getString("test_link");
		start_time=rs.getString("start_time");			     
		end_time=rs.getString("end_time");
                date_test=rs.getString("date_test");
                model.addRow(new Object[] {sno,test_link,start_time,end_time,date_test});
                sno++;
            }
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e+" Error Displaying Table");
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
    
    
    public static void main(String[] args) {
        new Assessment_frame();
    }
}
