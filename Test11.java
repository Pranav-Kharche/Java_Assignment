//11:Write a  program to find sum of all even and odd numbers between 1 to n. 
import java.util.Scanner;
public class Test11 {
	public static void main(String[] args) {

		  int n, even_sum=0, odd_sum=0, i;
		  Scanner sc= new Scanner(System.in);
		  System.out.println("Enter number: ");
		  n=sc.nextInt();
		  
		  for(i = 1; i<=n; i++)
		  {
		  	if(i%2==0) 
		  	{
		        even_sum=even_sum+i;
		  	}
		  	else
		  	{
		  		odd_sum=odd_sum+i;
			}
		  }
		  System.out.println("sum of even number is "+even_sum);
		  System.out.println("sum of odd number is:"+odd_sum);
	}
}

