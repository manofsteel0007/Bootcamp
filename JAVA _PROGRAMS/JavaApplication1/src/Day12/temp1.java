/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day12;

/**
 *
 * @author kumar
 */
import java.io.File; 
class temp1
{ 
	public static void main(String args[])
	{
//                File f2 = new File("BISDemo1.java");
		File f1 = new File("F:\\BOOTCAMP\\JAVA Class Documents\\Day-12 (June 19) File Handling, Networking &  Socket\\16 Java File Handling Programs.txt");
                

		System.out.println("File Name: " + f1.getName()); 
		System.out.println("Path: " + f1.getPath()); 
		System.out.println("Abs Path: " + f1.getAbsolutePath()); 
		System.out.println("Parent: " + f1.getParent()); 
		System.out.println(f1.exists() ? "exists" : "does not exist"); 
		System.out.println(f1.canWrite() ? "is writeable" : "is not writeable"); 
		System.out.println(f1.canRead() ? "is readable" : "is not readable"); 
		System.out.println("is " + (f1.isDirectory() ? "" : "not" + " a directory")); 
		System.out.println(f1.isFile() ? "is normal file" : "might be a named pipe"); 
		System.out.println(f1.isAbsolute() ? "is absolute" : "is not absolute"); 
		System.out.println("File last modified: " + f1.lastModified()); 
		System.out.println("File size: " + f1.length() + " Bytes"); 
	} 
}