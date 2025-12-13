import java.util.Scanner;
public class d21 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        char ch=sc.next().toLowerCase().charAt(0);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='0'||ch=='u')
        {
            System.out.println("Vowels: ");
        }
        else
        {
            System.out.println("Consonants: ");
        }
        
    }
}
