import java.util.Scanner;

public class StrongNumber {

   //function for calculating the factorial
   static int Fact(int num){
       int fact = 1;
       for(int i=1; i<=num; i++){
           fact = fact * i;
       }
       return fact;
   }

   //function for calculating factorial of every digit in given number
   static void detectStrong(int num){
       int digit,sum = 0,temp;
       temp = num;

       // calculate 1! + 4! + 5!
       while(temp != 0){
           digit = temp % 10;
           sum = sum + Fact(digit);
           temp = temp / 10;
       }

       if(sum == num)
           System.out.println(num+ " is Strong");
       else
           System.out.println(num+ " is Not Strong");
   }

   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter Number : ");
       int num = sc.nextInt();
       detectStrong(num);

   }

}
//method-1(iterative)
//For a number to be a Strong Number, the sum of Factorial of each digit of the number must be equal to the number itself.


import java.util.Scanner;

public class StrongNumber {

    //function for calculating the factorial
    static int Fact(int num){
        if(num == 0)
            return 1;

        return num * Fact(num-1);
    }

    //function for calculating factorial of every digit in given number and compare
    static boolean detectStrong(int num){
        int digit,sum = 0,temp;
        temp = num;

        // calculate 1! + 4! + 5!
        while(temp != 0){
            digit = temp % 10;
            sum = sum + Fact(digit);
            temp = temp / 10;
        }

        // returns 1 if both equal else 0
        return sum == num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num = sc.nextInt();

        if(detectStrong(num))
            System.out.println(num+ " is Strong");
        else
            System.out.println(num+ " is Not Strong");
    }

}

//For a number to be a Strong Number, the sum of Factorial of each digit of the number must be equal to the number itself.
