import java.util.Scanner;

public class PerfectSquare {

    static void perfectSquare(int num){
        if(Math.ceil((double)Math.sqrt(num)) == Math.floor((double)Math.sqrt(num))){
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num = sc.nextInt();
        perfectSquare(num);
    }

}
//perfect square --> Is a number that can be expressed as the product of an integer by itself or as the second exponent of an integer
