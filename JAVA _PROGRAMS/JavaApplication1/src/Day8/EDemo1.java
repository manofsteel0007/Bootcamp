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
public class EDemo1 {
    public static void main(String[] args) {
        try{
            int a=100/0;
            System.out.println("A :"+a);
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
