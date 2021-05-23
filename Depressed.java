import java.util.*;

class Depressed
{
	public static void main(String args[])
	{
		Scanner console = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n = console.nextInt();
		int arr[] = new int[n];

        for(int i=0;i<n;i++){
        	System.out.println("Enter value: ");
			arr[i] = console.nextInt();
	 	}
        
        System.out.println("The array: ");       
		for(int i=0;i<n;i++){
			System.out.println(arr[i]);
		}

    for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if(arr[i]==arr[j]){
					System.out.println("Duplicate: ");
					System.out.println(arr[i]);
				}
      }
		}
	}
}
