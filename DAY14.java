//Q:-Write a program to reverse a given number
//Solution:-
import java.util.Scanner;

public class basics {

   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number :");
      int num = sc.nextInt();
      int reverse=0;
      while(num>0){
         int last_digit=num%10;
         reverse=reverse*10+last_digit;
         num=num/10;
      }
      System.out.println(reverse);  
      }
}
