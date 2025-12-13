
import java.util.Scanner;
public class d5 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int temp=a;
        int count=0;
        while(temp!=0)
        {
            count++;
            temp/=10;
        }
        if(count==3)
        {
            System.out.println("It is three digit");
        }
        else
        {
            System.out.println("It is not a three digit");
        }
    }
}        
