package Day2;

class A6{
	int x;
	void display1(){
		System.out.println(" X  : "+x);
	}
}

class B6 extends A6{
	int y;
        void display2(){

		System.out.println(" Y  : "+y);
	}
}

class Demo6{
	public static void main(String aa[]){
		B6 s1=new B6();
		s1.x=100;
		s1.y=200;
		s1.display1();
		s1.display2();
		
		Object s2=s1; 
		A6 s3 =(A6)s2;
		s3.x=300;
		s3.display1();
		B6 s4 =(B6)s3;
		s4.display1();
		s4.display2();
	}
}
