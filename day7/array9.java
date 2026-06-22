package day7;
import java.util.Scanner;
public class array9//left shift 
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int[] arr=new int[n];
	    for(int i=0;i<n;i++){
	        arr[i]=sc.nextInt();
	    }
	    int k=sc.nextInt();
	    for(int i=0;i<k;i++){
	        int first=arr[n-1];
	        for(int j=n-1;j>0;j--){
	            arr[j]=arr[j-1];
	        }
	        arr[0]=first;
	    }
	    for(int i=0;i<n;i++){
		System.out.print(arr[i]+" ");
	}
}
}