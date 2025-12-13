import java.util.Scanner;
public class o31 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();
        int surfaceArea =2*(l*w+l*h+w*h);
        int volume =l*w*h;
        System.out.println("Surface Area  = "+surfaceArea);
        System.out.println("Volume of javaboid = "+volume);
      }
  }


