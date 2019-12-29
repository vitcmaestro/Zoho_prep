import java.util.*;
public class Main
{
    public static boolean isPara(char s)
    {
        if(s == '(' || s == ')')
        return true;
        return false;
    }
    public static boolean isValid(String s)
    {
        int cnt = 0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) == '(')
            cnt++;
            if(s.charAt(i) == ')')
            cnt--;
            if(cnt<0)
            return false;
        }
        return (cnt == 0);
    }
    public static void RemoveValidPara(String test)
    {
        boolean level = false;
        if(test.length() == 0)
        return;
        
        ArrayList<String> visited = new ArrayList<>();
        Queue<String> q = new LinkedList<>();
        String chop;
        q.add(test);
        visited.add(test);
        while(!q.isEmpty())
        {
            test = q.peek();
            q.remove();
            if(isValid(test))
            {
                System.out.println(test);
                level = true;
            }
            if(level)
            continue;
            for(int i =0;i<test.length();i++)
            {
                if(!isPara(test.charAt(i)))
                {
                    continue;
                }
                chop = test.substring(0,i)+test.substring(i+1);
                if(!visited.contains(chop))
                {
                    visited.add(chop);
                    q.add(chop);
                }
            }
        }
    }
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
		System.out.println("Enter the unbalanced paranthesis");
		String test = scan.nextLine();
		RemoveValidPara(test);
	}
}
