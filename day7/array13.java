package day7;
import java.util.Scanner;
public class array13 {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        int sum=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(n%2==0)
            {
                sum+=i;
            }
            if(sum==0)
                {
                    System.out.print("even");
                }  
                else
                {
                    System.out.print("odd");
                }
        }
    }
}
