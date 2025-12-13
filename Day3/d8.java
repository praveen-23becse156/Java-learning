import java.util.Scanner;
public class d8 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int temp=a;
         temp%=10;
        
        if(temp%3==0)
        {
          System.out.println("it is divisble by 3");
        }
        else
        {
          System.out.println("it is not divisible by 3");
        }

    }
  }