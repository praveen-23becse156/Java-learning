import java.util.Scanner;
public class d28{
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=a/100;
        int c=a%100;

        if(b==c)
        {
             System.out.println("first and last digit of year are equal  ");
        }
        else
        {
            System.out.println("first and last digit of year are not equal ");
        }
}
}
