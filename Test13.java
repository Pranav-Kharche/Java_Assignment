//13:Write a  program to print all Prime numbers between 1 to n. 
import java.util.Scanner;
public class Test13 {
	
	public static void main(String[] args) {
		int n,i,count;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number: ");
        n=sc.nextInt();
        
        for(int j=2;j<=n;j++)
        {
           count=0;
            for(i=1;i<=j;i++)
            {
              if(j%i==0)
              {
                count++;        
              }
            }
          if(count==2)
          System.out.print(j+"  ");   
         }
        
	}
}

