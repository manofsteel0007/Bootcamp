/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assessment.sql_creation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kumar
 */
public class TestDetails_Result {
        int sno;
	String test_link;
	String start_time;
	String end_time;
	String date_test;
	int status;
        ResultSet rs;
        public JTable t1=new JTable();
        
    public TestDetails_Result() {
        final String Driver="oracle.jdbc.driver.OracleDriver";
        final String connect="jdbc:oracle:thin:@127.0.0.1:1521:XE";
        try {
            Class.forName(Driver);
            Connection con=DriverManager.getConnection(connect,"bootathon","admin");
            Statement st=con.createStatement();
            String query="Select * from Test_Details";
            rs=st.executeQuery(query);
            DefaultTableModel model=new DefaultTableModel();
            String s1[]={"Sno","Test Link","Start Time","End Time","Test Date"};
            model.setColumnIdentifiers(s1);
            
            while(rs.next()){
               test_link=rs.getString("test_link");
		start_time=rs.getString("start_time");			     
		end_time=rs.getString("end_time");
                date_test=rs.getString("date_test");
                
            }
        }
        catch(Exception e)
        {
            System.out.println(e+"Error Displaying Table");
        }
        
    }
    public static void main(String[] args) {
        new TestDetails_Result();
    }
    
}
