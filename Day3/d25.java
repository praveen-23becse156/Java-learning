import java.util.Scanner;
public class d25 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        char a=sc.next().charAt(0);
        char b=sc.next().charAt(0);    
        if(a==b)
        {
             System.out.println("equal ");
        }
        else
        {
            System.out.println("not equal ");
        }
}
}