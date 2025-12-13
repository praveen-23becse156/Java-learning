
import java.util.Scanner;
public class d6 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a>b)
        {
          System.out.println(a);
        }
        else if(a>c)
        {
          System.out.println(c);
        }
        else
        {
          System.out.println(b);
        }

    }
  }  