/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Temp;

/**
 *
 * @author kumar
 */

class Adder{  
    static double add(double a,double  b)
    {
        return a+b+a;
    }  
//    static float add(float a,float b)
//    {
//        return a+b+a;
//    } 
//    static double add(double a,double b){
//        return a+b;
//    } 
    
}  

public class demo1 {
    public static void main(String[] args){  
        System.out.println(Adder.add((int)11,(int)11));  
        System.out.println(Adder.add(12.5,12.5));  
}
}


