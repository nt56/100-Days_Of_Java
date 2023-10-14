import java.util.Scanner;

public class PrimeNumber {

   public static void main(String[] args){

       Scanner sc = new Scanner(System.in);

       System.out.print("Enter Number : ");
       int num = sc.nextInt();
       int flag = 0;

       if(num <=1 ){
           System.out.println(num+ " Not a Prime Number");
       }
       else {
           for (int i=2; i<num/2; i++){
               if (num % 2 == 0){
                   flag = 1;
                   break;
               }
           }
       }

       if(flag == 1){
           System.out.println(num+ " Not a Prime Number");
       }
       else {
           System.out.println(num+ " is a Prime Number");
       }

   }

}
////method-1 --> normal



import java.util.Scanner;

public class PrimeNumber {

    static boolean checkPrime(int n, int i){

        // 0, 1 and negative numbers are not prime
        if (n < 2)
            return false;

        // if this satisfies then its prime as we
        // have completed recursion from 2 to n
        if (n == 2)
            return true;

        // Base cases
        if (n % 2 == 0)
            return false;

        i += 1;
        return checkPrime(n, i);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num = sc.nextInt();
        boolean isPrime = checkPrime(num, 2);

        String result = isPrime ? "Prime" : "Not Prime";
        System.out.println(num+ " is " +result);
    }

}
////method-1 --> recursion

