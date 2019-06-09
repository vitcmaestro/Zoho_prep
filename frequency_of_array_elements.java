//https://practice.geeksforgeeks.org/problems/frequency-of-array-elements/0
/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		 Scanner scan = new Scanner(System.in);
		int n,inp;
		int[] count;
		int T = scan.nextInt();
		for(int i = 0;i<T;i++)
		{
		   
		    n = scan.nextInt();
		    count = new int[n];
		    for(int j=0;j<n;j++)
		    {
		        inp = scan.nextInt();
		        count[inp-1]++;
		        
		    }
		    for(int j = 0;j<n;j++)
		    {
		       System.out.print(count[j]+" ");
		    }
		    System.out.println();
		}
    }
    
}
