import java.util.Scanner;
public class loop22
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
		int a=sc.nextInt();
	     int sum=0;
	    for(int i=1;i<=a;i++)
	   {
		   sum+=n;
	   }System.out.println(sum);
	}
}