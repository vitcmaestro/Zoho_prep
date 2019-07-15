//https://practice.geeksforgeeks.org/problems/sum-of-elements-in-a-matrix/0

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))
		{
		    int T = Integer.parseInt(br.readLine());
		    int[] arr;
		    int[] mn = new int[2];
		    long sum = 0;
		    for(int i =0;i<T;i++)
		    {
		        mn = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		        arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		        for(int k =0;k<arr.length;k++)
		        {
	            sum+=arr[k];
	            }
		        System.out.println(sum);
		        sum = 0;
		    }
		}
		catch(Exception e)
		{
		    System.out.println(e);
		}
	}
}
