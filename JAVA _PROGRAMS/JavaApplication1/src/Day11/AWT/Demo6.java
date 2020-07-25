/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day11.AWT;

import java.awt.Button;
import java.awt.CheckboxGroup;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Checkbox;
import java.awt.Choice;
import java.awt.Font;
//import javafx.scene.control.CheckBox;

/**
 *
 * @author kumar
 */
public class Demo6 extends Frame {
    Label l1,l2;
    Checkbox c1,c2,c3,c4;
    Button b1;
    CheckboxGroup CG;
    Choice ch1;
    Demo6(){
        setLayout(null);
        
        //setFont(new Font("Courier New",Font.BOLD,13));
        
        CG=new CheckboxGroup();
        c1=new Checkbox("Car");
        c2=new Checkbox("bike");
        c3= new Checkbox("Male",CG,true);
        c4=new Checkbox("Female",CG,false);
        b1=new Button("SUBMIT");



         c1.setBounds(200,100,60,25);
         c2.setBounds(270,100,60,25);

         c3.setBounds(200,150,60,25);
         c4.setBounds(270,150,60,25);

         b1.setBounds(100,150,80,25);
         String s[]={"volve","bmw","audi","shkoda","jagur","select","cbe","chennai","salem","trichy","madurai"};
         ch1=new Choice();
         for (String string : s) {
            ch1.add(string);
        }
         
//         ch1.add("volve");
//         ch1.add("bmw");
//         ch1.add("audi");
//         ch1.add("shkoda");
//         ch1.add("jagur");
//         ch1.add("select");
//         ch1.add("cbe");
//         ch1.add("chennai");
//         ch1.add("salem");
//         ch1.add("trichy");
//         ch1.add("madurai");
         ch1.setBounds(200, 200, 80, 30);
         add(c1);
         add(c2);
         add(c3);
         add(c4);

         add(b1);
         
         add(ch1);

         setSize(450,250);

         setResizable(false);
         setVisible(true); 
    }
    
    public static void main(String[] args) {
        new Demo6();
    }
}
