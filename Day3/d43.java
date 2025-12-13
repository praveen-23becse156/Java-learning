import java.util.Scanner;
public class d43{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a<=b&&a%100==0)
            System.out.println("withdraw successfully!Balance"+(b-a));
        else if(a>b)
            System.out.println("insufficient balance");
        else
            System.out.println("withdrawal amount should be in multiples of 100");
        }
    }
