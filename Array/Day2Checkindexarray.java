//Write a Java program , accept array ,accept number from user and  find the index of number 
//in array if present else show message not exist.
import java.util.Scanner;
public class Day2Checkindexarray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr;
		System.out.println("Enter size of array:");
		int size=sc.nextInt();
		arr=new int[size];
		System.out.println("Array elements are:");
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();//System.out.println(arr[i]);
		}
		
		System.out.println("Enter number to search");
		int n=sc.nextInt();
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]==n) 
			{
				System.out.println("Number present in array");
			}
			else
				System.out.println("Number is not present in array");
		}
	}
}
