import java.util.Scanner;
public class loop10
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	     int temp=n;
	     int count=1;
	    for(int i=1;i<n;i++)
	   
	    {
	        if(i%n==0)
	        {
	            n=n+i;
	        }
	    }
	    if(temp==n){
	        System.out.println("Perfect number");
	    }else{
	        System.out.println("not a perfect number");
	    }
	}
}