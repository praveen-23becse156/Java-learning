 import java.util.Scanner;
public class o37 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int cakesPerHour = sc.nextInt();
        int totalHours=sc.nextInt();
        int totalCakes=cakesPerHour*totalHours;
        System.out.println("Total cakes produced= "+totalCakes);
    }
}