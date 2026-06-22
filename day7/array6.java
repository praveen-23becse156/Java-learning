package day7;
import java.util.Scanner;
public class array6{//k th largest value
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
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-1-i;j++)
            {
                if(arr[i]>arr[i+1])
                {
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        
        }
    }
}
