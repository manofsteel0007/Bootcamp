/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day8;

import java.io.FileReader;

/**
 *
 * @author kumar
 */
public class EDemo4 {
    public static void main(String[] args) {
      try{
        FileReader fr=new FileReader("F:\\BOOTCAMP\\JAVA Class Documents\\Day-8 (June 9)\\11 Exception Handling.txt");
          System.out.println("Done!!");
      }
      catch(Exception e)
      {
          System.out.println(e);
      }
    }
}
