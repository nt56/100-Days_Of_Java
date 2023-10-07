import java.util.Scanner;

public class DecimalToHexadecimal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Decimal Number : ");
        int decimal = sc.nextInt();

        int i=0,r=0;
        char a;
        String st="";
        String s = "0123456789ABCDEF";

        //logic
        while(decimal > 0){
            r = decimal % 16;
            a = s.charAt(r);
            st = st + a;
            decimal = decimal / 16;
        }
        System.out.println("Hex in reverse : " +st);
    }

}
