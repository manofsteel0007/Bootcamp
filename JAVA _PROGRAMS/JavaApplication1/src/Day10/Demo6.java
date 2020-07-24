/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day10;

import java.util.*;
import java.util.Map;
/**
 *
 * @author kumar
 */
public class Demo6 {
    public static void main(String[] args) {
        Map m=new LinkedHashMap();
        m.put("C10","JAVA");
        m.put("C20","C");
        m.put("C30","C++");
        m.put("C40","PHP");
        String s=(String)m.get("C10");
        System.out.println(m);
    }
}

