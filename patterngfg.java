//https://www.geeksforgeeks.org/zoho-interview-set-1-campus/
//1
package pattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Pattern {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = 0;
        System.out.println("Enter the String to express the pattern");
        try {
            String pat = br.readLine();
            for(int i = 0;i<pat.length();i++)
            {
                k = pat.length()-i-1;
                for(int j =0;j<pat.length();j++)
                {
                    if(j == i || j == k)
                    {
                        System.out.print(pat.charAt(j));
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        } 
        catch (IOException ex) {
            Logger.getLogger(Pattern.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
