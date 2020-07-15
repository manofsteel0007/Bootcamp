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
interface Mail4
{
 	void register();
 	void valid();
}

class Yahoo4 implements Mail4
{
    public void register()
    {
        System.out.println("Register Method");
    }

    @Override
    public void valid() {
        System.out.println("Valid Method ");
    }
}
class Demo4
{
 	public static void main(String aa[])
 	{
  		Mail4 ob1=new Yahoo4();
  		ob1.register();
  		ob1.valid();
 	}
}