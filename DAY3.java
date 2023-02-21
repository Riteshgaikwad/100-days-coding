//Question:-Get an input character from the user and the give the ASCII value of the given input as the output.
//Solution in java

import java.util.Scanner;
class day3{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.printf("Enter the character:");
    char c=sc.next().charAt(0);
    int i=c;
    System.out.println("The ASCII value of character is:"+i);
    sc.close();


 }
}
