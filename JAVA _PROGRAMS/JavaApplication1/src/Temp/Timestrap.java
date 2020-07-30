/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Temp;

import java.util.Date;
import java.text.SimpleDateFormat;

/**
 *
 * @author kumar
 */
public class Timestrap {
    static String timeStamp = new SimpleDateFormat("yyyy/MM/dd:HH:mm:ss").format(new Date());
    public static void main(String[] args) {
        System.out.println(timeStamp);
    }
}
