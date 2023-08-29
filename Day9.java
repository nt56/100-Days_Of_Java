import java.util.Scanner;

public class PrimeNumberGivenRange {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a, b, i, j, flag;

        System.out.print("Enter Starting Number in Range: ");
        a = sc.nextInt();
        System.out.print("Enter upper bound of the interval: ");
        b = sc.nextInt();

        System.out.print("Prime numbers between " +a+  " and "  +b+  " are : ");

        // Traverse each number in the interval
        // with the help of for loop
        for (i = a; i <= b; i++) {

            // Skip 0 and 1 as they are
            // neither prime nor composite
            if (i == 1 || i == 0)
                continue;

            flag = 1;

            for (j = 2; j <= i / 2; ++j) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
            }

            // flag = 1 means i is prime
            // and flag = 0 means i is not prime
            if (flag == 1)
                System.out.println(i);
        }
    }
}



