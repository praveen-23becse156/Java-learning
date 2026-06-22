package day7;
import java.util.Scanner;
public class array3 {//odd or even
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
        System.out.print("even: ");
                for(int i=0;i<n;i++)
        {
            if(arr[i]%2==0)
            {
                 System.out.print(arr[i ]+" ");
            }
        }
         System.out.println();
         System.out.print("odd: ");
             for(int i=0;i<n;i++)
        {
            if(arr[i]%2!=0)
            {
                 System.out.print(arr[i]+" ");
            }
        }
    }
    
}
