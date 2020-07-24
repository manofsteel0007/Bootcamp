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

public class Array8 {
    public static void main(String[] args) {
        System.out.print("Enter the 'I' value :");
        Scanner scan =new Scanner(System.in);
        Integer x=(int)scan.nextDouble();
        int a[][]=new int [x][];
        for (int i = 0; i <x; i++) {
            a[i]=new int[i+1];
        }
        int c=0;
        for (int i = 0; i <a.length; i++) {
            for (int j = 0; j <a[i].length; j++) {
                a[i][j]=c;
                c++;
            }
        }
        for (int i = 0; i <a.length; i++) {
            for (int j : a[i]) {
                System.out.print(j+" ");
            }
            System.out.println("");
        }
    }
}
