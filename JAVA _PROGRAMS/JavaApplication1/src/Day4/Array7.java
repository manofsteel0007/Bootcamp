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
public class Array7 {
    public static void main(String[] args) {
        int a[][]=new int [2][2];
        
        a[0][0]=100;
        a[0][1]=200;
        a[1][0]=300;
        a[1][1]=400;
        
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
                System.out.print(a[i][j]+" ");
            System.out.println("");
        }
    }
}
