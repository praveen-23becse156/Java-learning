import java.util.Scanner;
public class o44{
    public static void main(String []args){  
    Scanner sc=new Scanner(System.in);
        int price=sc.nextInt();
        int bought=sc.nextInt();
        int offerGroups= bought/5;          
        int freePens=offerGroups*2;        
        int payablePens=bought-freePens;
        int totalCost=payablePens*price;
        System.out.println("Pens to be paid for= "+payablePens);
        System.out.println("Total cost= "+totalCost);
    }
}