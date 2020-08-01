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
public class StudentResults_Insert {

    public StudentResults_Insert() {
         final String Driver="oracle.jdbc.driver.OracleDriver";
        final String connect="jdbc:oracle:thin:@127.0.0.1:1521:XE";
        try {
            Class.forName(Driver);
            Connection con=DriverManager.getConnection(connect,"bootathon","admin");
            Statement st=con.createStatement();
            String query="alter table student_results add test3 number(10)";
            String query2="insert into student_results values ('18eumc071','Kumaran S','45','15','87','26','43.25')";
//            String query3-"

            st.executeUpdate(query);
            st.executeUpdate(query2);
            con.close();
            System.out.println("Success");
        }
        
        catch (Exception e) {
            System.out.println(e+"error in create testdetails table");
        }    
        
    }
    public static void main(String[] args) {
        new StudentResults_Insert();
    }
}
