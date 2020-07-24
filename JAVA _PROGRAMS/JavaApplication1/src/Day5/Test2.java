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

public class Test2 {

    void display1(){
        
        Test1 ob1=new Test1();

        ob1.v1_public=100;
        //ob1.v2_private=200;
        ob1.v3_protected=200;
        ob1.v4_default=300;
        ob1.display();
    }

    public static void main(String args[]){

        new Test2().display1();

    }
}