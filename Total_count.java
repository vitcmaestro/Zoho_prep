/*package whatever //do not write package name here */
//https://practice.geeksforgeeks.org/problems/total-count/0
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))
		{
		    int T = Integer.parseInt(br.readLine());
		    int[] n = new int[2];
		    int[] arr;
		    int count;
		    for(int i=0;i<T;i++)
		    {
		        count =0 ;
		        n = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		        arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
	            for(int j =0;j<n[0];j++)
	            {
	                count += arr[j]/n[1];
	                arr[j] = arr[j]%n[1];
	                if(arr[j]>0)
	                count++;
	            }
	            System.out.println(count);
		    }
		}
		catch(Exception e)
		{
		    System.out.println(e);
		}
	}
}
