import java.util.Scanner;
public class loop4{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int product=1;
        while(temp!=0)
        {
            int a=temp%10;
            temp/=10;
            product*=a;
            }
        System.out.println(product);
    }   
    
}