//3:Find the compound amount and compound interest on the principal Rs.20,000 borrowed at 6% compounded annually for 3 years.
import java.util.Scanner;
public class Test3 {

	public static void main(String[] args) {
		double p=20000, r=6, t=3, a, ci;
		Scanner sc= new Scanner(System.in);
//		System.out.println("Enter principle:");
//		p=sc.nextDouble();
//		System.out.println("Enter rate:");
//		r=sc.nextDouble();
//		System.out.println("Enter time:");
//		t=sc.nextDouble();
		a=p*((1+r/100)*(1+r/100)*(1+r/100));
		System.out.println("Amount:" +a);
		ci=a-p;
		System.out.println("Compound interest:"+ci);
			
		

	}

}
