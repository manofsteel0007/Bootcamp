/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

/**
 *
 * @author kumar
 */
import java.sql.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class registration extends JFrame implements ActionListener  {
    JFrame f=new JFrame();
	JLabel l1=new JLabel("Registration Form");
	JLabel l2=new JLabel("First Name");
	JLabel l3=new JLabel("Last Name");
	JLabel l4=new JLabel("Email");
	JLabel l5=new JLabel("Roll No");
	JLabel l6=new JLabel("Department");
	JLabel l7=new JLabel("Section");
	JLabel l8=new JLabel("College");
	JLabel l9=new JLabel("Password");
	JLabel l10=new JLabel("Mobile No");
	JLabel l11=new JLabel("Invalid firstname or lastname");
	JLabel l12=new JLabel("Invalid email");
	JLabel l13=new JLabel("Invalid roll no");
	JLabel l14=new JLabel("Invalid password");
	JLabel l15=new JLabel("Invalid mobile no");
	JRadioButton rb1=new JRadioButton("CSE");
	JRadioButton rb2=new JRadioButton("EEE");
	JRadioButton rb3=new JRadioButton("ECE");
	JRadioButton rb4=new JRadioButton("IT");
	JRadioButton rb5=new JRadioButton("MECH");
	JRadioButton rb6=new JRadioButton("A");
	JRadioButton rb7=new JRadioButton("B");
	JRadioButton rb8=new JRadioButton("C");
	JTextField t1=new JTextField();
	JTextField t2=new JTextField();
	JTextField t3=new JTextField();
	JTextField t4=new JTextField();
	JTextField t5=new JTextField();
	JTextField t6=new JTextField();
	JPasswordField p1=new JPasswordField();
	JButton b1=new JButton("Register");
	Color c=new Color(0,116,217);
	Color c1=new Color(255,255,255);
	registration()
	{
		l1.setBounds(400, 5, 300, 40);
		l2.setBounds(50, 45, 300, 20);
		l3.setBounds(350, 45, 300, 20);
		l4.setBounds(50, 114, 300, 20);
		l5.setBounds(50, 180, 300, 20);
		l6.setBounds(50, 250, 300, 20);
		l7.setBounds(50, 375, 300, 20);
		l8.setBounds(50, 460, 300, 20);
		l9.setBounds(50, 515, 300, 20);
		l10.setBounds(50, 585, 300, 20);
		l11.setBounds(50, 93, 300, 20);
		l12.setBounds(50, 163, 300, 20);
		l13.setBounds(50, 230, 300, 20);
		l14.setBounds(50, 560, 300, 20);
		l15.setBounds(50, 640, 300, 20);
		rb1.setBounds(50, 275, 70, 15);
		rb2.setBounds(50, 295, 300, 15);
		rb3.setBounds(50, 315, 300, 15);
		rb4.setBounds(50, 335, 300, 15);
		rb5.setBounds(50, 355, 300, 15);
		rb6.setBounds(50, 400, 300, 15);
		rb7.setBounds(50, 418, 300, 15);
		rb8.setBounds(50, 435, 300, 15);
		t1.setBounds(50, 70, 280, 25);
		t2.setBounds(350, 70, 280, 25);
		t3.setBounds(50, 140, 350, 25);
		t4.setBounds(50, 205, 350, 25);
		t5.setBounds(50, 485, 350, 25);
		p1.setBounds(50, 535, 350, 25);
		t6.setBounds(50, 615, 350, 25);
		l1.setFont(new Font("Verdana",Font.PLAIN,20));
		l2.setFont(new Font("Verdana",Font.PLAIN,15));
		l3.setFont(new Font("Verdana",Font.PLAIN,15));
		l4.setFont(new Font("Verdana",Font.PLAIN,15));
		l5.setFont(new Font("Verdana",Font.PLAIN,15));
		l6.setFont(new Font("Verdana",Font.PLAIN,15));
		l7.setFont(new Font("Verdana",Font.PLAIN,15));
		l8.setFont(new Font("Verdana",Font.PLAIN,15));
		l9.setFont(new Font("Verdana",Font.PLAIN,15));
		l10.setFont(new Font("Verdana",Font.PLAIN,15));
		l11.setForeground(Color.red);
		l12.setForeground(Color.red);
		l13.setForeground(Color.red);
		l14.setForeground(Color.red);
		l15.setForeground(Color.red);
		rb1.setFont(new Font("Verdana",Font.PLAIN,13));
		rb2.setFont(new Font("Verdana",Font.PLAIN,13));
		rb3.setFont(new Font("Verdana",Font.PLAIN,13));
		rb4.setFont(new Font("Verdana",Font.PLAIN,13));
		rb5.setFont(new Font("Verdana",Font.PLAIN,13));
		rb6.setFont(new Font("Verdana",Font.PLAIN,13));
		rb7.setFont(new Font("Verdana",Font.PLAIN,13));
		rb8.setFont(new Font("Verdana",Font.PLAIN,13));
		b1.setBounds(400, 670, 200, 30);
		b1.setBorderPainted(false);
		b1.setFocusPainted(false);
		b1.setBackground(c1);
		l1.setForeground(Color.white);
		l2.setForeground(Color.white);
		l3.setForeground(Color.white);
		l4.setForeground(Color.white);
		l5.setForeground(Color.white);
		l6.setForeground(Color.white);
		l7.setForeground(Color.white);
		l8.setForeground(Color.white);
		l9.setForeground(Color.white);
		l10.setForeground(Color.white);
		rb1.setForeground(Color.white);
		rb2.setForeground(Color.white);
		rb3.setForeground(Color.white);
		rb4.setForeground(Color.white);
		rb5.setForeground(Color.white);
		rb6.setForeground(Color.white);
		rb7.setForeground(Color.white);
		rb8.setForeground(Color.white);
		rb1.setBackground(c);
		rb2.setBackground(c);
		rb3.setBackground(c);
		rb4.setBackground(c);
		rb5.setBackground(c);
		rb6.setBackground(c);
		rb7.setBackground(c);
		rb8.setBackground(c);
		f.add(l1);
		f.add(l2);
		f.add(l3);
		f.add(l4);
		f.add(l5);
		f.add(l6);
		f.add(l7);
		f.add(l8);
		f.add(l9);
		f.add(l10);
		f.add(l11);
		f.add(l12);
		f.add(l13);
		f.add(l14);
		f.add(l15);
		f.add(rb1);
		f.add(rb2);
		f.add(rb3);
		f.add(rb4);
		f.add(rb5);
		f.add(rb6);
		f.add(rb7);
		f.add(rb8);
		f.add(t1);
		f.add(t2);
		f.add(t3);
		f.add(t4);
		f.add(t5);
		f.add(p1);
		f.add(t6);
		f.add(b1);
		b1.addActionListener(this);
		l11.setVisible(false);
		l12.setVisible(false);
		l13.setVisible(false);
		l14.setVisible(false);
		l15.setVisible(false);
		f.getContentPane().setBackground(c);
		f.setSize(1000,800);
		f.setLayout(null);
		f.setLocationRelativeTo(null);
		f.addWindowListener(new WindowAdapter() {
                    public void windowClosing(WindowEvent e) {  
                        int a=JOptionPane.showConfirmDialog(f,"Are you sure?");  
                        
                        if(a==JOptionPane.YES_OPTION){  
                            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
                        } 
                    }
                });
                f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		f.setVisible(true);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String fname=t1.getText();
		String lname=t2.getText();
		String email=t3.getText();
		String rollno=t4.getText();
		String password=new String(p1.getPassword());
		String college=t5.getText();
		String phno=t6.getText();
		String dept="";
		String sec="";
		String securitycode="mahesh";
		if(rb1.isSelected())
		{
			dept="CSE";
		}
		if(rb2.isSelected())
		{
			dept="EEE";
		}
		if(rb3.isSelected())
		{
			dept="ECE";
		}
		if(rb4.isSelected())
		{
			dept="IT";
		}
		if(rb5.isSelected())
		{
			dept="MECH";
		}
		if(rb6.isSelected())
		{
			sec="A";
		}
		if(rb7.isSelected())
		{
			sec="B";
		}
		if(rb8.isSelected())
		{
			sec="C";
		}
		final String Driver="oracle.jdbc.driver.OracleDriver";
                final String connect="jdbc:oracle:thin:@127.0.0.1:1521:XE";
		try
		{
			Class.forName(Driver);
                        Connection con=DriverManager.getConnection(connect,"bootathon","admin");
			Statement st=con.createStatement();
			con.setAutoCommit(true);
			if(validation.isValidUserFirstName(fname)==false &&
			validation.isValidUserLastName(lname)==false &&
			validation.isValidemail(email)==false &&
			validation.isValidRollno(rollno)==false &&
			validation.isValidDept(dept)==false &&
			validation.isValidSec(sec)==false &&
			validation.isValidClg(college)==false &&
			validation.isValidPhno(phno)==false &&
			validation.isValidPassword(password)==false )
			{
				JOptionPane.showMessageDialog(this, "You should fill all the fields !");
			}
			else if(validation.isValidUserFirstName(fname)==false ||
					validation.isValidUserLastName(lname)==false)
			{
				l11.setVisible(true);
				l12.setVisible(false);
				l13.setVisible(false);
				l14.setVisible(false);
				l15.setVisible(false);
			}
			else if(validation.isValidemail(email)==false)
			{
				l11.setVisible(false);
				l12.setVisible(true);
				l13.setVisible(false);
				l14.setVisible(false);
				l15.setVisible(false);
			}
			else if(validation.isValidRollno(rollno)==false)
			{
				l11.setVisible(false);
				l12.setVisible(false);
				l13.setVisible(true);
				l14.setVisible(false);
				l15.setVisible(false);
			}
			else if(validation.isValidPassword(password)==false )
			{
				l11.setVisible(false);
				l12.setVisible(false);
				l13.setVisible(false);
				l14.setVisible(true);
				l15.setVisible(false);
			}
			else if(validation.isValidPhno(phno)==false )
			{
				l11.setVisible(false);
				l12.setVisible(false);
				l13.setVisible(false);
				l14.setVisible(false);
				l15.setVisible(true);
			}
			
	        else
	        {
                                l11.setVisible(false);
				l12.setVisible(false);
				l13.setVisible(false);
				l14.setVisible(false);
				l15.setVisible(false);
	        	String query="insert into registers values('"+fname+"','"+lname+"','"+email+"','"+rollno+"','"+dept+"','"+sec+"',"
	        			+ "'"+college+"','"+password+"','"+phno+"','"+securitycode+"')";
				st.executeUpdate(query);
	        	new Logins();
	        	f.dispose();

	        }
	        con.close();
			
	        	        
		}
		catch(Exception E)
		{
			System.out.println(E);
		}
	}

		
	
	

}