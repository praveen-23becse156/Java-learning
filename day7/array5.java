package day7;
import java.util.Scanner;
public class array5//find the Second largest number
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
        for(int i=0;i<n;i++)
        {
            if(sum<arr[i])
            {
                sum=arr[i];
            }
        }
        int two=0;
        for(int i=0;i<n;i++)
        {
            if(sum>arr[i]&&two<arr[i])
            {
                two=arr[i];
            }
        }System.out.println(two);


    }
}

