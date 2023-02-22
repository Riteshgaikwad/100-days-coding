//Q:-Write a Program to print Length of the string without using strlen() function
//Solution:-
import java.util.Scanner;

public class basics {

   public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter a string : ");
      String str1=sc.nextLine();
      char ch[]=str1.toCharArray();
      int i=0;
      for(char c :ch){
         i++;
      }
      System.out.println("Length of string is:"+i);
      sc.close();

      }
}
