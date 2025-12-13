import java.util.Scanner;
public class d44{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        String color=sc.next().toLowerCase();
        switch(color){
        case "red":
            System.out.println("Stop");
            break;
            case "yellow":
            System.out.println("Ready");
            break;
            case "green":
                System.out.println("go");
                break;
                default:
                System.out.println("Invalid color");
        }
    }
}