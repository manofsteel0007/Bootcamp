/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day1;

/**
 *
 * @author kumar
 */
class Demo7{
    int id;
    void Display(){
        System.out.println("Value="+id);
    }
}
public class Print7 {
    public static void main(String[] args) {
        Demo7 a=new Demo7();
        Demo7 b=new Demo7();
        a.id=100;
        b.id=200;
        a.Display();
        b.Display();
    }
}
