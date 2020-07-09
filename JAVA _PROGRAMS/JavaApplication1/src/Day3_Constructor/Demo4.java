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
class A4{
    Integer x,y;

    public A4() {
        System.out.println("Constructor from 'A' class");
    }

    public A4(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("Constructor from 'A' class");
        System.out.println("X :"+this.x+"\nY :"+this.y);
    }
    
}
class B4 extends A4{

    public B4() {
        super();
        System.out.println("Constructor from 'B' class");
    }
    
    public B4(int x,int y){
        super(x,y);
        System.out.println("Constructor from 'B' class");
    }
    
}
public class Demo4 {
    public static void main(String[] args) {
        A4 s1 =new B4();
        B4 s2=(B4)s1;
        new B4(10, 20);
    }
}
