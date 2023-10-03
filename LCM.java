import java.util.Scanner;

public class LCM {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Num-1 : ");
        int num1 = sc.nextInt();
        System.out.print("Enter Num-2 : ");
        int num2 = sc.nextInt();

        int lcm=0;

        //calculate maximum of two numbers
        int max = Math.max(num1, num2);

        // LCM will atleast be >= max(num1, num2)
        // Largest possibility of LCM will be num1*num2

        for(int i = max; i <= num1*num2; i++){
            if(i % num1 == 0 && i % num2 == 0){
                lcm = i;
                break;
            }
        }

        System.out.println("LCM : " +lcm);

    }

}
//LCM is a Least Common Multiple, means LCM of two numbers is the number which is the smallest common multiple of both numbers. It is also referred to as the Lowest Common Multiple(LCM) or Least Common Denominator(LCD).
