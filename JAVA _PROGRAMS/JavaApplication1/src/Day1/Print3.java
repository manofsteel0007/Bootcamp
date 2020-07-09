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
class Demo3{
    int id;
    void Display(){
        System.out.println("Value="+id);
    }
}
public class Print3 {
    public static void main(String[] agrs)
    {
        new Demo3().id=1234;
        new Demo3().Display();
    }
}
