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

class Demo4{
	public static void main(String aa[]){
		B s1=new B();
		s1.x=100;
		s1.y=200;
		s1.display1();
		s1.display2();

		A s2=new B(); 
		s2.x=300;
		s2.display1();
	}
}
