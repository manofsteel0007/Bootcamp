package query;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.*;
public class admin extends JFrame implements MouseListener {
	JPanel navigationpanel=new JPanel();
	JPanel adminpanel=new JPanel();
	
        JLabel background=new JLabel(new ImageIcon("C:\\Users\\MAHESH KUMAR B\\Downloads\\background.jpg"));
	
        JLabel forum=new JLabel(new ImageIcon("C:\\Users\\MAHESH KUMAR B\\Downloads\\conversation (1).png"));
	JLabel assessment=new JLabel(new ImageIcon("C:\\Users\\MAHESH KUMAR B\\Downloads\\book (1).png"));
	JLabel admin=new JLabel(new ImageIcon("C:\\Users\\MAHESH KUMAR B\\Downloads\\shield (1).png"));
	JLabel logout=new JLabel(new ImageIcon("C:\\Users\\MAHESH KUMAR B\\Downloads\\logout (1).png"));
	
        JLabel forum1=new JLabel(new ImageIcon("C:\\Users\\MAHESH KUMAR B\\Downloads\\conversation.png"));
	JLabel assessment1=new JLabel(new ImageIcon("C:\\Users\\MAHESH KUMAR B\\Downloads\\book.png"));
	JLabel admin1=new JLabel(new ImageIcon("C:\\Users\\MAHESH KUMAR B\\Downloads\\shield.png"));
	JLabel logout1=new JLabel(new ImageIcon("C:\\Users\\MAHESH KUMAR B\\Downloads\\logout (2).png"));
	
        JLabel Bootcamp=new JLabel("Bootcamp");
	JLabel Admin=new JLabel("Admin");
	JLabel Line=new JLabel("____________________________________");
	JButton assessmentbtn=new JButton("Assessment");
	JButton forumbtn=new JButton("Forum");
	JButton adminbtn=new JButton("Admin");
	JButton logoutbtn=new JButton("Logout");
	Color c1=new Color(58,64,82);
	Color c2=new Color(255,102,0);	
	admin()
	{
		navigationpanel.setBounds(10, 20, 250, 725);
		adminpanel.setBounds(270, 225, 700, 520);
		background.setBounds(0, 0, 1000, 800);
		Admin.setBounds(5, 80, 30,30);
		
                assessment.setBounds(10, 200, 30,30);
		forum.setBounds(10, 140, 30,30); 
		admin.setBounds(5, 80, 30,30);
		logout.setBounds(10, 600, 30,30);
		
                assessment1.setBounds(10, 200, 30,30);
		forum1.setBounds(10, 140, 30,30); 
		admin1.setBounds(5, 80, 30,30);
		logout1.setBounds(10, 600, 30,30);
		
                adminbtn.setBounds(45, 80, 200,30);
		forumbtn.setBounds(45, 140, 200,30);
		assessmentbtn.setBounds(45, 200, 200,30);
		logoutbtn.setBounds(45, 600, 200,30);
		Bootcamp.setBounds(10,10,150,30);
		Admin.setBounds(270,20,150,30);
		Line.setBounds(8, 430, 230,20);
                
		Bootcamp.setFont(new Font("TimesRoman",Font.PLAIN,25));
		Admin.setFont(new Font("TimesRoman",Font.PLAIN,25));
		adminbtn.setFont(new Font("TimesRoman",Font.PLAIN,20));
		assessmentbtn.setFont(new Font("TimesRoman",Font.PLAIN,20));
		forumbtn.setFont(new Font("TimesRoman",Font.PLAIN,20));
		logoutbtn.setFont(new Font("TimesRoman",Font.PLAIN,20));
		Bootcamp.setForeground(Color.white);
		Admin.setForeground(Color.white);
		Line.setForeground(Color.white);
		adminbtn.setBackground(c1);
		assessmentbtn.setBackground(c1);
		forumbtn.setBackground(c1);
		logoutbtn.setBackground(c1);
		adminbtn.setForeground(Color.white);
		assessmentbtn.setForeground(Color.white);
		forumbtn.setForeground(Color.white);
		logoutbtn.setForeground(Color.white);
		adminbtn.setBorderPainted(false);
		assessmentbtn.setBorderPainted(false);
		forumbtn.setBorderPainted(false);
		logoutbtn.setBorderPainted(false);
		adminbtn.setFocusPainted(false);
		assessmentbtn.setFocusPainted(false);
		forumbtn.setFocusPainted(false);
		logoutbtn.setFocusPainted(false);
		navigationpanel.add(Bootcamp);
		navigationpanel.add(forum);
		navigationpanel.add(assessment);
		navigationpanel.add(admin);
		navigationpanel.add(logout);
		navigationpanel.add(adminbtn);
		navigationpanel.add(assessmentbtn);
		navigationpanel.add(forumbtn);
		navigationpanel.add(logoutbtn);
		navigationpanel.add(forum1);
		navigationpanel.add(assessment1);
		navigationpanel.add(admin1);
		navigationpanel.add(logout1);
		navigationpanel.add(Line);
		navigationpanel.setBackground(c1);
		add(navigationpanel);
		add(Admin);
		navigationpanel.setLayout(null);
		add(background);
		adminbtn.addMouseListener(this);
		assessmentbtn.addMouseListener(this);
		forumbtn.addMouseListener(this);
		logoutbtn.addMouseListener(this);
		assessment.setVisible(false);
		forum.setVisible(false);
		admin.setVisible(false);
		logout.setVisible(false);
		this.getContentPane().setBackground(Color.white);
	    setSize(1000,800);
	    setLocationRelativeTo(null);
	    setLayout(null);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new admin();

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource()==assessmentbtn)
		{
			
			assessmentbtn.setBackground(Color.white);
			forumbtn.setBackground(c1);
			
			adminbtn.setBackground(c1);
			
			logoutbtn.setBackground(c1);
			
			assessmentbtn.setForeground(Color.black);
			forumbtn.setForeground(Color.white);
			
			adminbtn.setForeground(Color.white);
			
			logoutbtn.setForeground(Color.white);
			
			assessment.setVisible(true);
			forum.setVisible(false);
			
			admin.setVisible(false);
			
			logout.setVisible(false);
			
			assessment1.setVisible(false);
			forum1.setVisible(true);
			
			admin1.setVisible(true);
			
			logout1.setVisible(true);
			
		}
		if(e.getSource()==forumbtn)
		{
			
			assessmentbtn.setBackground(c1);
			forumbtn.setBackground(Color.white);
			
			adminbtn.setBackground(c1);
			
			logoutbtn.setBackground(c1);
			
			assessmentbtn.setForeground(Color.white);
			forumbtn.setForeground(Color.black);
			
			adminbtn.setForeground(Color.white);
			
			logoutbtn.setForeground(Color.white);
			
			assessment.setVisible(false);
			forum.setVisible(true);
			
			admin.setVisible(false);
			
			logout.setVisible(false);
			
			assessment1.setVisible(true);
			forum1.setVisible(false);
			
			admin1.setVisible(true);
			
			logout1.setVisible(true);
						
		}
		
		if(e.getSource()==adminbtn)
		{
			
			assessmentbtn.setBackground(c1);
			forumbtn.setBackground(c1);
			
			adminbtn.setBackground(Color.white);
			
			logoutbtn.setBackground(c1);
			
			assessmentbtn.setForeground(Color.white);
			forumbtn.setForeground(Color.white);
			
			adminbtn.setForeground(Color.black);
			
			logoutbtn.setForeground(Color.white);
			
			assessment.setVisible(false);
			forum.setVisible(false);
			
			admin.setVisible(true);
			
			logout.setVisible(false);
			
			assessment1.setVisible(true);
			forum1.setVisible(true);
			
			admin1.setVisible(false);
			
			logout1.setVisible(true);
			
		}
		
		if(e.getSource()==logoutbtn)
		{
			
			assessmentbtn.setBackground(c1);
			forumbtn.setBackground(c1);
			
			adminbtn.setBackground(c1);
			
			logoutbtn.setBackground(Color.white);
			
			assessmentbtn.setForeground(Color.white);
			forumbtn.setForeground(Color.white);
			
			adminbtn.setForeground(Color.white);
			
			logoutbtn.setForeground(Color.black);
			
			assessment.setVisible(false);
			forum.setVisible(false);
			
			admin.setVisible(false);
			
			logout.setVisible(true);
			
			assessment1.setVisible(true);
			forum1.setVisible(true);
			
			admin1.setVisible(true);
			
			logout1.setVisible(false);
			
		}
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
