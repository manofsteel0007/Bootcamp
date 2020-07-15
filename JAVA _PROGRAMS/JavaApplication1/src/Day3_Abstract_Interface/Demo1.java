/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day3_Abstract_Interface;

/**
 *
 * @author kumar
 */

interface Car1
{
 	abstract void Speed();
 	abstract void Mileage();
}

interface Bike1
{
        abstract void Speed();
 	abstract void Mileage();
}

class Benz1 implements Car1,Bike1
{
 	public void Speed() 
 	{ 
  		System.out.println("  Benz door");    
 	}
 	public void Mileage() 
 	{ 
  		System.out.println("  Benz glass");    
 	}
}
public class Demo1
{
 	public static void main(String aa[])
 	{
  		Benz1 s1=new Benz1();
  	        s1.Speed();
  		s1.Mileage();
 	}
}
