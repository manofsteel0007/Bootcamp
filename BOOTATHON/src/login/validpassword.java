package login;
import java.sql.*;
import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.*;
public class validpassword extends JFrame implements ActionListener{
	String username;
	String name;
	String message="I have forgotten my password.Kindly I request password change";
	JPanel p1=new JPanel();
	JPanel p2=new JPanel();
	JLabel l7=new JLabel(new ImageIcon("C:\\Users\\kumar\\Downloads\\label1.jpg"));
	JLabel l1=new JLabel("Request Password Change");
	JLabel l2=new JLabel("Username");
	JLabel l4=new JLabel("<html>Your request has been sent to the admin.Please<br><br> contact admin for further queries.</html>");
	JLabel l6=new JLabel("Invalid username");
	JTextField t1=new JTextField();
	JButton b1=new JButton("submit");
	Border border=BorderFactory.createLineBorder(Color.black);
	Color c=new Color(0,116,217);
	Color c1=new Color(255,102,0);
	validpassword()
	{
		l7.setBounds(0, 0, 450, 700);
		l1.setBounds(30, 80, 450, 50);
		l2.setBounds(30, 150, 450, 50);
		l4.setBounds(30, 425, 460, 70);
		l6.setBounds(30, 270, 460, 50);
		t1.setBounds(30, 220, 400, 30);
		p1.setBounds(5, 5, 450, 753);
		p2.setBounds(460, 5, 520, 753);
		b1.setBounds(140, 350, 200, 30);
		l1.setFont(new Font("Verdana",Font.BOLD,20));
		l2.setFont(new Font("Verdana",Font.PLAIN,20));
		l4.setFont(new Font("Verdana",Font.PLAIN,15));
		l6.setFont(new Font("Verdana",Font.PLAIN,15));
		b1.setFont(new Font("Verdana",Font.PLAIN,15));
		l1.setBackground(Color.black);
		l2.setBackground(Color.black);
		l4.setForeground(Color.blue);
		l6.setForeground(Color.red);
		b1.setForeground(Color.white);
		t1.setBorder(border);
		p1.setBackground(Color.white);
		p2.setBackground(Color.white);
	    b1.setBorderPainted(false);
		b1.setFocusPainted(false);
		b1.setBackground(c);
		p1.add(l7);
		p2.add(l1);
		p2.add(l2);
		p2.add(l4);
		p2.add(l6);
		p2.add(t1);
		p2.add(b1);
		add(p1);
		add(p2);
		p1.setLayout(null);
		p2.setLayout(null);
		l4.setVisible(false);
		l6.setVisible(false);
		b1.addActionListener(this);
		this.getContentPane().setBackground(Color.white);
		setSize(1000,800);
		setLayout(null);
		setLocationRelativeTo(null);
		
                addWindowListener(new WindowAdapter() {
                    public void windowClosing(WindowEvent e) {  
                        int a=JOptionPane.showConfirmDialog(new JFrame(),"Are you sure?");  
                        if(a==JOptionPane.YES_OPTION){  
                            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
                        } 
                    }
                });
                setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		
                setVisible(true);
	}
	final String Driver="oracle.jdbc.driver.OracleDriver";
        final String connect="jdbc:oracle:thin:@127.0.0.1:1521:XE";
	@Override
	public void actionPerformed(ActionEvent e) {
		String s1=t1.getText();
		int f=0;
		if(e.getSource()==b1)
		{
			try
			{
				Class.forName(Driver);
                                Connection con=DriverManager.getConnection(connect,"bootathon","admin");
				Statement st=con.createStatement();
				String query="select * from registers";
		        ResultSet rs=st.executeQuery(query);
		        while(rs.next())
		        {
		        	if(rs.getString("rollno").equals(s1))
		        	{
		        		username=rs.getString("rollno");
		        		name=rs.getString("firstname")+" "+rs.getString("lastname");
		        		f=1;
		        		break;
		            }
		        }
		        if(f==1)
		        {
		        	l6.setVisible(false);
		        	l4.setVisible(true);
		        	con.close();
			        
                                Class.forName(Driver);
                                Connection con1=DriverManager.getConnection(connect,"bootathon","admin");
				Statement st1=con1.createStatement();
			        String query1="insert into query_forum values('"+username+"','"+name+"','"+message+"')";
			        st1.executeUpdate(query1);
			        con1.close();
		        }
		        else
		        {
		        	l4.setVisible(false);
		        	l6.setVisible(true);
		        }
		        
			}
			catch(Exception E)
			{
				System.out.println(E);
			}
		}

		
	}
	
	   public static void main(String[] args) {
        new validpassword();
    }

}
