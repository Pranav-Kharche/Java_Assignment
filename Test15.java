//15:Write a program to find greatest of three numbers using nested if-else.
import java.util.Scanner;
public class Test15 {

	public static void main(String[] args) {
		int a, b, c,n;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first no.:");
	  	a=sc.nextInt();
	  	System.out.println("Enter second no.: ");
	  	b=sc.nextInt();
	  	System.out.println("Enter third no.: ");
	  	c=sc.nextInt();
	    if(a>=b && a>=c)
	    {
	        System.out.println("greater no. is: "+a);
	    }
	    else if(b>=a && b>=c)
	    {
	        System.out.println("greater no is:"+b);
	    }
	    else
	    {
	        System.out.println("greater no is:"+c);
	    }

	}

}
