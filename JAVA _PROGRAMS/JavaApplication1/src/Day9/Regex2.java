/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day9;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author kumar
 */

public class Regex2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);
        String regex=scan.next();
        String value=scan.next();
        Pattern p=Pattern.compile(regex);
        Matcher m=p.matcher(value);
        boolean f=false;
        while(m.find())
        {
            System.out.println(m.start()+" "+m.end());
        }
    }
}
