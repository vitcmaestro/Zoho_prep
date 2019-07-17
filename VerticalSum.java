//https://practice.geeksforgeeks.org/problems/vertical-sum/1
import java.util.*;
class Node
{
    int data;
    Node left, right;
    
    Node(int key)
    {
        data = key;
        left = right = null;
    }
}
class Vertical_sum
{
     public static void insert(Node root,int a,int a1,char lr)
     {
        if(root==null){
            return;
        }
        if(root.data==a){
            switch(lr){
                case 'L':root.left=new Node(a1);
                break;
                case 'R':root.right=new Node(a1);
                break;
            }
            return;
        }
        insert(root.left,a,a1,lr);
        insert(root.right,a,a1,lr);
    }
    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
             while(t-->0)
          {
            int n=sc.nextInt();
            if(n==0){
                System.out.println(0);
                continue;
            }
            Node root = null;
            for(int i=0;i<n;i++){
                int a=sc.nextInt();
                int a1=sc.nextInt();
                char lr=sc.next().charAt(0);
                if(i==0){
                    root=new Node(a);
                    switch(lr){
                        case 'L':root.left=new Node(a1);
                        break;
                        case 'R':root.right=new Node(a1);
                        break;
                    }
                }
                else{
                    insert(root,a,a1,lr);
                }
            }
            GfG gfg = new GfG();
            gfg.printVertical(root);
            System.out.println();
            
        }
        
    }
}

}
class GfG
{
    public static void printVertical(Node root)
    {
        
        HashMap<Integer,Integer> hmp = new HashMap<>();
        ArrayList<Integer> val = new ArrayList<>();
        findsum(root,0,hmp,val);
        Collections.sort(val);
        for(int i =0;i<val.size();i++)
        System.out.print(hmp.get(val.get(i))+" ");
        
    }
    public static void findsum(Node root,int hd,HashMap<Integer,Integer> hmp,ArrayList<Integer> val)
    {
        if(root == null)
        return;
        findsum(root.left,hd-1,hmp,val);
        int prevsum = (hmp.containsKey(hd))?hmp.get(hd):0;
        hmp.put(hd,prevsum+root.data);
        if(!val.contains(hd))
        val.add(hd);
        findsum(root.right,hd+1,hmp,val);
    }
    
}
