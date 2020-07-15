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

interface Mail6
{
    void Register();
}

class test
{
    void Display6()
    {
        Mail6 S1= new Mail6() {
            @Override
            public void Register() {
                System.out.println("Anonymous Mail6");
            }
        };
        S1.Register();
    }
}

public class Demo6 {
    public static void main(String[] args) {
        test S1=new test();
        S1.Display6();
    }
}
