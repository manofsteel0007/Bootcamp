/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Temp;

import java.util.Scanner;

/**
 *
 * @author kumar
 */
public class tcs1 {
    static int check(int x){
        int Count=0;
        
        int array[]=new int[3];
                        
        String[] single_digits = new String[]{ "zero", "one",  
                                        "two", "three", "four", 
                                        "five", "six", "seven",  
                                            "eight", "nine"}; 
  
        String[] two_digits = new String[]{"", "ten", "eleven", "twelve",  
                                        "thirteen", "fourteen", 
                                        "fifteen", "sixteen", "seventeen", 
                                        "eighteen", "nineteen"}; 
  
        String[] tens_multiple = new String[]{"", "", "twenty", "thirty", "forty",  
                                            "fifty","sixty", "seventy",  
                                            "eighty", "ninety"};
        
        int z=0,temp=x;
        
        String s="";
                
        while(temp>0){
            
            array[z]=temp%10;
            temp/=10;
            z++;
        }
        
        if(array[1]==0){
            s=single_digits[array[0]];
        }
            
        else if(array[1]==1){
            s=two_digits[array[0]+1];
        }
            
        else{
            s=tens_multiple[array[1]];
            if(array[0]>0){
                s=s+" "+single_digits[array[0]];
            }

        }
        
        for (int i = 0; i < s.length(); i++) {
             if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {    
                Count++;    
            }
        }
        return Count;
    }
    
    static String convert(int x){
        int array[]=new int[3];
                        
        String[] single_digits = new String[]{ "zero", "one",  
                                        "two", "three", "four", 
                                        "five", "six", "seven",  
                                            "eight", "nine"}; 
  
        String[] two_digits = new String[]{"", "ten", "eleven", "twelve",  
                                        "thirteen", "fourteen", 
                                        "fifteen", "sixteen", "seventeen", 
                                        "eighteen", "nineteen"}; 
  
        String[] tens_multiple = new String[]{"", "", "twenty", "thirty", "forty",  
                                            "fifty","sixty", "seventy",  
                                            "eighty", "ninety"};
        int z=0,temp=x;
        
        String s="";
                
        while(temp>0){
            
            array[z]=temp%10;
            temp/=10;
            z++;
        }
        
        if(array[1]==0){
            s=single_digits[array[0]];
        }
            
        else if(array[1]==1){
            s=two_digits[array[0]+1];
        }
            
        else{
            s=tens_multiple[array[1]];
            if(array[0]>0){
                s=s+" "+single_digits[array[0]];
            }

        }
        return s;
    }
    
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        
        int d=0,Count=0;
        
        int x[]=new int[100];
        
        int vx[]=new int[100];
        
        for (int i = 0; i < a; i++) {
//            System.out.println(check(i));
//            check((i*10)+1);
//            System.out.println("");
            
            x[i]=scan.nextInt();
//            System.out.println(x[i]);
            vx[i]=check(x[i]);
            
            d+=vx[i];
//            System.out.println(vx[i]+" "+d);

        }

        for (int i = 0; i < a-1; i++) {
            for (int j = i+1; j < a; j++) {
                if((x[i]+x[j])==d){
                    Count++;
                }
            }
        }
        System.out.println("\n"+convert(Count));
    }
}
