import java.util.Scanner;

public class LeapYear {

   public static void main(String[] args){

       Scanner sc = new Scanner(System.in);

       System.out.print("Enter Year : ");
       int year = sc.nextInt();

       if(year%400 == 0 || (year%4 ==0 && year%100 != 0)){
           System.out.println(year+ " is Leap Year");
       }
       else {
           System.out.println(year+ " is not a Leap Year");
       }

   }

}
////method-1


import java.util.Scanner;

public class LeapYear {

   public static void main(String[] args){

       Scanner sc = new Scanner(System.in);

       System.out.print("Enter Year : ");
       int year = sc.nextInt();

       int result = (year%400 == 0 || (year%4 ==0 && year%100 != 0)) ? 1 : 0;

       if(result == 1){
           System.out.println(year+ " is Leap Year");
       }
       else {
           System.out.println(year+ " is not a Leap Year");
       }

   }

}
////method-1(ternary operator)


import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Year : ");
        int year = sc.nextInt();
        boolean leap;

        leap = year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);

        if(leap){
            System.out.println(year+ " is Leap Year");
        }
        else {
            System.out.println(year+ " is not a Leap Year");
        }

    }

}
//method-1(boolean)
