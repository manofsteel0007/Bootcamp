/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day10;

/**
 *
 * @author kumar
 */
import java.util.ArrayList;

class A
{

 	int x;
 	void test1()
 	{
  		System.out.println("Class A  :  "+x);
 	}  
}

class B
{
 	int y;
 	void  test2()
 	{
  		System.out.println("Class B  :  "+y);
 	}	
}

class C
{
 	int z;
 	void test3()
 	{
  		System.out.println("Class C  :  "+z);
 	}
}

class Demo2
{
 	public static void main(String args[])
 	{
  		A ob1=new A();
  		ob1.x=500;
 
  		B ob2=new B();
  		ob2.y=700;

                C ob3=new C();
                ob3.z=900;



                ArrayList arrayList=new ArrayList();

                arrayList.add(ob1);
                arrayList.add(ob2);
                arrayList.add(ob3);
                
                //System.out.println("   "+al);

                Object object1=arrayList.get(0);
                Object object2=arrayList.get(1);
                Object object3=arrayList.get(2);


 
  		A ob4=(A)object1;
  		ob4.test1();     //downcasting

    		B ob5=(B)object2;
  		ob5.test2();

                C ob6=(C)object3;
                ob6.test3();

 	}
}	
