import java.util.*;

class Binary
{
    public static void main(String args[])
    {
        Scanner console = new Scanner(System.in);
        BinarySearch obj = new BinarySearch();
        int arr[] = {11,22,33,44,55,66,77};
        System.out.println("Enter the search value: ");
        int val = console.nextInt();
        int n;
        n= arr.length;
        int extra = obj.Search(arr, 0, n-1, val);
        if(extra == -1)
        System.out.println("Element not found");
        else
        System.out.println("Element found at index:"+ extra);
    }
}

class BinarySearch
{
    int Search(int arr[], int l, int r, int val)
    {
        while(l<r)
        {
            int mid=(l+r)/2;
            if(arr[mid]==val)
            {
                return mid;
            }
            else if(arr[mid]>val)
            {
                r=mid-1;
            }
            else
            {
                l=mid+1;
            }
        }
        return -1;
    }
}
