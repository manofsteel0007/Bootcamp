/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day5;

/**
 *
 * @author kumar
 */
public class Test3 extends Test1 {
    void show(){
        v1_public=100;
        v3_protected=300;
        v4_default=400;
        display();
    }
    public static void main(String[] args) {
        new Test3().show();     
    }
}
