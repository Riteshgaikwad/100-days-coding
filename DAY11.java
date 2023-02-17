//Q:-Write a program to find Fibonacci series up to n
//Solution:-
import java.util.Scanner;

public class basics {

   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number of elements required in fibonacci series:");
      int num = sc.nextInt();
      int a=0,b=1,c;
      System.out.print(a+" "+b);
      for(int i=2;i<num;i++){
         c=a+b;
         System.out.print(" "+c);
         a=b;
         b=c;
      }
   }

}
