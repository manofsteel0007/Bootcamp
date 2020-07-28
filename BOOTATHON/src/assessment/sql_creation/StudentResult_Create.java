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
public class StudentResult_Create {

    public StudentResult_Create() {
        final String Driver="oracle.jdbc.driver.OracleDriver";
        final String connect="jdbc:oracle:thin:@127.0.0.1:1521:XE";
        try {
            Class.forName(Driver);
            Connection con=DriverManager.getConnection(connect,"bootathon","admin");
            Statement st=con.createStatement();
            String query="create table Student_Results( varchar2(100),start_time varchar2(10),end_time varchar2(10),date_test varchar2(10),status number(1))";
            
            st.executeUpdate(query);
            con.close();
            System.out.println("Success");
        }
        
        catch (Exception e) {
            System.out.println(e+"error in create testdetails table");
        }
        
    }
    
    public static void main(String[] args) {
        new StudentResult_Create();
    }
    
}
