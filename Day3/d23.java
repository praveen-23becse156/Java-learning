
import java.util.Scanner;
public class d23 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        char ch=sc.next().charAt(0);
        if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
        {
            System.out.println("Alaphabet ");
        }
        else 
        {
            System.out.println("not a Alaphabet ");
        }
    }
}