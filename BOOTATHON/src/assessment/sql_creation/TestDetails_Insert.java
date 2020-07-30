/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assessment.sql_creation;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.TimeZone;
import oracle.sql.DATE;

/**
 *
 * @author kumar
 */
public class TestDetails_Insert {
    

	String start_date="2020-07-31";
        String start_time="01:46";
        String end_date="2020-08-01";
	String end_time="01:46";
	String test_link="www.google.com";
	int status=0;
        
        Date start_date1;
        Date end_date1;
        
    void getData_test(){
        Scanner scan=new Scanner(System.in);
        //System.out.print("Enter sno:");
        //sno=scan.nextInt();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        sdf.setTimeZone(TimeZone.getDefault().getTimeZone("UTC"));
        
//        System.out.print("Enter start_date:");
//	start_date=scan.nextLine();
//        System.out.print("Enter start_time:");
//	start_time=scan.nextLine();
//        System.out.print("Enter end_date:");
//	end_date=scan.nextLine();
//        System.out.print("Enter end_time:");
//	end_time=scan.nextLine();
//        System.out.print("Enter status:");
//	status=  scan.nextInt();
//        System.out.print("Enter test_link:");
//	test_link=scan.nextLine();
        
        start_date1=Date.valueOf(start_date);
        end_date1=Date.valueOf(end_date);
        
    }
    
    public TestDetails_Insert() {
        final String Driver="oracle.jdbc.driver.OracleDriver";
        final String connect="jdbc:oracle:thin:@127.0.0.1:1521:XE";
        try {
            Class.forName(Driver);
            Connection con=DriverManager.getConnection(connect,"bootathon","admin");
            getData_test();
            String query="insert into test_details values (?,?,?,?,?,?) ";
//            String query="insert into test_details values ('"+start_date+"','"+start_time+"','"+end_date+"','"+end_time+"','"+test_link+"','"+status+"'); ";
            PreparedStatement st=con.prepareStatement(query);
            st.setDate(1, start_date1);
            st.setTimestamp(2, Timestamp.valueOf(start_date+" "+start_time+":00"));
            st.setDate(3, end_date1);
            st.setTimestamp(4, Timestamp.valueOf(end_date+" "+end_time+":00"));
            st.setString(5,"www.google.com");
            st.setInt(6, 0);
            
            st.executeUpdate();
            con.close();
            System.out.println("Success");
        }
        
        catch (Exception e) {
            System.out.println(e+"error in inserting value testdetails table");
        }
        
    }
    public static void main(String[] args) {
        new TestDetails_Insert();
    }
    
    
}
