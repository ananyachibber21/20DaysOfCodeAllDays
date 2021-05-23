class InsertionSort {
    void sort(int arr[])
    {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int temp = arr[i];
            int j = i - 1;
 
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = temp;
        }
    }
 
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
 
        System.out.println();
    }
}

class Main
{
 
    public static void main(String args[])
    {
        int arr[] = { 6,2,3,5,11 };
 
        InsertionSort ob = new InsertionSort();
        ob.sort(arr);
        System.out.print("The sorted array is: ");
        ob.printArray(arr);
    }
}

