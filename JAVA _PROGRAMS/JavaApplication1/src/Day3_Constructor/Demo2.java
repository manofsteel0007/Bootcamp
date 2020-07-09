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
class A2{

    int x;
    public A2() {
        System.out.println("X :"+x);
    }

    public A2(int x) {
        this.x = x;
        System.out.println("X :"+this.x);
    }    
}
public class Demo2 {
    public static void main(String[] args) {
        A2 s1=new A2();
        A2 s2=new A2(200);
    }
}
