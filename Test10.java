//10:Check whether the number is palindrome or not?
import java.util.Scanner;
public class Test10 {
	public static void main(String[] args) {
	int n,r,sum=0,temp;
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter number:");
    n=sc.nextInt();
    temp=n;    
    while(n>0)    
    {    
      r=n%10;    
      sum=(sum*10)+r;    
      n=n/10;    
    }    
    if(temp==sum)    
        System.out.println("Palindrome number.");    
    else    
    	System.out.println("Not palindrome number."); 
}

}
