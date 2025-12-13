import java.util.Scanner;
public class o33 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double r, h, surfaceArea, volume;
        r = sc.nextDouble();
        h = sc.nextDouble();
        surfaceArea = 2 * Math.PI * r * (r + h);
        volume = Math.PI * r * r * h;
        System.out.println("Surface Area = "+surfaceArea);
        System.out.println("Volume = "+volume);
  }
}

