//Using if, else if

import java.util.Scanner;

public class PositiveNegative {

    public static  void main(String[] args) {

        System.out.println("Check if a Number is Positive or Negative in Java");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num = sc.nextInt();

        if (num == 0) {
            System.out.println("Number is Zero");
        } else if (num > 0) {
            System.out.println("Number is positive");
        } else {
            System.out.println("Number is Negative");
        }
    }
}



//Using Ternary Operator
import java.util.Scanner;

public class PositiveNegative {

    public static  void main(String[] args) {

        System.out.println("Check if a Number is Positive or Negative in Java");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num = sc.nextInt();

        if (num == 0) {
            System.out.println("Number is Zero");
        }

        else {

            String result = num > 0 ? "Positive" :  "Negative";
            System.out.println(result);

        }

    }
}


