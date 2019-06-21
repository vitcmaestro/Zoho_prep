//https://www.geeksforgeeks.org/zoho-interview-set-1-campus/
//2
package weight;

import java.util.Arrays;
import java.util.Scanner;

public class Weight {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = scan.nextInt();
		System.out.println("Enter the array elements");
		int[] arr = new int[size];
		for(int i =0;i<size;i++)
		{
		    arr[i] = scan.nextInt();
		}
		Arrays.sort(arr);
		for(int i =0;i<size;i++)
		{
		    if(Math.sqrt(arr[i]) == Math.round(Math.sqrt(arr[i])))
		    {
		        System.out.println("<"+arr[i]+",5>");
		    }
		    else if(arr[i]%4 == 0 && arr[i]%6 == 0)
		    {
		        System.out.println("<"+arr[i]+",4>");
		    }
		    else if(arr[i]%2 == 0)
		    {
		        System.out.println("<"+arr[i]+",3>");
		    }
		    else
		    {
		        System.out.println("<"+arr[i]+",0>");
		    }
		}
	}
}
