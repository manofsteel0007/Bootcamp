public class A
{
	int x=2;
	void show()
	{
		System.out.println("hello-A"+x);
	}
	void show1()
	{
		show();
	}
	public static void main(String asd[])
	{
		A s1=new A();
		B s2=new B();
		A s3=s2;
		s1.show1();
		s2.show1();
	}
}
class B extends A
{
	int x=1;
	private void show()	
	{
		System.out.println("hello-B"+x);		
	}
	
}
