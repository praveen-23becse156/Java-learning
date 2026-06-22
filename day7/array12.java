package day7;
import java.util.Scanner;
public class array12
{
      public static void main(String[]args)
      {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int sum=0;
        int digit=n;

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
            System.out.println(sum);
        }
        
      }
}