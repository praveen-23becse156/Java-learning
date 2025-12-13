import java.util.Scanner;
public class d22 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        char ch=sc.next().charAt(0);
        if(ch>='a'&&ch<='z')
        {
            System.out.println("lowercase ");
        }
        else if(ch>='A'&&ch<='Z')
        {
            System.out.println("uppercase ");
        }
        else if(ch>='0'&&ch<='9')
        {
             System.out.println("digit ");
        }
        else
        {
             System.out.println("special symbols");
        }
        
    }
}
