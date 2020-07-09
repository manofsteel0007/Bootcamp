class A                                          
{
	int x;                     
	void display(int x)          
	{
		this.x=x;
		System.out.println(" X  : "+x);
	}
}

class Demo2
{
	public static void main(String aa[])
	{
		A s1= new A();
		s1.display(100)
		new A().display(200);
	}
}