import java.util.Scanner;
public class d34{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        double bill=sc.nextDouble();
        double discount=0;
        if (bill>=1000)
            discount=bill*0.20;
        else if(bill>=500)
            discount=bill*0.10;
        else if(bill>=200){
            discount=bill*0.05;
        }
        double finalAmount=bill-discount;
        }
    }