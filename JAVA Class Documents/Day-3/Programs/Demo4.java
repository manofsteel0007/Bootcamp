class A
{
 	void display()
 	{
  		System.out.println(" Hello World ");
 	}
		
}

class B extends A
{

}

class Demo4
{
 	public static void main(String aa[])
 	{
  		A s1=new A();
  		A s2=new B();
  		B s3=new B();

  		s1.display();
  		s2.display();
  		s3.display();
 	}
}