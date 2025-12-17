
import java.util.Scanner;
public class loop7{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int count=0;
        while(temp!=0){
        int rev=temp%10;
        count=count+rev*rev*rev;
        temp/=10;
        }
        if(n==count){
            System.out.println("armstrong");
        }else{
            System.out.println("noo");
        }}}