/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day3_Abstract;

/**
 *
 * @author kumar
 */

abstract class Car1
{
 	abstract void door();
 	abstract void glass();
}

class Benz1 extends Car1
{
 	void door() 
 	{ 
  		System.out.println("  Benz door");    
 	}
 	void glass() 
 	{ 
  		System.out.println("  Benz glass");    
 	}
}
public class Demo1
{
 	public static void main(String aa[])
 	{
  		Car1 s1=new Benz1();
  	        s1.door();
  		s1.glass();
 	}
}
