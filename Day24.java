import java.util.Scanner;

public class HarshadNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter Number : ");
        int num = sc.nextInt();

        int sum = 0, rem;
        int temp = num;

        while(temp != 0){
            rem = temp % 10;
            sum = sum + rem;
            temp = temp / 10;
        }

        if(num % sum == 0)
            System.out.println("Harshad Number");
        else
            System.out.println("Not a harshad Number");
    }

}

//Harshad number is a number or an integer in base 10 that is completely divisible by sum of its digits.
