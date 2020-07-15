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

interface Mail15
{
 	void register();
}
interface Mail25
{
 	void register();
}

class Yahoo5 implements Mail15,Mail25
{
 	public void register() 
 	{ 
  		System.out.println("  Yahoo registration");    
 	}
}
class Demo5
{
 	public static void main(String aa[])
 	{
  		Mail15 ob1=new Mail15() {
                      @Override
                      public void register() {
                          System.out.println("  Mail1 registration");
                      }
                  };
  		Mail25 ob2=new Yahoo5();

  		ob1.register();
 		ob2.register();
 	}
}
