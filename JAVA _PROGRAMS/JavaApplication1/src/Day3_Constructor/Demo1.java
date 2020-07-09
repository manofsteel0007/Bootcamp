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

class A1
{
    int x;

    A1() {
        this.x=10;
        System.out.println("This is Constructor");
    }
}

public class Demo1 {
    public static void main(String[] args) {
        new A1();
        A1 s1=new A1();
        System.out.println(s1.x);
    }
}
