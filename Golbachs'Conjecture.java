/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void findprimes(int num)
    {
        int n = num/2;
        ArrayList<Integer> prime = new ArrayList<Integer>();
        boolean[] primebool = new boolean[n];
        prime.add(2);
        for(int i =1;i<n;i++)
        {
            for(int j =i;(i+j+2*i*j)<n;j++)
            {
                primebool[i+j+2*i*j] = true;
            }
        }
        for(int i =0;i< n;i++)
        {
            if(!primebool[i]){
            prime.add(2*i+1);
            }
        }
        prime.remove(1);
        Iterator it = prime.iterator();
        int diff;
        //System.out.println(prime.get(0));
        for(int i =1;i<prime.size()/2;i++)
        {
            diff = num - prime.get(i);
            if(prime.contains(diff))
            {
                System.out.println((num-diff)+" "+diff);
                break;
            }
        }
        
    }
	public static void main (String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))
		{
		    int T = Integer.parseInt(br.readLine());
		    for(int i = 0;i<T;i++)
		    {
		        int number = Integer.parseInt(br.readLine());
		        findprimes(number);
		    }
		}
		catch(Exception e)
		{
		    System.out.println(e);
		}
	}
}
