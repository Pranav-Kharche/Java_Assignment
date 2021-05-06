//9:Sum of series :
	//1+2+3+….+n
import java.util.Scanner;
public class Test9 {

	public static void main(String[] args) {
		int n, sum=0, i;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number:");
		n=sc.nextInt();
		for(i=1; i<=n; i++)
			sum=sum+i;
		System.out.println("Addition from 1 to n:" +sum);
		

	}

}
