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
class A4
{
    public void Display()
    {
        System.out.println("I m from 'A' Class");
    }
}
class B4 extends A4
{
       
}
public class Demo4 {
    public static void main(String agrs[])
    {
        A4 S1 =new A4();
        A4 S2 =new B4();
        B4 S3=new B4();
        S1.Display();
        S2.Display();
        S3.Display();
    }
}
