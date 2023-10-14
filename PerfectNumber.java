import java.util.Scanner;

public class PerfectNumber {

   public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
       System.out.print("Enter Number : ");
       int num = sc.nextInt();
       int sum = 0;

       for(int i=1; i<num; i++){
           if (num % i == 0){
               sum = sum + i;
           }
       }

       if(sum == num){
           System.out.println(num+ " is Perfect");
       }
       else {
           System.out.println(num+ " is Not Perfect");
       }

   }

}
////method-1 (for)
// the objective is to check whether the number can be represented as the sum of its factors except the number itself


import java.util.Scanner;

public class PerfectNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num = sc.nextInt();
        int sum = 0, i = 1;

        while (i <= num/2){
            if(num % i == 0){
                sum = sum + i;
            }
            i++;
        }

        if(sum == num){
            System.out.println(num+ " is Perfect");
        }
        else {
            System.out.println(num+ " is Not Perfect");
        }

    }

}
//method-2 (while)
