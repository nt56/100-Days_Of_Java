import java.util.Scanner;

public class SumOfNumbersGivenRange {

   public static void main(String[] args){

       Scanner sc = new Scanner(System.in);
       int sum =0;
       System.out.print("Enter Starting Number : ");
       int s = sc.nextInt();
       System.out.print("Enter Ending Number : ");
       int e = sc.nextInt();

       for(int i=s; i<=e; i++){
           sum = sum + i;
       }

       System.out.println("Sum of " +s+ " to " +e+ " is : " +sum);

   }

}
//method-1 --> Brute force

import java.util.Scanner;

public class SumOfNumbersGivenRange {

   public static void main(String[] args){

       Scanner sc = new Scanner(System.in);
       System.out.print("Enter Starting Number : ");
       int s = sc.nextInt();
       System.out.print("Enter Ending Number : ");
       int e = sc.nextInt();

       int sum = e*(e+1)/2 - s*(s+1)/2 + s ;

       System.out.println("Sum of " +s+ " to " +e+ " is : " +sum);

   }

}
//method-2 --> By Formula


import java.util.Scanner;

public class SumOfNumbersGivenRange {

    static int getsum(int sum,int s,int e){

        if(s > e){
            return sum;
        }

        return s + getsum(sum,s+1,e);
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Starting Number : ");
        int a = sc.nextInt();
        System.out.print("Enter Ending Number : ");
        int b = sc.nextInt();

        int result = getsum(0, a, b);

        System.out.println("Sum of " +a+ " to " +b+ " is : " +result);

    }

}
//method-3 --> Recursive Function
