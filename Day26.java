import java.util.Scanner;

public class FriendlyPair {

    static int getDivisorsSum(int num){
        int sum = 0;
        for(int i=1; i<num; i++){
            if (num % i == 0){
                sum = sum + i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Num1 : ");
        int num1 = sc.nextInt();
        System.out.print("Enter Num2 : ");
        int num2 = sc.nextInt();

        int sum1 = getDivisorsSum(num1);
        int sum2 = getDivisorsSum(num2);

        if(sum1 / num1 == sum2 / num2){
            System.out.println(num1+ " & " +num2+ " are friendly pairs");
        } else {
            System.out.println(num1+ " & " +num2+ " are not friendly pairs");
        }
    }

}
//two numbers with a common abundancy index, the ratio between the sum of divisors of a number and the number itself
