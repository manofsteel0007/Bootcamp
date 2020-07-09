/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Temp;

/* IMPORTANT: Multiple classes and nested static classes are supported */


//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class ZigZag {
    public static void main(String args[] ) throws Exception {
        Scanner scan=new Scanner(System.in).useDelimiter("\n");
        char ch[]=scan.next().toCharArray();
        int x=0,i=0,j,n=scan.nextInt();
        char a[][]=new char[n][100];
        while(true)
        {
            for(j=0;j<n;j++)
            {
                a[j][x]=ch[i];
                //System.out.println(ch[i]);
                i++;
                if(i==ch.length)
                    break;
            }
            if(i==ch.length)
                break;
            x++;
            for(j=n-2;j>0;j--)
            {
                a[j][x]=ch[i];
                //System.out.println(ch[i]);
                i++;
                if(i==ch.length)
                    break;
                x++;
            }
            if(i==ch.length)
                break;
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<x+1;j++)
            {
                System.out.print(a[i][j]);
            }
            //System.out.println("");
        }
    }
}