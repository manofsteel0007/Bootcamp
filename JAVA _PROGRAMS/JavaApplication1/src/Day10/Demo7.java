/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day10;

/**
 *
 * @author kumar
 */
import java.util.*;
public class Demo7 {
    public static void main(String[] args) {
        Map<Integer,String> map=new LinkedHashMap<Integer,String>();
        map.put(101,"Amit");
        map.put(100,"Vijay");
        map.put(102,"Rahul");
        System.out.println(map);
        for(Map.Entry m : map.entrySet()){
            
            System.out.println(m.getKey()+" "+m.getValue());

    }
    }
}
