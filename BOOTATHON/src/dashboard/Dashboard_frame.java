
package dashboard;

import assessment.Assessment_frame;
import forum.Forum_frame;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import javax.imageio.ImageIO;
import javax.swing.*;
import login.Logins;
import login.Setting_frame;
import query.Query_frame;



public class Dashboard_frame extends JFrame implements ActionListener,MouseListener{
    JFrame f=new JFrame();
    JPanel p1,p3;
    JLabel l1,l2,l3,l4;
    JButton b1,b10,b11,b12,b13,b15,b16;
    Color c1=new Color(58,64,82);
    Color c3=new Color(255, 255, 255);
    
    JLabel main_user_name_disJLabel,main_name_disJLabel;
    
    JLabel Line=new JLabel("_________________________________");
    
    JLabel background=new JLabel(new ImageIcon(loadImage("/Image/Dashboard_1.jpg")));

    JLabel user=new JLabel(new ImageIcon(loadImage("/Image/user.png")));

    JLabel dashboard=new JLabel(new ImageIcon(loadImage("/Image/home-run (1).png")));
    JLabel forum=new JLabel(new ImageIcon(loadImage("/Image/conversation (1).png")));
    JLabel assessment=new JLabel(new ImageIcon(loadImage("/Image/book (1).png")));
    JLabel query=new JLabel(new ImageIcon(loadImage("/Image/question (1).png")));
    JLabel setting=new JLabel(new ImageIcon(loadImage("/Image/gear (1).png")));
    JLabel logout=new JLabel(new ImageIcon(loadImage("/Image/logout (1).png")));

    JLabel dashboard1=new JLabel(new ImageIcon(loadImage("/Image/home-run.png")));
    JLabel forum1=new JLabel(new ImageIcon(loadImage("/Image/conversation.png")));
    JLabel assessment1=new JLabel(new ImageIcon(loadImage("/Image/book.png")));
    JLabel query1=new JLabel(new ImageIcon(loadImage("/Image/question.png")));
    JLabel setting1=new JLabel(new ImageIcon(loadImage("/Image/gear.png")));
    JLabel logout1=new JLabel(new ImageIcon(loadImage("/Image/logout (2).png")));
    
    
    String main_user_name;
    String main_name;
    
    final String Driver="oracle.jdbc.driver.OracleDriver";
    final String connect="jdbc:oracle:thin:@127.0.0.1:1521:XE";  
        
    public Dashboard_frame(String main_user_name,String main_name) {
        this.main_user_name=main_user_name;
        this.main_name=main_name;
        
        p1=new JPanel(); 
        p3=new JPanel(); 
        
        l1=new JLabel("Bootcamp");
        l2=new JLabel("Dashboard");
        
        main_user_name_disJLabel=new JLabel(""+main_user_name+"");
        main_name_disJLabel=new JLabel(""+main_name+"");
        
        b10=new JButton("Dashboard");
        b11=new JButton("Assessment");
        b12=new JButton("Forum");
        b13=new JButton("Query");
        b15=new JButton("Setting");
        b16=new JButton("Logout");
        
        p1.setBounds(10, 20, 250, 735);
        p3.setBounds(270, 210, 700, 545);
        
        background.setBounds(0, 0, 1000, 210);
        
        user.setBounds(245, 40, 200,200);
        
        main_name_disJLabel.setBounds(450, 100, 200,50);
        main_user_name_disJLabel.setBounds(450, 150, 200,50);
        main_name_disJLabel.setForeground(Color.black);
        main_user_name_disJLabel.setForeground(Color.black);
        main_name_disJLabel.setFont(new Font("TimesRoman",Font.PLAIN,20));
        main_user_name_disJLabel.setFont(new Font("TimesRoman",Font.PLAIN,20));
        
        l1.setBounds(10,10,150,30);
        l2.setBounds(270,20,150,30);
        
        Line.setBounds(8, 430, 250,20);
        Line.setForeground(Color.white);
        
        dashboard.setBounds(5, 80, 30,30);
        assessment.setBounds(10, 140, 30,30);
        forum.setBounds(10, 200, 30,30);
        query.setBounds(10, 260, 30,30);
        setting.setBounds(10, 520, 30,30);
        logout.setBounds(10, 600, 30,30);
        
        dashboard1.setBounds(5, 80, 30,30);
        assessment1.setBounds(10, 140, 30,30);
        forum1.setBounds(10, 200, 30,30);
        query1.setBounds(10, 260, 30,30);
        setting1.setBounds(10, 520, 30,30);
        logout1.setBounds(10, 600, 30,30);
        
        b10.setBounds(45, 80, 200,30);
        b11.setBounds(45, 140, 200,30);
        b12.setBounds(45, 200, 200,30);
        b13.setBounds(45, 260, 200,30);
        b15.setBounds(45, 520, 200,30);
        b16.setBounds(45, 600, 200,30);
        
        b10.setBorderPainted(false);
        b11.setBorderPainted(false);
        b12.setBorderPainted(false);
        b13.setBorderPainted(false);
        b15.setBorderPainted(false);
        b16.setBorderPainted(false);
        
        b10.setFocusPainted(false);
        b11.setFocusPainted(false);
        b12.setFocusPainted(false);
        b13.setFocusPainted(false);
        b15.setFocusPainted(false);
        b16.setFocusPainted(false);
        
        p1.setBackground(c1);
        p3.setBackground(c3);
        b10.setBackground(c3);
        b11.setBackground(c1);
        b12.setBackground(c1);
        b13.setBackground(c1);
        b15.setBackground(c1);
        b16.setBackground(c1);
        
        l1.setForeground(c3);
        l2.setBackground(c3);
        b10.setForeground(c1);
        b11.setForeground(c3);
        b12.setForeground(c3);
        b13.setForeground(c3);
        b15.setForeground(c3);
        b16.setForeground(c3);
        
        l1.setFont(new Font("TimesRoman",Font.PLAIN,25));
        l2.setFont(new Font("TimesRoman",Font.BOLD,25));
        
        b10.setFont(new Font("TimesRoman",Font.PLAIN,20));
        b11.setFont(new Font("TimesRoman",Font.PLAIN,20));
        b12.setFont(new Font("TimesRoman",Font.PLAIN,20));
        b13.setFont(new Font("TimesRoman",Font.PLAIN,20));
        b15.setFont(new Font("TimesRoman",Font.PLAIN,20));
        b16.setFont(new Font("TimesRoman",Font.PLAIN,20));
        
        b10.addMouseListener(this);
        b11.addMouseListener(this);
        b12.addMouseListener(this);
        b13.addMouseListener(this);
        b15.addMouseListener(this);
        
        p1.add(dashboard1);
        p1.add(forum1);
        p1.add(assessment1);
        p1.add(query1);
        p1.add(setting1);
        p1.add(logout1);
        
        p1.add(l1);
        p1.add(dashboard);
        p1.add(forum);
        p1.add(assessment);
        p1.add(query);
        p1.add(setting);
        p1.add(logout);
                
        p1.add(Line);
        
        p1.add(b10);
        p1.add(b11);
        p1.add(b12);
        p1.add(b13);
        p1.add(b15);
        p1.add(b16);
        
        f.add(user);        
        f.add(p1);
        f.add(p3);
        f.add(l2);
        f.add(main_name_disJLabel);
        f.add(main_user_name_disJLabel);
        f.add(background);
        
        p1.setLayout(null);
        p3.setLayout(null);
        
        dashboard.setVisible(true);
        dashboard1.setVisible(false);
        
        f.setLayout(null);
        f.setResizable(false);
        f.setSize(1000,800);
	f.setLocationRelativeTo(null);
        f.setBackground(Color.gray);
        f.setVisible(true);
        
        b16.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                b16.setBackground(Color.white);
                b10.setBackground(c1);
            
                b16.setForeground(Color.black);
                b10.setForeground(Color.white);

                logout.setVisible(true);
                dashboard.setVisible(false);

                logout1.setVisible(false);
                dashboard1.setVisible(true);

                int a=JOptionPane.showConfirmDialog(f,"Are you sure?");  

                if(a==JOptionPane.YES_OPTION){  
                    f.dispose();
                    new Logins();
                } 
                else{
                    b10.setBackground(Color.white);
                    b16.setBackground(c1);

                    b10.setForeground(Color.black);
                    b16.setForeground(Color.white);

                    dashboard.setVisible(true);
                    logout.setVisible(false);

                    dashboard1.setVisible(false);
                    logout1.setVisible(true);
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

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if(e.getSource()==b11){

            b11.setBackground(Color.white);
            b10.setBackground(c1);
            
            b11.setForeground(Color.black);
            b10.setForeground(Color.white);
            
            assessment1.setVisible(true);
            dashboard1.setVisible(false);
            
            assessment.setVisible(false);
            dashboard.setVisible(true);
            f.dispose();
            new Assessment_frame(main_user_name, main_name);
        }

        else if(e.getSource()==b12){
            
            b12.setBackground(Color.white);
            b10.setBackground(c1);
            
            b12.setForeground(Color.black);
            b10.setForeground(Color.white);
            
            forum1.setVisible(true);
            dashboard1.setVisible(false);
            
            forum.setVisible(false);
            dashboard.setVisible(true);
            
            new Forum_frame(main_user_name, main_name);
            f.dispose();
        }

        else if(e.getSource()==b13){

            b13.setBackground(Color.white);
            b10.setBackground(c1);
            
            b13.setForeground(Color.black);
            b10.setForeground(Color.white);
            
            query1.setVisible(true);
            dashboard1.setVisible(false);
            
            query.setVisible(false);
            dashboard.setVisible(true);
            
            f.dispose();
            new Query_frame(main_user_name, main_name).StartThread();
            
        }

        else if(e.getSource()==b15){
            
            b15.setBackground(Color.white);
            b10.setBackground(c1);
            
            b15.setForeground(Color.black);
            b10.setForeground(Color.white);
            
            setting1.setVisible(true);
            dashboard1.setVisible(false);
            
            setting.setVisible(false);
            dashboard.setVisible(true);
            
            f.dispose();
            new Setting_frame(main_user_name, main_name);
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public BufferedImage loadImage(String fileName){
        BufferedImage buff = null;
        try {
            buff = ImageIO.read(getClass().getResourceAsStream(fileName));
        } catch (IOException e) {
                // TODO Auto-generated catch block
            e.printStackTrace();
            return null;
        }
        return buff;
    }

    public static void main(String[] args) {
        new Dashboard_frame("18eumc071", "Kumaran S");
    }
}
