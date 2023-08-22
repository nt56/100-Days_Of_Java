import java.util.Scanner;

public class EvenOdd {

   public static void main(String[] args){

       Scanner sc = new Scanner(System.in);

       System.out.print("Enter Number : ");
       int n = sc.nextInt();

       if(n % 2 == 0){
           System.out.println(n+ " is Even ");
       }
       else{
           System.out.println(n+ " is Odd ");
       }

   }

}
////method-1

/*
    Logic:
    if reminder is 0 then number is even
    if reminder is 1 then number is odd
*/

import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int n = sc.nextInt();

        String result = n%2==0 ? " is Even Number " : " is Odd Number";
        System.out.println(n + result);

    }

}
//method-2
