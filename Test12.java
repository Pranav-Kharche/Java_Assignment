//12: Write a  program to enter a number and print its reverse.
import java.util.Scanner;
public class Test12 {

	public static void main(String[] args) {
		   int n, y=0, r;
		   Scanner sc= new Scanner(System.in);
		   System.out.println("Enter number: ");
		   n=sc.nextInt();
		   while(n!=0)
		    {
		        r=n%10;
		        y=y*10+r;
		        n=n/10;
		    }
		    System.out.println("Reverse number is:"+y);

	}

}
