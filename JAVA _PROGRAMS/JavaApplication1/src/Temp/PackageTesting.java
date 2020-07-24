/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Temp;
import Day5.Test1;
/**
 *
 * @author kumar
 */
class Test12 {
    int v1_public=100;
    static int a;
    void Display(){
        System.out.println("hello World");
    }
}
class Test13 extends Test1{
    int v1_public=100;
    void Display1(){
        v3_protected=100;
        
        display();
        Display_protect();
    }
}
class PackageTesting {
    public static void main(String[] args) {
        Test13 S1= new Test13();
        Test1 S2= new Test1();
        S2.v1_public=100;
        S2.display();
        S1.Display1();
    }
}
