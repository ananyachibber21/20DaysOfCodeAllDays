import java.util.*;
 
class LeftRotation
{  
 public static void main(String args[])
 {
 Scanner sc = new Scanner(System.in);
 
         int i,n,temp;
 
 System.out.println("Enter the number of elements:") ;
 n = sc.nextInt();
 int arr[] = new int[n];
 
     System.out.println("Enter the elements") ;
     for(i=0;i<n;i++)
     { 
         arr[i] = sc.nextInt();
     }
 
     	System.out.println("Original array");
     for(i=0;i<n;i++)
     {
         System.out.print(arr[i]+" ");
     }
 
     
     temp=arr[0];
     for(i=0;i<n-1;i++)
     {
       arr[i]=arr[i+1];
     }
     arr[n-1]=temp;
 
     System.out.println("\nNew array after rotating by one postion in the left direction");
     for(i=0;i<n;i++)
     {
       System.out.print(arr[i]+" ");
     }
 } 
}
