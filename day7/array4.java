package day7;
import java.util.Scanner;
public class array4//find the largest number
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
        int max=0;
        for(int i=0;i<n;i++)
        {
            if(max<arr[i])
            {
                max=arr[i];
            }
        }System.out.println(max);


    }
}
