import java.util.Scanner;

public class AutomorphismNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num = sc.nextInt();
        int square = num * num ;
        if(isAutomorphic(num) == 1)
            System.out.println("Num: "+ num + ", Square: " + square + " --> is Automorphic");
        else
            System.out.println("Num: "+ num + ", Square: " + square + " --> is not Automorphic");
    }

    static int isAutomorphic(int num){
        int square = num * num;
        while(num != 0)
        {
            // means not automorphic number
            if(num % 10 != square % 10){
                return 0;
            }
            // reduce down numbers
            num /= 10;
            square /= 10;
        }
        // if reaches here means automorphic number
        return 1;
    }

}
//A number is called an Automorphic number if and only if its square ends in the same digits as the number itself.
