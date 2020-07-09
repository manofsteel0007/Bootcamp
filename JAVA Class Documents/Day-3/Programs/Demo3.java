class A
{
	int x,y;

	void display()
	{
		System.out.println(" Class A ");
	}
 	void display(int x)
 	{
		this.x=x;
		System.out.println(" Class A "+this.x);
 	}
 	void display(int x,int r)
 	{
		y=r;
		System.out.println(" Class A "+x+"    "+y);
 	}
 	void display(char c)
 	{
		System.out.println(" Class A "+c);
 	}
}

class Demo3
{
 	public static void main(String aa[])
 	{
  		A ob=new A();
  		ob.display();
  		ob.display(10);
  		ob.display(20,30);
  		ob.display('S');
 	}
}