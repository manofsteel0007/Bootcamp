/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day10;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.text.html.HTMLDocument;

/**
 *
 * @author kumar
 */
public class Demo3 {
    
    
    ArrayList<String> al;
    
    public void prin()
    {
        Iterator<String> e=al.iterator();
                while(e.hasNext())
                {
                    Object ob=e.next();
                    String s=(String)ob;
                    System.out.println("s:     "+s.toUpperCase());
                }
    }
    
    public void ppp()
    {
        String s1=new String("java");
        String s2=new String("c");
        String s3=new String("c++");
        String s4=new String("python");
                al=new ArrayList();
                al.add(s1);
  		al.add(s2);
  		al.add(s3);
  		al.add(s4);
                al.add("JAVA");
  		al.add("C");
  		al.add("C++");
  		al.add("VB");
                al.add("1");
                prin();
    }
    public static void main(String[] args) {
        Demo3 z=new Demo3();
        z.ppp();
    }
}
