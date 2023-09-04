import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Num : ");
        int num = sc.nextInt();

        int a = 0, b = 1, nextTerm;

        System.out.print (a + " , " + b + " , ");

        for (int i=2; i<num; i++){
            nextTerm = a + b;
            a = b;
            b = nextTerm;
            System.out.print(nextTerm+ " , ");
        }
    }

}

//logic
//num=5

//1. 0 , 1 (first prints these two)
//2. 2 < 5 --> true
//3. nextTerm = 0+1 = 1
//4. a = 1
//5. b = 1
//6. 0 , 1, 1 (prints)

//1. 3 < 5 --> true
//2. nextTerm = 1+1 = 2
//3. a = 1
//4. b = 2
//5. 0 , 1, 1, 2 (prints)

//1. 4 < 5 --> true
//2. nextTerm = 1+2 = 3
//3. a = 2
//4. b = 3
//5. 0 , 1, 1, 2, 3 (prints)

//1. 5 < 5 --> false

// using recursion
import java.util.Scanner;

public class FibonacciSeries {

   static int a = 0, b = 1, nextTerm;

   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter Num : ");
       int num = sc.nextInt();
       System.out.print (a + " , " + b + " , ");
       Fib(num-2);
   }

   static int Fib (int num){
       if(num > 0){
           nextTerm = a+b;
           a = b;
           b = nextTerm;
           System.out.print(nextTerm+ " , ");
           Fib(num - 1);
       }
       return 0;
   }

}
