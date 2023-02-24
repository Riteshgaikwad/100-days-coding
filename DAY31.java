
/*
Question:-Write a Program to Toggle each character in a string
Description
Get an input string from user and then convert the lower case of alphabets to upper case and all uppercase alphabets into lower case
*/
//Solution:-
import java.util.*;

public class basic {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:-");
        String str=sc.nextLine();       //Taking string as an input
        String str1="";   //new empty string
        for(int i=0;i<str.length();i++){         
            if(Character.isUpperCase(str.charAt(i))){              //check if the charactr is upper case if its true then convert it to lower case
                str1=str1+Character.toLowerCase(str.charAt(i));
            }
            else{
                str1=str1+Character.toUpperCase(str.charAt(i));   //else convert the character to the upper case
            }
            
        }
        System.out.println(str1);
    }
}
