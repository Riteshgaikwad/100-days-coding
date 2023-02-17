//Q:-Write a program to identify if the number is Strong number or not
/*

A number is said to be strong number if the sum of the factorial of each digit in the number is same as 
that of the number.
E.g. let the number be 145
Here 1! + 4! + 5! is 1 + 24 + 120 which is equal to 145 itself.

*/
//Solution:-

import java.util.Scanner;
public class basics {

public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the number:");
   int num=sc.nextInt();
   int sum=0;
   int fact=1;
   int copy=num;
   if(copy==0){
      sum=sum+fact;
   }
   else{
      while(copy!=0){
         int rem=copy%10;
         fact=1;
         for(int i=1;i<=rem;i++){
            fact=fact*i;
         }
         sum=sum+fact;
         copy=copy/10;
      }
   }
  if(sum==num){
   System.out.println("Strong number");
  }
  else{
   System.out.println("Not a Strong number ");
  }

   }
}
