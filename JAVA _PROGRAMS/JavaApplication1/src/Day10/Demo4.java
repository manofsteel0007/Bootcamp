/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day10;

import java.util.HashSet;

/**
 *
 * @author kumar
 */
public class Demo4 {
    public static void main(String[] args) {
        HashSet hs=new HashSet();
                hs.add("E");
  		hs.add("D");
  		hs.add("A");
  		hs.add("B");
  		hs.add("C");
                hs.add("C");
        System.out.println(""+hs);
    }
}
