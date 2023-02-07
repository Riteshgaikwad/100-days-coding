//Question:-Get the values of a, b and c (coefficients of quadratic equation) as input from the user and calculate the roots and print as the output.
//Solution in java

import java.util.Scanner;
class day8{
   public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a:");
        double a=sc.nextInt();
        System.out.println("Enter the value of b:");
        double b=sc.nextInt();
        System.out.println("Enter the value of c:");
        double c=sc.nextInt();
        double x1,x2;
        double determinant=b*b-4*a*c;
        if(determinant>0){
            x1=((-b+Math.sqrt(determinant))/2*a);
            x2=((-b-Math.sqrt(determinant))/2*a);
            System.out.println("Roots are real and different:");
            System.out.println(x1+","+x2);
        }
        else if(determinant==0){
            x1=-b/2*a;
            x2=x1;
            System.out.println("Roots are real and same");
            System.out.println(x1+","+x2);
        }
        else{
            double real,img;
            real=-b/2*a;
            img=Math.sqrt(-determinant)/2*a;
            System.out.println(real+"+"+img+"i");
            System.out.println(real+"-"+img+"i");
        }
        sc.close();

    }

}
