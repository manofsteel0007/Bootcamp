package Day2;

class A5{
	int x;
	void display1(){
		System.out.println(" X  : "+x);
	}
}

class B5 extends A5{
	int y;
        void display2(){

		System.out.println(" Y  : "+y);
	}
}

class Demo5{
	public static void main(String aa[]){
		B5 s1=new B5();
		s1.x=100;
		s1.y=200;
		s1.display1();
		s1.display2();

		A5 s2=s1; 
		s2.x=300;
		s2.display1();
		B5 s3 =(B5)s2;
		s3.display1();
		s3.display2();
	}
}
