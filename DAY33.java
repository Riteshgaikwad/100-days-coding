/*
Write a Program to check if String is a palindrome or not
Description
Get an input string from the user and then check whether it is a palindrome string or not.
*/
//Solution:-
import java.util.*;

public class basic {
    public static boolean is_palindrome(String str){
        int start=0;
        int end=str.length()-1;
        while(start<end){
            if(str.charAt(start)!=str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:-");
        String str=sc.nextLine();       //Taking string as an input
        if(is_palindrome(str)){
            System.out.println("The string is palindrome");
        }
        else{
            System.out.println("The string is not palindrome");
        }
    }
}
