class A
{
 	void display()
 	{
  		System.out.println(" Hello World ");
 	}
		
}

class B extends A
{
 	void display() 
 	{
  		System.out.println(" World Hello ");
 	}
}

class Demo6
{
 	public static void main(String aa[])
 	{

		new A().display();
		new B().display();
		new A(){}.display();

		new A()
		{
			void display()
			{
		  		System.out.println(" Get Lost ");				
			}
		}.display();


		A s1=new A()
		{
			void display()
			{
		  		System.out.println(" Get Lost ");				
			}
		};

		s1.display();
 	}
}