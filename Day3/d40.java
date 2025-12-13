import java.util.Scanner;
public class d40{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        double b=0;
        if(a<=100)
            b=0;
        else if(a<=300)
            b=(a-100)*5;
        else
            b=(a*5)+(a-300)*10;
        if(a>500){
            b=b+(b*0.10);
        }
        System.out.println("Total bill="+b);
        }
    }