import java.util.Scanner;
public class d31{
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int mark=sc.nextInt();
        switch(mark/10)
        {
        case 1:
        case 2:
            System.out.println("grade A");
            break;
        case 3:
        case 4:
            System.out.println("grade B");
             break;
        case 5:
        case 6:
            System.out.println("grade C");
             break;
        default:
            if(mark>=0)
                {
                   System.out.println("fail"); 
                }          
             else
                {
                    System.out.println("invalid");
                }   
 }      
}
}
