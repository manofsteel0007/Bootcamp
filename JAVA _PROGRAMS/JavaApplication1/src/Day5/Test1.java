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
class A1{
    void Display (){
            System.out.println("hello");
    }
}
public class Test1 {

    public     int  v1_public;          //variable declaration
    private    int  v2_private;
    protected  int  v3_protected;            
               int  v4_default;
    
    protected void Display_protect(){
        
        System.out.println(v3_protected);
    }           
    
    public void display(){
        v2_private=-1;
        System.out.println("  Public     : "+v1_public);
        System.out.println("  Private    : "+v2_private);
        System.out.println("  Protected  : "+v3_protected);
        System.out.println("  Default    : "+v4_default);
    }

    public static void main(String args[]){

        Test1 ob1=new Test1();

        ob1.v1_public=100;
        ob1.v2_private=200;
        ob1.v3_protected=300;
        ob1.v4_default=400;

        ob1.display();

    }
}