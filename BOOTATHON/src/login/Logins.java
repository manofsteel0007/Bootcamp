package login;
import java.sql.*;
import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.*;
public class Logins extends JFrame implements ActionListener,MouseListener{
	JPanel p1=new JPanel();
	JPanel p2=new JPanel();
	JLabel l7=new JLabel(new ImageIcon("C:\\Users\\kumar\\Downloads\\label1.jpg"));
	JLabel l8=new JLabel("Welcome Back :)");
	JLabel l1=new JLabel("Sign in");
	JLabel l2=new JLabel("Username");
	JLabel l3=new JLabel("Password");
	JLabel l4=new JLabel("Forgot Password?");
	JLabel l6=new JLabel("Invalid username or password");
	JTextField t1=new JTextField();
	JPasswordField password=new JPasswordField();
	JButton b1=new JButton("Login");
	JLabel l5=new JLabel("or");
	JButton b2=new JButton("create an account");
	Border border=BorderFactory.createLineBorder(Color.black);
	Color c=new Color(0,116,217);
	Color c1=new Color(255,102,0);
        
        String main_user_name;
        String main_name;
        
	public Logins()
	{
		l1.setBounds(30, 80, 450, 50);
		l2.setBounds(30, 150, 450, 50);
		l3.setBounds(30, 270, 460, 50);
		l4.setBounds(300, 425, 460, 50);
		l6.setBounds(30, 400, 460, 50);
                l7.setBounds(0, 0, 450, 700);
		l8.setBounds(30, 30, 450, 40);
		
                t1.setBounds(30, 220, 400, 30);
		password.setBounds(30, 345, 400, 30);
		p1.setBounds(5, 5, 450, 753);
		p2.setBounds(460, 5, 520, 753);
		b1.setBounds(140, 480, 200, 30);
		b2.setBounds(10, 530, 150, 30);
		
                l1.setFont(new Font("Verdana",Font.BOLD,25));
		l2.setFont(new Font("Verdana",Font.PLAIN,20));
		l3.setFont(new Font("Verdana",Font.PLAIN,20));
		l4.setFont(new Font("Verdana",Font.PLAIN,15));
		l6.setFont(new Font("Verdana",Font.PLAIN,15));
		l8.setFont(new Font("Verdana",Font.PLAIN,20));
		b1.setFont(new Font("Verdana",Font.PLAIN,15));
		b2.setFont(new Font("Verdana",Font.PLAIN,13));
		
                l1.setBackground(Color.black);
		l2.setBackground(Color.black);
		l3.setBackground(Color.black);
		l4.setForeground(Color.blue);
		l6.setForeground(Color.red);
		l8.setBackground(Color.black);

                b1.setForeground(Color.white);
		t1.setBorder(border);
		password.setBorder(border);
		p1.setBackground(Color.white);
		p2.setBackground(Color.white);
                
                b1.setBorderPainted(false);
		b1.setFocusPainted(false);
		
                b1.setBackground(c);
		b2.setBackground(c);
		b2.setForeground(c);
		
                b2.setBorderPainted(false);
		b2.setFocusPainted(false);
		b2.setMargin(new Insets(0,0,0,0));
		b2.setContentAreaFilled(false);
		b2.setOpaque(false);
		
                p1.add(l7);
		p2.add(l1);
		p2.add(l2);
		p2.add(l4);
		p2.add(l6);
		p2.add(l8);
		p2.add(t1);
		p2.add(password);
		p2.add(l3);
		p2.add(b1);
		p2.add(b2);
		
                add(p1);
		add(p2);
		
                p1.setLayout(null);
		p2.setLayout(null);
		l6.setVisible(false);
		
                b1.addActionListener(this);
		b2.addActionListener(this);
		l4.addMouseListener(this);
		
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
	public static void main(String[] args) {
		new Logins();

	}
	@Override
	public void actionPerformed(ActionEvent e) {
            String s1=t1.getText();
            String s2=new String(password.getPassword());
            int f=0;
            int flag=0;
            if(e.getSource()==b1){
                final String Driver="oracle.jdbc.driver.OracleDriver";
                final String connect="jdbc:oracle:thin:@127.0.0.1:1521:XE";
                    
		try{
                    Class.forName(Driver);
                    Connection con=DriverManager.getConnection(connect,"bootathon","admin");
                    Statement st=con.createStatement();
                    String query="select * from registers";
		    ResultSet rs=st.executeQuery(query);
		    while(rs.next())
		    {
                        if(rs.getString("rollno").equals(s1)){
                            f=1;
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
                        if(rs1.getString("rollno").equals(s1) && rs1.getString("password").equals(s2) ){
                            main_user_name=rs1.getString("rollno");
                            main_name=rs1.getString("firstname")+rs1.getString("lastname");
                            flag=1;
                            break;
		        	}
		        }
	           if(f==0 || flag==0)
		        {
		        	l6.setVisible(true);
		        }
		        else
		        {
		        	//new forum(s1);
		        	l6.setVisible(false);
		        	setVisible(false);
                                dispose();
                                new assessment.Assessment_frame(main_user_name, main_name);
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
			setVisible(false);
		}

		
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==l4)
		{
			
			new validpassword();
			l6.setVisible(false);
			setVisible(false);
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
	

}
