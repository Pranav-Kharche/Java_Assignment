//6:Write a program which read aaray of 5 elements and print reverse array.

import java.util.Scanner;
public class Day2Reversearry {

	public static void main(String[] args) {
	int[] arr;	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter size of an array:");
	int size=sc.nextInt();
	arr=new int[size];
	System.out.println("Array elements are:");
	for(int i=0; i<arr.length; i++)
	{
		arr[i]=sc.nextInt();
	}
	System.out.println("Reverse array elements:");
	for(int i=arr.length-1; i>=0; i--)
	{
	   System.out.println(arr[i]);
    }
}
}
