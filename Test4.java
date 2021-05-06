//4:Write a program to calculate power of a number.
import java.util.Scanner;
public class Test4 {

	public static void main(String[] args) {
		int n, m , pow=1,i;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number:");
		n=sc.nextInt();
		System.out.println("Enter powwer:");
		m=sc.nextInt();
		for(i=1; i<=m; i++)
		{
			pow=pow*n;
		}
        System.out.println(("Result is:" +pow));  
	}

}
