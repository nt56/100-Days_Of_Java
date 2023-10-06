import java.util.Scanner;

public class OctalToDecimal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Octal Number : ");
        int octal = sc.nextInt();

        //for storing decimal value
        double decimal = 0;

        //for use of power
        int n = 0;

        //actual logic
        while (octal > 0){
            int temp = octal % 10;
            decimal = decimal + temp * Math.pow(8,n);
            octal = octal / 10;
            n++;
        }

        System.out.println("Decimal Nummber : " +decimal);

    }

}
//working
//137 - 1. 7 * 8 * 0 -->  7
//      2. 3 * 8 * 1 --> 24
//      3. 1 * 8 * 2 --> 64
//      7+24+64 = 95
