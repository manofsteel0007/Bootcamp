/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day8;
import java.util.*;
/**
 *
 * @author kumar
 */

class Age extends Exception
{
    String Ex(){
        return "Age shouldn't be greater then 25";
    }
}

class register{
    void vaild(int x) throws Age{
        if(x>25)
            throw new Age();
        else 
            System.out.println("Validation success!");
    }
}


public class EDemo3 {
        
    public static void main(String[] args) {
        register S1=new register();
        Scanner scan=new Scanner (System.in);
        try{
            S1.vaild(scan.nextInt());
        }
        
       catch(Exception e)
       {
           if(e instanceof Age)
           {
               Age SS=(Age)e;
               String ex=SS.Ex();
               System.out.println(ex);
           }
       }
    }
}
