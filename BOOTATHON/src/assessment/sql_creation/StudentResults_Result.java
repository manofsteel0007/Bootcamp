/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assessment.sql_creation;

/**
 *
 * @author kumar
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.sql.Types;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kumar
 */
public class StudentResults_Result {
        String main_user_name="18eumc071";
        String name;
        int column;
        int test[]=new int[1000];
       
        
    public StudentResults_Result() {
        final String Driver="oracle.jdbc.driver.OracleDriver";
        final String connect="jdbc:oracle:thin:@127.0.0.1:1521:XE";
        try {
            Class.forName(Driver);
            Connection con=DriverManager.getConnection(connect,"bootathon","admin");
            Statement st=con.createStatement();
            
            String query="Select * from Student_Results";
            ResultSet rs=st.executeQuery(query);
            ResultSetMetaData rsmd=rs.getMetaData(); 
            column =rsmd.getColumnCount()-2;
            
            System.out.println(column);
            name=rsmd.getColumnName(1);
            System.out.println(name);
            for (int i = 1; i <=column+2; i++) {
                System.out.println(rsmd.getColumnName(i));
            }
            while(rs.next()){
              if(rs.getString("user_name").equals(main_user_name)){
                  for (int i = 1; i <= column; i++) {
//                      System.out.println(rs.getString("test1"));
                      test[i]=Integer.parseInt(rs.getString("test"+i));
                  }
                  break;
              }
////                test_link=rs.getString("test_link");
////		start_time=rs.getString("start_time");			     
////		end_time=rs.getString("end_time");
////                date_test=rs.getString("date_test");
////                
            }
        }
        catch(Exception e)
        {
            System.out.println(e+"Error Displaying Table");
        }
        for (int i = 1; i <= column; i++) {
            System.out.println(test[i]);
        }
    }
    public static void main(String[] args) {
        new StudentResults_Result();
    }
    
}

