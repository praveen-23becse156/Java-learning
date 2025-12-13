import java.util.Scanner;
public class o41{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a>=80)
            System.out.println("full");
        else if(a>=60)
            System.out.println("moderate");
        else
            System.out.println("low");
    }
}