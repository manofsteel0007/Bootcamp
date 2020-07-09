package Day2;

class A7{
	int x;
	void display1(){
		System.out.println(" X  : "+x);
	}
}

class B7 extends A7{
	int y;
        void display2(){

		System.out.println(" Y  : "+y);
	}
}

class Demo7{
	public static void main(String aa[]){
		B7 s1=new B7();
		s1.x=100;
		s1.y=200;
		s1.display1();
		s1.display2();

		Object s2=s1; 
		A7 s3 =(A7)s2;
		s3.x=300;
		Object s4 =s3;
		s3.display1();
		B7 s5 =(B7)s4;
		s5.display1();
		s5.display2();
		A6 x=new B6();
		x.x=1;
		x.display1();
	}
}
