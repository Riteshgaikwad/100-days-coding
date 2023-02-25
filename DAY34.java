/*
Write a Program to Remove brackets from an algebraic 
expression
Description
Get an algebraic expression as input from the user and then remove all the brackets in that.
*/
// Solution:-
import java.util.*;

public class basic {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:-");
        String str=sc.nextLine();       //Taking string as an input
        String str1="";
        str1=str.replaceAll("[(){}]","");
        System.out.println(str1);
    }
}
