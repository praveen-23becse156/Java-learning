import java.util.Scanner;
public class d29{
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=a%10;

        if(a==b)
        {
             System.out.println(" last digit of year are same  ");
        }
        else
        {
            System.out.println(" last digit of year are not same ");
        }
}
}
