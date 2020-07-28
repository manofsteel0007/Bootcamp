/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assessment.sql_creation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

/**
 *
 * @author kumar
 */
public class TestDetails_Insert {
    

	int sno;
	String test_link;
	String start_time;
	String end_time;
	String date_test;
	int status;

    void getData_test(){
        Scanner scan=new Scanner(System.in);
        //System.out.print("Enter sno:");
        //sno=scan.nextInt();
        System.out.print("Enter test_link:");
	test_link=scan.nextLine();
        System.out.print("Enter start_time:");
	start_time=scan.nextLine();
        System.out.print("Enter end_time:");
	end_time=scan.nextLine();
        System.out.print("Enter date_test");
	date_test=scan.nextLine();
        System.out.print("Enter status:");
	status=  scan.nextInt();
    }
    public TestDetails_Insert() {
        final String Driver="oracle.jdbc.driver.OracleDriver";
        final String connect="jdbc:oracle:thin:@127.0.0.1:1521:XE";
        try {
            Class.forName(Driver);
            Connection con=DriverManager.getConnection(connect,"bootathon","admin");
            Statement st=con.createStatement();
            getData_test();
            sno=2;
            String query="insert into test_details values ('"+sno+"','"+test_link+"','"+start_time+"','"+end_time+"','"+date_test+"','"+status+"') ";
            
            st.executeUpdate(query);
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
