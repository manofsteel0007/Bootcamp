package Day3_Methods;

//package Day3;

class A1{
	void Display()
	{
		System.out.println("Hello World");
	}
}
public class Demo1 {
    int x;

    public Demo1(int x) {
        this.x=x;
        System.out.println(this.x);
    }
	public static void main(String ags[])
	{
		A1 s1=new A1();
		s1.Display();
                Demo1 s2= new Demo1(100);
	}
}
