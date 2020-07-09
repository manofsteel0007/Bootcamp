class A{
	int x;
	void display1(){
		System.out.println(" X  : "+x);
	}
}

class B{
	int y;
	void display2(){
		System.out.println(" Y  : "+y);
	}
}

class C{
	int z;
	void display3(){
		System.out.println(" Z  : "+z);
	}
}

class Demo3{
	public static void main(String aa[]){
		A ob1=new A(); 
		ob1.x=100;
		ob1.display1();

                B ob2=new B(); 
		ob2.y=200;
		ob2.display2();

                C ob3=new C(); 
		ob3.z=300;
		ob3.display3();

		Object r1=new A(); 
		Object r2=ob1; 	   

		Object r3=new B(); 
		Object r4=ob2; 	   

		Object r5=new C(); 
		Object r6=ob3; 	  

                A ob4=(A)r1;
		ob4.display1();

		A ob5=(A)r2; 
		ob5.display1();

                B ob6=(B)r3;
		ob6.display2();

                B ob7=(B)r4; 
        	ob7.display2();

                C ob8=(C)r5; 
		ob8.display3();

		C ob9=(C)r6; 
		ob9.display3();
       	}
}
