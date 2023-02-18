//Q:Write a program to find the Factors of a number
//Solution:-
import java.util.Scanner;

public class basics {

   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number:");
      int num = sc.nextInt();
      
      for (int i = 1; i < num; i++) {
         if (num % i == 0) {
            System.out.print(i+" ");
         }
      }
      sc.close();
   }
}
