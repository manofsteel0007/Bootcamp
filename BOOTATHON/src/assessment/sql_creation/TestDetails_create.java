/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assessment.sql_creation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author kumar
 */
//class to create table for TEST_DETAILS
public class TestDetails_create {

    public TestDetails_create() {
        final String Driver="oracle.jdbc.driver.OracleDriver";
        final String connect="jdbc:oracle:thin:@127.0.0.1:1521:XE";
        try {
            Class.forName(Driver);
            Connection con=DriverManager.getConnection(connect,"bootathon","admin");
            Statement st=con.createStatement();
            String query="create table test_details(sno number(3) primary key,test_link varchar(100),start_time varchar(10),end_time varchar(10),date varchar(10),status number(1))";
            
            st.executeUpdate(query);

            System.out.println("Success");
        }
        
        catch (Exception e) {
            System.out.println("error in create testdetails table");
        }
        
    }
    
    public static void main(String[] args) {
        new TestDetails_create();
    }
    
}
