/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))
		{
		 int t = Integer.parseInt(br.readLine());
		 int size,amt;
		 int[] arr;
		 int[][] dp;
		 for(int x =0;x<t;x++)
		 {
		     size = Integer.parseInt(br.readLine());
		     arr = Arrays.stream(br.readLine().split("//s+")).mapToInt(Integer::parseInt).toArray();
		     amt = Integer.parseInt(br.readLine());
		     dp = new int[size+1][amt+1];
		     for(int i=0;i<size;i++) 
            {
                dp[0][i] = 1;  
            } 
      
    for(int i=1;i<=size;i++) 
      { 
            
          for(int j=1;j<=amt;j++) 
          { 
              if(arr[i-1]>j) 
              { 
                 dp[i][j]=dp[i-1][j]; 
                    
              } 
                
              else
              { 
                  dp[i][j]=dp[i-1][j]+dp[i][j-(i-1)]; 
              } 
              //System.out.println(dp);
                
          } 
      } 
    System.out.println(dp[size][amt]); 
		     
		 }
		}
		catch(Exception e)
		{
		    System.out.println(e);
		}
	}
}
