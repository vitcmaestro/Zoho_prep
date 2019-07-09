//https://practice.geeksforgeeks.org/problems/the-celebrity-problem/1
import java.util.*;
class Celebrity_Problem
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int N = sc.nextInt();
			int M[][] = new int[N][N];
			for(int i=0; i<N; i++)
			{
				for(int j=0; j<N; j++)
				{
					M[i][j] = sc.nextInt();
				}
			}
		System.out.println(new Celebrity().getId(M,N));
		t--;
		}
	}
}

}

class Celebrity
{
    // The task is to complete this function
    int getId(int M[][], int n)
    {
        int[] knows = new int[n];
        int i = 0,ar = 0;
        for(int j =0;j<n && i<n;j++)
        {
            if(M[i][j] == 1)
            {
                i = j;
            }
        }
        for(int j =0;j<n;j++)
        {
            if(i !=j && (M[j][i] == 0 || M[i][j] == 1))
            return -1;
        }
        
        return i;
    }
}
