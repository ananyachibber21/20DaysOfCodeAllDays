import java.util.*;

public class MaxOccurrence {

public static void main (String[] args)
{
Scanner sc = new Scanner(System.in);
int num;
System.out.println("Enter the number of elements in the array:");
num = sc.nextInt();
int arr[] = new int[num];
System.out.println("Enter the elements:");
for(int i=0; i<num; i++)
{
arr[i] = sc.nextInt();
}
System.out.println("Input Array: ");
for(int i=0; i<num; i++)
{
System.out.print(arr[i] + " ");
}

int count,element=0,max=0;
for(int i=0;i<num;i++){
    count=0;
    for(int j=0;j<num;j++){
        if(arr[i]==arr[j]){
            count++;
        }
        }
        if(max<count){
                max=count;
                element = arr[i];
        }
    }
    System.out.println("Element repeating maximum no of times: " + element + ", maximum count: " + max);
    }
}
