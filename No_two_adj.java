//https://practice.geeksforgeeks.org/problems/stickler-theif/0

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

class GFG {
	public static void main (String[] args) {
	    try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
		long excl_prev=0,incl_prev=0,excl_curr=0,incl_curr=0;
		int n;
		int[] arr;
		Scanner scan = new Scanner(System.in);
		int  t = Integer.parseInt(br.readLine());
		for(int i =0;i<t;i++)
		{
		    n = Integer.parseInt(br.readLine());
		    arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		    excl_prev=0;
		    incl_prev=0;
		    excl_curr=0;
		    incl_curr=0;
		    for(int j =0;j<n;j++)
		    {
		        excl_curr = Math.max(excl_prev,incl_prev);
		        incl_curr = excl_prev+arr[j];
		        excl_prev = excl_curr;
		        incl_prev = incl_curr;
		      // System.out.println(incl_curr+" "+excl_curr);
		    }
		    System.out.println(Math.max(incl_curr,excl_curr));
		}
	}
	catch(Exception e){
	System.out.println(e);
	}
	}
}
