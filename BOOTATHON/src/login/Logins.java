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
import forum.Forum_frame;
import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.Border;
public class Logins extends JFrame implements ActionListener,MouseListener{
	JFrame f;
        JLabel l1,l2,l3,l4,l5,l6;
	JTextField tf1;
	JPasswordField p1;
	JButton b1,b2;
	Color c=new Color(0,116,217);
	Color c1=new Color(255,102,0);
	Logins()
	{
            f=new JFrame();
                        
            l1=new JLabel("Login Form");
            l2=new JLabel("Username");
            l3=new JLabel("Password");
            l4=new JLabel("Forgot Password?");
            l5=new JLabel("or");
            l6=new JLabel("Invalid username or password");
            
            b1=new JButton("Login");
            b2=new JButton("Sign up");
            
            tf1=new JTextField();
            p1=new JPasswordField();
        
		l1.setBounds(400, 50, 300, 40);
		l2.setBounds(200, 120, 300, 20);
		l3.setBounds(200, 220, 300, 20);
		l4.setBounds(200, 300, 300, 20);
		l5.setBounds(450, 400, 250, 40);
		l6.setBounds(200, 310, 250, 40);
                
		tf1.setBounds(200, 150, 350, 30);
                
		p1.setBounds(200, 250, 350, 30);
		
                b1.setBounds(330, 350, 250, 40);
		b2.setBounds(330, 450, 250, 40);
		
                l1.setFont(new Font("Verdana",Font.PLAIN,20));
		l2.setFont(new Font("Verdana",Font.PLAIN,15));
		l3.setFont(new Font("Verdana",Font.PLAIN,15));
		l4.setFont(new Font("Verdana",Font.PLAIN,15));
		l5.setFont(new Font("Verdana",Font.PLAIN,20));
		
                b1.setBorderPainted(false);
		b2.setBorderPainted(false);
		b1.setFocusPainted(false);
		b2.setFocusPainted(false);
		
                l1.setForeground(Color.white);
		l2.setForeground(Color.white);
		l3.setForeground(Color.white);
                l4.setForeground(Color.orange);
		l6.setForeground(Color.red);
                
                b1.setBorder(new RoundedBorder(20));
                b2.setBorder(new RoundedBorder(20));
		
		f.add(l1);
		f.add(l2);
		f.add(l3);
		f.add(l4);
		f.add(l5);
		f.add(l6);
		f.add(tf1);
		f.add(p1);
		f.add(b1);
		f.add(b2);
                
		l6.setVisible(false);
		
                b1.addActionListener(this);
		b2.addActionListener(this);
		l4.addMouseListener(this);
            
            f.getContentPane().setBackground(c);
		
            f.setSize(1000,800);
            f.setLayout(null);
            f.setLocationRelativeTo(null);
            f.setVisible(true);

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
	public void actionPerformed(ActionEvent e) {
		String s1=tf1.getText();
		String s2=new String(p1.getPassword());
		int x=0;
		int flag=0;
                final String Driver="oracle.jdbc.driver.OracleDriver";
                final String connect="jdbc:oracle:thin:@127.0.0.1:1521:XE";
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
		        		x=1;
		        		break;
		            }
		        }
		        con.close();
                        Class.forName(Driver);
                        Connection con1=DriverManager.getConnection(connect,"bootathon","admin");

                        Statement st1=con1.createStatement();
		        String query1="select * from registers";
		        ResultSet rs1=st1.executeQuery(query1);
	            while(rs1.next())
		        {
		        	if(rs1.getString("rollno").equals(s1) && rs1.getString("password").equals(s2) )
		        	{
		        		flag=1;
		        		break;
		        	}
		        }
                    if(x==0 || flag==0)
		        {
		        	l6.setVisible(true);
		        }
		        else
		        {
		        	new assessment.Assessment_frame();
		        	l6.setVisible(false);
		        	f.setVisible(false);
		        }
		        con1.close();
		        
			}
			catch(Exception E)
			{
				System.out.println(E);
			}
		}
		if(e.getSource()==b2)
		{
			new registration();
			l6.setVisible(false);
			f.setVisible(false);
		}

		
	}
        
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==l4)
		{
			
			new validpassword();
			l6.setVisible(false);
			f.setVisible(false);
		}
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
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
	
        public static void main(String[] args) {
		new Logins();

	}
}   