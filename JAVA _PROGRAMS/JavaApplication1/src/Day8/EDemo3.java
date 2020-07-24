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
class AgeException extends Exception
{
    String Ex(){
        return "Age shouldn't be greater then 25";
    }
}

class register{
    void vaild(int x) throws AgeException{
        if(x>25)
            throw new AgeException();
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
           if(e instanceof AgeException)
           {
               AgeException SS=(AgeException)e;
               String ex=SS.Ex();
               System.out.println(ex);
           }
       }
    }
}
