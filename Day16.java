import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int num = sc.nextInt();
        int fact=1,i;

        for(i=1; i<=num; i++){
            fact = fact * i;
        }

        System.out.println("Factorial of " +num+ " is : " +fact);

    }

}

//logic --> num = 5
//1. fact = 1 * 1 = 1
//2. fact = 1 * 2 = 2
//3. fact = 2 * 3 = 6
//4. fact = 6 * 4 = 24
//5. fact = 24 * 5 = 120

//using recursion
import java.util.Scanner;

public class Factorial {

   static int Fact(int num){
       if(num == 0 )
           return 1;

       return num * Fact(num-1);
   }

   public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
       System.out.print("Enter Number : ");
       int num = sc.nextInt();

       int fact = Fact(num);   //function call

       System.out.println("Factorial of " +num+ " is : " +fact);

   }

}
