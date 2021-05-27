//2:Write a Java program to accept 2D aaray elements.Display all elements.
import java.util.Scanner;
public class Day3Array2d {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n,m;
	System.out.println("Enter number of Rows: ");
	n= sc.nextInt();
	System.out.println("Enter number of Columns: ");
	m= sc.nextInt();
	int arr[][] = new int[n][m];
	
	System.out.println("Enter 2D Array Elements: ");
	for(int i=0; i<n; i++)
	{
		for(int j=0; j<m; j++)
		{
			arr[i][j]=sc.nextInt();
		}
	}
	
	System.out.println("Your Array: ");
	for(int i=0; i<n; i++)
	{
		for(int j=0; j<m; j++)
		{
			System.out.print(arr[i][j]+"\t");
		}
		System.out.println("");
	}
	sc.close();
}
}