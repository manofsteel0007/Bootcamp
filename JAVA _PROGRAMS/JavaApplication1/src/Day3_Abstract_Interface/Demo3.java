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
abstract class Car3
{
 	abstract void door();
 	abstract void glass();
}

abstract class Benz3 extends Car3
{

 	abstract void test();
}

class Sample3 extends Benz3
{
 	void door() 
 	{ 
  		System.out.println("  Sample door");    
 	}
 	void glass() 
 	{ 
  		System.out.println("  Sample glass");    
 	}
 	void test() 
 	{ 
  		System.out.println("  Sample Test");    
 	}
}
class Demo3
{
 	public static void main(String aa[])
 	{
  		Benz3 ob=new Sample3();
  		ob.door();
  		ob.glass();
  		ob.test();
 	}
}