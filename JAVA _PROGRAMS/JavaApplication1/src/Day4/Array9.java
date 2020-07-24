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
public class Array9 {
    public static void main(String[] args) {
        Integer a[][];
        a=new Integer[5][10];
        int x=11;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                a[i][j]=x;
                x+=1;
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
