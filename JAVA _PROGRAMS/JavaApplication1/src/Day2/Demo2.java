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
class A2{
	int x;
	void display1(){
		System.out.println(" X  : "+x);
	}
}
class B2 extends A2{
	int y;
	void display2(){
		System.out.println(" X  : "+x+" Y  : "+y);
	}
}

public class Demo2{
 	public static void main(String agrs[]){
                Demo1 s7=new Demo1();
                
		B2 s1 = new B2(); 
                B1 S4=new B1();
               
		s1.x=100;
		s1.y=200;
		s1.display2();

		A2 s2 = s1;

		s2.display1();
		
		B2 s3 = (B2)s2;
 
		s3.display2();
                String s="Welcome";
                String ss= s.concat(s);
                System.out.println(ss);
                System.out.println(s.concat(" Hello"));
	}
}
