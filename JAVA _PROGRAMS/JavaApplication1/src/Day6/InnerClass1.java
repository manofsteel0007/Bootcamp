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
class A1
{
    int a;
    class InnerClass1{
        void test(){
            a=-1;
            System.out.println("Inner Class \nValue :"+a);
        }
    }
}
public class InnerClass1
{
    
 	public static void main(String aa[])
 	{
		A1.InnerClass1 S1 = new A1().new InnerClass1(){
                    void test(){
                        System.out.println("New Inner Class ");
                    }
                };
                S1.test();
                A1 S2 =new A1();
                A1.InnerClass1 S3 = S2.new InnerClass1();
                S3.test();
                S2.new InnerClass1(){
                    void test(){
                        System.out.println("Inner Anonymos Class");
                    }
                }.test();
                
                
 	}
}
 