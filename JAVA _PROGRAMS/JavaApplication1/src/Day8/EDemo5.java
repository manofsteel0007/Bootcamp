/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day8;

import java.util.Scanner;

/**
 *
 * @author kumar
 */
public class EDemo5 {
    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);
        int value=scan.nextInt();
        assert value>=18:" Not valid";
        System.out.println("Value is :"+value);
    }
    
}
