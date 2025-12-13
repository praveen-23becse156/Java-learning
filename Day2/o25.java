import java.util.Scanner;
public class o25{
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int x1=sc.nextInt();     
        int x2=sc.nextInt();       
        int y1=sc.nextInt();     
        int y2=sc.nextInt();     
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("distance between two points:"+distance);
    }
  }





           
