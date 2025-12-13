import java.util.Scanner;
public class d15 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
      if((n%3==0)||(n%7==0))
      {
        System.out.printf("OK%d",n);
      }
      else {
        System.out.printf("not%d",n);
      }
      }
    }
  