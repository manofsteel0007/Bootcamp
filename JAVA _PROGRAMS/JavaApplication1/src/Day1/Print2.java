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
class Demo2{
    int id;
    void Display(){
        System.out.println("Value :"+id);
    }
}
public class Print2 {
    public static void main(String[] agrs)
    {
        Demo2 a=new Demo2();
        a.id=100;
        a.Display();
    }
}
