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
class Demo4{
    static int id=1234;
    static void Display(){
        System.out.println("Value="+id);
    }
}
public class Print4 {
    public static void main(String[] args) {
        Demo4.id=4321;
        Demo4.Display();
    }
}
