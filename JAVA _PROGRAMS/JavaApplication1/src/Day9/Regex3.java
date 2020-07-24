/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day9;

/**
 *
 * @author kumar
 */
import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Regex3 {
    public static void main(String[] args) {
        Console c=System.console();
        if(c==null)
        {
            System.out.println("no console");
            System.exit(1);
        }
        while(true){
            Pattern p=Pattern.compile(c.readLine("hbdsh"));
            Matcher m=p.matcher(c.readLine("sfgsfg "));
            while(m.find()){
                c.format("I found the text %s  starting at index %d and ending at index %d.%n",m.group(),m.start(),m.end());
            }
        }
    }
}
