package Day3_Methods;

class A2{
	int x;
	void Display(int x) {
		this.x=x;
		System.out.println("x:"+this.x);
	}
        void Display1()
        {
            System.out.println("x:"+x);
        }
}

public class Demo2 {
	public static void main(String args[])
	{
            A2 s1=new A2();
            s1.Display(20);
            s1.x=100;
            s1.Display1();
            new A2().Display(100);
	}
}
