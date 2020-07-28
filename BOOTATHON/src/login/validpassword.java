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
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class validpassword extends JFrame implements ActionListener{
    JFrame f=new JFrame();
	JLabel l1=new JLabel("Create new Password");
	JLabel l2=new JLabel("Username");
	JLabel l3=new JLabel("Enter your security code");
	JLabel l4=new JLabel("New Password");
	JLabel l5=new JLabel("Re-type Password");
	JLabel l6=new JLabel("Username doesn't exist");
	JLabel l7=new JLabel("Wrong security code");
	JLabel l8=new JLabel("Invalid password");
	JLabel l9=new JLabel("Password match failed");
	JTextField t1=new JTextField();
	JPasswordField p1=new JPasswordField();
	JPasswordField p2=new JPasswordField();
	JPasswordField p3=new JPasswordField();
	JButton b1=new JButton("Submit");
	Color c=new Color(0,116,217);
	Color c1=new Color(255,255,255);
	validpassword()
	{
		l1.setBounds(400, 50, 300, 40);
		l2.setBounds(200, 120, 300, 20);
		l3.setBounds(200, 220, 300, 20);
		l4.setBounds(200, 320, 300, 20);
		l5.setBounds(200, 410, 300, 20);
		l6.setBounds(200, 180, 300, 20);
		l7.setBounds(200, 280, 300, 20);
		l8.setBounds(200, 380, 300, 20);
		l9.setBounds(200, 470, 300, 20);
		t1.setBounds(200, 150, 350, 30);
		p1.setBounds(200, 250, 350, 30);
		p2.setBounds(200, 350, 350, 30);
		p3.setBounds(200, 440, 350, 30);
		b1.setBounds(370, 520, 250, 40);
		l1.setFont(new Font("Verdana",Font.PLAIN,20));
		l2.setFont(new Font("Verdana",Font.PLAIN,15));
		l3.setFont(new Font("Verdana",Font.PLAIN,15));
		l4.setFont(new Font("Verdana",Font.PLAIN,15));
		l5.setFont(new Font("Verdana",Font.PLAIN,15));
		l6.setForeground(Color.red);
		l7.setForeground(Color.red);
		l8.setForeground(Color.red);
		l9.setForeground(Color.red);
		b1.setBorderPainted(false);
		b1.setFocusPainted(false);
		b1.setBackground(c1);
		l1.setForeground(Color.white);
		l2.setForeground(Color.white);
		l3.setForeground(Color.white);
		l4.setForeground(Color.white);
		l5.setForeground(Color.white);
		f.add(l1);
		f.add(l2);
		f.add(l3);
		f.add(l4);
		f.add(l5);
		f.add(l6);
		f.add(l7);
		f.add(l8);
		f.add(l9);
		f.add(t1);
		f.add(p1);
		f.add(p2);
		f.add(p3);
		f.add(b1);
		b1.addActionListener(this);
		l6.setVisible(false);
		l7.setVisible(false);
		l8.setVisible(false);
		l9.setVisible(false);
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
		// TODO Auto-generated method stub
		String uname=t1.getText();
                final String Driver="oracle.jdbc.driver.OracleDriver";
                final String connect="jdbc:oracle:thin:@127.0.0.1:1521:XE";
		String securitycode=new String(p1.getPassword());
		String newpassword=new String(p2.getPassword());
		String retypepassword=new String(p3.getPassword());
		int x=0;
		int flag=0;
		try
		{
                        Class.forName(Driver);
                        Connection con=DriverManager.getConnection(connect,"bootathon","admin");
                        Statement st=con.createStatement();
			String query="select * from registers";
	        ResultSet rs=st.executeQuery(query);
	        while(rs.next())
	        {
	        	if(rs.getString("rollno").equals(uname))
	        	{
	        		x=1;
	        		break;
	            }
	        }
	        con.close();

                        Class.forName(Driver);
                        Connection con1=DriverManager.getConnection(connect,"bootathon","admin");
                        Statement st1=con1.createStatement();
			String query1="select rollno,securitycode,password from registers";
	        ResultSet rs1=st1.executeQuery(query1);
	        while(rs1.next())
	        {
	        	if(rs1.getString("rollno").equals(uname) && rs1.getString("securitycode").equals(securitycode))
	        	{
	        		flag=1;
	        		break;
	        }
	        }
	        con1.close();

                Class.forName(Driver);
                Connection con2=DriverManager.getConnection(connect,"bootathon","admin");
                if(x==1 && flag==1)
	        {
	        	if(newpassword.equals(retypepassword))
	        	{
	        		Statement st2=con2.createStatement();
	        		String sql="update registers set password='"+newpassword+"' where rollno='"+uname+"'";
	        		st2.executeUpdate(sql);
	        		new Logins();
	        		f.dispose();
	        	}
	        	else
	        	{
	        		l9.setVisible(true);
	        		l8.setVisible(false);
	        		l7.setVisible(false);
	        		l6.setVisible(false);
	        	}
	        	
	        }
	        else if(x==0)
	        {
	        	l6.setVisible(true);
	        	l7.setVisible(false);
	        	l8.setVisible(false);
	        	l9.setVisible(false);
	        }
	        else if(flag==0)
	        {
	        	l6.setVisible(false);
	        	l7.setVisible(true);
	        	l8.setVisible(false);
	        	l9.setVisible(false);
	        }
	        else if(validation.isValidPassword(newpassword)==false)
	        {
	        	l6.setVisible(false);
	        	l7.setVisible(false);
	        	l8.setVisible(true);
	        	l9.setVisible(false);
	        }
	        con2.close();
		}
		catch(Exception g)
		{
			System.out.print(g);
		}
	}


}