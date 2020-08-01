/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Temp;

/**
 *
 * @author kumar
 */
import java.io.File; 
  
public class Filehadling  
{ 
     static void RecursivePrint(File[] arr,int index,int level)  
     { 
         // terminate condition 
         if(index == arr.length) 
             return; 
           
         // tabs for internal levels 
         for (int i = 0; i < level; i++) 
             System.out.print("\t"); 
           
         // for files 
         if(arr[index].isFile()) 
             System.out.println(arr[index].getName()); 
           
         // for sub-directories 
         else if(arr[index].isDirectory()) 
         { 
             System.out.println("[" + arr[index].getName() + "]"); 
               
             // recursion for sub-directories 
             RecursivePrint(arr[index].listFiles(), 0, level + 1); 
         } 
            
         // recursion for main directory 
         RecursivePrint(arr,++index, level); 
    } 
      
    // Driver Method 
    public static void main(String[] args) 
    { 
        // Provide full path for directory(change accordingly)   
        String maindirpath = "F:\\BOOTCAMP\\Test cases"; 
                  
        // File object 
        File maindir = new File(maindirpath); 
           
        if(maindir.exists() && maindir.isDirectory()) 
        { 
            // array for files and sub-directories  z
            // of directory pointed by maindir 
            File arr[] = maindir.listFiles(); 
              
            System.out.println("**********************************************"); 
            System.out.println("Files from main directory : " + maindir); 
            System.out.println("**********************************************"+arr); 
              
            // Calling recursive method 
            RecursivePrint(arr,0,0);  
       }  
    } 
}