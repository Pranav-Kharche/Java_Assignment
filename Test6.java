//6:Write a program to find factorial of a given number.

import java.util.Scanner;
public class Test6 {

	public static void main(String[] args) {
		int n, i, fact=1;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number:");
		n=sc.nextInt();
		for(i=1; i<=n; i++)
		{
			fact=fact+i;
		}
	    System.out.println("Factorial of "+n+" is:"+fact);
		    

	}

}
