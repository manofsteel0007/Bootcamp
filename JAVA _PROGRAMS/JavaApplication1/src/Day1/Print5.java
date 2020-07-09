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
class Demo5{
    int id;
    void Display(){
        System.out.println("Value from Class="+id);
    }
}
public class Print5 {
    public static void main(String[] args) {
        int id;
        Demo5 a=new Demo5();
        id=1234;
        a.id=4321;
        System.out.println("value="+id);
        a.Display();
    }
}
