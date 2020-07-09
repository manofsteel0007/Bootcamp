class A
{	
	int x=1;
	void display()
 	{
  		System.out.println(" Hello World "+x);
 	}
		
}

class B extends A
{
 	int x=4;
	void display() 
 	{
  		System.out.println(" World Hello "+x);
 	}
}

class Demo7
{
 	public static void main(String aa[])
 	{

		new A().display();
		new B().display();
		new A(){}.display();

		new B()
		{
			void display()
			{
		  		System.out.println(" Get Lost "+x);				
			}
		}.display();

				

		A s1=new A()
		{
			void display()
			{
		  		x=4;
				System.out.println(" Get Lost "+x);				
			}
		};

		s1.display();
 	}
}