//2:Write a program which will accept student information like rollno,name,5 subject marks.calculate total and percentage.calculate grade.. 
//           per >75 grade :A
//           per<74 and >60 :B
//           per<59  :C

import java.util.Scanner;
public class Day2Studentinfo {
 public static void main(String[] args) {
     
     int eng, mar, phy, m, bio;
     int total=0;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter your English marks:");
     eng=sc.nextInt();
     System.out.println("Enter your Marathi marks:");
     mar=sc.nextInt();
     System.out.println("Enter your Physics marks:");
     phy=sc.nextInt();
     System.out.println("Enter your Math marks:");
     m=sc.nextInt();
     System.out.println("Enter your Biology marks:");
     bio=sc.nextInt();
     total=eng+mar+phy+m+bio;
     System.out.println("Total is:"+total);
     float per=total/5;
     System.out.println("Percentage is:"+per);
     System.out.print("Grade is:");
	
     if(per>=80)
     {
         System.out.print("A");
     }
     else if(per>=60 && per<80)
     {
        System.out.print("B");
     } 
     else if(per>=40 && per<60)
     {
         System.out.print("C");
     }
     else
     {
         System.out.print("D");
     }
 }
}

//int[] marks = new int[5];
//for(i=0; i<5; i++) 
//{ 
  // System.out.print("Enter Marks of Subject"+(i+1)+":");
   //marks[i] = scanner.nextInt();
   //total = total + marks[i];
  // System.out.println("Total is:"+total);
//}
//System.out.println("Total is:"+total);
//per= total/5;
//System.out.println("Percentage is:"+per);
//System.out.print("The Grade obtained is: ");