/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day4;

/**
 *
 * @author kumar
 */
public class Array3 {
    public static void main(String args[])
 	{
            int a[]=new int[10];
            int value=100;

            for(int i=0;i<a.length;i++)
            {
                a[i]=value;
    		value+=50;
            }
  
            for(int i=0;i<a.length;i++)
            {
            	System.out.println(i+1+". "+a[i]);      
            }
 	}
}
