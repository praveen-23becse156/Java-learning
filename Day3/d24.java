import java.util.Scanner;
public class d24 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        char ch=sc.next().charAt(0);
        if(ch>='0'&&ch<='9')
        {
             System.out.println("digit ");
        }
        else
        {
            System.out.println("not a digit ");
        }
}
}
