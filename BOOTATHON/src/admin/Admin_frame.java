/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

/**
 *
 * @author kumar
 * 
 */

import java.sql.*;
import java.util.ArrayList;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.event.*;
import javax.swing.table.*;
public class Admin_frame extends JFrame implements ActionListener,MouseListener, Runnable{
	String main_user_name;
        String main_name;
        String username;
	String msg_send;
	String msg_get;
	String name;
	String message;
	Thread thread=new Thread();
	String spin1;
	String spin2;
	String spin3;
	String spin4;
	String spin5;
	String spin6;
	String spin7;
	String spin8;
	JPanel p1=new JPanel();
	JPanel p2=new JPanel();
	JPanel p3=new JPanel();
	JPanel p4=new JPanel();
	JPanel p5=new JPanel();
	JPanel p6=new JPanel();
	JPanel p7=new JPanel();
	JPanel p8=new JPanel();
	ArrayList<String> al;
	JLabel l1=new JLabel("Admin");
	JLabel l2=new JLabel("Bootcamp");
	JLabel l3=new JLabel();
	JLabel l4=new JLabel("Start Date : ");
	JLabel l5=new JLabel("Start time : ");
	JLabel l6=new JLabel("End date   : ");
	JLabel l7=new JLabel("End time   : ");
	JLabel l8=new JLabel("Test Link  : ");
	JLabel l9=new JLabel("Results : ");
	JLabel l10=new JLabel("Enter the query : ");
	JTextField tf1=new JTextField();
	JTextField tf2=new JTextField();
	JTextArea ta1=new JTextArea();
	JTextArea textarea=new JTextArea();
	JTextArea textarea1=new JTextArea();
	SpinnerModel sm1=new SpinnerNumberModel(15,01,31,1);
	SpinnerModel sm2=new SpinnerNumberModel(06,01,12,1);
	String[] year= {"2020","2021","2022","2023","2024","2025"};
	JComboBox<String> cb1=new JComboBox<String>(year);
	SpinnerModel sm5=new SpinnerNumberModel(15,01,31,1);
	SpinnerModel sm6=new SpinnerNumberModel(06,01,12,1);
	String[] year1= {"2020","2021","2022","2023","2024","2025"};
	JComboBox<String> cb3=new JComboBox<String>(year1);
	SpinnerModel sm3=new SpinnerNumberModel(6,1,12,1);
	SpinnerModel sm4=new SpinnerNumberModel(30,1,60,1);
	SpinnerModel sm7=new SpinnerNumberModel(6,1,12,1);
	SpinnerModel sm8=new SpinnerNumberModel(30,1,60,1);
	String[] time1= {"AM","PM"};
	String[] time= {"AM","PM"};
	JComboBox<String> cb2=new JComboBox<String>(time);
	JComboBox<String> cb4=new JComboBox<String>(time1);
	JSpinner spinner1=new JSpinner(sm1);
	JSpinner spinner2=new JSpinner(sm2);
	JSpinner spinner3=new JSpinner(sm3);
	JSpinner spinner4=new JSpinner(sm4);
	JSpinner spinner5=new JSpinner(sm5);
	JSpinner spinner6=new JSpinner(sm6);
	JSpinner spinner7=new JSpinner(sm7);
	JSpinner spinner8=new JSpinner(sm8);
	JButton b1=new JButton("Student Details");
	JButton b2=new JButton("Announcements");
	JButton b3=new JButton("Assingning Test");
	JButton b4=new JButton("Post Results");
	JButton b5=new JButton("Queries");
	JButton b6=new JButton("send");
	JButton b7=new JButton("Dashboard");
	JButton b8=new JButton("Forum");
	JButton b9=new JButton("Assessment");
	JButton b10=new JButton("Admin");
	JButton b11=new JButton("Setting");
	JButton b12=new JButton("Log out");
	JButton b13=new JButton("Assign Test");
	JButton b14=new JButton("Upload");
	JTable t1=new JTable();
	JTable t2=new JTable();
	JScrollPane sp1;
	JScrollPane sp2;
	JScrollPane sp3;
	JScrollPane sp4;
	JScrollPane sp5;
	Border border=BorderFactory.createLineBorder(Color.black);
	Color c1=new Color(0,116,217);
	Color c2=new Color(255,102,0);
	Color c3=new Color(255,255,255);
        
        final String Driver="oracle.jdbc.driver.OracleDriver";
        final String connect="jdbc:oracle:thin:@127.0.0.1:1521:XE";
        
	public Admin_frame(String main_user_name,String main_name)
	{
            this.main_user_name=main_user_name;
            this.main_name=main_name;
		al=new ArrayList<String>();
		
                p1.setBounds(5, 5, 250, 800);
		p2.setBounds(258, 5, 727, 205);
		p3.setBounds(258, 205, 727, 590);
		p6.setBounds(258, 205, 727, 590);
		l1.setBounds(270, 50, 100, 30);
		l2.setBounds(10, 20, 250, 40);
		l3.setBounds(50, 30, 100, 40);
		l4.setBounds(50, 70, 100, 40);
		l5.setBounds(50, 110, 100, 40);
		l6.setBounds(50, 155, 100, 40);
		l7.setBounds(50, 200, 100, 40);
		l8.setBounds(50, 250, 100, 40);
		l9.setBounds(265, 215, 100, 40);
		l10.setBounds(265, 500, 150, 40);
		b1.setBounds(258, 185, 145, 25);
		b2.setBounds(403, 185, 145, 25);
		b3.setBounds(548, 185, 145, 25);
		b4.setBounds(693, 185, 145, 25);
		b5.setBounds(838, 185, 147, 25);
		b7.setBounds(5, 120, 250, 30);
		b8.setBounds(5, 160, 250, 30);
		b9.setBounds(5, 200, 250, 30);
		b10.setBounds(5, 240, 250, 30);
		b11.setBounds(5, 650, 250, 30);
		b12.setBounds(5, 700, 250, 30);
		b13.setBounds(180, 310, 220, 30);
		tf1.setBounds(270,715, 590, 30);
		tf2.setBounds(170, 260, 300, 25);
		ta1.setBounds(265, 535, 500, 200);
		b14.setBounds(800, 700, 100, 30);
		spinner1.setBounds(170, 75, 45, 28);
		spinner2.setBounds(230, 75, 45, 28);
		spinner3.setBounds(170, 120, 45, 28);
		spinner4.setBounds(230, 120, 45, 28);
		spinner5.setBounds(170, 165, 45, 28);
		spinner6.setBounds(230, 165, 45, 28);
		spinner7.setBounds(170, 210, 45, 28);
		spinner8.setBounds(230, 210, 45, 28);
		cb1.setBounds(290, 75, 70, 28);
		cb2.setBounds(290, 120, 70, 28);
		cb3.setBounds(290, 165, 70, 28);
		cb4.setBounds(290, 210, 70, 28);
		b6.setBounds(875, 715, 100, 30);
		l1.setFont(new Font("Verdana",Font.PLAIN,25));
		l2.setFont(new Font("Verdana",Font.PLAIN,30));
		l3.setFont(new Font("Verdana",Font.PLAIN,15));
		l4.setFont(new Font("Verdana",Font.PLAIN,15));
		l5.setFont(new Font("Verdana",Font.PLAIN,15));
		l6.setFont(new Font("Verdana",Font.PLAIN,15));
		l7.setFont(new Font("Verdana",Font.PLAIN,15));
		l8.setFont(new Font("Verdana",Font.PLAIN,15));
		l9.setFont(new Font("Verdana",Font.PLAIN,15));
		l10.setFont(new Font("Verdana",Font.PLAIN,15));
		b7.setFont(new Font("Verdana",Font.PLAIN,20));
		b8.setFont(new Font("Verdana",Font.PLAIN,20));
		b9.setFont(new Font("Verdana",Font.PLAIN,20));
		b10.setFont(new Font("Verdana",Font.PLAIN,20));
		b11.setFont(new Font("Verdana",Font.PLAIN,20));
		b12.setFont(new Font("Verdana",Font.PLAIN,20));
		b13.setFont(new Font("Verdana",Font.PLAIN,15));
		textarea.setFont(new Font("Verdana",Font.PLAIN,15));
		textarea1.setFont(new Font("Verdana",Font.PLAIN,15));
		b7.setBorderPainted(false);
		b8.setBorderPainted(false);
		b9.setBorderPainted(false);
		b10.setBorderPainted(false);
		b11.setBorderPainted(false);
		b12.setBorderPainted(false);
		b13.setBorderPainted(false);
		l1.setForeground(Color.white);
		l2.setForeground(Color.white);
		l3.setForeground(Color.black);
		l4.setForeground(Color.black);
		l5.setForeground(Color.black);
		l6.setForeground(Color.black);
		l7.setForeground(Color.black);
		l8.setForeground(Color.black);
		l9.setForeground(Color.black);
		l10.setForeground(Color.black);
		b1.setBackground(c3);
		b2.setBackground(c3);
		b3.setBackground(c3);
		b4.setBackground(c3);
		b5.setBackground(c3);
		b6.setBackground(c1);
		b7.setBackground(c1);
		b8.setBackground(c1);
		b9.setBackground(c1);
		b10.setBackground(c1);
		b11.setBackground(c1);
		b12.setBackground(c1);
		b13.setBackground(c1);
		b14.setBackground(c1);
		b6.setForeground(Color.white);
		b7.setForeground(Color.white);
		b8.setForeground(Color.white);
		b9.setForeground(Color.white);
		b10.setForeground(Color.white);
		b11.setForeground(Color.white);
		b12.setForeground(Color.white);
		b13.setForeground(Color.white);
		b14.setForeground(Color.white);
        
                p1.setBackground(c1);
                ta1.setBorder(border);
		p2.setBackground(c2);
		p3.setBackground(Color.white);
		p4.setBackground(Color.white);
		p5.setBackground(Color.white);
		p6.setBackground(Color.white);
		p7.setBackground(Color.white);
	
            b1.setFocusPainted(false);
	    b2.setFocusPainted(false);
	    b3.setFocusPainted(false);
	    b4.setFocusPainted(false);
	    b5.setFocusPainted(false);
	    b6.setFocusPainted(false);
	    b7.setFocusPainted(false);
	    b8.setFocusPainted(false);
	    b9.setFocusPainted(false);
	    b10.setFocusPainted(false);
	    b11.setFocusPainted(false);
	    b12.setFocusPainted(false);
	    b13.setFocusPainted(false);
	    b14.setFocusPainted(false);
            
            textarea.setLineWrap(true);
            textarea.setWrapStyleWord(true);
            textarea1.setLineWrap(true);
            textarea1.setWrapStyleWord(true);
	
            add(l1);
	    add(l2);
	    add(l9);
	    add(l10);
	    add(tf1);
	    add(ta1);
	    add(b1);
	    add(b2);
	    add(b3);
	    add(b4);
	    add(b5);
	    add(b7);
	    //add(p7);
	    add(b8);
	    add(b9);
	    add(b10);
	    add(b11);
	    add(b12);
	    add(b14);
	    add(l1);
	    add(p1);
	    add(tf1);
	    add(b6);
	    add(p2);
	    add(p3);
	    p6.add(l3);
	    p6.add(l4);
	    p6.add(l5);
	    p6.add(l6);
	    p6.add(l7);
	    p6.add(l8);
	    p6.add(spinner1);
	    p6.add(spinner2);
	    p6.add(spinner3);
	    p6.add(spinner4);
	    p6.add(spinner5);
	    p6.add(spinner6);
	    p6.add(spinner7);
	    p6.add(spinner8);
	    p6.add(cb1);
	    p6.add(cb2);
	    p6.add(cb3);
	    p6.add(cb4);
	    p6.add(tf2);
	    p6.add(b13);
	    add(p6);
	    sp1=new JScrollPane(t1);
	    sp1.setBounds(258, 215, 727, 540);
	    add(sp1);
		sp2=new JScrollPane(textarea);
		sp2.setBounds(270, 220, 710, 485);
	    add(sp2);
	    sp4=new JScrollPane(t2);
	    sp4.setBounds(265, 250, 700, 250);
	    add(sp4);
	    sp5=new JScrollPane(textarea1);
	    sp5.setBounds(270, 240, 700, 485);
	    add(sp5);
	    p4.setLayout(null);
	    p6.setLayout(null);
	    p7.setLayout(null);
	    p4.setVisible(false);
	    p6.setVisible(false);
	    l9.setVisible(false);
	    l10.setVisible(false);
	    ta1.setVisible(false);
	    b14.setVisible(false);
	    tf1.setVisible(false);
	    b6.setVisible(false);
	    sp1.setVisible(false);
	    sp2.setVisible(false);
	    sp5.setVisible(false);
	    b1.addActionListener(this);
	    b2.addActionListener(this);
	    b3.addActionListener(this);
	    b4.addActionListener(this);
	    b5.addActionListener(this);
	    b6.addActionListener(this);
	    b7.addMouseListener(this);
	    b8.addMouseListener(this);
	    b9.addMouseListener(this);
	    b10.addMouseListener(this);
	    b11.addMouseListener(this);
	    b12.addMouseListener(this);
	    b13.addActionListener(this);
	    spinner1.addChangeListener(new ChangeListener()
	    {
	    	public void stateChanged(ChangeEvent e) {
	    		if(e.getSource()==spinner1)
	    		{
	    			Integer spins1=(Integer)spinner1.getValue();
	    			spin1=spins1.toString();
	    			System.out.print(spin1);
	    		}
	    	}
	    });
	    spinner2.addChangeListener(new ChangeListener()
	    {
	    	public void stateChanged(ChangeEvent e) {
	    		if(e.getSource()==spinner2)
	    		{
	    			Integer spins2=(Integer)spinner2.getValue();
	    			spin2=spins2.toString();
	    			//System.out.print(spin1);
	    		}
	    	}
	    });
	    spinner3.addChangeListener(new ChangeListener()
	    {
	    	public void stateChanged(ChangeEvent e) {
	    		if(e.getSource()==spinner3)
	    		{
	    			Integer spins3=(Integer)spinner3.getValue();
	    			spin3=spins3.toString();
	    			//System.out.print(spin1);
	    		}
	    	}
	    });
	    spinner4.addChangeListener(new ChangeListener()
	    {
	    	public void stateChanged(ChangeEvent e) {
	    		if(e.getSource()==spinner4)
	    		{
	    			Integer spins4=(Integer)spinner4.getValue();
	    			spin4=spins4.toString();
	    			//System.out.print(spin1);
	    		}
	    	}
	    });
	    spinner5.addChangeListener(new ChangeListener()
	    {
	    	public void stateChanged(ChangeEvent e) {
	    		if(e.getSource()==spinner5)
	    		{
	    			Integer spins5=(Integer)spinner5.getValue();
	    			spin5=spins5.toString();
	    			//System.out.print(spin1);
	    		}
	    	}
	    });
	    spinner6.addChangeListener(new ChangeListener()
	    {
	    	public void stateChanged(ChangeEvent e) {
	    		if(e.getSource()==spinner6)
	    		{
	    			Integer spins6=(Integer)spinner6.getValue();
	    			spin6=spins6.toString();
	    			//System.out.print(spin1);
	    		}
	    	}
	    });
	    spinner7.addChangeListener(new ChangeListener()
	    {
	    	public void stateChanged(ChangeEvent e) {
	    		if(e.getSource()==spinner7)
	    		{
	    			Integer spins7=(Integer)spinner7.getValue();
	    			spin7=spins7.toString();
	    			//System.out.print(spin1);
	    		}
	    	}
	    });
	    spinner8.addChangeListener(new ChangeListener()
	    {
	    	public void stateChanged(ChangeEvent e) {
	    		if(e.getSource()==spinner8)
	    		{
	    			Integer spins8=(Integer)spinner8.getValue();
	    			spin8=spins8.toString();
	    			//System.out.print(spin1);
	    		}
	    	}
	    });
	    
	    this.getContentPane().setBackground(Color.white);
	    setSize(1000,800);
	    setLocationRelativeTo(null);
	    setLayout(null);
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
            if(e.getSource()==b1)
            {
                p3.setVisible(false);
                p6.setVisible(false);
                sp2.setVisible(false);
                sp5.setVisible(false);
                tf1.setVisible(false);
		b6.setVisible(false);
		sp1.setVisible(true);
		l9.setVisible(false);
		l10.setVisible(false);
		sp4.setVisible(false);
		ta1.setVisible(false);
		b14.setVisible(false);
		String[] s1= {"First Name","Last Name","Email","Roll No","Department","Section","college","Mobile No"};
		DefaultTableModel model=new DefaultTableModel();
		model.setColumnIdentifiers(s1);
		t1.setModel(model);
		t1.setFillsViewportHeight(true);
		t1.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		String fname="";
		String lname="";
		String email="";
		String rollno="";
		String dept="";
		String sec="";
		String clge="";
		String phno="";
		try{ 
                    Class.forName(Driver);
                    Connection con=DriverManager.getConnection(connect,"bootathon","admin");
                    Statement st=con.createStatement();
		    con.setAutoCommit(true);
		    String query="select * from registers";
		    ResultSet rs=st.executeQuery(query);
		    while(rs.next())
		    {
                        fname=rs.getString("firstname");
			lname=rs.getString("lastname");			     
			email=rs.getString("email");
			rollno=rs.getString("rollno");
			dept=rs.getString("department");
			sec=rs.getString("section");
			clge=rs.getString("college");
			phno=rs.getString("mobileno");
			model.addRow(new Object[] {fname,lname,email,rollno,dept,sec,clge,phno});
		     }
		     con.close();
		  }
		  catch(Exception E)
		  { System.out.println(E);
			  
		  }
            }
            if(e.getSource()==b2)
            {
                sp5.setVisible(false);
                p3.setVisible(false);
                p6.setVisible(false);
                sp1.setVisible(false);
                sp2.setVisible(true);
                tf1.setVisible(true);
		    
                b6.setVisible(true);
		l9.setVisible(false);
		l10.setVisible(false);
		sp4.setVisible(false);
		ta1.setVisible(false);
		b14.setVisible(false);
		StartThread();
            }
		
            if(e.getSource()==b6){
                sp5.setVisible(false);
                p3.setVisible(false);
                p6.setVisible(false);
                p4.setVisible(false);
                sp2.setVisible(true);
                sp1.setVisible(false);
                l9.setVisible(false);
                l10.setVisible(false);
                sp4.setVisible(false);
                ta1.setVisible(false);
                b14.setVisible(false);
				
                msg_send=tf1.getText();
	        tf1.setText(null);
	        
	        sendMsg();
				 
				 //setVisible(false);
				 //new forum();
            }
		
            if(e.getSource()==b3){
                
                tf1.setVisible(false);
                sp1.setVisible(false);
                b6.setVisible(false);
                p3.setVisible(false);
                sp5.setVisible(false);
                p6.setVisible(true);
                p4.setVisible(false);
                sp2.setVisible(false);
                l9.setVisible(false);
                l10.setVisible(false);
                sp4.setVisible(false);
                ta1.setVisible(false);
                b14.setVisible(false);
            }
            
            if(e.getSource()==b13){
                String combo1=cb1.getItemAt(cb1.getSelectedIndex());
                String combo2=cb2.getItemAt(cb2.getSelectedIndex());
                String combo3=cb3.getItemAt(cb3.getSelectedIndex());
                String combo4=cb4.getItemAt(cb4.getSelectedIndex());
                
                Integer spins1=(Integer)spinner1.getValue();
                spin1=spins1.toString();
                Integer spins2=(Integer)spinner2.getValue();
                spin2=spins2.toString();
                Integer spins3=(Integer)spinner3.getValue();
                if(combo2=="PM"){
                       
                }
                spin3=spins3.toString();
                Integer spins4=(Integer)spinner4.getValue();
                spin4=spins4.toString();
                Integer spins5=(Integer)spinner5.getValue();
                spin5=spins5.toString();
                Integer spins6=(Integer)spinner6.getValue();
                spin6=spins6.toString();
                Integer spins7=(Integer)spinner7.getValue();
                spin7=spins7.toString();
                Integer spins8=(Integer)spinner8.getValue();
                spin8=spins8.toString();
                    
                String startdate=combo1+"-"+spin2+"-"+spin1; 
                String starttime=spin3+":"+spin4;
                String enddate=combo3+"-"+spin6+"-"+spin5;
                String endtime=spin7+":"+spin8;
                String testlink=tf2.getText();
                int statusnumber=0;
		
                try{  
                
                    java.sql.Date start_date1=null;
                    java.sql.Date end_date1=null;
                                      
                    System.out.println(start_date1+" "+startdate+" "+starttime);
                    System.out.println(start_date1+" "+enddate+" "+endtime);
                    Class.forName(Driver);
                    Connection con=DriverManager.getConnection(connect,"bootathon","admin");
//                  Statement st=con.createStatement();
                    con.setAutoCommit(true);
                    String query="insert into test_details values (?,?,?,?,?,?) ";
                    //String query="insert into test_details values('"+startdate+"','"+starttime+"','"+enddate+"','"+endtime+"','"+testlink+"','"+statusnumber+"')";
                    PreparedStatement st=con.prepareStatement(query);
                    st.setDate(1, start_date1);
                    st.setTimestamp(2, Timestamp.valueOf(startdate+" "+starttime+":00"));
                    st.setDate(3, end_date1);
                    st.setTimestamp(4, Timestamp.valueOf(enddate+" "+endtime+":00"));
                    st.setString(5,testlink);
                    st.setInt(6, statusnumber);
                                     
                    st.executeUpdate();
                    st.close();
                    con.close();
                    System.out.println("Success");
		}
		catch(Exception E){
                    System.out.println("admin.Admin_frame.actionPerformed()");
                    E.printStackTrace();
		}
            }
            
            if(e.getSource()==b4){
	
                tf1.setVisible(false);
		b6.setVisible(false);
		p3.setVisible(false);
		p6.setVisible(false);
		p4.setVisible(false);
		sp1.setVisible(false);
		sp2.setVisible(false);
		sp5.setVisible(false);
		l9.setVisible(true);
		l10.setVisible(true);
		sp4.setVisible(true);
		ta1.setVisible(true);
		b14.setVisible(true);
                Results();
                System.out.println("admin.Admin_frame.actionPerformed()");
            }
            if(e.getSource()==b14){
                
                tf1.setVisible(false);
		b6.setVisible(false);
		p3.setVisible(false);
		p6.setVisible(false);
		p4.setVisible(false);
		sp1.setVisible(false);
		sp2.setVisible(false);
		sp5.setVisible(false);
		l9.setVisible(true);
		l10.setVisible(true);
		sp4.setVisible(true);
		ta1.setVisible(true);
		b14.setVisible(true);
		t1.setFillsViewportHeight(true);
		t1.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		Results();
		try{
                    Class.forName(Driver);
                    Connection con=DriverManager.getConnection(connect,"bootathon","admin");
                    Statement st=con.createStatement();
                    con.setAutoCommit(true);
                    String query="select * from registers";
                    ResultSet rs=st.executeQuery(query);
                    while(rs.next()){
		
                    }
                    con.close();
		}
		
                catch(Exception E){ 
                    System.out.println(E);
                
                }
            }
            
            
            if(e.getSource()==b5){
	
                tf1.setVisible(false);
		b6.setVisible(false);
		p3.setVisible(false);
		p6.setVisible(false);
		p4.setVisible(false);
		sp1.setVisible(false);
		sp2.setVisible(false);
		l9.setVisible(false);
		l10.setVisible(false);
		sp4.setVisible(false);
		ta1.setVisible(false);
		b14.setVisible(false);
		sp5.setVisible(true);
		String usermsg="";
		try{ 
		
                    Class.forName(Driver);
                    Connection con=DriverManager.getConnection(connect,"bootathon","admin");
                    Statement st=con.createStatement();
                    con.setAutoCommit(true);
                    String query="select * from query_forum";
                    ResultSet rs=st.executeQuery(query);
                    while(rs.next()){
                        username=rs.getString("user_name");
			name=rs.getString("name");
			message=rs.getString("msg_send");
			usermsg=usermsg+"\n "+(username)+" "+name+" "+"\n\t"+message+".\n";
                    }
                    textarea1.setText(usermsg);
                    
                    con.close();
		}
		catch(Exception E){ 
                    System.out.println(E);
		}
            }
				
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
	}

        void Results(){
        System.out.println("dghdfvf");
        int column,average=0,rank=1;
        String user_name,name;
        int test[]=new int[100];
        final String Driver="oracle.jdbc.driver.OracleDriver";
        final String connect="jdbc:oracle:thin:@127.0.0.1:1521:XE";
        try {
            Class.forName(Driver);
            Connection con=DriverManager.getConnection(connect,"bootathon","admin");
            Statement st=con.createStatement();
            
            String query="Select * from Student_Results";
            ResultSet rs=st.executeQuery(query);
            ResultSetMetaData rsmd=rs.getMetaData(); 
            column =rsmd.getColumnCount()-3;

            DefaultTableModel model=new DefaultTableModel();
            ArrayList <String> sa1=new ArrayList<String>();
            sa1.add("User Name");
            sa1.add("Name");
            
            for (int i = 1; i <= column; i++) {
                sa1.add("Test"+i);
            }
            sa1.add("Average");
            
            String s1[]=new String[sa1.size()];
            for (int j = 0; j < sa1.size(); j++) { 
                s1[j] = sa1.get(j); 
            }    
            
            model.setColumnIdentifiers(s1);
            t2.setModel(model);
            t2.setFillsViewportHeight(true);
            t2.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
            
            while(rs.next()){
                user_name=rs.getString("user_name");
                name=rs.getString("name");
                for (int i = 1; i <= column; i++) {
                    System.out.println(i);
                    test[i]=rs.getInt("test"+i);
                    
                }
                average=rs.getInt("average");
              rank++;
              ArrayList<Object> values=new ArrayList<Object>();
              values.add(rs.getString("user_name"));
              values.add(rs.getString("name"));
                for (int i = 1; i <=column; i++) {
                    values.add(rs.getInt("test"+i));
                }
                values.add(rs.getInt("average"));
              model.addRow(values.toArray());
            }
            System.out.println(rank+""+average);
        }
        catch(Exception e)
        {
            System.out.println(e+"Error Displaying Table");
        }    
    }
        
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b7)
		{
	    b7.setBackground(c2);
	    b8.setBackground(c1);
	    b9.setBackground(c1);
	    b10.setBackground(c1);
	    b11.setBackground(c1);
	    b12.setBackground(c1);
	    }
		if(e.getSource()==b8)
		{
	    b7.setBackground(c1);
	    b8.setBackground(c2);
	    b9.setBackground(c1);
	    b10.setBackground(c1);
	    b11.setBackground(c1);
	    b12.setBackground(c1);
	    }

		if(e.getSource()==b9)
		{
	    b7.setBackground(c1);
	    b8.setBackground(c1);
	    b9.setBackground(c2);
	    b10.setBackground(c1);
	    b11.setBackground(c1);
	    b12.setBackground(c1);
	    }

		if(e.getSource()==b10)
		{
	    b7.setBackground(c1);
	    b8.setBackground(c1);
	    b9.setBackground(c1);
	    b10.setBackground(c2);
	    b11.setBackground(c1);
	    b12.setBackground(c1);
	    }

		if(e.getSource()==b11)
		{
	    b7.setBackground(c1);
	    b8.setBackground(c1);
	    b9.setBackground(c1);
	    b10.setBackground(c1);
	    b11.setBackground(c2);
	    b12.setBackground(c1);
	    }
		if(e.getSource()==b12)
		{
	    b7.setBackground(c1);
	    b8.setBackground(c1);
	    b9.setBackground(c1);
	    b10.setBackground(c1);
	    b11.setBackground(c1);
	    b12.setBackground(c2);
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
	void sendMsg(){
            int sno=1;
            try{  
                Class.forName(Driver);
                Connection con=DriverManager.getConnection(connect,"bootathon","admin");
                Statement st=con.createStatement();
		     
                String query="insert into admin_forum values('"+msg_send+"')";
                con.setAutoCommit(true);
                st.executeUpdate(query);
                st.close();
                con.close();
            }
            catch(Exception E)
            {
                E.printStackTrace();
            }
        }

        void getMsg(){
            try {
	
                String AdminMsg="";
                Class.forName(Driver);
                Connection con1=DriverManager.getConnection(connect,"bootathon","admin");
                Statement st1=con1.createStatement();
                con1.setAutoCommit(true);
                String query1="select * from admin_forum";
                ResultSet rs=st1.executeQuery(query1); 
                int i=1;
                while(rs.next()){
                    msg_get=rs.getString("msg_admin");
                    AdminMsg=AdminMsg+" "+i+". "+msg_get+".\n\n";
                    i++;
                }
                textarea.setText(AdminMsg);
                con1.close();
            }
            catch(Exception e)
            {
                System.out.println(e+" Error Displaying Table");
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
	void StartThread()
        {
            new Thread(this).start();
        }
	
        public static void main(String[] args) {
            new Admin_frame("18eumc071","Kumaran S");
        }

}
