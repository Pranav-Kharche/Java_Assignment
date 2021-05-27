//7:Write a java program to convert char array into String.
public class Day3Chartostring {

	public static void main(String[] names) {

		char[] arr= {'P','U','N','E'};
		String a=String.copyValueOf(arr);
		System.out.println("Character array into string is: "+a);
		
	}

}
