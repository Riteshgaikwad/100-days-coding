//Q:-Write a program to identify if the number is Palindrome or not
/*
Description
Get a number as input from the user and check whether that number is a Palindrome or not.
*/
//Solution:-
import java.util.Scanner;

public class basics {

   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number:");
      int num=sc.nextInt();
      int copy=num;
      int reverse=0;
      while(copy>0){
         int lastdigit=copy%10;
         reverse=reverse*10+lastdigit;
         copy/=10;
      }
      if(reverse==num){
         System.out.println("Palindrome");
      }
      else{
         System.out.println("Not Palindrome");
      }
      sc.close();
   }
}
