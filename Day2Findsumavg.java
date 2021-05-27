/*9: Write a program to create an array of integers and perform following operations on that array like 
finding the sum, average, maximum and minimum number in that array. Accept the numbers of the 
array from user.*/
import java.util.Scanner;
public class Day2Findsumavg {

	public static void main(String[] args) {
		int[] arr;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of an array:");
		int size=sc.nextInt();
		arr=new int[size];
		System.out.println("Enter array elements:");
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int sum=0;
		for(int i=0; i<arr.length; i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("Sum of an array elements is:"+sum);
		
		int avg=0;
		for(int i=0; i<arr.length; i++)
		{
			avg=sum/arr.length;
		}
		System.out.println("Average of an array elements is:"+avg);
		
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
