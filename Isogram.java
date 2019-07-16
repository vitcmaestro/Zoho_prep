//https://practice.geeksforgeeks.org/problems/check-if-a-string-is-isogram-or-not/1
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
     //Position this line where user code will be pasted.
	public static void main (String[] args) throws Exception
	 {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        while(testCase-- > 0)
        {
            String data = br.readLine();
            System.out.println(isIsogram(data)?"1":"0");
            
        }
	 }
}
}
/*This is a function problem.You only need to complete the function given below*/
//This is a function problem
static boolean isIsogram(String data){
    String lower  = data.toLowerCase();
 int slen = data.length();
 char[] arr = lower.toCharArray();
 Arrays.sort(arr);
 for(int i=0;i<slen-1;i++)
 {
     if(arr[i] == arr[i+1])
     return false;
 }
 return true;
}
