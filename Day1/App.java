package Day1;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int first  =(a)%10;
        int last=(a)/100;
        int num=first+last;
        System.out.println(num);
    }
  } 