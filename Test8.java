//8:Check if number is a prime number or not.
import java.util.Scanner;
public class Test8 {

	public static void main(String[] args) {
		int n, i, prime=1;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number:");
		n=sc.nextInt();
		for(i=2; i<n; i++) 
		   {
		      if((n%i) == 0) 
		      {
		         prime = 0;
		      }
		   }

		   if (prime == 1)
		      System.err.println("Number is prime.");
		   else
		      System.out.println("Number is not a prime.");
		}
}

