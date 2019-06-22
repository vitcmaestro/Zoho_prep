//https://practice.geeksforgeeks.org/problems/number-of-paths/0
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static int findpath(int r,int c)
    {
        if(r == 1 || c == 1)
        return 1;
        else
        return findpath(r,c-1)+findpath(c,r-1);
    }
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		int row,col;
		for(int i =0;i< T;i++)
		{
		    row = scan.nextInt();
		    col = scan.nextInt();
		    System.out.println(findpath(row,col));
		}
	}
}
