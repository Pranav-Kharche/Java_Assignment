//4:Write functions for making addition of diffrent types(use FunctionOverloading);
import java.util.Scanner;
public class Day2Addtypes {
	public static void add(int i, int j){
	System.out.println("Addition is:"+(i+j));
	}
	public static void add(int i, int j, int k){
	System.out.println("Addition is:"+(i+j+k));
	}
	public static void add(double i, int j){
	System.out.println("Addition is:"+(i+j));
	}
	public static void add(int i, double j){
	System.out.println("Addition is:"+(i+j));
	}
	public static void main(String[] args) {
		int a=10, b=20, c=30;
		double d=15.10;
		add(a,b);
		add(a,b,c);
		add(d,a);
		add(b,d);
	}
}
