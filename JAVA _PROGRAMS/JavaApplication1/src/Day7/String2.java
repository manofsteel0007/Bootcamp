/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day7;

/**
 *
 * @author kumar
 */
public class String2 {
    public static void main(String[] args) {
        String input1="Welcome Welcome";

                String ss1=input1.substring(0,15);
                String ss2=input1.substring(1,15);
                String ss3=input1.substring(2,15);
                String ss4=input1.substring(3,15);
                String ss5=input1.substring(4,15);

                String ss6="Java";
                String ss7="Java";
                System.out.println(ss6+" "+ss7);
                ss6=ss6+"123";
                System.out.println(ss6+" "+ss7);
                
                System.out.println("   Sub-String -->   "+ss1);
                System.out.println("   Sub-String -->   "+ss2);
                System.out.println("   Sub-String -->   "+ss3);
                System.out.println("   Sub-String -->   "+ss4);
                System.out.println("   Sub-String -->   "+ss5);



                String str="Welcome#Good#Morning";

                String ses[] = str.split("");


                for (String string : ses) {

                    System.out.println(string);

                }

                int a[]={5,6,7,8,9,9,1,2,3};

                for(int s : a){
                    System.out.print(" "+s);
                }
    }
 
}
