import java.util.Scanner;
public class d26{
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();;
        if(a%400==0||(a%4==0&&a%100!=0))
        {
             System.out.println("leap year ");
        }
        else
        {
            System.out.println("not a leap year");
        }
}
}
