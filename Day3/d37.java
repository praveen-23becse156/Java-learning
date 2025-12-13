import java.util.Scanner;
public class d37{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a==100)
            System.out.println("battery full");
        else if(a>=50&&a<100)
        System.out.println("50% consumed");
        else if(a<50)
            System.out.println("low battery");
        else
            System.out.println("invalid input");
        }
    }

   