import java.util.*;

class MissingElement
{
static int findmissing(int arr[], int n)
{
     
    int l = 0, r = n - 1;
    while (l <= r)
    {
        int mid = (l + r) / 2;
     
        if (arr[mid] != mid + 1 &&
            arr[mid - 1] == mid)
            return (mid + 1);
     
       if (arr[mid] != mid + 1)
            r = mid - 1;
     
        else
            l = mid + 1;
    }
 
return -1;
}
 
public static void main(String [] args)
{
    Scanner console = new Scanner(System.in);
    System.out.println("Enter the size of an array: ");
    int n = console.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++){
        System.out.println("Enter the element: ");
        arr[i]= console.nextInt();
    }
    
    for(int i=0;i<n;i++){
        System.out.println(arr[i]+ " ");
    }
    
    System.out.print("The missing element is: ");
    System.out.print(findmissing(arr, n));
}
}
