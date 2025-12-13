import java.util.Scanner;
public class o40{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a<20)
            System.out.println("cold");
        else if(a>=20&&a<=30)
            System.out.println("warm");
        else if(a>=31&&a<=40)
            System.out.println("hot");
        else
            System.out.println("heatware");
    }
}
