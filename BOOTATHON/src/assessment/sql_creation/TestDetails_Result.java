/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assessment.sql_creation;

import java.sql.Connection;
//import java.sql.Date;
import java.util.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Timestamp;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import oracle.sql.TIMESTAMP;

/**
 *
 * @author kumar
 */
public class TestDetails_Result extends JFrame{
        int sno;
	Date start_date;
        Timestamp start_time;
        Date end_date;
	Date end_time;
	String test_link;
	int status=0;
        ResultSet rs;
//        public JTable t1=new JTable();
        
       
        
    public TestDetails_Result() {
        setBounds(500,500,1000,1000);
        int sno=1;
        String userMsg="";
        final String Driver="oracle.jdbc.driver.OracleDriver";
        final String connect="jdbc:oracle:thin:@127.0.0.1:1521:XE";
        try {
            
            Class.forName(Driver);
            Connection con=DriverManager.getConnection(connect,"bootathon","admin");
            Statement st=con.createStatement();
            String query="Select * from Test_Details";
            rs=st.executeQuery(query);
//            DefaultTableModel model=new DefaultTableModel();
//            String s1[]={"Sno","Start Date","Start Time","End Date","End Time","Test Link"};
//            model.setColumnIdentifiers(s1);
//            t1.setModel(model);
//            t1.setFillsViewportHeight(true);
//            t1.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
            
            while(rs.next()){
                start_date=rs.getDate("start_date");
		start_time=rs.getTimestamp("start_time");			     
		end_date=rs.getDate("end_date");
                end_time=rs.getTimestamp("end_time");
                test_link=rs.getString("test_link");
                sno++;
                System.out.println(end_time+"\n"+new Date());
            }
//            model.addRow(new Object[] {sno,start_date,start_time,end_date,end_time,test_link});
//             add(t1);
//             setVisible(true);
            con.close();
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
