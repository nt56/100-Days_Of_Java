import java.util.Scanner;

public class SumOfDigitsOfNumber {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Numbers : ");
        int num = sc.nextInt();     //user enter 1234
        int sum = 0;

        while(num!=0){
            sum += num % 10;    //extracts the last digit of the number.
            num = num / 10;     //removes the last digit from the number
        }

        System.out.println("Sum Of Digits Of Number is : " +sum);
    }

}
//method-1

//1. num = 1234
//2. while(1234 != 0) true
//4. sum = 1234 % 10 --> add 4 to sum
//5. num = 1234 / 10 --> remove 4 from num
//6. num = 123
//2. while(123 != 0) true
//4. sum = 123 % 10 --> add 3 to sum = 4+3
//5. num = 123 / 10 --> remove 3 from num
//6. num = 12
//7. step goes on until num = 0



import java.util.Scanner;

public class SumOfDigitsOfNumber {

   static int getSum (int num, int sum){
       if (num == 0)
           return sum;

       sum += num % 10; //returning value
       return getSum(num/10, sum);
   }

   public static void main(String[] args){

       Scanner sc = new Scanner(System.in);
       System.out.print("Enter Numbers : ");
       int num = sc.nextInt();
       int sum = 0;
       System.out.println("Sum Of Digits Of Number is : " +getSum(num,sum));
   }

}
////method-2 --> Recursion

