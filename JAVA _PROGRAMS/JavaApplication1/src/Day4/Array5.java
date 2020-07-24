/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day4;

/**
 *
 * @author kumar
 */
class A5{
    int x;
    void Display(){
        System.out.println("X :"+x);
    }
}

class B5 extends A5{
    int y;
    void Display(){
        System.out.println("X :"+x+"\nY :"+y);
    }
}

public class Array5 {
    public static void main(String args[])
 	{
   		A5 s1=new A5();
  		s1.x=100;

   		B5 s2=new B5();
   		s2.x=200;
   		s2.y=300;


   		A5 ob[]=new A5[2];

   		ob[0] = s1;
   		ob[1] = s2;

   		ob[0].Display();
   		ob[1].Display();

   		System.out.println("--------------------------------------");

   		B5 s3=(B5)ob[1];

   		s3.Display();
   		s3.Display();
   		System.out.println("--------------------------------------");
 	}
}
