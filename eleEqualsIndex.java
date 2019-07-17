public class MyClass {
    public static void main(String args[]) {
        int[] arr = {-1,0,1,2,3,4,5,6,9};
        int mid = arr.length/2;
        for(int i =0;mid>0 && mid<arr.length;i++)
        {
            System.out.println(arr[mid]+ " "+mid);
            if(arr[mid] == mid)
            {
            System.out.println("sucess");
            break;
        }
        else if(mid == 0 || mid == arr.length-1)
        break;
            else if(arr[mid]>mid)
            {
                mid = mid/2;
            }
            else
            {
                mid = (mid+arr.length)/2;
            }
        }
    }
}
