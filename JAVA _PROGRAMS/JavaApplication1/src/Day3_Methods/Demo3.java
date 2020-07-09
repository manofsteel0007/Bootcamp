/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day3_Methods;

/**
 *
 * @author kumar
 */
class A3
{
    int x,y;
    void Display(int x,int y)
    {
        this.x=x;
        this.y=y;
        System.out.println("x:"+x+"\ny:"+y);
    }
     void Display(float y)
    {
        this.y=(int)y;
        System.out.println("x:"+x+"\ny:"+y);
    }
    void Display(int x)
    {
        this.x=x;
        System.out.println("x:"+x+"\ny:"+y);
    }
    void Display()
    {
        System.out.println("x:"+x+"\ny:"+y);
    }
}
public class Demo3 {
    public static void main(String[] args) {
        A3 S1=new A3();
        S1.Display();
        S1.Display(100);
        S1.Display(11.0F);
        S1.Display(100, 200);
    }            
}
