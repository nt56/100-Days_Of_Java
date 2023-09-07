import java.util.Scanner;

public class FactorsOfNumber {

   public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

       System.out.print("Enter Number : ");
       int num = sc.nextInt();

       System.out.println("Factors Of " +num+ " is : ");

       for(int i=1; i<=num; i++){
           if(num % i == 0){
               System.out.print(i+ " ");
           }
       }

   }

}
//method-1


import java.util.Scanner;

public class FactorsOfNumber {

    static void Factor(int num){
        for(int i=1; i<=num/2; i++){
            if(num % i == 0){
                System.out.print(i+ " ");
            }
        }
        //print the number itself to
        System.out.print(num);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num = sc.nextInt();

        System.out.println("Factors Of " +num+ " is : ");
        Factor(num);    //function call
    }

}
