/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day4;

import java.util.*;
/**
 *
 * @author kumar
 */
public class Array11 {
    static Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {
        char[] a=scan.next().toCharArray();
//        for (int i = 0; i < a.length; i++) {
//            char c = a[i];
//            System.out.print(a[i]+" ");
//        }
        char[] b=new char[10];
        System.arraycopy(a, 3, b, 0, 1);
        System.out.println(String.valueOf(b));
    }   
}
