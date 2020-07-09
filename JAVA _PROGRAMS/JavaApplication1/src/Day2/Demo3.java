package Day2;

class A3{
	int x;
	void display1(){
		System.out.println(" X  : "+x);
	}
}

class B3{
	int y;
	void display2(){
		System.out.println(" Y  : "+y);
	}
}

class C3{
	int z;
	void display3(){
		System.out.println(" Z  : "+z);
	}
}

class Demo3{
	public static void main(String aa[]){
		A3 ob1=new A3(); 
		ob1.x=100;
		ob1.display1();

                B3 ob2=new B3(); 
		ob2.y=200;
		ob2.display2();

                C3 ob3 = new C3();
		ob3.z=300;
		ob3.display3();

		Object r1=new A3(); 
		Object r2=ob1; 	   

		Object r3=new B3(); 
		Object r4=ob2; 	   

		Object r5=new C3(); 
		Object r6=ob3; 	  

                A3 ob4=(A3)r1;
		ob4.display1();

		A3 ob5=(A3)r2; 
		ob5.display1();

                B3 ob6=(B3)r3;
		ob6.display2();

                B3 ob7=(B3)r4; 
        	ob7.display2();

                C3 ob8=(C3)r5; 
		ob8.display3();

		C3 ob9=(C3)r6; 
		ob9.display3();
       	}
}
