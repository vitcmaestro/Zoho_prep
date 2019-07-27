//https://practice.geeksforgeeks.org/problems/stock-span-problem/0

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))
		{
		    int t =Integer.parseInt(br.readLine());
		    int n;
		    int[] arr;
		    int[] res;
		    int count;
		    for(int i =0;i< t;i++)
		    {
		        n = Integer.parseInt(br.readLine());
		        arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		        res = new int[n];
		        res[0] = 1;
		        System.out.print(res[0]+" ");
		        for(int j=1;j<n;j++)
		        {
		            count = 1;
		            while(j-count >=0 && arr[j] >= arr[j-count])
		            count+= res[j-count];
		            res[j] = count;
		            System.out.print(res[j]+" ");
		        }
		        System.out.println();
		        
		    }
		}
		catch(Exception e)
		{
		    System.out.println(e);
		}
	}
}
