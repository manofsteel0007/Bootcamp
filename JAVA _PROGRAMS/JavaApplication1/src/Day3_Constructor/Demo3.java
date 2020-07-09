/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day3_Constructor;

/**
 *
 * @author kumar
 */
class A3{
    
    int x;
    public A3() {
        System.out.println("Constructor from 'A' class");
    }
    
    public A3(int x){
        System.out.println("Constructor from 'A' class\nX :"+x);
    }
    
}
class B3 extends A3{

    public B3() {
        System.out.println("Constructor from 'B' class");
    } 
//    public B3(int x) {
//        super(x);
//        System.out.println("Constructor from 'B' class");
//    } 
}
public class Demo3 {
    public static void main(String[] args) {
        B3 s1=new B3();
//        B3 s2=new B3(100);
    }
}
