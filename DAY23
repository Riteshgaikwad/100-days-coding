//Q:-Write a program to Replace all 0’s with 1 in a given integer
//Solution:-
import java.util.Scanner;

public class basics {

   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number 0's and 1's:");
      int num=sc.nextInt();
      int new_num=0;
      while(num>0){
         int lastdigit=num%10;
         if(lastdigit==0){
            lastdigit=1;
         }
         num/=10;
         new_num=new_num*10+lastdigit;
      }
      num=0;
      while(new_num>0){
         int rem=new_num%10;
         num=num*10+rem;
         new_num/=10;
      }
     System.out.println("New Number is:"+num);
      sc.close();
   }
}
