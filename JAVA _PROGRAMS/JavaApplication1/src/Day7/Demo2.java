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
public class Demo2 {
    public static void main(String[] args) {
        double d1=Math.ceil(20.4);
  	double d2=Math.floor(20.4);
  	double d3=Math.round(20.4);
  	double d4=Math.round(20.6);
  	double d5=Math.pow(2,16);
  	double d6=Math.sqrt(144);

  	System.out.println(" Ceil  20.4 --> "+d1);
 	System.out.println(" Floor 20.4 --> "+d2);
  	System.out.println(" Round 20.4 --> "+d3);
  	System.out.println(" Round 20.6 --> "+d4);
  	System.out.println(" 2 Power  16 --> "+d5);
  	System.out.println(" Sq Rt  144 --> "+d6);
        
        System.out.println("-------------------------------------------");
        
        for(int i=1;i<=10;i++)
  	{
            d1 = Math.random();
            System.out.println(d1);
            System.out.println(" Random Numbers --> "+(int)(d1*10));
        }
        
        System.out.println("-------------------------------------------");
        
        int a=-1;
        float f=-0.5f;
        int abs_a=Math.abs(a);
        float abs_f=Math.abs(f);
        System.out.println("a :"+abs_a);
        System.out.println("f :"+abs_f);
    }
}
