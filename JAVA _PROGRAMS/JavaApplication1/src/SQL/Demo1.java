/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SQL;

/**
 *
 * @author kumar
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class Demo1 {
    void tablecreate(){
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE","test","sql");
            Statement st=con.createStatement();
            String query="create table emp2(ename varchar(15),city varchar(20))";
            int result=st.executeUpdate(query);
            con.close();
            System.out.println("Success  "+result);
            
        } catch (Exception e) {
            
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        new Demo1().tablecreate();
    }
}
