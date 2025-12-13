import java.util.Scanner;
public class d30{
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        char operator=sc.next().charAt(0);
        switch(operator)
        {
        case'+':
            System.out.println(a+b);
            break;
        case'-':
            System.out.println(a-b);
             break;
        case'*':
            System.out.println(a*b);
             break;
        case'/':
            if(b!=0)
                {
                   System.out.println("not divisbleby 0"); 
                    break;
                }          
             else
                {
                    System.out.println(a/b);
                     break;
                }   
 }      
}
}
