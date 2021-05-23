public class ReverseArray
{
public static void main(String args[])
{
    int arr[]=new int[]{1,2,3};
    int n=arr.length;
    reverse(arr,n);
}

static void reverse(int arr[], int n){
    for(int i=0;i<n/2;i++){
        int temp= arr[i];
        arr[i]= arr[n-i-1];
        arr[n-i-1]= temp;
        
    }

    System.out.println("Reversed Array:");
    for(int k=0;k<n;k++){
        System.out.print(arr[k]);
    }
}
}
