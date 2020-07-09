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
class A7
{
    char ch = 'A';
    void Display(){
        System.out.println("I m from 'A' class "+ch);
    }
}

class B7 extends A7
{
    char ch='B';
    void Display(){
        System.out.println("I m from 'B' class"+ch);
    }
}

public class Demo7 {
    public static void main(String agrs[]){
        A7 S1= new A7();
        A7 S2 = new B7();
        B7 S3 = new B7();
        A7 S4 = new B7(){
            void Display(){
                System.out.println("I m from 'MAIN' Class"+ch);
            }
        };
        
        S1.Display();
        S2.Display();
        S3.Display();
        S4.Display();
    }
}
