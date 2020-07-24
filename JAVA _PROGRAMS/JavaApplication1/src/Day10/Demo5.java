/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day10;

import java.util.TreeSet;

/**
 *
 * @author kumar
 */
public class Demo5 {
    public static void main(String[] args) {
        TreeSet ts=new TreeSet();
                ts.add("H");
		ts.add("G");
		ts.add("F");
		ts.add("E");
		ts.add("D");
		ts.add("C");
		ts.add("B");
		ts.add("A");
                ts.add("A");
                ts.add("A");
                ts.add("A");
         System.out.println("	"+ts); 
		System.out.println("	"); 
		System.out.println("	"+ts.headSet("D")); 
		System.out.println("	"); 
		System.out.println("	"+ts.tailSet("D")); 
		System.out.println("	"); 
		System.out.println("	"+ts.subSet("D","G")); 
    }
}
