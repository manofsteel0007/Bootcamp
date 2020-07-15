package Temp;


class A implements Runnable
{
 	public void run()
 	{
  		try
  		{
   			for(int i=0;i<6;i++)
   			{
    				System.out.println("First Thread");
                                Thread.sleep(1000);
   			}
  		}
  		catch(Exception e)
  		{
  		}
 	}
}
class B implements Runnable
{
 	public void run()
 	{
  		try
  		{
   			for(int i=0;i<6;i++)
   			{
    				System.out.println("Second Thread");
    				//Thread.sleep(2000);
   			}
  		}
  		catch(Exception e)
  		{
  		}
 	}
}
class RDemo1
{
 	public static void main(String args[])
 	{
  		A x1=new A();              //new Thread(new A()).start();
  		B x2=new B();  
						
  		Thread t1=new Thread(x1);  // new thread(this).start();
  		Thread t2=new Thread(x2);  // new A().test();

                t1.start();
  		t2.start();
 	}
}
