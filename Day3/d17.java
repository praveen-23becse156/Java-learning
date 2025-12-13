import java.util.Scanner;
public class d17 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int num1=n1%=10;
        int num2=n2%=10;
        if(num1==num2){
            System.out.println("Same");
        }
        else{
            System.out.println("Not Same");
        }
    }
    
}
