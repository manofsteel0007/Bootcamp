/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day12;

/**
 *
 * @author kumar
 */
import java.io.FileInputStream;

class temp2
{
 	public static void main(String aa[])throws Exception
 	{
  		FileInputStream fis=new FileInputStream("F:\\BOOTCAMP\\Test cases\\testing.txt");
                
  		int c;
  		while((c=fis.read())!=-1)
  		{
   			System.out.print((char)c);
  		}

//                System.out.println("\n------------------------");
                System.out.println();
 	}
}
