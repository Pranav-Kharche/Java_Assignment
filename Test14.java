//14:Write a program to check entered number is Armstrong number or not.
import java.util.Scanner;
public class Test14 {
	public static void main(String[] args) {
		int n, c=0,a,temp;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number:");
		n=sc.nextInt();  
	    temp=n;  
	    while(n>0)  
	    {  
	    a=n%10;  
	    n=n/10;  
	    c=c+(a*a*a);  
	    }  
	    if(temp==c)  
	        System.out.println("armstrong number");   
	    else  
	        System.out.println("Not armstrong number");   
	   }  
	

	}


