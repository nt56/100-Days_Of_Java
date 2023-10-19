import java.util.Scanner;

public class AsciiValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Character : ");
        char ch = sc.next().charAt(0);

        //typecasting from character type to integer type
        int i = ch;
        System.out.println("ASCII of " +ch+ " is : " +i);

    }
}
