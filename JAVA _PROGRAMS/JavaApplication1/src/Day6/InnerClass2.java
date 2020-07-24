/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day6;

/**
 *
 * @author kumar
 */
class A2
{
    interface InnerInterface{
        void Door();
        void Glass();
        
    }
    int a;
    class InnerClass2{
        void test(){
            a=-1;
            System.out.println("Inner Class \nValue :"+a);
        }
    }
}
class B2  extends A2 implements A2.InnerInterface{
    @Override
    public void Door(){
        a=-1;
        System.out.println("Door!!"+a);
    }
    @Override
    public void Glass(){
        System.out.println("Glass!!");
    }
}
public class InnerClass2 extends A2 
{
    
 	public static void main(String aa[])
 	{
		A2.InnerClass2 S1 = new A2().new InnerClass2(){
                    void test(){
                        System.out.println("New Inner Class ");
                    }
                };
                S1.test();
                A2 S2 =new A2();
                B2 S3 = new B2();
                S3.Door();
                S3.Glass();
                
                A2.InnerInterface S4=new A2.InnerInterface() {
                    public void Door(){
                        int a=1;
                        System.out.println("A :"+a);
                    }
                    public void Glass(){
                        int b=0;
                        System.out.println("B :"+b);
                    }
                };
                S4.Door();
                S4.Glass();
               
 	}
}