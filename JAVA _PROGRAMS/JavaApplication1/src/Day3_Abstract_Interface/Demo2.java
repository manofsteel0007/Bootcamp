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
abstract class Car2
{
 	abstract void door();
 	abstract void glass();
 	void wheel() 
 	{ 
  		System.out.println("  Wheel");    
 	}
}

class Benz2 extends Car2
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

class Lancer2 extends Car2
{
 	void door() 
 	{ 
  		System.out.println("  Lancer door");    
 	}
 	void glass() 
 	{ 
  		System.out.println("  Lancer glass");    
 	}
}
class Demo2
{
 	public static void main(String aa[])
 	{
  		Car2 s1=new Benz2();
  		s1.door();
  		s1.glass();
  		s1.wheel();

  		System.out.println("=================");    
  		System.out.println("=================");    

  		Car2 s2=new Lancer2();
  		s2.door();
  		s2.glass();
  		s2.wheel();
 	}
}