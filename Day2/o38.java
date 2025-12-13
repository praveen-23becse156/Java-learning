 import java.util.Scanner;
public class o38 {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int price=sc.nextInt();
        int purchased=sc.nextInt();
        int free=purchased/3;              
        int totalMangoes=purchased+free;
        int amountToPay=purchased*price;   
        System.out.println("Free mangoes= "+free);
        System.out.println("Total mangoes received= "+totalMangoes);
        System.out.println("Amount to pay= "+amountToPay);
    }
}