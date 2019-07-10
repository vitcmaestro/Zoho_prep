//https://practice.geeksforgeeks.org/problems/sum-of-bit-differences/0

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		    int T = s.nextInt();
		    int n,sum =0;
		    int[] arr;
		    for(int i =0;i<T;i++)
		    {
		        sum = 0;
		        n = s.nextInt();
		        arr = new int[n];
		        for(int j =0;j<n;j++)
		        arr[j] = s.nextInt();
		        for(int k =0;k<n;k++)
		        {
		            for(int l = 0;l<n;l++)
		            {
		                sum += Integer.bitCount(arr[k]^arr[l]);
		            }
		        }
		        System.out.println(sum);
		    }
	}
}
