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
class A6
{
    void Display(){
        System.out.println("I m from 'A' class ");
    }
}

class B6 extends A6
{
    void Display(){
        System.out.println("I m from 'B' class");
    }
}

public class Demo6 {
    public static void main(String agrs[]){
        A6 S1= new A6();
        A6 S2 = new B6();
        B6 S3 = new B6();
        A6 S4 = new B6(){
            void Display(){
                System.out.println("I m from 'MAIN' Class");
            }
        };
        
        S1.Display();
        S2.Display();
        S3.Display();
        S4.Display();
    }
}
