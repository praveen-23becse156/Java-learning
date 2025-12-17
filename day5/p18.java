package day5;
import java.util.Scanner;
public class p18
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
		    for(int j=1;j<=n;j++)
		    {
		        if(i>=j)
		        {
		            System.out.print("* ");
		        }
		        else
		        {
		            System.out.print("  ");
		        }
            }
		    for(int j=1;j<=n;j++)
		    {
		        if(i+j>=n+1)
		        {
		            System.out.print("* ");
		        }
		        else
		        {
		            System.out.print("  ");
		        }
            
		    }System.out.println();
        }
    
         for(int k=1;k<=n;k++)
		{
		    for(int j=1;j<=n;j++)
		    {
		        if(k==1||j==1||k+j<=n+1)
		        {
		            System.out.print("* ");
		        }
		        else
		        {
		            System.out.print("  ");
		        }
            }
            
		
		    for(int j=1;j<=n;j++)
		    {
		        if(k==1||j==n||k<=j)
		        {
		            System.out.print("* ");
		        }
		        else
		        {
		            System.out.print("  ");
		        }
            }System.out.println();
           
         
    }  

}
}


