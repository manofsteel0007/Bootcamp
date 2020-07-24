/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day8;

/**
 *
 * @author kumar
 */
public class EDemo2 {
    public static void main(String[] args) {
        try{
            int a=100/0;
            System.out.println("A :"+a);
            int b[]={10,20,30,40};
            for(int x :b)
                System.out.println(x+" ");
        }
        
       catch(ArithmeticException e)
       {
           System.out.println(e);
       }
       catch(ArrayIndexOutOfBoundsException e)
       {
           System.out.println(e);
       }
        finally{
            System.out.println("  Connection Closed ");
            System.out.println("Finally Block");
        }
    }
}
