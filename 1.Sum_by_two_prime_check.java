/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static boolean isprime(int x)
    {
        if(x == 1)
        return false;
        else if(x == 2)
        return true;
        else if(x%2 ==0)
        return false;
        else
        {
            for(int v = 3;v< (int)Math.sqrt(x)+1;v+=2)
            {
                if(x%v == 0)
                return false;
            }
        }
        return true;
    }
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		int num,d,k;
		for(int i=0;i<T;i++)
		{
		    num = scan.nextInt();
		    d = 0;
		    for(int j = 0;j<=num/2;j++)
		    {
		        k = num-j;
		        //System.out.println(k+" "+j);
		        if(isprime(j) && isprime(k))
		        {
		            System.out.println("Yes");
		            d= 1;
		            j = num/2;
		        }
		    }
		    if(d == 0)
		    System.out.println("No");
		}
	}
}
