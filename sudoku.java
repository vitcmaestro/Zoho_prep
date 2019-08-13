/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

import java.math.*;
class GFG {
    static int[][] arr;
    public static boolean issafe(int[][] arr,int row,int col,int num){
     for (int d = 0; d < arr.length; d++)  
    { 
        if (arr[row][d] == num)  
        { 
            return false; 
        } 
    } 
      
    for (int r = 0; r < arr.length; r++) 
    { 
        if (arr[r][col] == num) 
        { 
            return false; 
        } 
    } 
  
    int sqrt = (int)Math.sqrt(arr.length); 
    int boxRowStart = row - row % sqrt; 
    int boxColStart = col - col % sqrt; 
  
    for (int r = boxRowStart; 
             r < boxRowStart + sqrt; r++)  
    { 
        for (int d = boxColStart;  
                 d < boxColStart + sqrt; d++)  
        { 
            if (arr[r][d] == num)  
            { 
                return false; 
            } 
        } 
    } 
  
    return true; 
} 
    public static boolean solvesudoku(int[][] arr)
    {
        int row = -1;
        int col = -1;
        boolean isemp = true;
        for(int i =0;i<9;i++)
        {
            for(int m =0;m<9;m++)
            {
                if(arr[i][m] == 0)
                {
                    isemp = false;
                    row = i;
                    col = m;
                }
                
            }
        if(!isemp)
        break;
        }
        if(isemp)
        return true;
        for(int i =1;i<=9;i++)
        {
            if(issafe(arr,row,col,i))
            {
                arr[row][col] = i;
                if(solvesudoku(arr))
                return true;
                
            else
            arr[row][col] = 0;
            }
            
        }
        return false;
    }
    public static void printer(int[][] arr)
    {
        for(int i =0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                System.out.print(arr[i][j]+ " ");
                
            }
        }
    }
	public static void main (String[] args) {
	    //GFG ob = new GFG();
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		for(int  j=0;j<t;j++)
		{
		    arr = new int[9][9];
		    for(int k =0;k<9;k++)
		    {
		        for(int l = 0;l<9;l++)
		        {
		            arr[k][l] = scan.nextInt();
		        }
		    }
		    if(solvesudoku(arr))
		    printer(arr);
		}
	}
}
