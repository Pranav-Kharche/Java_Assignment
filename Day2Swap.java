//3:Write function to swap two numbers.
import java.util.Scanner;
public class Day2Swap {
  public static void swap()
  {
        int n1,n2,temp;
		Scanner sc= new Scanner(System.in);
		System.out.println(("Enter no1:"));
		n1=sc.nextInt();
		System.out.println(("Enter no2:"));
		n2=sc.nextInt();
	    System.out.println("Before swapping:"+n1+" "+n2); 
		temp=n1;
		n1=n2;
		n2=temp;
		System.out.println("After swapping :"+n1+" "+n2);
  }
  public static void main(String[] args) {
	  swap();
  }
}
