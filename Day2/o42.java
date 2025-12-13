import java.util.Scanner;
public class o42{
    public static void main(String []args){  
    Scanner sc=new Scanner(System.in);
        int candies=sc.nextInt();
        int students=sc.nextInt();
        int candiesPerStudent=candies/students;
        int remainingCandies=candies%students;
        System.out.println("Each student gets= "+candiesPerStudent+"candies");
        System.out.println("Remaining candies= "+remainingCandies);
    }
}