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
interface A8
{
    void register();
}
class B8{
    void test(){
        new A8(){
            public void register(){
                System.out.println("Anonymos class"); 
            };
        }.register();
    }
}
interface C8{
    void register();
}
class D8 implements A8,C8{

    @Override
    public void register() {
        System.out.println("Class Overrided");
    }
    
}
public class Demo8 {
    public static void main(String[] args) {
        A8 S1=new D8();
        C8 S2= new D8();
        new B8().test();
        S1.register();
        S2.register();
    }
}
