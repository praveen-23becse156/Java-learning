import java.util.Scanner;
public class d27{
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();;
        if(a%100==0)
        {
             System.out.println("centuary year ");
        }
        else
        {
            System.out.println("not a centuary year");
        }
}
}
