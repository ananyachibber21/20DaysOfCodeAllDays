
import java.util.*;
public class DiagonalSum
{
	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int r = console.nextInt();
		System.out.println("Enter the number of cols: ");
		int c = console.nextInt();
		int arr[][]= new int[r][c];
		
		for(int i=0;i<r;i++){
		    for(int j=0;j<c;j++){
		        System.out.println("Enter value: ");
		        arr[i][j]=console.nextInt();
		    }
		}
		
		for(int i=0;i<r;i++){
		    for(int j=0;j<c;j++){
		        System.out.print(arr[i][j]+ " ");
		    }
		    System.out.print("\n");
		}
		
		int sum1=0;
		System.out.println("Sum of the Left diagonal");
		for(int i=0;i<r;i++){
		    for(int j=0;j<c;j++){
		        if(i==j){
		            sum1=sum1+arr[i][j];
		        }
		    }
		 }
		 System.out.print(sum1);
		 
		 System.out.print("\n");
		 
		int sum2=0;
		System.out.println("Sum of the Right diagonal");
		for(int i=0;i<r;i++){
		    for(int j=0;j<c;j++){
		        if((i==j) || (j==3-i)){
		            sum2=sum2+arr[i][j];
		        }
		    }
		 }
		 System.out.print(sum2);
	}
}
