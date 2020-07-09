class A{
	int x;
	void display1(){
		System.out.println(" X  : "+x);
	}
}

class B extends A{
	int y;
        void display2(){

		System.out.println(" Y  : "+y);
	}
}

class Demo7{
	public static void main(String aa[]){
		B s1=new B();
		s1.x=100;
		s1.y=200;
		s1.display1();
		s1.display2();

		Object s2=s1; 
		A s3 =(A)s2;
		s3.x=300;
		Object s4 =s3;
		s3.display1();
		B s5 =(B)s4;
		s5.display1();
		s5.display2();
	}
}
