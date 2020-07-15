/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day3_Abstract_Interface;

/**
 *
 * @author kumar
 */

interface A7
{
    void Display();
    void InputValue();
}

class B7 implements A7
{

    @Override
    public void Display() {
        System.out.println("Anonymus Display method");
    }

    @Override
    public void InputValue() {
        System.out.println("Anonymus InputValue method");
    }
        
}

public class Demo7 {
    public static void main(String[] args) {
        B7 S1= new B7();
        A7 S2 = new B7();
        A7 S3 = new A7() {
            @Override
            public void Display() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void InputValue() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
            
        }; 
        
    }
}
