/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day9;

import java.util.regex.Pattern;

/**
 *
 * @author kumar
 */
public class Regex1 {
    public static void main(String[] args) {
        String regex="^[a-zA-Z0-9]*";
        String values="Welcome123";
        boolean rx=Pattern.matches(regex, values);
        System.out.println(rx);
    }
}
