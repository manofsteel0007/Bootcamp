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
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.table.*;


public class Admin_frame extends JFrame implements ActionListener{
    JPanel p1=new JPanel();
    JPanel p2=new JPanel();
    JLabel l2=new JLabel();
	JLabel l1=new JLabel("Admin");
	JButton b1=new JButton("Student details");
	JButton b2=new JButton("Student results");
	JButton b3=new JButton("Queries");
	JTable t1=new JTable();
	JScrollPane sp=new JScrollPane(t1);
	Color c=new Color(0,0,153);
	Color c1=new Color(255,255,255);
	
        public Admin_frame()
	{
            l1.setBounds(7,7,250,30);
            l1.setFont(new Font("Verdana",Font.PLAIN,25));
            l1.setForeground(c1);
            sp.setBounds(255,5,631,595);
            p1.setBounds(5,5,250,795);
            p2.setBounds(255,5,745,790);
            b1.setBounds(5,195,250,30);
            b2.setBounds(5,230,250,30);
            b3.setBounds(5,265,250,30);
            b1.setBackground(c1);
            b2.setBackground(c1);
            b3.setBackground(c1);
            b1.setFocusPainted(false);
            b2.setFocusPainted(false);
            b3.setFocusPainted(false);
            p1.setBackground(c);
            p2.setBackground(Color.white);
            add(l1);
            add(b1);
            add(b2);
            add(b3);
            add(p1);
            add(p2);
            add(l2);
            //add(t1);
            p2.add(sp);
            b1.addActionListener(this);
            b2.addActionListener(this);
            setSize(1000,800);
            setLayout(null);
            setVisible(true);
	}
        
        public void actionPerformed(ActionEvent e) {
	if(e.getSource()==b2)
        {
            l2.setText("hello");
            l2.setBounds(255,5,631,595);
            p2.removeAll();
            p2.setBackground(Color.BLACK);
            p2.add(l2);
            //add()
        }
            if(e.getSource()==b1)
		{
                    p2.removeAll();
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
		try
		  { 
                     Connection con=DriverManager.getConnection("jdbc:sqlite:C:\\Users\\MAHESH KUMAR B\\Downloads\\SQLiteStudio-3.2.1\\mahi\\studentsdetails.db");
		     Statement st=con.createStatement();
		     con.setAutoCommit(true);
		     String query="select * from registers";
		     ResultSet rs=st.executeQuery(query);
		     int i=0;
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
				 i++;
		     }
		     if(i==0)
		     {
		    	 System.out.print("no");
		     }
		     else
		     {
		    	 System.out.print("yess");
		     }
		     con.close();
		  }
		  catch(Exception E)
		  { 
                      System.out.println(E);
			  
		  }
		p2.add(sp);
		}
		
	}
        public static void main(String[] args) {
        new Admin_frame();
    }
}
