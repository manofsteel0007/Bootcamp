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
class Demo6{
    int id;
    void Display(){
        System.out.println("Value="+id);
    }         
}
public class Print6 {
    public static void main(String[] args) {
        	Demo6 d1 = new Demo6();
		d1.id=4321;
		d1.Display();
		d1.Display();
		d1.Display();
		new Demo6().id=1234; 
		new Demo6().Display();
		new Demo6().Display();
		new Demo6().Display();

    }
}
