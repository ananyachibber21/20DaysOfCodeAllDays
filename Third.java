import java.util.*;

class Third
{
	public static void main(String args[])
	{
		Scanner console = new Scanner(System.in);
		Ls obj = new Ls();
		System.out.println("Enter the length of array: ");
		int n = console.nextInt();
		int arr[] = new int[n];
        
        for(int i=0;i<n;i++){
        	System.out.println("Enter value: ");
            arr[i]= console.nextInt();
        }
        
        System.out.println("The array: ");
        for(int i=0;i<n;i++){
        	System.out.println(arr[i]+ " ");
        }

        obj.sort(arr);
        System.out.println("The sorted array is: ");
        obj.printSort(arr);
        System.out.println("Third smallest: ");
        obj.smallest(arr);
        System.out.println("Third largest: ");
        obj.largest(arr);
    }
}

class Ls
{
	void sort(int arr[])
	{
        int n = arr.length;
		for(int i=0;i<n-1;i++){
			int min = i;
            for(int j=i+1;j<n;j++){
        		if(arr[j]<arr[min]){
        			min= j;
        		}

        		int temp = arr[min];
        		arr[min] = arr[i];
        		arr[i] = temp;
        	}
        }
    }

    void printSort(int arr[])
    {
    	int n=arr.length;
    	for (int i=0; i<n; ++i)
            System.out.println(arr[i]+" ");
    }

    void smallest(int arr[])
    {
        int first = arr[2];
        System.out.println(first);
    }

    void largest(int arr[])
    {
        int large = arr[arr.length-3];
        System.out.println(large);
    }
}
