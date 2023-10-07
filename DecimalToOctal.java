import java.util.Scanner;

public class DecimalToOctal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Decimal Number : ");
        int decimal = sc.nextInt();

        //array for storing binary numbers
        int[] octal = new int[20];
        int i=0;

        //logic
        while(decimal > 0){
            int rem = decimal % 8;
            octal[i++] = rem;
            decimal = decimal / 8;
        }

        //printing
        System.out.print("Octal Number : ");
        for(int j=i-1; j>=0; j--){
            System.out.print(octal[j] +"");
        }

    }

}
