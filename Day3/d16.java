import java.util.Scanner;
public class d16 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
      if((n%2==0)&&(n%5==0)&&(n%8!=0))
      {
        System.out.printf("OK%d",n);
      }
      else {
        System.out.printf("not%d",n);
      }
      }
  } 
