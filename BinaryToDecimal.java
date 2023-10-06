import java.util.Scanner;

public class BinaryToDecimal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a binary number : ");
        int binary = sc.nextInt();

        //Declaring variable to store decimal number
        int decimal = 0;

        //Declaring variable to use in power
        int n=0;

        //writing logic for the conversion
        while(binary > 0){
            int temp = binary % 10;
            decimal = (int) (decimal + temp * Math.pow(2,n));
            binary = binary/10;
            n++;
        }

        System.out.println("Decimal number : " +decimal);

    }

}
//working
//110 - 1. 0 * 2 * 0 -->  0
//      2. 1 * 2 * 1 --> 2
//      3. 1 * 2 * 2 --> 4
//      0+3+5 = 6
