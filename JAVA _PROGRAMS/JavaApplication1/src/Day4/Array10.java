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
public class Array10 {
    public static void main(String args[])
 	{
 		 int a[][]=
            			{
				{10,20,30,40,50,60,70},
				{15,25,35,45,55,65,75},
				{5,10,15,20,25,30,35},
            			};


  		int v; 

  		for(int i=0;i<2;i++)
  		{
    			for(int j=0;j<2;j++)
    			{
     				v=a[i][j];
     				System.out.print("   "+v);      
    			}
   			System.out.println(); 
  		}
 	}
}
