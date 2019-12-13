/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package longest.palindrome;

import java.util.Scanner;

/**
 *
 * @author MS
 */
public class LongestPalindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the paranthesis");
        String x = scan.next();
        int arr[] = new int[100];
        char curr = ' ';
        int j = 0;
        for(int i =0;i<x.length();i++)
        {
            curr = x.charAt(i);
            if(curr == '(')
            {
                arr[j] = i;
                j++;
            }
            else
            {
               if(j>0 && x.charAt(arr[j-1]) == '(')
               {
                   //maxlen = i-j-1;
                   j--;
               }
               else
               {
                   arr[j] = i;
                   j++;
               }
            }
        }
        int curlen = 0;
        int maxlen = arr[0];
        for(int i = 1;i<j;i++)
        {
            curlen = arr[i]-arr[i-1];
            System.out.println(arr[i]+" "+arr[i-1]);
            if(curlen>maxlen)
                maxlen = curlen;
        }
        if(maxlen == 0)
            maxlen = x.length();
        if(maxlen == 1)
            maxlen = 0;
        System.out.println(maxlen);
    }
    
}
