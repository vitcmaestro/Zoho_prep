/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))
		{
		int T = Integer.parseInt(br.readLine());
		int size,max,sum;
		for(int j =0;j<T;j++)
		{
		    size = Integer.parseInt(br.readLine());
		    int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		    sum = arr[0];
		    max = arr[0];
		    for(int i =1;i<size;i++)
		    {
		        sum = Math.max(sum+arr[i],arr[i]);
		        max = Math.max(sum,max);
		        
		    }
		    
		    System.out.println(max);
		}
		}
		catch(Exception e)
		{
		    System.out.println(e);
		}
	}
}
