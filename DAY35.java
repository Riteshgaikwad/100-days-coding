/*
Write a Program to Count the sum of numbers in a string
Description
Get a string from the user and find the sum of numbers in the string.
*/
//solution:-
import java.util.*;

public class basic {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:-");
        String str=sc.nextLine();       //Taking string as an input
       int count=0;
        for(int i=0;i<str.length();i++){
            if(Character.isDigit(str.charAt(i))){
                count=count+Character.getNumericValue(str.charAt(i));
            }
        }
        System.out.println(count);
    }
}
