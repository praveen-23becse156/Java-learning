package day5;
import java.util.Scanner;
public class p22
{
    public static void main(String[]aStrings)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(j==1||i==n||i>=j)
                {
                    System.out.print(a+" ");
                    a++;
                }
                else
                {
                    System.out.print("  ");
                }
            }System.out.println();
        }
    }
}