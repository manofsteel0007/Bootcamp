package Temp;

import java.util.ArrayList;



public class WrapperClass {
	public static void main(String ags[])
	{
		int z=2;
                Integer x=5;
//		System.out.print(x);
		Integer a[]= {11,22,33,44,55,};
                //int p[]=new int[a.length];
                //int p=a.length;
                
                //System.out.println(p);
		for(int i:a)
		{
			System.out.println(i);
		}
		ArrayList<Integer> pp=new ArrayList<Integer>();
		for(int j:a)
			pp.add(j);

		System.out.println(x);
		for (int c 	= 0; c <  pp.size(); c++) {
			System.out.println(pp);			
		}
	}
}
