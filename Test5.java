//5:Write a program to swap two numbers.
import java.util.Scanner;
public class Test5 {

	public static void main(String[] args) {
		int n1,n2,temp;
		Scanner sc= new Scanner(System.in);
		System.out.println(("Enter no1:"));
		n1=sc.nextInt();
		System.out.println(("Enter no2:"));
		n2=sc.nextInt();
	
		temp=n1;
		n1=n2;
		n2=temp;
		System.out.println("After swapping no1 is:"+n1);
		System.out.println("After swapping no2 is:"+n2);

	}

}
