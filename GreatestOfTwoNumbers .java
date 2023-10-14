import java.util.Scanner;

public class GreatestOfTwoNumbers {

   public static void main(String[] args){

       Scanner sc = new Scanner(System.in);

       System.out.print("Enter Num1 : ");
       int n1 = sc.nextInt();
       System.out.print("Enter Num2 : ");
       int n2 = sc.nextInt();

       if (n1 == n2){
           System.out.println("Both are Equals");
       }
       else if (n1 > n2) {
           System.out.println(n1+ " is Greater");
       }
       else{
           System.out.println(n2+ " is Greater");
       }

   }

}
////method-1 --> brute force


import java.util.Scanner;

public class GreatestOfTwoNumbers {

   public static void main(String[] args){

       Scanner sc = new Scanner(System.in);

       System.out.print("Enter Num1 : ");
       int n1 = sc.nextInt();
       System.out.print("Enter Num2 : ");
       int n2 = sc.nextInt();
       int result;

       if (n1 == n2){
           System.out.println("Both are Equals");
       }
       else {
           result = n1 > n2 ? n1 : n2;
           System.out.println(result+ " is Greater");
       }

   }

}
////method-1 --> Ternary operator


import java.util.Scanner;

public class GreatestOfTwoNumbers {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Num1 : ");
        int n1 = sc.nextInt();
        System.out.print("Enter Num2 : ");
        int n2 = sc.nextInt();
        int result;

        if (n1 == n2){
            System.out.println("Both are Equals");
        }
        else {
            result = Math.max(n1, n2);
            System.out.println(result+ " is Greater");
        }

    }

}
//method-1 --> Ternary operator

