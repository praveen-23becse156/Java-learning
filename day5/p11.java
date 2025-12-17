package day5;
import java.util.Scanner;
public class p11
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i+j==n+1||i==n){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
        }
        
    for(int k=2;k<=n;k++){
        if(i==k||i==n){
        System.out.print("* ");
    }else{
        System.out.print("  ");
    }
}System.out.println();
  }
}}
		