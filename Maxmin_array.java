import java.util.*;

class Maxmin_array
{
    public static void main(String args[])
    {
        Scanner console= new Scanner(System.in);
        int arr1[]= new int[10];
        int n;
        int max, min;
        
        System.out.println("Enter the size of the array: ");
        n=console.nextInt();

        for(int i=0;i<n;i++){
            System.out.println("Enter a value: ");
            arr1[i]=console.nextInt();
        }

        max=arr1[0];
        min=arr1[0];

        for(int i=1;i<n;i++){
            if(arr1[i]>max){
                max=arr1[i];
            }
        }
            System.out.println("The max value is: ");
            System.out.println(max);
        

        for(int i=1;i<n;i++){
            if(arr1[i]<min){
                min=arr1[i];
            }
        }
            System.out.println("The min value is: ");
            System.out.println(min);
    }
}
