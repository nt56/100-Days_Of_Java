import java.util.Scanner;

public class PrimeNumberGivenRange {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a, b, i, j, flag=0;

        System.out.print("Enter Starting Number in Range: ");
        a = sc.nextInt();
        System.out.print("Enter Ending Number in Range: ");
        b = sc.nextInt();

        for (i = a; i <= b; i++) { //for starting to end range

            if (i == 1 || i == 0)
                continue;
            flag = 1;

            for (j = 2; j < i; j++) {    //checks every number in ascending order
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
            }

            // flag = 1 means i is prime
            // and flag = 0 means i is not prime
            if (flag == 1)
                System.out.println("Prime Number between " +a+ " and " +b+ " are: " +i);
        }

    }
}



