
package sieveofsundaram;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SieveOfSundaram {
    private static void findprimes(int limit) {
        boolean[] primebool = new boolean[limit];
        int n = limit/2;
        for(int i =0;i<n;i++)
        {
            for(int j =i;(i+j+2*i*j)<n+1;j++)
                primebool[i+j+(2*i*j)] = true;
        }
        display(primebool);
    }
    public static void display(boolean[] primes)
    {
        System.out.print("\nPrimes = 2 3 ");
        for (int i = 2; i < primes.length/2; i++){
            System.out.println(primes[i]+" "+i);
            if (primes[i])
                System.out.print((2 *i + 1) +" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));)
        {
        int limit = Integer.parseInt(br.readLine());
        findprimes(limit);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }

    
}
