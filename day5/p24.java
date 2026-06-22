package day5;
import java.util.Scanner;
public class p24
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
        int m=1;
		for(int i=1;i<=n-1;i++)
		{
        
		    for(int j=1;j<=n;j++)
		    {
        
		        if(i+j>=n+1)
		        {
		            System.out.print(m+" ");
                    m++;
		        }
		        else
		        {
		            System.out.print("  ");
		        }
		    }
            m--;
            for(int k=2;k<=n;k++)
            {
                
                    if(i>=k)
                    {
                        m--;
                        System.out.print(m+" ");
                    }
                    else
                    {
                        System.out.print("  ");
                    }
                }System.out.println();
            }
		}
    }
