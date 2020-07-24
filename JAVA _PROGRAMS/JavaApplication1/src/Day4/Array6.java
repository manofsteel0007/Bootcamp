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

class A6{
    int x;
    void Display(){
        System.out.println("X :"+x);
    }
}

class B6{
    int y;
    void Display(){
        System.out.println("Y :"+y);
    }
}

class C6{
    int z;
    void Display(){
        System.out.println("Z :"+z);
    }
}

public class Array6 {
    public static void main(String args[])
 	{
   		A6 s1=new A6();
   		s1.x=100;

   		B6 s2=new B6();
   		s2.y=200;

   		C6 s3=new C6();
   		s3.z=300;

		Object ob[]=new Object[3];

   		ob[0]=s1;
   		ob[1]=s2;
   		ob[2]=s3;

   		System.out.println("--------------------------------------");

   		A6 S1=(A6)ob[0];
   		S1.Display();

   		System.out.println("--------------------------------------");

   		B6 S2=(B6)ob[1];
   		S2.Display();

   		System.out.println("--------------------------------------");

   		C6 S3=(C6)ob[2];
   		S3.Display();

   		System.out.println("--------------------------------------");
 	}
}
