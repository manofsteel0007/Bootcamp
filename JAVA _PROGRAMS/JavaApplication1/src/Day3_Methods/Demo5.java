/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day3_Methods;

/**
 *
 * @author kumar
 */
class A5
{
    void Display()
    {
        System.out.println("I m from 'A' Class");
    }
}
class B5 extends A5
{   
    void Display(){
        System.out.println("I m from 'B' class");
    }
    
}
public class Demo5 {
    public static void main(String agrs[])
    {
        A5 S1 =new A5();
        A5 S2 =new B5();
        B5 S3=new B5();
        A5 S4= (A5)S2;
        S1.Display();
        S2.Display();
        S3.Display();
        S4.Display();
    }
}
