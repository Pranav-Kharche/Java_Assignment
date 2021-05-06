//2:Write a program to adddition of two numbers also addition of two characters.
import java.util.Scanner;
public class Test2 {
    public static void main(String[] args) {
  	int n1,n2,ans;
  	int c,d,result;
  	Scanner sc= new Scanner(System.in);
  	System.out.println("Enter first no.:");
  	n1=sc.nextInt();
  	System.out.println("Enter second no.: ");
  	n2=sc.nextInt();
  	ans=n1+n2;
  	System.out.println("Addition is:" +ans);
  	System.out.println("Enter first char.:");
  	c=sc.next().charAt(0);
  	System.out.println("Enter second char.: ");
	d=sc.next().charAt(0);
	result=c+d;
	System.out.println("Addition is:" +result);

	}

}
