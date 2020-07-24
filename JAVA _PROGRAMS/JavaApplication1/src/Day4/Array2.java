/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day4;

/**
 *
 * @author kumar
 */
public class Array2 {
    public static void main(String[] args) {
        int a[]=new int[5];
        a[0]=10;
        a[1]=20;
        a[2]=30;
        a[3]=40;
        a[4]=50;
        for(int i=0;a.length>i;i++)
        {
            System.out.println(i+1+"."+a[i]);
        }
    }
}
