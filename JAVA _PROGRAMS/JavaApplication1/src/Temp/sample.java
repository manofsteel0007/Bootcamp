package Temp;
     
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.*;
public class sample extends JFrame implements ActionListener {
	JTextArea ta1=new JTextArea();
	JButton b1=new JButton("send");
	ArrayList<String> al=new ArrayList<String>();
	sample()
	{
		ta1.setBounds(50,50,200,200);
		b1.setBounds(300,150,100,30);
		add(ta1);
		add(b1);
		b1.addActionListener(this);
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new sample();

	}

                final String Driver="oracle.jdbc.driver.OracleDriver";
        final String connect="jdbc:oracle:thin:@127.0.0.1:1521:XE";
        
	public void upload() {
		// TODO Auto-generated method stub
		String s1=ta1.getText();
		String[] a=s1.split("\\s");
                //String w;
                for(String w:a)
                {
                        System.out.println(w);
                }
                try
                {

                        Class.forName("oracle.jdbc.driver.OracleDriver");
                        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","bootathon","admin");
                        Statement st1=con.createStatement();
                        String sql="select * from registers";
                        ResultSet rs=st1.executeQuery(sql);
                        while(rs.next())
                        {
                                al.add(rs.getString("rollno"));
                        }
                        con.close();

                        Class.forName(Driver);
                        Connection con1=DriverManager.getConnection(connect,"bootathon","admin");
                        Statement st=con1.createStatement();
                        String queryADD="ALTER TABLE registers ADD test"+1+" varchar(255)";

                        int i=0;
                        for(String w:a)
                        {

                                String query="update registers set marks='"+w+"' where rollno='"+al.get(i)+"'";
                                st.executeUpdate(query);
                                System.out.print("success");
                                i++;
                        }
                        //con.setAutoCommit(true);
                con.close();
                }
                catch(Exception E)
                {
                        System.out.print(E);
                }
	}

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
