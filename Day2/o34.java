import java.util.Scanner;
public class o34 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double a,surfaceArea,volume,perimeter;
        a=sc.nextDouble();
        surfaceArea=6*a*a;
        volume=a*a*a;
        perimeter=12*a;
        System.out.println("Surface Area of Cube ="+surfaceArea);
        System.out.println("Volume of Cube = "+volume);
        System.out.println("Perimeter of Cube = " +perimeter);
  }
}
