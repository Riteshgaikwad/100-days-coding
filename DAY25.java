//Q:-Write a program to find Area of a circle
/*
Description
Get the value for radius from the user and calculate the area of the circle for the given radius.
Area of circle = 3.14*radius*radius
*/
//Solution:-
import java.util.Scanner;

public class basics {

   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the radius :");
      float rad=sc.nextFloat();
      double area=3.14*rad*rad;
      System.out.println("Area of circle is:"+area);
      sc.close();
   }
}
