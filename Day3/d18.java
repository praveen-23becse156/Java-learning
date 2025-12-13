import java.util.Scanner;
public class d18 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int count=0;
     
        while(temp!=0)
        {
             count++;
             temp/=10;

        }     
      
        if(count==1)
            {
        System.out.printf("single digit");}

      else if(count==2)
      {
         System.out.printf("double digit");
      }
      else if(count==3)
        {
         System.out.printf("three digit");
      }
      else 
      {
        System.out.printf("the number is above three digit");
      }
      }
    }