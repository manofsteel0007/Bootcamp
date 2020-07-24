/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day7;

/**
 *
 * @author kumar
 */
import java.io.*;

public class String1 {
    public static void main(String[] args) {
        Integer s1=new Integer(100);

  		Integer s2=new Integer(100);

		if(s1.equals(s2))
  		{
   			System.out.println("        Values are Equals ");
  		}
		else if(!s1.equals(s2))
  		{
   			System.out.println("        Values are Not Equals ");
  		}

		System.out.println("=======================================================");
		System.out.println("=======================================================");

  		String s3=new String("Welcome");
  		String s4=new String("Welcome");

		if(s3==s4)
  		{
   			System.out.println("        Reference are Equals ");
  		}
		else
  		{
   			System.out.println("        Reference  are Not Equals ");
  		}

		System.out.println("=======================================================");
		System.out.println("=======================================================");

  		String s5 = new String("Welcome");

  		String s6 = s5;

		if(s5==s6)
  		{
   			System.out.println("        Reference are Equals ");
  		}
		else
  		{
   			System.out.println("        Reference  are Not Equals ");
  		}

		System.out.println("=======================================================");
		System.out.println("=======================================================");

  		String s7="Welcome";

  		String s8="Welcome";

		if(s7==s8)
  		{
   			System.out.println("        Reference are Equals ");
  		}
		else
  		{
   			System.out.println("        Reference  are Not Equals ");
  		}
    }
}
