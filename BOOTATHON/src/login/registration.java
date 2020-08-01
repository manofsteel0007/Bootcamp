package login;
import java.sql.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.*;
public class registration extends JFrame implements ActionListener  {
	JPanel p1=new JPanel();
	JPanel p2=new JPanel();
	JLabel l20=new JLabel(new ImageIcon("C:\\Users\\kumar\\Downloads\\label1.jpg"));
	JLabel l1=new JLabel("Registration Form");
	JLabel l2=new JLabel("First Name");
	JLabel l3=new JLabel("Last Name");
	JLabel l4=new JLabel("Email");
	JLabel l5=new JLabel("Roll No");
	JLabel l6=new JLabel("Department");
	JLabel l7=new JLabel("Section");
	JLabel l8=new JLabel("College");
	JLabel l9=new JLabel("Password");
	JLabel l16=new JLabel("Security code");
	JLabel l17=new JLabel("Confirm password");
	JLabel l10=new JLabel("Mobile No");
	JLabel l11=new JLabel("Invalid firstname");
	JLabel l12=new JLabel("Invalid email");
	JLabel l13=new JLabel("Invalid roll no");
	JLabel l14=new JLabel("Invalid password");
	JLabel l15=new JLabel("Invalid mobile no");
	JLabel l18=new JLabel("Wrong security code");
	JLabel l19=new JLabel("Password match failed");
	JLabel l21=new JLabel("Invalid lastname");
	String[] department= {"CIVIL","CSE","ECE","EEE","IT","MECH","MCT"};
	JComboBox<String> cb1=new JComboBox<String>(department);
	ButtonGroup bg=new ButtonGroup();
	JRadioButton rb1=new JRadioButton("A");
	JRadioButton rb2=new JRadioButton("B");
	JRadioButton rb3=new JRadioButton("C");
	JTextField t1=new JTextField();
	JTextField t2=new JTextField();
	JTextField t3=new JTextField();
	JTextField t4=new JTextField();
	JTextField t5=new JTextField();
	JTextField t6=new JTextField();
	JPasswordField password1=new JPasswordField();
	JPasswordField password2=new JPasswordField();
	JPasswordField password3=new JPasswordField();
	JButton b1=new JButton("Register");
	Border border=BorderFactory.createLineBorder(Color.black);
	Color c=new Color(0,116,217);
	Color c1=new Color(255,255,255);
	
        public registration()
	{
		l20.setBounds(0, 0, 450, 700);
		l1.setBounds(30, 30, 200, 30);
		l2.setBounds(30, 70, 150, 20);
		l3.setBounds(245, 70, 150, 20);
		l4.setBounds(30, 150, 150, 20);
		l5.setBounds(245, 150, 150, 20);
		l6.setBounds(30, 228, 150, 20);
		l7.setBounds(30, 283, 150, 20);
		l8.setBounds(30, 375, 150, 20);
		l9.setBounds(30, 453, 150, 20);
		l10.setBounds(30, 540, 150, 20);
		l11.setBounds(30, 125, 150, 20);
		l12.setBounds(30, 205, 150, 20);
		l13.setBounds(245, 205, 150, 20);
		l14.setBounds(30, 515, 150, 20);
		l15.setBounds(30, 596, 150, 20);
		l16.setBounds(245, 375, 150, 20);
		l17.setBounds(245, 456, 150, 20);
		l18.setBounds(245, 433, 150, 20);
		l19.setBounds(245, 515, 150, 20);
		l21.setBounds(245, 125, 150, 20);
		
                cb1.setBounds(30, 255, 100, 20);
		rb1.setBounds(30, 305, 40, 20);
		rb2.setBounds(30, 325, 40, 20);
		rb3.setBounds(30, 345, 40, 20);
		
                t1.setBounds(30, 100, 200, 25);
		t2.setBounds(245, 100, 200, 25);
		t3.setBounds(30, 180, 200, 25);
		t4.setBounds(245, 180, 200, 25);
		t5.setBounds(30, 405, 200, 25);
		t6.setBounds(30, 565, 200, 25);
		
                password1.setBounds(245, 405, 200, 25);
		password2.setBounds(30, 486, 200, 25);
		password3.setBounds(245, 486, 200, 25);
		
                b1.setBounds(140, 623, 200, 30);
		
                l1.setFont(new Font("Verdana",Font.PLAIN,20));
		l2.setFont(new Font("Verdana",Font.PLAIN,12));
		l3.setFont(new Font("Verdana",Font.PLAIN,12));
		l4.setFont(new Font("Verdana",Font.PLAIN,12));
		l5.setFont(new Font("Verdana",Font.PLAIN,12));
		l6.setFont(new Font("Verdana",Font.PLAIN,12));
		l7.setFont(new Font("Verdana",Font.PLAIN,12));
		l8.setFont(new Font("Verdana",Font.PLAIN,12));
		l9.setFont(new Font("Verdana",Font.PLAIN,12));
		l10.setFont(new Font("Verdana",Font.PLAIN,12));
		l16.setFont(new Font("Verdana",Font.PLAIN,12));
		l17.setFont(new Font("Verdana",Font.PLAIN,12));
		rb1.setFont(new Font("Verdana",Font.PLAIN,12));
		rb2.setFont(new Font("Verdana",Font.PLAIN,12));
		rb3.setFont(new Font("Verdana",Font.PLAIN,12));
		cb1.setFont(new Font("TimesRoman",Font.PLAIN,12));
		b1.setFont(new Font("Verdana",Font.PLAIN,15));
		
                cb1.setBackground(Color.white);
		cb1.setForeground(Color.black);
		cb1.setOpaque(false);
		/*l1.setBackground(Color.black);
		l2.setBackground(Color.black);
		l3.setBackground(Color.black);*/
		rb1.setBackground(Color.white);
		rb2.setBackground(Color.white);
		rb3.setBackground(Color.white);
		b1.setForeground(Color.white);
		
                b1.setBorderPainted(false);
                b1.setFocusPainted(false);
		b1.setBackground(c);
		rb1.setBorderPainted(false);
		rb1.setContentAreaFilled(false);
		rb1.setFocusPainted(false);
		rb1.setOpaque(false);
		rb2.setBorderPainted(false);
		rb2.setContentAreaFilled(false);
		rb2.setFocusPainted(false);
		rb2.setOpaque(false);
		rb3.setBorderPainted(false);
		rb3.setContentAreaFilled(false);
		rb3.setFocusPainted(false);
		rb3.setOpaque(false);
		
                bg.add(rb1);
		bg.add(rb2);
		bg.add(rb3);
		
                l11.setForeground(Color.red);
		l12.setForeground(Color.red);
		l13.setForeground(Color.red);
		l14.setForeground(Color.red);
		l15.setForeground(Color.red);
		l18.setForeground(Color.red);
		l19.setForeground(Color.red);
		l21.setForeground(Color.red);
		
                p1.setBounds(5, 5, 450, 753);
		p2.setBounds(460, 5, 520, 753);
		
                t1.setBorder(border);
		t2.setBorder(border);
		t3.setBorder(border);
		t4.setBorder(border);
		t5.setBorder(border);
		t6.setBorder(border);
		password1.setBorder(border);
		password2.setBorder(border);
		password3.setBorder(border);
		p1.setBackground(Color.white);
		p2.setBackground(Color.white);
		
                p1.add(l20);
		p2.add(l1);
		p2.add(l2);
		p2.add(l3);
		p2.add(l4);
		p2.add(l5);
		p2.add(l6);
		p2.add(l7);
		p2.add(l8);
		p2.add(l9);
		p2.add(l10);
		p2.add(l11);
		p2.add(l12);
		p2.add(l13);
		p2.add(l14);
		p2.add(l15);
		p2.add(l16);
		p2.add(l17);
		p2.add(l18);
		p2.add(l19);
		p2.add(l21);
		p2.add(cb1);
		p2.add(rb1);
		p2.add(rb2);
		p2.add(rb3);
		p2.add(t1);
		p2.add(t2);
		p2.add(t3);
		p2.add(t4);
		p2.add(t5);
		p2.add(t6);
		p2.add(b1);
		p2.add(password1);
		p2.add(password2);
		p2.add(password3);
		
                add(p1);
		add(p2);
		p1.setLayout(null);
		p2.setLayout(null);
		
                b1.addActionListener(this);
		
                l11.setVisible(false);
		l12.setVisible(false);
		l13.setVisible(false);
		l14.setVisible(false);
		l15.setVisible(false);
		l18.setVisible(false);
		l19.setVisible(false);
		l21.setVisible(false);
		
                this.getContentPane().setBackground(Color.white);
		setSize(1000,800);
		setLayout(null);
		setLocationRelativeTo(null);
		setVisible(true);
		
                addWindowListener(new WindowAdapter() {
                    public void windowClosing(WindowEvent e) {  
                    int a=JOptionPane.showConfirmDialog(new JFrame(),"Are you sure?");  
                    if(a==JOptionPane.YES_OPTION){  
                        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
                    } 
                }
                });
                setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String fname=t1.getText();
		String lname=t2.getText();
		String email=t3.getText();
		String rollno=t4.getText();
		String password=new String(password2.getPassword());
		String retypepassword=new String(password3.getPassword());
		String college=t5.getText();
		String phno=t6.getText();
		String dept=cb1.getItemAt(cb1.getSelectedIndex());
		String sec="";
		String securitycode1=new String(password1.getPassword());
		String securitycode2="mahesh";
		if(rb1.isSelected())
		{
			sec="CSE";
		}
		if(rb2.isSelected())
		{
			sec="EEE";
		}
		if(rb3.isSelected())
		{
			sec="ECE";
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
				l11.setVisible(false);
				l12.setVisible(false);
				l13.setVisible(false);
				l14.setVisible(false);
				l15.setVisible(false);
				l18.setVisible(false);
				l19.setVisible(false);
				l21.setVisible(false);
				JOptionPane.showMessageDialog(this, "You should fill all the fields!");
			}
			else if(validation.isValidUserFirstName(fname)==false)
			{
				l11.setVisible(true);
				l12.setVisible(false);
				l13.setVisible(false);
				l14.setVisible(false);
				l15.setVisible(false);
				l18.setVisible(false);
				l19.setVisible(false);
				l21.setVisible(false);
			}
			else if(validation.isValidUserLastName(lname)==false){
				l11.setVisible(false);
				l12.setVisible(false);
				l13.setVisible(false);
				l14.setVisible(false);
				l15.setVisible(false);
				l18.setVisible(false);
				l19.setVisible(false);
				l21.setVisible(true);
				
			}
			else if(validation.isValidemail(email)==false)
			{
				l11.setVisible(false);
				l12.setVisible(true);
				l13.setVisible(false);
				l14.setVisible(false);
				l15.setVisible(false);
				l18.setVisible(false);
				l19.setVisible(false);
				l21.setVisible(false);

			}
			else if(validation.isValidRollno(rollno)==false)
			{
				l11.setVisible(false);
				l12.setVisible(false);
				l13.setVisible(true);
				l14.setVisible(false);
				l15.setVisible(false);
				l18.setVisible(false);
				l19.setVisible(false);
				l21.setVisible(false);

			}
			
			else if(!securitycode1.equals(securitycode2))
			{
				l11.setVisible(false);
				l12.setVisible(false);
				l13.setVisible(false);
				l14.setVisible(false);
				l15.setVisible(false);
				l18.setVisible(true);
				l19.setVisible(false);
				l21.setVisible(false);

				
			}
			else if(validation.isValidPassword(password)==false )
			{
				l11.setVisible(false);
				l12.setVisible(false);
				l13.setVisible(false);
				l14.setVisible(true);
				l15.setVisible(false);
				l18.setVisible(false);
				l19.setVisible(false);
				l21.setVisible(false);

			}
			else if(!password.equals(retypepassword))
			{
				l11.setVisible(false);
				l12.setVisible(false);
				l13.setVisible(false);
				l14.setVisible(false);
				l15.setVisible(false);
				l18.setVisible(false);
				l19.setVisible(true);
				l21.setVisible(false);
			}
			else if(validation.isValidPhno(phno)==false )
			{
				l11.setVisible(false);
				l12.setVisible(false);
				l13.setVisible(false);
				l14.setVisible(false);
				l15.setVisible(true);
				l18.setVisible(false);
				l19.setVisible(false);
				l21.setVisible(false);

			}
			
	        else
	        {
	        	l11.setVisible(false);
	    		l12.setVisible(false);
	    		l13.setVisible(false);
	    		l14.setVisible(false);
	    		l15.setVisible(false);
	    		l18.setVisible(false);
	    		l19.setVisible(false);
	    		l21.setVisible(false);

	        	String query="insert into registers values('"+fname+"','"+lname+"','"+email+"','"+rollno+"','"+dept+"','"+sec+"',"
	        			+ "'"+college+"','"+password+"','"+phno+"','"+securitycode2+"')";
				st.executeUpdate(query);
	        	new Logins();
	        	JOptionPane.showMessageDialog(this, "successfully registered");
	        	setVisible(false);
                        
                        dispose();

	        }
	        con.close();
			
	        	        
		}
		catch(Exception E)
		{
			System.out.println(E);
		}
	}
    public static void main(String[] args) {
        new registration();
    }


}
