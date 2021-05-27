//1:Write a function to accept array of string.Display all elements in uppercase.
import java.util.Scanner;
public class Day3Acceptarray {
	public static void acceptArray(String[] names) {
		for(int i=0; i<names.length; i++)
		{
			System.out.println(names[i].toUpperCase());
		}
	}
	public static void main (String[] args)
		{
		for(int i=0; i<args.length; i++)
		{
			System.out.println(args[i]);
		}
			String[] arr= {"pranav", "vivek","rahul","saurabh"};
			acceptArray(arr);
		}
}




