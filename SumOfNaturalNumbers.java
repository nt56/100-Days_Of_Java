import java.util.Scanner;

public class SumOfNaturalNumbers {

   public static void main(String[] args){

       Scanner sc = new Scanner(System.in);

       System.out.print("Enter Number : ");
       int num = sc.nextInt();
       int sum = 0;

       for(int i=0; i<=num; i++){
           sum = sum + i;
       }
       System.out.println("Sum Of " +num+ " is : " +sum);
   }

}
////method-1 --> brute force


import java.util.Scanner;

public class SumOfNaturalNumbers {

   public static void main(String[] args){

       Scanner sc = new Scanner(System.in);

       System.out.print("Enter Number : ");
       int num = sc.nextInt();

       System.out.println("Sum Of " +num+ " is : " +num * (num+1)/2);
   }

}
//method-2 --> using formula


import java.util.Scanner;

public class SumOfNaturalNumbers {

    static int getSum(int n){
        if(n == 0){
            return n;
        }

        return n + getSum(n - 1);
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int num = sc.nextInt();
        int sum = getSum(num);

        System.out.println("Sum Of " +num+ " is : " +sum);
    }

}
//method-3 --> Using Recursion




