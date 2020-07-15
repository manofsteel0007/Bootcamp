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
    
    int x=10;
    
    public A3() {
        System.out.println("Constructor from 'A' class\n\n");
    }
    
//    public A3(int x){
//        this.x=x;
//        System.out.println("Constructor from 'A' class\nX :"+this.x);
//    }
    
}
class B3 extends A3{
    int y=10;
    public B3() {
        super();
        System.out.println("Constructor from 'B' class");
    } 
    {System.out.println("hello world");}
//    public B3(int x) {
//        //super(x);
//        //System.out.println(x);
//        System.out.println("Constructor from 'B' class");
//    } 
    
}
public class Demo3 {
    public static void main(String[] args) {
        B3 s1=new B3();
        //System.out.println(s1.y);
//        B3 s2=new B3(100);
    }
}
