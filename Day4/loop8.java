
import java.util.Scanner;
public class loop8{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        for(int i=1;i<n;i++)
        {
            if(n%10==0)
            {
               count++;
            }
        
        }
        if(count==0){
            System.out.println("Prime number");
        }else{
            System.out.println("not a prime number");
        }
    }
}