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
public class String3 {
    public static void main(String args[]){

	StringBuffer sb1=new StringBuffer("Hello ");
	sb1.append("Java");
	System.out.println(sb1);

	StringBuffer sb2=new StringBuffer("Hello ");
	sb2.insert(1,"Java");
	System.out.println(sb2);


	StringBuffer sb3=new StringBuffer("Hello");
	sb3.replace(1,3,"Java");
	System.out.println(sb3);

	StringBuffer sb4=new StringBuffer("Hello");
	sb4.delete(1,3);
	System.out.println(sb4);

	StringBuffer sb5=new StringBuffer("Hello");
	sb5.reverse();
	System.out.println(sb5);

	StringBuffer sb6=new StringBuffer();
	System.out.println(sb6.capacity());
	sb6.append("Hello world");
	System.out.println(sb6.capacity());
        String S1="java is my favourite language";
        System.out.println(S1.length()+" "+sb6.length());
	sb6.append(S1);
	System.out.println(sb6.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2
    }
}
