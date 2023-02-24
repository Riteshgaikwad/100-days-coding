/*
Write a Program to Remove vowels from a string
Description
Get a string as the input from the user and then remove all the vowel letters from the string and give the 
output.
*/
//Solution:-
import java.util.*;

public class basic {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:-");
        String str=sc.nextLine();       //Taking string as an input
        String str1="";   //new empty string  
        str1=str.replaceAll("[aeiou]", "");  //using replace all to replace the string 
        System.out.println(str1);
    }
}
