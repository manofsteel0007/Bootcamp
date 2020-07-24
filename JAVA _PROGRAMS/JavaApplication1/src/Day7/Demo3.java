/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day7;

/**
 *
 * @author kumar
 */
public class Demo3 {
    public static void main(String[] args) {
        
    int i = 7;
    int j = -9;
    double x = 72.3;
    double y = 0.34;

    System.out.println("i is " + i);
    System.out.println("j is " + j);
    System.out.println("x is " + x);
    System.out.println("y is " + y+"\n");


    System.out.println("|" + i + "| is " + Math.abs(i));
    System.out.println("|" + j + "| is " + Math.abs(j));
    System.out.println("|" + x + "| is " + Math.abs(x));
    System.out.println("|" + y + "| is " + Math.abs(y)+"\n");

     System.out.println(x + " is approximately " + Math.round(x));
     System.out.println(y + " is approximately " + Math.round(y));


     System.out.println("The ceiling of " + i + " is " + Math.ceil(i));
     System.out.println("The ceiling of " + j + " is " + Math.ceil(j));
     System.out.println("The ceiling of " + x + " is " + Math.ceil(x));
     System.out.println("The ceiling of " + y + " is " + Math.ceil(y)+"\n");


     System.out.println("The floor of " + i + " is " + Math.floor(i));
     System.out.println("The floor of " + j + " is " + Math.floor(j));
     System.out.println("The floor of " + x + " is " + Math.floor(x));
     System.out.println("The floor of " + y + " is " + Math.floor(y)+"\n");


     System.out.println("min(" + i + "," + j + ") is " + Math.min(i,j));
     System.out.println("min(" + x + "," + y + ") is " + Math.min(x,y));
     System.out.println("min(" + i + "," + x + ") is " + Math.min(i,x));
     System.out.println("min(" + y + "," + j + ") is " + Math.min(y,j)+"\n");


     System.out.println("max(" + i + "," + j + ") is " + Math.max(i,j));
     System.out.println("max(" + x + "," + y + ") is " + Math.max(x,y));
     System.out.println("max(" + i + "," + x + ") is " + Math.max(i,x));
     System.out.println("max(" + y + "," + j + ") is " + Math.max(y,j)+"\n");


     System.out.println("Pi is " + Math.PI);
     System.out.println("e is " + Math.E);

    double angle = 45.0 * 2.0 * Math.PI/360.0;
    System.out.println("cos(" + angle + ") is " + Math.cos(angle));
    System.out.println("sin(" + angle + ") is " + Math.sin(angle)+"\n");


    double value = 0.707;

    System.out.println("acos(" + value + ") is " + Math.acos(value));
    System.out.println("asin(" + value + ") is " + Math.asin(value));
    System.out.println("atan(" + value + ") is " + Math.atan(value)+"\n");


    System.out.println("exp(1.0) is "  + Math.exp(1.0));
    System.out.println("exp(10.0) is " + Math.exp(10.0));
    System.out.println("exp(0.0) is "  +  Math.exp(0.0)+"\n");


    System.out.println("log(1.0) is "    + Math.log(1.0));
    System.out.println("log(10.0) is "   + Math.log(10.0));
    System.out.println("log(Math.E) is " + Math.log(Math.E)+"\n");


    System.out.println("pow(2.0, 2.0) is "  + Math.pow(2.0,2.0));
    System.out.println("pow(10.0, 3.5) is " + Math.pow(10.0,3.5));
    System.out.println("pow(8, -1) is "     + Math.pow(8,-1)+"\n");


    for (i=0; i < 10; i++) {
      System.out.println("The square root of " + i + " is " + Math.sqrt(i));
    }


    System.out.println("\nHere's one random number: " + Math.random());
    System.out.println("Here's another random number: " + Math.random()+"\n");

  }
}

