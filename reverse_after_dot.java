//https://practice.geeksforgeeks.org/problems/reverse-each-word-in-a-given-string/0
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	    Scanner scan = new Scanner(System.in);
	    String[] st;
	    String res;
	    int l;
	    int n = scan.nextInt();
	    for(int i=0;i<n;i++)
	    {
	        res="";
	            st = scan.next().split("\\.");
	           for(int j =0;j<st.length;j++)
	           {
	               l = st[j].length();
	               while(l>0){
	               res = res+ st[j].charAt(l-1);
	               l--;
	               }
	               if(j<st.length-1)
	               res = res+".";
	           }
	           System.out.println(res);
	           
	    }
	}
}
