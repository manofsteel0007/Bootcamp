/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day7;

import java.math.BigInteger;

/**
 *
 * @author kumar
 */
public class Demo1 {
    public static void main(String[] args) {
            Integer i1=new Integer(200);
            Integer i2=new Integer(200);

            Integer i3=i1+i2;

            System.out.println("  "+i3);

            byte    grade = 2;
            int     marks = 50;
            float   price = 8.6f;
            double  rate = 50.5;
            int x=100;            
            
            String S1=Integer.toOctalString(marks);
            String S2=Integer.toHexString(x);
            //char a[]=S1.toCharArray();
            System.out.println(S1+" "+S2);

            System.out.println("========================================");
            
            BigInteger b1,b2,b3;
            b1=new BigInteger(S2);
            b2=new BigInteger(S1);
            b3=b1.add(b2);
            System.out.println(b3);
            
            System.out.println("========================================");
            
            System.out.println(Byte.MAX_VALUE);
            System.out.println(Integer.MIN_VALUE);
            String bad = "2000000000";     
            BigInteger good=new BigInteger(bad);
           System.out.println("good     = " + good);
        System.out.println("good.add(BigInteger.ONE) = " + good.add(BigInteger.ONE));
        System.out.println("good.multiply(BigInteger.THREE) = " + good.multiply(BigInteger.valueOf(3)));
        System.out.println("good.multiply(BigInteger.valueOf(4)) = " + good.multiply(BigInteger.valueOf(4)));
        
            System.out.println("========================================");
            
            Byte     g1 = new Byte(grade);
            Integer  m1 = new Integer(marks);
            Float    f1 = new Float(price);
            Double   r1 = new Double(rate);


            System.out.println("Values of Wrapper objects (printing as objects)");

            System.out.println("Byte object g1:     ------------> " + g1);
            System.out.println("Integer object m1:  ------------> " + m1);
            System.out.println("Float object f1:    ------------> " + f1);
            System.out.println("Double object r1:   ------------> " + r1);


            byte    bv = g1;
            int     iv = m1.intValue();
            float   fv = f1.floatValue();
            double  dv = r1.doubleValue();

            Float x1= Float.valueOf(fv);
            
            System.out.println("========================================");

            System.out.println("Unwrapped values (printing as data types)");
            System.out.println("byte value, bv:    ------------> " + bv);
            System.out.println("int value, iv:     ------------> " + iv);
            System.out.println("float value, fv:   ------------> " + fv);
            System.out.println("double value, dv:  ------------> " + dv);
    }
}
