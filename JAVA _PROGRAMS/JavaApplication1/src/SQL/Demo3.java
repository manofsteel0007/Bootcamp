/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author kumar
 */
public class Demo3 {
//    Connection connect(){
//        try {
//            Class.forName("oracle.jdbc.driver.OracleDriver");
//        String url="jdbc:oracle:thin:@127.0.0.1:1521:XE";
//        Connection con=DriverManager.getConnection(url,"test","sql");
//        return con;
//        } catch (Exception e) {
//            Connection con=new Connection;
//            return con;
//        }
//        
//        
//    }
    public Demo3() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String url="jdbc:oracle:thin:@127.0.0.1:1521:XE";
            Connection con=DriverManager.getConnection(url,"test","sql");
            String query="insert into emp1 values(?,?)";
            PreparedStatement ps=con.prepareStatement(query);
            ps.setString(1,"aravindha");
            ps.setString(2, "cbe");
            
            ps.executeUpdate();
            con.close();
            System.out.println("Success");
            
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
    
    public static void main(String[] args) {
        new Demo3();
        
    }
}
