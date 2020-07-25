/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author kumar
 */
public class Demo4 {
    void getdata(){
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String url="jdbc:oracle:thin:@127.0.0.1:1521:XE";
            Connection con=DriverManager.getConnection(url,"test","sql");
            Statement st=con.createStatement();
            String query="select ename from emp1";
            ResultSet rs=st.executeQuery(query);
            while (rs.next()) {
                System.out.println("Name:"+rs.getString("ename"));
                //System.out.println("City:"+rs.getString("city"));
                
            }
            con.close();
        } catch (Exception e) {
        }
    }
    public static void main(String[] args) {
        new Demo4().getdata();
        
    }
}
