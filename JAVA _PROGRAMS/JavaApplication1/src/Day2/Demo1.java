/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day2;

/**
 *
 * @author kumar
 */
class A1{
	int x;
	void display1(){
		System.out.println(" X  : "+x);
	}
}
class B1 extends A1{
	int y;
	void display2(){
		System.out.println(" X  : "+x+" Y  : "+y);
	}
}

class Demo1{
 	public static void main(String agrs[]){

		A1 s7=new A1();
                s7.x=100;
                s7.display1();
                
                /*B1 s1 = new B1(); 

		s1.x=100;
		s1.display1();
		s1.y=200;
		s1.display2();

		A1 s2 = new B1();

		s2.x=300;
		s2.display1();
		//s2.display2();

		B1 s3 = (B1)s2;
 
		s3.display1();
		s3.y=400;
		s3.display2();*/
	}
}
