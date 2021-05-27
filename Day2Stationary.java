/*11:Write a menu driven program for stationary shop.Items are 1:Pen 2:Pencil 3:NoteBook 4:Bottle 5:ColorBox.
1 pen cost is 10Rs,Pencil is 5 rs.NoteBook is 20 rs Bottle is 30 rs and ColorBox is at 50 Rs.
Calculate Total of all purchesed items.*/ 

import java.util.Scanner;
public class Day2Stationary {

	public static void main(String[] args) {
	int sum=0, ch=0;	
    Scanner sc= new Scanner(System.in);
    boolean flag=true;
    System.out.println("Which item do you want to buy\n1.pen \n2.pencil \n3.notebook \n4.bottle \n5.colorbox \n6.Exit ");
     
	while(flag!=false)
	{
		System.out.println("Enter choice:");
 	    ch=sc.nextInt();
	
	switch(ch) {
	
	case 1:
		int total=0;
		System.out.println("How many pen do you want to buy:");
		int a=sc.nextInt();
		total=10*a;
		sum=sum+total;
		System.out.println("Total price for your purchase is:=" +total);
		break;
		
	
	                            case 2:
		int total1=0;
		System.out.println("How many pencil do you want to buy:");
		int b=sc.nextInt();
		total1=5*b;
		sum=sum+total1;
		System.out.println("Total price for your purchase is:=" +total1);
		break;
			
	case 3:
		int total2=0;
		System.out.println("How many notebook do you want to buy:");
		int c=sc.nextInt();
		total2=20*c;
		sum=sum+total2;
		System.out.println("Total price for your purchase is:=" +total2);
		break;
			
	case 4:
		int total3=0;
		System.out.println("How many bottle do you want to buy:");
		int d=sc.nextInt();
		total3=30*d;
		sum=sum+total3;
		System.out.println("Total price for your purchase is:=" +total3);
		break;
			
	case 5:
		int total4=0;
		System.out.println("How many colorbox do you want to buy:");
		int e=sc.nextInt();
		total4=50*e;
		sum=sum+total4;
		System.out.println("Total price for your purchase is:=" +total4);
		break;
		
	case 6:
		flag=true;
	    break;
	default: break;
	}
	System.out.println("Total sum is="+sum);
	}
	}
}