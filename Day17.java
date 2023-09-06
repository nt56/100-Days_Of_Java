import java.util.Scanner;

public class PowerOfNumber {

   public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

       System.out.print("Enter The Base : ");
       int b = sc.nextInt();
       System.out.print("Enter The Power : ");
       int p = sc.nextInt();

       int result = 1;

       for(int i=1; i<=p; i++){
           result = result * b;
       }

       System.out.println("Power Of " +b+ " is : " +result);

   }

}
////using for loop


import java.util.Scanner;

public class PowerOfNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The Base : ");
        int b = sc.nextInt();
        System.out.print("Enter The Power : ");
        int p = sc.nextInt();

        int result = 1;

        while (p != 0){
            result = result * b;
            p--;
        }

        System.out.println("Power Of " +b+ " is : " +result);

    }

}
//using while loop
