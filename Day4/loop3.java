import java.util.Scanner;
public class loop3{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int count=0;
        while(temp!=0)
        {
            int a=temp%10;
            temp/=10;
            count++;
            }
        System.out.println(count);
    }
    
}
