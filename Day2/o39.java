import java.util.Scanner;
public class o39{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        double amount=sc.nextDouble();
        double discount=0;
        if(amount>1000)
            discount=amount*0.20;
        else if(amount>500)
            discount=amount*0.10;
        else{
            discount=amount*0.05;
        }
        double finalAmount=amount-discount;
        System.out.println(amount);
        System.out.println(discount);
        System.out.println(finalAmount);
    }
}
