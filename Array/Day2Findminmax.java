//8:Write a Java program to find the maximum and minimum value of an array.

import java.util.Scanner;
public class Day2Findminmax {

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
	int min=arr[0];
	for(int i=0; i<arr.length; i++)
	if(arr[i]<min)
	{
		min=arr[i];
	}
	System.out.println("Minimum number is:"+min);
	int max=arr[0];
	for(int i=0; i<arr.length; i++)
		if(arr[i]>max)
		{
			max=arr[i];
		}
	System.out.println("Maximum number is:"+max);
		}
	}

