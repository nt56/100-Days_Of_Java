import java.util.Scanner;

public class DecimalToBinary {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Decimal Number : ");
        int decimal = sc.nextInt();

        //integer array for storing binary number
        int[] binary = new int[20];
        int i = 0;

        //logic --> storing reminder, which is binary
        while(decimal > 0){
            int rem = decimal % 2;
            binary[i++] = rem;
            decimal = decimal / 2;
        }

        //printing reversed number to normal
        System.out.print("Binary Number : ");
        for(int j=i-1; j >= 0; j--){
            System.out.print(binary[j] +"");
        }

    }

}
