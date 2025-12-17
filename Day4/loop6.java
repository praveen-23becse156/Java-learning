import java.util.Scanner;
public class loop6{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int rev=0;
        while(temp!=0)
        {
            
            int a=temp%10;
            rev=rev*10+a;
            temp/=10;
            }
            if(rev==n)
            {
                 System.out.println("palindrom");
            }
            else
            {
                System.out.println("not a palindrom");
            }    
    }   
    
}