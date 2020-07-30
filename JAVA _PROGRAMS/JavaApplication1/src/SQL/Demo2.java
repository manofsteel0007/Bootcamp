/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

/**
 *
 * @author kumar
 */
public class Demo2 {
    void tablecreate(String xyz,String Ecity){
        try {
            
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE","test","sql");
            Statement st=con.createStatement();
            String query="insert into emp1 values('"+xyz+"','"+Ecity+"')";
            st.executeUpdate(query);
            //con.getAutoCommit();
            con.close();
            System.out.println("Success");
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter Name :");
        String Ename=scan.nextLine();
        System.out.print("Enter City :");
        String Ecity=scan.nextLine();
        String xyz=Ename+"/"+Ecity;
        new Demo2().tablecreate(xyz,Ecity);
        
    }
}
