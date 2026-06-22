package day7;
import java.util.Scanner;
public class array2//rev the given number
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=n-1;i>=0;i--)
        {
            System.out.print(arr[i]+" ");
        }System.out.println();
    }
}