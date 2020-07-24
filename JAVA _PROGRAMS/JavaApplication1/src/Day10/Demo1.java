/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day10;

import java.util.ArrayList;

/**
 *
 * @author kumar
 */
public class Demo1 {
    static void display(Object ob2){
        System.out.println(" value :"+ob2);
    }
    public static void main(String[] args) {
        ArrayList ls=new ArrayList();
        ls.add("hello");
        ls.add("World");
        ls.add("ppl");
        ls.add(null);
        ls.add("ppl");
        for (Object l : ls) {
            System.out.println("ls:"+l);
        }
        
        Object ob1=ls.get(1);
        System.out.println("before downcasting:"+ob1);
        String s1=(String)ob1;
        display(1);
        System.out.println("After downcasting :"+s1);
    }
   
}
