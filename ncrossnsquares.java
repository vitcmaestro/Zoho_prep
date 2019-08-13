/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		int n;
		for(int i =0;i<T;i++)
		{
		    n = scan.nextInt();
		    System.out.println((n*(2*n+1)*(n+1))/6);
		}
	}
}
